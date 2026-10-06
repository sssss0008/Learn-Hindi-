package com.example.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.ConversationData
import com.example.data.CultureData
import com.example.data.GrammarData
import com.example.data.QuizData
import com.example.data.VarnamalaData
import com.example.data.VocabularyData
import com.example.model.AppLanguage
import com.example.model.CharType
import com.example.model.ConversationItem
import com.example.model.CultureArticle
import com.example.model.GrammarLesson
import com.example.model.MatchPair
import com.example.model.NavTab
import com.example.model.QuizQuestion
import com.example.model.VarnamalaItem
import com.example.model.VocabularyWord
import com.example.util.PreferencesManager
import com.example.util.TextToSpeechHelper
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

enum class PracticeMode(val titleEn: String, val titleHi: String, val titleNe: String) {
    QUIZ("Quiz Challenge", "प्रश्नोत्तरी", "प्रश्नोत्तरी"),
    FLASHCARDS("Flashcards", "फ़्लैशकार्ड", "फ्ल्यासकार्ड"),
    MATCH_PAIRS("Word Match", "जोड़ी मिलाओ", "जोडा मिलाउनुहोस्"),
    LISTENING("Listening Test", "सुनो और चुनो", "सुनेर छान्नुहोस्")
}

data class UiState(
    val currentTab: NavTab = NavTab.HOME,
    val language: AppLanguage = AppLanguage.ENGLISH,
    val streak: Int = 1,
    val favoriteIds: Set<String> = emptySet(),
    val speechRate: Float = 0.85f,

    // Learn Tab State
    val learnSubTab: Int = 0, // 0: Varnamala, 1: Vocabulary, 2: Grammar, 3: Conversations
    val charType: CharType = CharType.SWAR,
    val vocabCategory: String = "All",
    val searchQuery: String = "",

    // Selected Detail Dialogs
    val activeCultureArticle: CultureArticle? = null,
    val activeGrammarLesson: GrammarLesson? = null,
    val activeConversation: ConversationItem? = null,
    val showFavoritesOnly: Boolean = false,

    // Practice Quiz State
    val practiceMode: PracticeMode = PracticeMode.QUIZ,
    val currentQuizQuestionIndex: Int = 0,
    val selectedOptionIndex: Int? = null,
    val isAnswerSubmitted: Boolean = false,
    val quizScore: Int = 0,
    val isQuizFinished: Boolean = false,

    // Flashcards State
    val flashcardIndex: Int = 0,
    val isFlashcardFlipped: Boolean = false,
    val flashcardsMasteredCount: Int = 0,

    // Match Pairs State
    val matchHindiSelected: String? = null,
    val matchTransSelected: String? = null,
    val matchedIds: Set<String> = emptySet(),

    // Listening Test State
    val listeningQuestionIndex: Int = 0,
    val listeningSelectedOption: Int? = null,
    val isListeningSubmitted: Boolean = false,
    val listeningScore: Int = 0
)

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val prefs = PreferencesManager(application)
    val tts = TextToSpeechHelper(application)

    private val _uiState = MutableStateFlow(
        UiState(
            language = prefs.appLanguage,
            streak = prefs.getStreak(),
            favoriteIds = prefs.getFavoriteIds(),
            speechRate = prefs.speechRate
        )
    )
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    fun setTab(tab: NavTab) {
        _uiState.update { it.copy(currentTab = tab) }
    }

    fun setLanguage(language: AppLanguage) {
        prefs.appLanguage = language
        _uiState.update { it.copy(language = language) }
    }

    fun setSpeechRate(rate: Float) {
        prefs.speechRate = rate
        _uiState.update { it.copy(speechRate = rate) }
    }

    fun toggleFavorite(wordId: String) {
        prefs.toggleFavorite(wordId)
        _uiState.update { it.copy(favoriteIds = prefs.getFavoriteIds()) }
    }

    fun setLearnSubTab(index: Int) {
        _uiState.update { it.copy(learnSubTab = index) }
    }

    fun setCharType(type: CharType) {
        _uiState.update { it.copy(charType = type) }
    }

    fun setVocabCategory(category: String) {
        _uiState.update { it.copy(vocabCategory = category) }
    }

    fun setSearchQuery(query: String) {
        _uiState.update { it.copy(searchQuery = query) }
    }

    fun setPracticeMode(mode: PracticeMode) {
        _uiState.update { it.copy(practiceMode = mode) }
    }

    fun showCultureDetail(article: CultureArticle?) {
        _uiState.update { it.copy(activeCultureArticle = article) }
    }

    fun showGrammarDetail(lesson: GrammarLesson?) {
        _uiState.update { it.copy(activeGrammarLesson = lesson) }
    }

    fun showConversationDetail(conversation: ConversationItem?) {
        _uiState.update { it.copy(activeConversation = conversation) }
    }

    fun toggleShowFavorites() {
        _uiState.update { it.copy(showFavoritesOnly = !it.showFavoritesOnly) }
    }

    // Speech Trigger
    fun speak(text: String) {
        tts.speak(text, _uiState.value.speechRate)
    }

    // Quiz Actions
    fun selectQuizOption(index: Int) {
        if (_uiState.value.isAnswerSubmitted) return
        _uiState.update { it.copy(selectedOptionIndex = index) }
    }

    fun submitQuizAnswer() {
        val state = _uiState.value
        val currentQ = QuizData.questions.getOrNull(state.currentQuizQuestionIndex) ?: return
        if (state.selectedOptionIndex == null || state.isAnswerSubmitted) return

        val isCorrect = state.selectedOptionIndex == currentQ.correctIndex
        val newScore = if (isCorrect) state.quizScore + 1 else state.quizScore

        _uiState.update {
            it.copy(
                isAnswerSubmitted = true,
                quizScore = newScore
            )
        }
    }

    fun nextQuizQuestion() {
        val state = _uiState.value
        if (state.currentQuizQuestionIndex + 1 < QuizData.questions.size) {
            _uiState.update {
                it.copy(
                    currentQuizQuestionIndex = it.currentQuizQuestionIndex + 1,
                    selectedOptionIndex = null,
                    isAnswerSubmitted = false
                )
            }
        } else {
            // Quiz finished
            prefs.totalQuizzes += 1
            if (state.quizScore > prefs.highScore) {
                prefs.highScore = state.quizScore
            }
            _uiState.update { it.copy(isQuizFinished = true) }
        }
    }

    fun restartQuiz() {
        _uiState.update {
            it.copy(
                currentQuizQuestionIndex = 0,
                selectedOptionIndex = null,
                isAnswerSubmitted = false,
                quizScore = 0,
                isQuizFinished = false
            )
        }
    }

    // Flashcard Actions
    fun flipFlashcard() {
        _uiState.update { it.copy(isFlashcardFlipped = !it.isFlashcardFlipped) }
    }

    fun nextFlashcard(markedMastered: Boolean) {
        val state = _uiState.value
        val totalCards = VocabularyData.words.size
        val nextIdx = (state.flashcardIndex + 1) % totalCards
        val newMastered = if (markedMastered) state.flashcardsMasteredCount + 1 else state.flashcardsMasteredCount

        _uiState.update {
            it.copy(
                flashcardIndex = nextIdx,
                isFlashcardFlipped = false,
                flashcardsMasteredCount = newMastered
            )
        }
    }

    fun prevFlashcard() {
        val state = _uiState.value
        val totalCards = VocabularyData.words.size
        val prevIdx = if (state.flashcardIndex - 1 < 0) totalCards - 1 else state.flashcardIndex - 1
        _uiState.update {
            it.copy(
                flashcardIndex = prevIdx,
                isFlashcardFlipped = false
            )
        }
    }

    // Word Match Actions
    fun selectMatchHindi(id: String) {
        val state = _uiState.value
        if (state.matchedIds.contains(id)) return
        _uiState.update { it.copy(matchHindiSelected = id) }
        checkMatchPair()
    }

    fun selectMatchTrans(id: String) {
        val state = _uiState.value
        if (state.matchedIds.contains(id)) return
        _uiState.update { it.copy(matchTransSelected = id) }
        checkMatchPair()
    }

    private fun checkMatchPair() {
        val state = _uiState.value
        val h = state.matchHindiSelected
        val t = state.matchTransSelected
        if (h != null && t != null) {
            if (h == t) {
                // Correct match!
                val updated = state.matchedIds + h
                _uiState.update {
                    it.copy(
                        matchedIds = updated,
                        matchHindiSelected = null,
                        matchTransSelected = null
                    )
                }
            } else {
                // Incorrect match, reset selections
                _uiState.update {
                    it.copy(
                        matchHindiSelected = null,
                        matchTransSelected = null
                    )
                }
            }
        }
    }

    fun resetMatchPairs() {
        _uiState.update {
            it.copy(
                matchHindiSelected = null,
                matchTransSelected = null,
                matchedIds = emptySet()
            )
        }
    }

    // Listening Test Actions
    fun selectListeningOption(index: Int) {
        if (_uiState.value.isListeningSubmitted) return
        _uiState.update { it.copy(listeningSelectedOption = index) }
    }

    fun submitListeningAnswer(correctIndex: Int) {
        val state = _uiState.value
        if (state.listeningSelectedOption == null || state.isListeningSubmitted) return
        val isCorrect = state.listeningSelectedOption == correctIndex
        _uiState.update {
            it.copy(
                isListeningSubmitted = true,
                listeningScore = if (isCorrect) it.listeningScore + 1 else it.listeningScore
            )
        }
    }

    fun nextListeningQuestion() {
        _uiState.update {
            it.copy(
                listeningQuestionIndex = (it.listeningQuestionIndex + 1) % 5,
                listeningSelectedOption = null,
                isListeningSubmitted = false
            )
        }
    }

    override fun onCleared() {
        super.onCleared()
        tts.shutdown()
    }
}
