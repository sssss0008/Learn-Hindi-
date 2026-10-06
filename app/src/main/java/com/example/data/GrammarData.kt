package com.example.data

import com.example.model.GrammarExample
import com.example.model.GrammarLesson

object GrammarData {
    val lessons: List<GrammarLesson> = listOf(
        GrammarLesson(
            id = "gram_sov",
            titleEn = "SOV Sentence Order",
            titleHi = "कर्ता-कर्म-क्रिया (SOV) वाक्य संरचना",
            titleNe = "कर्ता-कर्म-क्रिया (SOV) वाक्य संरचना",
            summaryEn = "Hindi and Nepali follow Subject + Object + Verb order, unlike English (SVO).",
            summaryHi = "हिन्दी और नेपाली दोनों में कर्ता + कर्म + क्रिया का क्रम होता है, जबकि अंग्रेजी में SVO होता है।",
            summaryNe = "नेपाली र हिन्दी दुवैमा कर्ता + कर्म + क्रिया (SOV) को नियम हुन्छ।",
            contentEn = "In English, we say: 'I (Subject) read (Verb) a book (Object)'.\nIn Hindi and Nepali, the verb ALWAYS comes at the end!\nHindi: 'मैं (Subject) किताब (Object) पढ़ता हूँ (Verb)'.\nNepali: 'म (Subject) किताब (Object) पढ्छु (Verb)'.\nBecause both Hindi and Nepali share this grammatical foundation, speakers of either language grasp it effortlessly!",
            contentHi = "अंग्रेजी में क्रिया बीच में आती है (I read a book), लेकिन हिन्दी में क्रिया हमेशा अंत में आती है:\n'मैं (कर्ता) किताब (कर्म) पढ़ता हूँ (क्रिया)।'\nनेपाली में भी यही नियम है: 'म किताब पढ्छु।'",
            contentNe = "अंग्रेजीमा SVO हुन्छ भने नेपाली र हिन्दी दुवै भाषामा SOV संरचना हुन्छ:\n'म (कर्ता) किताब (कर्म) पढ्छु (क्रिया)।'\nहिन्दी: 'मैं किताब पढ़ता हूँ।'",
            examples = listOf(
                GrammarExample("मैं चाय पीता हूँ।", "Main chai peeta hoon.", "I drink tea.", "म चिया पिउँछु।", "Subject (मैं) + Object (चाय) + Verb (पीता हूँ)"),
                GrammarExample("वह गाना गाती है।", "Vah gaana gaati hai.", "She sings a song.", "उनी गीत गाउँछिन्।", "Subject (वह) + Object (गाना) + Verb (गाती है)"),
                GrammarExample("हम बाज़ार जा रहे हैं।", "Hum bazaar jaa rahe hain.", "We are going to the market.", "हामी बजार जाँदैछौं।", "Subject (हम) + Object (बाज़ार) + Verb (जा रहे हैं)")
            )
        ),
        GrammarLesson(
            id = "gram_gender",
            titleEn = "Noun Genders (Pulling & Striling)",
            titleHi = "लिंग भेद: पुल्लिंग और स्त्रीलिंग",
            titleNe = "लिङ्ग भेद: पुल्लिङ्ग र स्त्रीलिङ्ग",
            summaryEn = "Every noun in Hindi is either Masculine (पुल्लिंग) or Feminine (स्त्रीलिंग).",
            summaryHi = "हिन्दी में प्रत्येक संज्ञा पुल्लिंग या स्त्रीलिंग होती है; निर्जीव वस्तुएँ भी लिंग युक्त होती हैं।",
            summaryNe = "हिन्दीमा सबै संज्ञाको लिङ्ग हुन्छ (पुल्लिङ्ग र स्त्रीलिङ्ग)।",
            contentEn = "Unlike English where objects are neutral ('it'), Hindi assigns a gender to every object!\n- Generally, nouns ending in -aa (ा) are Masculine (कमरा - room, लड़का - boy, केला - banana).\n- Nouns ending in -ee (ी) are Feminine (लड़की - girl, रोटी - bread, नदी - river, चाय - tea).\n- The verb and adjectives change based on the gender:\n'लड़का आया' (Boy came) vs 'लड़की आई' (Girl came).",
            contentHi = "सामान्य नियम:\n१. 'आ' कारांत शब्द प्रायः पुल्लिंग होते हैं: लड़का, कमरा, दरवाजा, पंखा।\n२. 'ई' कारांत शब्द प्रायः स्त्रीलिंग होते हैं: लड़की, रोटी, रात, नदी।\nक्रिया लिंग के अनुसार बदलती है: 'पानी गिरता है' (पु.) तथा 'चाय गिरती है' (स्त्री.)।",
            contentNe = "हिन्दीमा वस्तुहरूको पनि लिङ्ग निर्धारण हुन्छ:\n१. 'आ' मा टुङ्गिने प्रायः पुल्लिङ्ग: लड़का (केटा), कमरा (कोठा)।\n२. 'ई' मा टुङ्गिने प्रायः स्त्रीलिङ्ग: लड़की (केटी), रोटी (रोटी)।\nक्रिया पनि लिङ्ग अनुसार परिवर्तन हुन्छ।",
            examples = listOf(
                GrammarExample("लड़का आम खाता है।", "Ladka aam khaata hai.", "The boy eats a mango.", "केटा आँप खान्छ।", "Boy (Masculine) -> खाता है (Verb masculine)"),
                GrammarExample("लड़की पानी पीती है।", "Ladki paani peeti hai.", "The girl drinks water.", "केटी पानी पिउँछे।", "Girl (Feminine) -> पीती है (Verb feminine)"),
                GrammarExample("यह किताब अच्छी है।", "Yeh kitaab achhi hai.", "This book is good.", "यो किताब राम्रो छ।", "Book is feminine in Hindi -> 'अच्छी' adjective")
            )
        ),
        GrammarLesson(
            id = "gram_respect",
            titleEn = "Pronouns & 3 Levels of Respect",
            titleHi = "सर्वनाम और आदर के तीन स्तर (तू, तुम, आप)",
            titleNe = "सर्वनाम र आदरार्थी रूप (तू, तुम, आप)",
            summaryEn = "Hindi has three levels of address matching Nepali: तू (intimate/तँ), तुम (casual/तिमी), आप (formal/तपाईं).",
            summaryHi = "सम्बोधन के ३ स्तर: 'तू' (अत्यधिक निकट/ईश्वर), 'तुम' (मित्र/बराबर), 'आप' (आदरणीय/वरिष्ठ)।",
            summaryNe = "हिन्दीमा पनि नेपाली जस्तै तीन स्तरका आदरार्थी सर्वनाम हुन्छन्।",
            contentEn = "Politeness is a cornerstone of South Asian culture!\n1. तू (Tu) = Intimate, used with very close childhood friends, younger siblings, or in deep prayers to God. (Equivalent to Nepali 'तँ').\n2. तुम (Tum) = Familiar/Informal, used with friends, peers, and classmates. (Equivalent to Nepali 'तिमी').\n3. आप (Aap) = Formal & Respectful, used with elders, teachers, strangers, and in professional settings. (Equivalent to Nepali 'तपाईं'). Always use 'आप' when in doubt!",
            contentHi = "१. 'तू': भगवान से प्रार्थना या अति घनिष्ठता में (तू कहाँ है?)\n२. 'तुम': दोस्तों और बराबर वालों के साथ (तुम क्या कर रहे हो?)\n३. 'आप': बड़ों, अजनबियों और सम्मान देने के लिए (आप कैसे हैं?)\nहमेशा अजनबियों से बात करते समय 'आप' का प्रयोग सबसे सुरक्षित और शिष्ट है।",
            contentNe = "१. 'तू' = नेपालीको 'तँ' (धेरै नजिकका साथी वा भगवान्सँग)\n२. 'तुम' = नेपालीको 'तिमी' (साथीभाइ र समवयीसँग)\n३. 'आप' = नेपालीको 'तपाईं' (अग्रज, शिक्षक, नयाँ व्यक्तिहरूसँग आदरपूर्वक)।",
            examples = listOf(
                GrammarExample("आप कैसे हैं?", "Aap kaise hain?", "How are you? (Formal/Polite)", "तपाईंलाई कस्तो छ?", "Used with 'आप' (तपाईं) - highest respect"),
                GrammarExample("तुम क्या कर रहे हो?", "Tum kya kar rahe ho?", "What are you doing? (Casual)", "तिमी के गर्दैछौ?", "Used with 'तुम' (तिमी) - peers/friends"),
                GrammarExample("तू मेरा सच्चा मित्र है।", "Tu mera sachha mitra hai.", "You are my true friend. (Intimate)", "तँ मेरो साँचो साथी होस्।", "Used with 'तू' (तँ) - intimate bond")
            )
        ),
        GrammarLesson(
            id = "gram_postpositions",
            titleEn = "Hindi Postpositions (कारकीय परसर्ग)",
            titleHi = "विभक्ति चिह्न व परसर्ग (का, को, से, में, पर)",
            titleNe = "विभक्ति र नामयोगी (मा, लाई, बाट, को)",
            summaryEn = "Hindi uses postpositions (coming AFTER nouns) instead of prepositions (before nouns).",
            summaryHi = "अंग्रेजी के prepositions के विपरीत हिन्दी और नेपाली में परसर्ग संज्ञा के बाद आते हैं।",
            summaryNe = "नेपाली जस्तै हिन्दीमा पनि विभक्ति शब्दको पछाडि आउँछ।",
            contentEn = "In English we say 'IN the room', 'TO the market', 'WITH a friend'.\nIn Hindi and Nepali, these words come AFTER the noun!\n- में (mein) = In / At (नेपाली: मा)\n- पर (par) = On / Upon (नेपाली: माथि)\n- को (ko) = To / Specific Object (नेपाली: लाई)\n- से (se) = From / By / With (नेपाली: बाट / ले)\n- का / के / की (kaa / ke / kee) = 's / Of (नेपाली: को / का / की)\n- के लिए (ke liye) = For (नेपाली: को लागि)",
            contentHi = "प्रमुख परसर्ग:\n• 'में': कमरे में (In the room)\n• 'पर': मेज़ पर (On the table)\n• 'को': राहुल को (To Rahul)\n• 'से': दिल्ली से (From Delhi) / चम्मच से (With spoon)\n• 'का/के/की': राम की किताब (Ram's book)\n• 'के लिए': आपके लिए (For you)",
            contentNe = "प्रमुख विभक्तिहरू:\n• 'में' = मा (कमरे में -> कोठामा)\n• 'पर' = माथि (मेज़ पर -> टेबलमाथि)\n• 'को' = लाई (राहुल को -> राहुललाई)\n• 'से' = बाट/ले (घर से -> घरबाट)\n• 'के लिए' = को लागि (आपके लिए -> तपाईंको लागि)",
            examples = listOf(
                GrammarExample("किताब मेज़ पर रखी है।", "Kitaab mez par rakhi hai.", "The book is kept on the table.", "किताब टेबलमाथि राखिएको छ।", "पर = On"),
                GrammarExample("पानी गिलास में है।", "Paani gilaas mein hai.", "Water is in the glass.", "पानी गिलासमा छ।", "में = In"),
                GrammarExample("यह उपहार आपके लिए है।", "Yeh upahaar aapke liye hai.", "This gift is for you.", "यो उपहार तपाईंको लागि हो।", "के लिए = For")
            )
        )
    )
}
