package com.example.model

enum class AppLanguage(val code: String, val displayName: String, val nativeName: String) {
    ENGLISH("en", "English", "English"),
    HINDI("hi", "Hindi", "हिन्दी"),
    NEPALI("ne", "Nepali", "नेपाली")
}

enum class NavTab(val titleEn: String, val titleHi: String, val titleNe: String) {
    HOME("Home", "गृह", "गृह"),
    LEARN("Learn", "सीखें", "सिक्नुहोस्"),
    PRACTICE("Practice", "अभ्यास", "अभ्यास"),
    ABOUT("Culture & About", "संस्कृति व परिचय", "संस्कृति र परिचय")
}

data class VarnamalaItem(
    val character: String,
    val transliteration: String,
    val type: CharType, // VOWEL, CONSONANT, MATRA
    val exampleHindi: String,
    val exampleTransliteration: String,
    val exampleEnglish: String,
    val exampleNepali: String,
    val descriptionEn: String,
    val descriptionHi: String,
    val descriptionNe: String
)

enum class CharType {
    SWAR, // Vowels
    VYANJAN, // Consonants
    MATRA // Vowel signs
}

data class VocabularyWord(
    val id: String,
    val hindi: String,
    val transliteration: String,
    val english: String,
    val nepali: String,
    val category: String,
    val exampleSentenceHindi: String = "",
    val exampleSentenceTranslit: String = "",
    val exampleSentenceEn: String = "",
    val exampleSentenceNe: String = "",
    val isFavorite: Boolean = false
)

data class GrammarLesson(
    val id: String,
    val titleEn: String,
    val titleHi: String,
    val titleNe: String,
    val summaryEn: String,
    val summaryHi: String,
    val summaryNe: String,
    val contentEn: String,
    val contentHi: String,
    val contentNe: String,
    val examples: List<GrammarExample>
)

data class GrammarExample(
    val hindi: String,
    val transliteration: String,
    val english: String,
    val nepali: String,
    val explanation: String
)

data class ConversationItem(
    val id: String,
    val titleEn: String,
    val titleHi: String,
    val titleNe: String,
    val situationEn: String,
    val situationHi: String,
    val situationNe: String,
    val dialogue: List<DialogueLine>
)

data class DialogueLine(
    val speaker: String,
    val hindi: String,
    val transliteration: String,
    val english: String,
    val nepali: String
)

data class CultureArticle(
    val id: String,
    val category: CultureCategory,
    val titleEn: String,
    val titleHi: String,
    val titleNe: String,
    val subtitleEn: String,
    val subtitleHi: String,
    val subtitleNe: String,
    val descriptionEn: String,
    val descriptionHi: String,
    val descriptionNe: String,
    val keyFactsEn: List<String>,
    val keyFactsHi: List<String>,
    val keyFactsNe: List<String>,
    val iconResName: String // e.g. "ic_culture_diwali"
)

enum class CultureCategory(val titleEn: String, val titleHi: String, val titleNe: String) {
    FESTIVALS("Festivals & Celebrations", "त्योहार और उत्सव", "चाडपर्व र उत्सव"),
    HISTORY("History & Heritage", "इतिहास और धरोहर", "इतिहास र सम्पदा"),
    LITERATURE("Literature & Masters", "साहित्य और रचनाकार", "साहित्य र स्रष्टा"),
    BRIDGE("India-Nepal Bond", "भारत-नेपाल सांस्कृतिक सेतु", "भारत-नेपाल सांस्कृतिक सेतु")
}

data class QuizQuestion(
    val id: String,
    val promptEn: String,
    val promptHi: String,
    val promptNe: String,
    val hindiSubject: String,
    val options: List<String>,
    val correctIndex: Int,
    val explanationEn: String,
    val explanationHi: String,
    val explanationNe: String
)

data class MatchPair(
    val id: String,
    val hindi: String,
    val transliteration: String,
    val translation: String // dynamically based on language
)
