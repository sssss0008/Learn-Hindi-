package com.example.data

import com.example.model.MatchPair
import com.example.model.QuizQuestion

object QuizData {
    val questions: List<QuizQuestion> = listOf(
        QuizQuestion(
            id = "q1",
            promptEn = "What is the meaning of 'नमस्ते' (Namaste)?",
            promptHi = "'नमस्ते' का सही अर्थ क्या है?",
            promptNe = "'नमस्ते' को सही अर्थ के हो?",
            hindiSubject = "नमस्ते",
            options = listOf("Thank you", "Hello / Greetings", "Goodbye", "Please"),
            correctIndex = 1,
            explanationEn = "'Namaste' is the standard polite greeting in Hindi, meaning 'I bow to you'.",
            explanationHi = "'नमस्ते' आदरपूर्वक अभिवादन करने के लिए प्रयुक्त होता है।",
            explanationNe = "'नमस्ते' अभिवादन गर्दा प्रयोग गरिन्छ।"
        ),
        QuizQuestion(
            id = "q2",
            promptEn = "Which Hindi letter represents the sound 'आ' (aa)?",
            promptHi = "'आम' (Mango) किस अक्षर से शुरू होता है?",
            promptNe = "'आम' (आँप) कुन अक्षरबाट सुरु हुन्छ?",
            hindiSubject = "आ",
            options = listOf("अ", "इ", "आ", "उ"),
            correctIndex = 2,
            explanationEn = "'आ' is the long vowel 'aa', as in Aam (Mango).",
            explanationHi = "'आ' दीर्घ स्वर है, जिससे आम बनता है।",
            explanationNe = "'आ' दीर्घ स्वर हो।"
        ),
        QuizQuestion(
            id = "q3",
            promptEn = "How do you say 'Water' in Hindi?",
            promptHi = "'Water' (जल) को सामान्य बोलचाल में क्या कहते हैं?",
            promptNe = "'Water' (पानी) लाई हिन्दीमा के भनिन्छ?",
            hindiSubject = "पानी",
            options = listOf("चाय (Chai)", "दूध (Doodh)", "पानी (Paani)", "रोटी (Roti)"),
            correctIndex = 2,
            explanationEn = "'Paani' (पानी) or 'Jal' (जल) means water in Hindi.",
            explanationHi = "'पानी' अथवा 'जल' का अर्थ Water होता है।",
            explanationNe = "हिन्दीमा पनि 'पानी' नै भनिन्छ।"
        ),
        QuizQuestion(
            id = "q4",
            promptEn = "Which pronoun represents the polite/formal 'You'?",
            promptHi = "बड़ों को आदरपूर्वक सम्बोधित करने के लिए कौन सा सर्वनाम प्रयोग होता है?",
            promptNe = "आदरपूर्वक 'तपाईं' भन्न हिन्दीमा कुन शब्द प्रयोग हुन्छ?",
            hindiSubject = "आप",
            options = listOf("तू (Tu)", "तुम (Tum)", "आप (Aap)", "वह (Vah)"),
            correctIndex = 2,
            explanationEn = "'आप' (Aap) is the formal, respectful second-person pronoun (like नेपाली 'तपाईं').",
            explanationHi = "'आप' का प्रयोग बड़ों और अजनबियों को सम्मान देने के लिए होता है।",
            explanationNe = "हिन्दीमा 'आप' ले नेपालीको 'तपाईं' जस्तै आदर जनाउँछ।"
        ),
        QuizQuestion(
            id = "q5",
            promptEn = "What is the word order in a Hindi sentence?",
            promptHi = "हिन्दी वाक्य में पदों का सही क्रम क्या है?",
            promptNe = "हिन्दी वाक्य संरचनाको सही क्रम कुन हो?",
            hindiSubject = "SOV",
            options = listOf("Verb + Subject + Object", "Subject + Verb + Object", "Subject + Object + Verb (SOV)", "Object + Verb + Subject"),
            correctIndex = 2,
            explanationEn = "Hindi & Nepali follow Subject + Object + Verb (SOV) order.",
            explanationHi = "हिन्दी में कर्ता + कर्म + क्रिया का क्रम होता है।",
            explanationNe = "हिन्दी र नेपाली दुवैमा कर्ता + कर्म + क्रिया (SOV) हुन्छ।"
        ),
        QuizQuestion(
            id = "q6",
            promptEn = "What does 'धन्यवाद' (Dhanyavaad) mean?",
            promptHi = "'धन्यवाद' किस भाव को प्रकट करता है?",
            promptNe = "'धन्यवाद' ले के जनाउँछ?",
            hindiSubject = "धन्यवाद",
            options = listOf("Sorry", "Excuse me", "Welcome", "Thank you"),
            correctIndex = 3,
            explanationEn = "'Dhanyavaad' means 'Thank you'.",
            explanationHi = "'धन्यवाद' आभार व्यक्त करने के लिए कहा जाता है।",
            explanationNe = "आभार व्यक्त गर्दा 'धन्यवाद' भनिन्छ।"
        ),
        QuizQuestion(
            id = "q7",
            promptEn = "What is the number 'पाँच' (Paanch) in digits?",
            promptHi = "'पाँच' किस संख्या को दर्शाता है?",
            promptNe = "'पाँच' ले कुन अङ्कलाई बुझाउँछ?",
            hindiSubject = "५ (5)",
            options = listOf("3", "5", "7", "10"),
            correctIndex = 1,
            explanationEn = "'Paanch' means 5.",
            explanationHi = "'पाँच' का अर्थ ५ (Five) होता है।",
            explanationNe = "'पाँच' अङ्क ५ हो।"
        ),
        QuizQuestion(
            id = "q8",
            promptEn = "What color is 'लाल' (Laal)?",
            promptHi = "'लाल' कौन सा रंग है?",
            promptNe = "'लाल' कुन रङ हो?",
            hindiSubject = "लाल",
            options = listOf("Green", "Blue", "Red", "Yellow"),
            correctIndex = 2,
            explanationEn = "'Laal' means Red (like a rose or tomato).",
            explanationHi = "'लाल' का अर्थ Red (रातो) होता है।",
            explanationNe = "'लाल' भनेको रातो रङ हो।"
        )
    )

    val matchPairs: List<MatchPair> = listOf(
        MatchPair("m1", "किताब", "Kitaab", "Book / पुस्तक"),
        MatchPair("m2", "मित्र / दोस्त", "Mitra / Dost", "Friend / साथी"),
        MatchPair("m3", "घर", "Ghar", "Home / घर"),
        MatchPair("m4", "सेब", "Seb", "Apple / स्याउ"),
        MatchPair("m5", "सूरज", "Sooraj", "Sun / घाम-सूर्य"),
        MatchPair("m6", "पानी", "Paani", "Water / पानी")
    )
}
