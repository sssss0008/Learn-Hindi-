package com.example.data

import com.example.model.VocabularyWord

object VocabularyData {
    val words: List<VocabularyWord> = listOf(
        // Greetings
        VocabularyWord(
            id = "greet_1",
            hindi = "नमस्ते",
            transliteration = "Namaste",
            english = "Hello / Greetings",
            nepali = "नमस्ते / नमस्कार",
            category = "Greetings",
            exampleSentenceHindi = "नमस्ते! आप कैसे हैं?",
            exampleSentenceTranslit = "Namaste! Aap kaise hain?",
            exampleSentenceEn = "Hello! How are you?",
            exampleSentenceNe = "नमस्ते! तपाईंलाई कस्तो छ?"
        ),
        VocabularyWord(
            id = "greet_2",
            hindi = "धन्यवाद",
            transliteration = "Dhanyavaad",
            english = "Thank you",
            nepali = "धन्यवाद",
            category = "Greetings",
            exampleSentenceHindi = "आपकी मदद के लिए बहुत-बहुत धन्यवाद।",
            exampleSentenceTranslit = "Aapki madad ke liye bahut bahut dhanyavaad.",
            exampleSentenceEn = "Thank you very much for your help.",
            exampleSentenceNe = "तपाईंको सहयोगको लागि धेरै धेरै धन्यवाद।"
        ),
        VocabularyWord(
            id = "greet_3",
            hindi = "शुभ प्रभात",
            transliteration = "Shubh Prabhat",
            english = "Good Morning",
            nepali = "शुभ प्रभात / शुभ बिहानी",
            category = "Greetings",
            exampleSentenceHindi = "शुभ प्रभात, आपका दिन मंगलमय हो!",
            exampleSentenceTranslit = "Shubh prabhat, aapka din mangalmay ho!",
            exampleSentenceEn = "Good morning, have a wonderful day!",
            exampleSentenceNe = "शुभ प्रभात, तपाईंको दिन राम्रो रहोस्!"
        ),
        VocabularyWord(
            id = "greet_4",
            hindi = "शुभ रात्रि",
            transliteration = "Shubh Raatri",
            english = "Good Night",
            nepali = "शुभ रात्रि",
            category = "Greetings",
            exampleSentenceHindi = "अब सोने का समय हो गया, शुभ रात्रि।",
            exampleSentenceTranslit = "Ab sone ka samay ho gaya, shubh raatri.",
            exampleSentenceEn = "It is time to sleep now, good night.",
            exampleSentenceNe = "अब सुत्ने बेला भयो, शुभ रात्रि।"
        ),
        VocabularyWord(
            id = "greet_5",
            hindi = "कृपया",
            transliteration = "Kripya",
            english = "Please",
            nepali = "कृपया",
            category = "Greetings",
            exampleSentenceHindi = "कृपया यहाँ बैठिए।",
            exampleSentenceTranslit = "Kripya yahan baithiye.",
            exampleSentenceEn = "Please sit here.",
            exampleSentenceNe = "कृपया यहाँ बस्नुहोस्।"
        ),
        VocabularyWord(
            id = "greet_6",
            hindi = "माफ़ कीजिए",
            transliteration = "Maaf kijiye / Kshama kijiye",
            english = "Excuse me / Sorry",
            nepali = "माफ गर्नुहोस्",
            category = "Greetings",
            exampleSentenceHindi = "माफ़ कीजिए, क्या आप मेरी मदद करेंगे?",
            exampleSentenceTranslit = "Maaf kijiye, kya aap meri madad karenge?",
            exampleSentenceEn = "Excuse me, will you help me?",
            exampleSentenceNe = "माफ गर्नुहोस्, के तपाईं मलाई सहयोग गर्नुहुन्छ?"
        ),
        VocabularyWord(
            id = "greet_7",
            hindi = "फिर मिलेंगे",
            transliteration = "Phir milenge",
            english = "See you again",
            nepali = "फेरि भेटौँला",
            category = "Greetings",
            exampleSentenceHindi = "अच्छा चलता हूँ, फिर मिलेंगे!",
            exampleSentenceTranslit = "Achha chalta hoon, phir milenge!",
            exampleSentenceEn = "Alright I am leaving, see you again!",
            exampleSentenceNe = "ल म हिँडे, फेरि भेटौँला!"
        ),

        // Numbers
        VocabularyWord(
            id = "num_1",
            hindi = "एक",
            transliteration = "Ek",
            english = "One (1)",
            nepali = "एक (१)",
            category = "Numbers",
            exampleSentenceHindi = "मुझे एक कप चाय चाहिए।",
            exampleSentenceTranslit = "Mujhe ek cup chai chahiye.",
            exampleSentenceEn = "I want one cup of tea.",
            exampleSentenceNe = "मलाई एक कप चिया चाहिन्छ।"
        ),
        VocabularyWord(
            id = "num_2",
            hindi = "दो",
            transliteration = "Do",
            english = "Two (2)",
            nepali = "दुई (२)",
            category = "Numbers",
            exampleSentenceHindi = "यहाँ दो रास्ते हैं।",
            exampleSentenceTranslit = "Yahan do raaste hain.",
            exampleSentenceEn = "There are two paths here.",
            exampleSentenceNe = "यहाँ दुईवटा बाटा छन्।"
        ),
        VocabularyWord(
            id = "num_3",
            hindi = "तीन",
            transliteration = "Teen",
            english = "Three (3)",
            nepali = "तीन (३)",
            category = "Numbers",
            exampleSentenceHindi = "गाड़ी में तीन लोग हैं।",
            exampleSentenceTranslit = "Gadi mein teen log hain.",
            exampleSentenceEn = "There are three people in the vehicle.",
            exampleSentenceNe = "गाडीमा तीन जना छन्।"
        ),
        VocabularyWord(
            id = "num_4",
            hindi = "चार",
            transliteration = "Chaar",
            english = "Four (4)",
            nepali = "चार (४)",
            category = "Numbers",
            exampleSentenceHindi = "कमरे में चार खिड़कियाँ हैं।",
            exampleSentenceTranslit = "Kamre mein chaar khidkiyan hain.",
            exampleSentenceEn = "There are four windows in the room.",
            exampleSentenceNe = "कोठामा चारवटा झ्यालहरू छन्।"
        ),
        VocabularyWord(
            id = "num_5",
            hindi = "पाँच",
            transliteration = "Paanch",
            english = "Five (5)",
            nepali = "पाँच (५)",
            category = "Numbers",
            exampleSentenceHindi = "हाथ में पाँच उँगलियाँ होती हैं।",
            exampleSentenceTranslit = "Haath mein paanch ungliyan hoti hain.",
            exampleSentenceEn = "A hand has five fingers.",
            exampleSentenceNe = "हातमा पाँचवटा औंला हुन्छन्।"
        ),
        VocabularyWord(
            id = "num_10",
            hindi = "दस",
            transliteration = "Das",
            english = "Ten (10)",
            nepali = "दश (१०)",
            category = "Numbers",
            exampleSentenceHindi = "इसकी कीमत दस रुपये है।",
            exampleSentenceTranslit = "Iski keemat das rupaye hai.",
            exampleSentenceEn = "Its price is ten rupees.",
            exampleSentenceNe = "यसको मूल्य दश रुपैयाँ हो।"
        ),
        VocabularyWord(
            id = "num_100",
            hindi = "सौ",
            transliteration = "Sau",
            english = "Hundred (100)",
            nepali = "सय (१००)",
            category = "Numbers",
            exampleSentenceHindi = "किताब में सौ पृष्ठ हैं।",
            exampleSentenceTranslit = "Kitaab mein sau prishth hain.",
            exampleSentenceEn = "The book has one hundred pages.",
            exampleSentenceNe = "किताबमा सय पृष्ठहरू छन्।"
        ),

        // Family & Relations
        VocabularyWord(
            id = "fam_1",
            hindi = "माँ / माता जी",
            transliteration = "Maa / Mata ji",
            english = "Mother",
            nepali = "आमा / माता",
            category = "Family",
            exampleSentenceHindi = "मेरी माँ बहुत स्वादिष्ट खाना बनाती हैं।",
            exampleSentenceTranslit = "Meri maa bahut swadisht khaana banati hain.",
            exampleSentenceEn = "My mother cooks very delicious food.",
            exampleSentenceNe = "मेरी आमा धेरै मिठो खाना पकाउनुहुन्छ।"
        ),
        VocabularyWord(
            id = "fam_2",
            hindi = "पिता जी / बापू",
            transliteration = "Pita ji / Baapu",
            english = "Father",
            nepali = "बुबा / पिता",
            category = "Family",
            exampleSentenceHindi = "पिता जी दफ़्तर से आ गए।",
            exampleSentenceTranslit = "Pita ji daftar se aa gaye.",
            exampleSentenceEn = "Father has returned from the office.",
            exampleSentenceNe = "बुबा कार्यालयबाट आउनुभयो।"
        ),
        VocabularyWord(
            id = "fam_3",
            hindi = "भाई",
            transliteration = "Bhai",
            english = "Brother",
            nepali = "दाजु / भाइ",
            category = "Family",
            exampleSentenceHindi = "मेरा भाई स्कूल जा रहा है।",
            exampleSentenceTranslit = "Mera bhai school jaa raha hai.",
            exampleSentenceEn = "My brother is going to school.",
            exampleSentenceNe = "मेरो भाइ विद्यालय जाँदैछ।"
        ),
        VocabularyWord(
            id = "fam_4",
            hindi = "बहन",
            transliteration = "Behan",
            english = "Sister",
            nepali = "दिदी / बहिनी",
            category = "Family",
            exampleSentenceHindi = "मेरी बहन किताब पढ़ रही है।",
            exampleSentenceTranslit = "Meri behan kitaab padh rahi hai.",
            exampleSentenceEn = "My sister is reading a book.",
            exampleSentenceNe = "मेरी बहिनी किताब पढ्दैछे।"
        ),
        VocabularyWord(
            id = "fam_5",
            hindi = "दोस्त / मित्र",
            transliteration = "Dost / Mitra",
            english = "Friend",
            nepali = "साथी / मित्र",
            category = "Family",
            exampleSentenceHindi = "सच्चा दोस्त जीवन का अनमोल तोहफ़ा है।",
            exampleSentenceTranslit = "Sachha dost jeevan ka anmol tohfa hai.",
            exampleSentenceEn = "A true friend is a priceless gift of life.",
            exampleSentenceNe = "साँचो साथी जीवनको अमूल्य उपहार हो।"
        ),

        // Food & Drinks
        VocabularyWord(
            id = "food_1",
            hindi = "चाय",
            transliteration = "Chai",
            english = "Tea",
            nepali = "चिया",
            category = "Food",
            exampleSentenceHindi = "भारत और नेपाल में गरमा-गरम अदरक वाली चाय बहुत लोकप्रिय है।",
            exampleSentenceTranslit = "Bharat aur Nepal mein garam garam adrak wali chai bahut lokpriya hai.",
            exampleSentenceEn = "Hot ginger tea is very popular in India and Nepal.",
            exampleSentenceNe = "भारत र नेपालमा तातो अदुवा चिया धेरै लोकप्रिय छ।"
        ),
        VocabularyWord(
            id = "food_2",
            hindi = "पानी / जल",
            transliteration = "Paani / Jal",
            english = "Water",
            nepali = "पानी / जल",
            category = "Food",
            exampleSentenceHindi = "कृपया पीने का साफ़ पानी दीजिए।",
            exampleSentenceTranslit = "Kripya peene ka saaf paani dijiye.",
            exampleSentenceEn = "Please give clean drinking water.",
            exampleSentenceNe = "कृपया पिउने सफा पानी दिनुहोस्।"
        ),
        VocabularyWord(
            id = "food_3",
            hindi = "रोटी",
            transliteration = "Roti",
            english = "Flatbread / Bread",
            nepali = "रोटी",
            category = "Food",
            exampleSentenceHindi = "गरम रोटी और दाल बहुत पौष्टिक होती है।",
            exampleSentenceTranslit = "Garam roti aur daal bahut paushtik hoti hai.",
            exampleSentenceEn = "Hot flatbread and lentils are very nutritious.",
            exampleSentenceNe = "तातो रोटी र दाल धेरै पोसिलो हुन्छ।"
        ),
        VocabularyWord(
            id = "food_4",
            hindi = "चावल",
            transliteration = "Chaaval",
            english = "Rice",
            nepali = "चामल / भात",
            category = "Food",
            exampleSentenceHindi = "दाल-चावल हर घर का पसंदीदा भोजन है।",
            exampleSentenceTranslit = "Daal chaaval har ghar ka pasandeeda bhojan hai.",
            exampleSentenceEn = "Lentils and rice is every household's favorite meal.",
            exampleSentenceNe = "दाल-भात हरेक घरको मनपर्ने खाना हो।"
        ),
        VocabularyWord(
            id = "food_5",
            hindi = "दूध",
            transliteration = "Doodh",
            english = "Milk",
            nepali = "दूध",
            category = "Food",
            exampleSentenceHindi = "रोज़ाना दूध पीना सेहत के लिए अच्छा है।",
            exampleSentenceTranslit = "Rozana doodh peena sehat ke liye achha hai.",
            exampleSentenceEn = "Drinking milk daily is good for health.",
            exampleSentenceNe = "दैनिक दूध पिउनु स्वास्थ्यका लागि राम्रो हो।"
        ),

        // Travel & Directions
        VocabularyWord(
            id = "trav_1",
            hindi = "रास्ता",
            transliteration = "Raasta",
            english = "Way / Road / Path",
            nepali = "बाटो",
            category = "Travel",
            exampleSentenceHindi = "यह रास्ता रेलवे स्टेशन की तरफ़ जाता है।",
            exampleSentenceTranslit = "Yeh raasta railway station ki taraf jaata hai.",
            exampleSentenceEn = "This road leads towards the railway station.",
            exampleSentenceNe = "यो बाटो रेलवे स्टेशन तर्फ जान्छ।"
        ),
        VocabularyWord(
            id = "trav_2",
            hindi = "बाएँ",
            transliteration = "Baayein",
            english = "Left",
            nepali = "बायाँ",
            category = "Travel",
            exampleSentenceHindi = "आगे जाकर बाएँ मुड़िए।",
            exampleSentenceTranslit = "Aage jaakar baayein mudiye.",
            exampleSentenceEn = "Go ahead and turn left.",
            exampleSentenceNe = "अगाडि गएर बायाँ मोडिनुहोस्।"
        ),
        VocabularyWord(
            id = "trav_3",
            hindi = "दाएँ",
            transliteration = "Daayein",
            english = "Right",
            nepali = "दायाँ",
            category = "Travel",
            exampleSentenceHindi = "बाज़ार दाएँ हाथ पर है।",
            exampleSentenceTranslit = "Bazaar daayein haath par hai.",
            exampleSentenceEn = "The market is on the right hand side.",
            exampleSentenceNe = "बजार दायाँ हात तर्फ छ।"
        ),
        VocabularyWord(
            id = "trav_4",
            hindi = "सीधे",
            transliteration = "Seedhe",
            english = "Straight",
            nepali = "सिधा",
            category = "Travel",
            exampleSentenceHindi = "दो सौ मीटर तक सीधे चलिए।",
            exampleSentenceTranslit = "Do sau meter tak seedhe chaliye.",
            exampleSentenceEn = "Walk straight for two hundred meters.",
            exampleSentenceNe = "दुई सय मिटरसम्म सिधा हिँड्नुहोस्।"
        ),
        VocabularyWord(
            id = "trav_5",
            hindi = "कितनी दूर",
            transliteration = "Kitni door",
            english = "How far",
            nepali = "कति टाढा",
            category = "Travel",
            exampleSentenceHindi = "हवाई अड्डा यहाँ से कितनी दूर है?",
            exampleSentenceTranslit = "Hawai adda yahan se kitni door hai?",
            exampleSentenceEn = "How far is the airport from here?",
            exampleSentenceNe = "विमानस्थल यहाँबाट कति टाढा छ?"
        ),

        // Time & Days
        VocabularyWord(
            id = "time_1",
            hindi = "आज",
            transliteration = "Aaj",
            english = "Today",
            nepali = "आज",
            category = "Time",
            exampleSentenceHindi = "आज मौसम बहुत सुहावना है।",
            exampleSentenceTranslit = "Aaj mausam bahut suhavana hai.",
            exampleSentenceEn = "Today the weather is very pleasant.",
            exampleSentenceNe = "आज मौसम धेरै रमाइलो छ।"
        ),
        VocabularyWord(
            id = "time_2",
            hindi = "कल",
            transliteration = "Kal",
            english = "Tomorrow / Yesterday",
            nepali = "भोलि / हिजो",
            category = "Time",
            exampleSentenceHindi = "हम कल मंदिर जाएँगे।",
            exampleSentenceTranslit = "Hum kal mandir jaayenge.",
            exampleSentenceEn = "We will go to the temple tomorrow.",
            exampleSentenceNe = "हामी भोलि मन्दिर जानेछौं।"
        ),
        VocabularyWord(
            id = "time_3",
            hindi = "सुबह",
            transliteration = "Subah",
            english = "Morning",
            nepali = "बिहान",
            category = "Time",
            exampleSentenceHindi = "मैं सुबह जल्दी उठता हूँ।",
            exampleSentenceTranslit = "Main subah jaldi uthta hoon.",
            exampleSentenceEn = "I wake up early in the morning.",
            exampleSentenceNe = "म बिहान सबेरै उठ्छु।"
        ),
        VocabularyWord(
            id = "time_4",
            hindi = "शाम",
            transliteration = "Shaam",
            english = "Evening",
            nepali = "साँझ",
            category = "Time",
            exampleSentenceHindi = "शाम को गंगा आरती देखने चलते हैं।",
            exampleSentenceTranslit = "Shaam ko Ganga aarti dekhne chalte hain.",
            exampleSentenceEn = "Let's go watch Ganga Aarti in the evening.",
            exampleSentenceNe = "साँझमा गंगा आरती हेर्न जाऔं।"
        ),
        VocabularyWord(
            id = "time_5",
            hindi = "समय / वक़्त",
            transliteration = "Samay / Waqt",
            english = "Time",
            nepali = "समय",
            category = "Time",
            exampleSentenceHindi = "अभी क्या समय हुआ है?",
            exampleSentenceTranslit = "Abhi kya samay hua hai?",
            exampleSentenceEn = "What time is it right now?",
            exampleSentenceNe = "अहिले कति बज्यो? (के समय भयो?)"
        ),

        // Colors
        VocabularyWord(
            id = "col_1",
            hindi = "लाल",
            transliteration = "Laal",
            english = "Red",
            nepali = "रातो",
            category = "Colors",
            exampleSentenceHindi = "गुलाब का फूल लाल होता है।",
            exampleSentenceTranslit = "Gulaab ka phool laal hota hai.",
            exampleSentenceEn = "The rose flower is red.",
            exampleSentenceNe = "गुलाबको फूल रातो हुन्छ।"
        ),
        VocabularyWord(
            id = "col_2",
            hindi = "नीला",
            transliteration = "Neela",
            english = "Blue",
            nepali = "नीलो",
            category = "Colors",
            exampleSentenceHindi = "साफ़ आसमान नीला दिखाई देता है।",
            exampleSentenceTranslit = "Saaf aasmaan neela dikhai deta hai.",
            exampleSentenceEn = "A clear sky appears blue.",
            exampleSentenceNe = "सफा आकाश नीलो देखिन्छ।"
        ),
        VocabularyWord(
            id = "col_3",
            hindi = "हरा",
            transliteration = "Hara",
            english = "Green",
            nepali = "हरियो",
            category = "Colors",
            exampleSentenceHindi = "पेड़-पौधे हरे-भरे हैं।",
            exampleSentenceTranslit = "Ped-paudhe hare-bhare hain.",
            exampleSentenceEn = "The trees and plants are lush green.",
            exampleSentenceNe = "रुख-बिरुवा हरियाली छन्।"
        ),
        VocabularyWord(
            id = "col_4",
            hindi = "पीला",
            transliteration = "Peela",
            english = "Yellow",
            nepali = "पहेंलो",
            category = "Colors",
            exampleSentenceHindi = "पका हुआ आम पीला होता है।",
            exampleSentenceTranslit = "Paka hua aam peela hota hai.",
            exampleSentenceEn = "A ripe mango is yellow.",
            exampleSentenceNe = "पाकेको आँप पहेंलो हुन्छ।"
        ),
        VocabularyWord(
            id = "col_5",
            hindi = "सफ़ेद",
            transliteration = "Safed",
            english = "White",
            nepali = "सेतो",
            category = "Colors",
            exampleSentenceHindi = "बर्फ़ का रंग सफ़ेद होता है।",
            exampleSentenceTranslit = "Barf ka rang safed hota hai.",
            exampleSentenceEn = "The color of snow is white.",
            exampleSentenceNe = "हिउँको रङ सेतो हुन्छ।"
        ),

        // Emergency & Essentials
        VocabularyWord(
            id = "emg_1",
            hindi = "मदद कीजिए",
            transliteration = "Madad kijiye",
            english = "Help me please",
            nepali = "सहयोग गर्नुहोस् / मद्दत गर्नुहोस्",
            category = "Essentials",
            exampleSentenceHindi = "कृपया मेरी मदद कीजिए, मुझे अस्पताल जाना है।",
            exampleSentenceTranslit = "Kripya meri madad kijiye, mujhe aspatal jaana hai.",
            exampleSentenceEn = "Please help me, I need to go to the hospital.",
            exampleSentenceNe = "कृपया मलाई सहयोग गर्नुहोस्, म अस्पताल जानु छ।"
        ),
        VocabularyWord(
            id = "emg_2",
            hindi = "आपका नाम क्या है?",
            transliteration = "Aapka naam kya hai?",
            english = "What is your name?",
            nepali = "तपाईंको नाम के हो?",
            category = "Essentials",
            exampleSentenceHindi = "नमस्ते जी, आपका शुभ नाम क्या है?",
            exampleSentenceTranslit = "Namaste ji, aapka shubh naam kya hai?",
            exampleSentenceEn = "Hello sir/ma'am, what is your good name?",
            exampleSentenceNe = "नमस्ते, तपाईंको शुभ नाम के हो?"
        ),
        VocabularyWord(
            id = "emg_3",
            hindi = "मेरा नाम ... है",
            transliteration = "Mera naam ... hai",
            english = "My name is ...",
            nepali = "मेरो नाम ... हो",
            category = "Essentials",
            exampleSentenceHindi = "मेरा नाम राहुल है।",
            exampleSentenceTranslit = "Mera naam Rahul hai.",
            exampleSentenceEn = "My name is Rahul.",
            exampleSentenceNe = "मेरो नाम राहुल हो।"
        ),
        VocabularyWord(
            id = "emg_4",
            hindi = "यह कितने का है?",
            transliteration = "Yeh kitne ka hai?",
            english = "How much is this?",
            nepali = "यो कतिको हो? / यसको कति पर्छ?",
            category = "Essentials",
            exampleSentenceHindi = "भैया, यह फल कितने का है?",
            exampleSentenceTranslit = "Bhaiya, yeh phal kitne ka hai?",
            exampleSentenceEn = "Brother, how much is this fruit for?",
            exampleSentenceNe = "दाइ, यो फलफूलको कति पर्छ?"
        )
    )

    val categories: List<String> = listOf("All", "Greetings", "Numbers", "Family", "Food", "Travel", "Time", "Colors", "Essentials")
}
