package com.example.data

import com.example.model.ConversationItem
import com.example.model.DialogueLine

object ConversationData {
    val conversations: List<ConversationItem> = listOf(
        ConversationItem(
            id = "conv_market",
            titleEn = "At the Market (Bargaining & Buying)",
            titleHi = "बाज़ार में फल-सब्जी की खरीदारी",
            titleNe = "बजारमा फलफूल तथा तरकारी किनमेल",
            situationEn = "You are buying fresh mangoes and vegetables at a local market in Delhi or Varanasi.",
            situationHi = "आप फल-सब्जी की दुकान पर खरीदारी और मोलभाव कर रहे हैं।",
            situationNe = "तपाईं स्थानीय बजारमा फलफूल र तरकारी किनमेल गर्दै हुनुहुन्छ।",
            dialogue = listOf(
                DialogueLine("Customer", "नमस्ते भैया, यह आम कैसे दिए?", "Namaste bhaiya, yeh aam kaise diye?", "Hello brother, how much are these mangoes?", "नमस्ते दाइ, यो आँप कसरी दिनुभयो?"),
                DialogueLine("Shopkeeper", "नमस्ते जी! अस्सी रुपये किलो हैं, एकदम मीठे हैं।", "Namaste ji! Assi rupaye kilo hain, ekdam meethe hain.", "Hello sir! Eighty rupees per kilo, absolutely sweet.", "नमस्ते हजुर! असी रुपैयाँ किलो हो, एकदमै गुलियो छ।"),
                DialogueLine("Customer", "कुछ कम कीजिए, साठ रुपये लगा लीजिए?", "Kuch kam kijiye, saath rupaye laga lijiye?", "Reduce it a bit, will you take sixty rupees?", "अलिकति कम गर्नुहोस् न, साठी रुपैयाँ लिनुहुन्छ?"),
                DialogueLine("Shopkeeper", "चलिए, आपके लिए सत्तर रुपये प्रति किलो लगा दूँगा।", "Chaliye, aapke liye sattar rupaye prati kilo laga doonga.", "Alright, for you I will make it seventy rupees per kilo.", "ल ठीक छ, तपाईंको लागि सत्तरी रुपैयाँ किलो दिन्छु।"),
                DialogueLine("Customer", "ठीक है, दो किलो ताज़े आम तौल दीजिए। धन्यवाद!", "Theek hai, do kilo taaze aam taul dijiye. Dhanyavaad!", "Alright, please weigh two kilos of fresh mangoes. Thank you!", "हुन्छ, दुई किलो ताजा आँप जोखी दिनुहोस्। धन्यवाद!")
            )
        ),
        ConversationItem(
            id = "conv_restaurant",
            titleEn = "Ordering Food at a Dhaba / Restaurant",
            titleHi = "होटल / ढाबे में स्वादिष्ट भोजन मँगाना",
            titleNe = "होटल तथा रेस्टुरेन्टमा खाना अर्डर गर्दा",
            situationEn = "Ordering dinner at a traditional Indian dining hall or roadside dhaba.",
            situationHi = "शाम के समय ढाबे पर दाल मखनी, रोटी और चाय मँगाना।",
            situationNe = "साँझमा ढाबा वा रेस्टुरेन्टमा मिठो खाना मगाउँदा।",
            dialogue = listOf(
                DialogueLine("Waiter", "नमस्ते जी, आप क्या लेना पसंद करेंगे?", "Namaste ji, aap kya lena pasand karenge?", "Hello sir/ma'am, what would you like to have?", "नमस्ते हजुर, तपाईं के लिन मन पराउनुहुन्छ?"),
                DialogueLine("Guest", "मेन्यू में आज की विशेष थाली में क्या है?", "Menu mein aaj ki vishesh thaali mein kya hai?", "What is in today's special thali on the menu?", "मेनुमा आजको विशेष थालीमा के के छ?"),
                DialogueLine("Waiter", "दाल मखनी, पनीर की सब्ज़ी, गरम रोटियाँ और बासमती चावल।", "Daal makhani, paneer ki sabzi, garam rotiyan aur basmati chaaval.", "Dal makhani, paneer curry, hot flatbreads, and basmati rice.", "दाल मखनी, पनिरको तरकारी, तातो रोटी र बासमती चामल।"),
                DialogueLine("Guest", "बहुत बढ़िया! एक स्पेशल थाली और एक कप मसाला चाय ले आइए।", "Bahut badhiya! Ek special thaali aur ek cup masala chai le aaiye.", "Great! Please bring one special thali and a cup of spiced tea.", "धेरै राम्रो! एक स्पेशल थाली र एक कप मसला चिया ल्याउनुहोस्।"),
                DialogueLine("Waiter", "जी बिल्कुल, दस मिनट में आपका खाना आ जाएगा।", "Ji bilkul, das minute mein aapka khaana aa jaayega.", "Yes certainly, your food will arrive in ten minutes.", "हवस, दश मिनेटमा तपाईंको खाना आइपुग्नेछ।")
            )
        ),
        ConversationItem(
            id = "conv_direction",
            titleEn = "Asking for Directions on the Street",
            titleHi = "सड़क पर किसी से रास्ता पूछना",
            titleNe = "बाटोमा कसैलाई ठेगाना वा बाटो सोध्दा",
            situationEn = "You are looking for the historic temple or railway station.",
            situationHi = "आप किसी नए शहर में प्रसिद्ध मंदिर या स्टेशन का रास्ता पूछ रहे हैं।",
            situationNe = "नयाँ ठाउँमा प्रसिद्ध मन्दिर वा रेल स्टेशनको बाटो सोध्दै।",
            dialogue = listOf(
                DialogueLine("Traveler", "माफ़ कीजिए भाई साहब, क्या आप बता सकते हैं स्टेशन किधर है?", "Maaf kijiye bhai sahab, kya aap bata sakte hain station kidhar hai?", "Excuse me sir, could you tell me which way the station is?", "माफ गर्नुहोस् दाजु, स्टेशन कता पर्छ बताउन सक्नुहुन्छ?"),
                DialogueLine("Local", "हाँ ज़रूर, यहाँ से सीधे जाइए और पहले चौराहे से दाएँ मुड़िए।", "Haan zaroor, yahan se seedhe jaaiye aur pehle chauraahe se daayein mudiye.", "Yes surely, go straight from here and turn right at the first crossing.", "हजुर अवश्य, यहाँबाट सिधा जानुहोस् र पहिलो चोकबाट दायाँ मोडिनुहोस्।"),
                DialogueLine("Traveler", "क्या वहाँ तक पैदल जाना आसान है?", "Kya wahan tak paidal jaana aasan hai?", "Is it easy to walk up to there?", "के त्यहाँसम्म हिँडेर जान सजिलो छ?"),
                DialogueLine("Local", "हाँ, सिर्फ़ पाँच मिनट का पैदल रास्ता है।", "Haan, sirf paanch minute ka paidal raasta hai.", "Yes, it is only a five minute walking distance.", "हजुर, जम्मा पाँच मिनेटको पैदल बाटो हो।"),
                DialogueLine("Traveler", "आपका बहुत-बहुत धन्यवाद!", "Aapka bahut bahut dhanyavaad!", "Thank you very much!", "तपाईंलाई धेरै धेरै धन्यवाद!")
            )
        ),
        ConversationItem(
            id = "conv_intro",
            titleEn = "Self Introduction & Making Friends",
            titleHi = "अपना परिचय देना और नए मित्र बनाना",
            titleNe = "आफ्नो परिचय दिने र नयाँ साथी बनाउने",
            situationEn = "Meeting someone new in college, travel, or an event.",
            situationHi = "पहली बार किसी से मिलना और मैत्रीपूर्ण बातचीत करना।",
            situationNe = "पहिलो पटक कसैसँग भेटेर कुराकानी गर्दा।",
            dialogue = listOf(
                DialogueLine("Person A", "नमस्ते! मेरा नाम राहुल है। आपका नाम क्या है?", "Namaste! Mera naam Rahul hai. Aapka naam kya hai?", "Hello! My name is Rahul. What is your name?", "नमस्ते! मेरो नाम राहुल हो। तपाईंको नाम के हो?"),
                DialogueLine("Person B", "नमस्ते राहुल! मेरा नाम अविष्कार है। आपसे मिलकर बहुत खुशी हुई।", "Namaste Rahul! Mera naam Awiskar hai. Aapse milkar bahut khushi hui.", "Hello Rahul! My name is Awiskar. Very pleased to meet you.", "नमस्ते राहुल! मेरो नाम अविष्कार हो। तपाईंसँग भेटेर धेरै खुसी लाग्यो।"),
                DialogueLine("Person A", "आप कहाँ के रहने वाले हैं?", "Aap kahan ke rehne waale hain?", "Where are you from originally?", "तपाईं कहाँको बासिन्दा हुनुहुन्छ?"),
                DialogueLine("Person B", "मैं नेपाल से हूँ और हिन्दी भाषा सीख रहा हूँ।", "Main Nepal se hoon aur Hindi bhasha seekh raha hoon.", "I am from Nepal and I am learning the Hindi language.", "म नेपालबाट हुँ र हिन्दी भाषा सिक्दैछु।"),
                DialogueLine("Person A", "अरे वाह! नेपाल बहुत सुंदर देश है और हमारी संस्कृतियाँ एक जैसी हैं!", "Are waah! Nepal bahut sundar desh hai aur hamari sanskritiyan ek jaisi hain!", "Oh wonderful! Nepal is a very beautiful country and our cultures are so shared!", "वाह! नेपाल धेरै सुन्दर देश हो र हाम्रो संस्कृति एकदमै मिल्दोजुल्दो छ!")
            )
        )
    )
}
