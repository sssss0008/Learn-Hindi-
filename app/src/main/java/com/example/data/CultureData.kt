package com.example.data

import com.example.model.CultureArticle
import com.example.model.CultureCategory

object CultureData {
    val articles: List<CultureArticle> = listOf(
        CultureArticle(
            id = "cult_diwali",
            category = CultureCategory.FESTIVALS,
            titleEn = "Diwali (दीपावली) — The Festival of Lights",
            titleHi = "दीपावली: अंधकार पर प्रकाश की विजय का महापर्व",
            titleNe = "दीपावली / तिहार: उज्यालो र खुसीयालीको महान् चाड",
            subtitleEn = "Celebrating the return of Lord Rama to Ayodhya, prosperity with Goddess Lakshmi, and inner awakening.",
            subtitleHi = "दीपों की जगमगाहट, माँ लक्ष्मी का पूजन और सत्य की असत्य पर विजय।",
            subtitleNe = "दीपावली र तिहारमा दियो बालेर धनकी देवी लक्ष्मीको पूजा गरिन्छ।",
            descriptionEn = "Diwali, or Deepawali, is the most celebrated festival in the Hindi heartland and across South Asia. Homes are illuminated with earthen clay oil lamps (diyas), intricate colored floor designs (rangoli), and sweets are shared among neighbors and families. Symbolically, lighting the lamp represents destroying the darkness of ignorance with the light of knowledge and wisdom.",
            descriptionHi = "दीपावली भारत और विश्व भर में भारतीय मूल के लोगों द्वारा मनाया जाने वाला सबसे भव्य त्योहार है। मिट्टी के दीयों (दीपकों) से घरों को सजाया जाता है। यह त्योहार भगवान श्री राम के १४ वर्ष के वनवास के बाद अयोध्या लौटने की स्मृति में मनाया जाता है। व्यापारी इस दिन नए बही-खाते शुरू करते हैं और माँ लक्ष्मी तथा गणेश जी की पूजा की जाती है।",
            descriptionNe = "दीपावलीलाई नेपालमा तिहारको रूपमा पनि भव्य रूपले मनाइन्छ। लक्ष्मी पूजाको दिन घर-घरमा माटोको दियो, बत्ती र झिलिमिली बालेर लक्ष्मी भित्र्याइन्छ। यसले अज्ञानताको अन्धकार हटाएर ज्ञान र समृद्धिको उज्यालो फैलाउने सन्देश दिन्छ।",
            keyFactsEn = listOf(
                "Celebrated on Kartik Amavasya (new moon night).",
                "Clay lamps called 'Diya' (दीया) are filled with mustard or sesame oil.",
                "Sweets like Kaju Katli, Ladoo, and Gujiya are prepared and gifted.",
                "Shared closely between India and Nepal with deep spiritual joy."
            ),
            keyFactsHi = listOf(
                "कार्तिक मास की अमावस्या को मनाया जाता है।",
                "मिट्टी के दीये जलाकर पूरे घर-आँगन को आलोकित किया जाता है।",
                "काजू कतली, बेसन के लड्डू और पकवान बांटे जाते हैं।",
                "यह ज्ञान, समृद्धि और पारिवारिक सद्भाव का प्रतीक है।"
            ),
            keyFactsNe = listOf(
                "कार्तिक कृष्ण औँसीका दिन लक्ष्मी पूजा गरिन्छ।",
                "माटाका पाला (दियो) र फूलमालाले घर सिँगारिन्छ।",
                "सेलरोटी, अनरसा र विभिन्न मिठाईहरू बाँडिन्छन्।",
                "दुवै देशमा यो उमङ्ग र उज्यालोको चाड हो।"
            ),
            iconResName = "ic_culture_diwali"
        ),
        CultureArticle(
            id = "cult_chhath",
            category = CultureCategory.FESTIVALS,
            titleEn = "Chhath Puja (छठ पूजा) — The Solar Thanksgiving",
            titleHi = "छठ पूजा: सूर्योपासना और प्रकृति के प्रति कृतज्ञता",
            titleNe = "छठ पर्व: सूर्यदेवको आराधना र प्रकृति पूजन",
            subtitleEn = "Ancient Vedic sun worship uniting Bihar, Eastern Uttar Pradesh, and the Terai-Madhesh of Nepal.",
            subtitleHi = "छठी मइया और प्रत्यक्ष देवता भगवान भास्कर को पवित्र अर्घ्य।",
            subtitleNe = "नेपालको तराई-मधेश र भारतको बिहार-उत्तर प्रदेशलाई जोड्ने सांस्कृतिक पर्व।",
            descriptionEn = "Chhath Puja is one of the purest and oldest Vedic rituals dedicated to Lord Surya (Sun) and Chhathi Maiya. Vratis (devotees) fast for 36 hours without water, standing waist-deep in holy rivers to offer 'Arghya' to both the setting and rising sun. It is unique because it honors both sunset and sunrise, reminding us that every descent is followed by an ascent.",
            descriptionHi = "छठ पूजा बिहार, झारखंड, पूर्वांचल और नेपाल के तराई क्षेत्र का सबसे पवित्र महापर्व है। यह पूर्णतः स्वच्छता, संयम और प्रकृति प्रेम पर आधारित है। व्रती ३६ घंटे का निर्जला व्रत रखते हैं और डूबते हुए तथा उगते हुए सूर्य को अर्घ्य देते हैं। ठेकुआ का प्रसाद इस पर्व की विशिष्ट पहचान है।",
            descriptionNe = "छठ पर्व नेपालको तराई क्षेत्र र भारतका विभिन्न भागमा श्रद्धा र निष्ठापूर्वक मनाइन्छ। यसमा अस्ताउँदो र उदाउँदो सूर्यलाई नदी वा जलाशयमा उभिएर अर्घ्य दिइन्छ। ठेकुवा, भुसुवा र मौसमी फलफूल प्रसादका रूपमा चढाइन्छ।",
            keyFactsEn = listOf(
                "Only festival where the setting sun (Sandhya Arghya) is worshipped first.",
                "Pure traditional prasad called 'Thekua' made with jaggery, wheat, and ghee.",
                "Strong cultural bridge directly connecting India and Nepal.",
                "Eco-friendly, celebrating rivers, ponds, and solar energy."
            ),
            keyFactsHi = listOf(
                "अस्ताचलगामी (डूबते) सूर्य को पहला अर्घ्य दिया जाता है।",
                "गुड़ और गेहूं के आटे से बना 'ठेकुआ' मुख्य प्रसाद है।",
                "यह भारत और नेपाल की साझी लोक आस्था का जीवंत प्रतीक है।",
                "बिना किसी पुरोहित के सीधा प्रकृति से संवाद करने वाला पर्व है।"
            ),
            keyFactsNe = listOf(
                "पहिलो दिन अस्ताउँदो सूर्यलाई र भोलिपल्ट बिहान उदाउँदो सूर्यलाई अर्घ्य दिइन्छ।",
                "गहुँको पिठो र सख्खरबाट बनेको 'ठेकुवा' मुख्य प्रसाद हो।",
                "नेपाल र भारतका लाखौं भक्तजन एकै भावमा सामेल हुन्छन्।"
            ),
            iconResName = "ic_culture_diwali"
        ),
        CultureArticle(
            id = "cult_history_devanagari",
            category = CultureCategory.HISTORY,
            titleEn = "Devanagari Script & Roots of Hindi",
            titleHi = "देवनागरी लिपि और हिन्दी भाषा का उद्भव",
            titleNe = "देवनागरी लिपि र हिन्दी-नेपालीको भाषा उद्भव",
            subtitleEn = "How Brahmi evolved into Devanagari, the phonetic script of Hindi, Nepali, and Sanskrit.",
            subtitleHi = "ब्राह्मी से नागरी और वैज्ञानिक ध्वन्यात्मक लिपि का क्रमिक विकास।",
            subtitleNe = "ब्राह्मी लिपिबाट विकसित भएको वैज्ञानिक देवनागरी लिपि।",
            descriptionEn = "Devanagari is hailed by modern linguists as one of the most scientific writing systems in human history. Every character has exactly one fixed sound; words are spoken exactly as they are written. Hindi originates from the Indo-Aryan branch of Indo-European languages, having descended from Vedic Sanskrit through Prakrit and Apabhramsha stages into modern Khari Boli Hindi.",
            descriptionHi = "देवनागरी लिपि का विकास प्राचीन ब्राह्मी लिपि से गुप्त काल और सिद्धमातृका के माध्यम से हुआ। 'देवनागरी' का अर्थ है 'देवताओं के नगर की लिपि'। यह पूर्णतः वैज्ञानिक लिपि है जिसमें जैसा बोला जाता है, वैसा ही लिखा जाता है। हिन्दी आधुनिक समय में विश्व की तीसरी सबसे अधिक बोली जाने वाली भाषा है।",
            descriptionNe = "नेपाली र हिन्दी दुवै भाषाहरू देवनागरी लिपिमा लेखिन्छन्। यसको विकास प्राचीन ब्राह्मी लिपिबाट भएको हो। देवनागरी लिपि ध्वन्यात्मक रूपमा संसारकै सबैभन्दा वैज्ञानिक लिपिहरू मध्ये एक मानिन्छ।",
            keyFactsEn = listOf(
                "Devanagari uses a horizontal top line called 'Shirorekha' (शिरोरेखा).",
                "Consonants and vowels are arranged phonetically by point of articulation (throat, palate, teeth, lips).",
                "Shares script with Sanskrit, Hindi, Nepali, and Marathi."
            ),
            keyFactsHi = listOf(
                "प्रत्येक अक्षर के ऊपर 'शिरोरेखा' बांधी जाती है।",
                "ध्वनियों का वर्गीकरण उच्चारण स्थान (कण्ठ्य, तालव्य, मूर्धन्य, दन्त्य, ओष्ठ्य) के अनुसार है।",
                "संस्कृत, हिन्दी, नेपाली, मराठी आदि भाषाओं की साझा लिपि।"
            ),
            keyFactsNe = listOf(
                "अक्षरहरूको माथि तेर्सो रेखा 'शिरोरेखा' तानिन्छ।",
                "ध्वनि उच्चारण स्थानका आधारमा वैज्ञानिक वर्गीकरण गरिएको छ।",
                "नेपाली, हिन्दी र संस्कृतको साझा लिपि।"
            ),
            iconResName = "ic_culture_monument"
        ),
        CultureArticle(
            id = "cult_history_varanasi",
            category = CultureCategory.HISTORY,
            titleEn = "Varanasi (Kashi) & Sacred Heritage",
            titleHi = "काशी (वाराणसी): भारतीय संस्कृति और साहित्य की शाश्वत नगरी",
            titleNe = "वाराणसी र काठमाडौँको ऐतिहासिक आध्यात्मिक सम्बन्ध",
            subtitleEn = "The spiritual capital of India along the sacred river Ganga, revered by poets and scholars.",
            subtitleHi = "८४ घाट, माँ गंगा की धारा और कबीर, तुलसी, प्रेमचंद की पावन कर्मभूमि।",
            subtitleNe = "काशी विश्वनाथ र पशुपतिनाथ बीचको सनातन सम्बन्ध।",
            descriptionEn = "Varanasi (also known as Kashi and Benares) is one of the world's oldest living cities. Mark Twain famously wrote that Varanasi is older than history, older than tradition, older even than legend. It has been the crucible of Hindi literature and classical arts, where Tulsidas composed the Ramcharitmanas and Kabir sang his timeless dohas on the Ghats.",
            descriptionHi = "वाराणसी को ज्ञान की नगरी कहा जाता है। गंगा के तट पर बने ८४ घाटों पर सुबह की 'सुबहे-बनारस' और शाम की 'गंगा आरती' अद्वितीय आध्यात्मिक अनुभव कराती है। यहाँ काशी विश्वनाथ मंदिर और नेपाली मंदिर (पशुपतिनाथ मंदिर, ललिता घाट) स्थित है जो भारत और नेपाल के प्राचीन संबंधों का अटूट प्रमाण है।",
            descriptionNe = "वाराणसीको ललिता घाटमा नेपालका राजाले बनाएको काष्ठकलायुक्त नेपाली मन्दिर (पशुपतिनाथ मन्दिर) अवस्थित छ। यसले दुई देशको सयौं वर्ष पुरानो सांस्कृतिक सम्बन्धलाई प्रत्यक्ष देखाउँछ।",
            keyFactsEn = listOf(
                "Famous for 84 historic stone ghats along the Ganges river.",
                "Features the historic Nepali Temple on Lalita Ghat built in traditional pagoda style.",
                "Home to Banarasi silk sarees and rich Hindustani classical music traditions."
            ),
            keyFactsHi = listOf(
                "८४ पावन घाटों पर अवस्थित प्राचीन सांस्कृतिक केंद्र।",
                "ललिता घाट पर प्रसिद्ध काष्ठ-निर्मित नेपाली पशुपतिनाथ मंदिर।",
                "कबीर, तुलसीदास, भारतेन्दु हरिश्चंद्र और प्रेमचंद की कर्मस्थली।"
            ),
            keyFactsNe = listOf(
                "ललिता घाटमा नेपाली प्यागोडा शैलीको पशुपतिनाथ मन्दिर छ।",
                "ज्ञान, दर्शन र संस्कृत शिक्षाको ऐतिहासिक केन्द्र।"
            ),
            iconResName = "ic_culture_monument"
        ),
        CultureArticle(
            id = "cult_lit_premchand",
            category = CultureCategory.LITERATURE,
            titleEn = "Munshi Premchand — The Storyteller of the Soil",
            titleHi = "मुंशी प्रेमचंद: हिन्दी कथा साहित्य के 'उपन्यास सम्राट'",
            titleNe = "मुन्शी प्रेमचन्द: हिन्दी कथा साहित्यका सम्राट",
            subtitleEn = "Champion of realism, depicting rural life, empathy, and social reform in Hindi literature.",
            subtitleHi = "'गोदान', 'कफ़न', 'ईदगाह' और 'पंच परमेश्वर' के अमर रचयिता।",
            subtitleNe = "गाउँले जनजीवन, गरिबी र मानवीय संवेदनाका अमर कथाकार।",
            descriptionEn = "Dhanpat Rai Shrivastava, known by his pen name Munshi Premchand (1880–1936), revolutionized modern Hindi and Urdu literature. He took storytelling away from kings and fairies and grounded it firmly in the real struggles of ordinary farmers, laborers, and women. His masterpieces like 'Godaan' (The Gift of a Cow) and 'Eidgah' touch millions of hearts with their deep human compassion.",
            descriptionHi = "प्रेमचंद को हिन्दी साहित्य में 'उपन्यास सम्राट' की उपाधि प्राप्त है। उन्होंने अपनी कहानियों और उपन्यासों में भारत के ग्रामीण जीवन, किसानों की पीड़ा, सामाजिक कुरीतियों और मानवीय संवेदनाओं को सजीव रूप में प्रस्तुत किया। उनकी भाषा अत्यंत सरल, मुहावरेदार और आम जनमानस के करीब है।",
            descriptionNe = "मुन्शी प्रेमचन्दका कथाहरू नेपालका विद्यालय तथा विश्वविद्यालयमा पनि खुब रुचिका साथ पढाइन्छ। उनको 'ईदगाह' कथामा हामिद र उसकी हजुरआमाको प्रेमले जो कोहीको आँखा रसाउँछ।",
            keyFactsEn = listOf(
                "Wrote nearly 300 short stories and more than a dozen classic novels.",
                "'Eidgah' tells the touching story of young Hamid buying tongs for his grandmother.",
                "'Godaan' is regarded as one of the greatest novels in Indian literature."
            ),
            keyFactsHi = listOf(
                "लगभग ३०० अमर कहानियाँ और प्रसिद्ध उपन्यास लिखे।",
                "'ईदगाह' में बालक हामिद अपनी दादी के लिए चिमटा खरीदता है।",
                "'गोदान' भारतीय कृषक जीवन का अमर महाकाव्य माना जाता है।"
            ),
            keyFactsNe = listOf(
                "नेपाली पाठकहरूमा पनि प्रेमचन्दका कृतिहरू निकै लोकप्रिय छन्।",
                "मानवीय संवेदना र सामाजिक सुधारका पक्षधर।"
            ),
            iconResName = "ic_culture_literature"
        ),
        CultureArticle(
            id = "cult_lit_kabir",
            category = CultureCategory.LITERATURE,
            titleEn = "Sant Kabir Das — Doha Master of Wisdom",
            titleHi = "संत कबीर दास: दोहों के माध्यम से मानवता का संदेश",
            titleNe = "सन्त कबीर दास: साँचो मानवता र सद्भावका प्रतीक",
            subtitleEn = "15th-century mystic poet who taught universal love, humility, and inner truth.",
            subtitleHi = "'पोथी पढ़ि पढ़ि जग मुआ, पंडित भया न कोय... ढाई आखर प्रेम का, पढ़े सो पंडित होय'",
            subtitleNe = "जातपात र आडम्बर विरोधी, प्रेम र सत्यका अमर कवि।",
            descriptionEn = "Sant Kabir was a 15th-century mystic poet and saint whose couplets (dohas) are memorized across schools, villages, and assemblies in India and Nepal. He criticized hollow dogmatism and urged humanity to see the divine presence inside every living creature. His language, known as 'Sadhukkadi' or Panchmel Khichdi, blended Khari Boli, Braj, Awadhi, and Punjabi.",
            descriptionHi = "कबीर दास जी निर्गुण भक्ति धारा के महान संत थे। उन्होंने सामाजिक भेदभाव, पाखंड और आडंबरों पर कड़ा प्रहार किया। उनके दोहे आज भी जीवन के व्यावहारिक सत्य और नैतिक मूल्यों का सबसे श्रेष्ठ मार्गदर्शन करते हैं।",
            descriptionNe = "कबीरका दोहाहरूले सरल भाषामा जीवनको गहिरो दर्शन सिकाउँछन्। प्रेम र आपसी सद्भाव नै सबैभन्दा ठूलो धर्म हो भन्ने उनको मूल सन्देश थियो।",
            keyFactsEn = listOf(
                "Master of 2-line rhyming couplets (Dohas) packed with timeless philosophy.",
                "Advocated universal equality beyond caste, creed, and dogma.",
                "His verses are sung in classical, folk, and Sufi music."
            ),
            keyFactsHi = listOf(
                "दो पंक्तियों के दोहों में जीवन का गूढ़ सत्य पिरोया।",
                "मानवता, करुणा और आत्मानुभूति पर बल दिया।",
                "साखी, सबद और रमैनी उनकी प्रमुख वाणियाँ हैं।"
            ),
            keyFactsNe = listOf(
                "संसारभरिका साधक र साहित्यप्रेमीहरू कबीरका दोहाबाट प्रेरित छन्।",
                "सद्भाव र समानताको अमर उद्घोष।"
            ),
            iconResName = "ic_culture_literature"
        ),
        CultureArticle(
            id = "cult_bridge_nepal_india",
            category = CultureCategory.BRIDGE,
            titleEn = "The Hindi-Nepali Linguistic & Cultural Bridge",
            titleHi = "हिन्दी-नेपाली भाषाई और सांस्कृतिक सेतु",
            titleNe = "नेपाली र हिन्दी बीचको भाषिक र सांस्कृतिक मितेरी",
            subtitleEn = "Exploring the deep Sanskrit heritage, Janakpur-Ayodhya corridor, and natural kinship.",
            subtitleHi = "सांस्कृतिक आत्मीयता, जनकपुर-अयोध्या का संबंध और देवनागरी की अटूट कड़ी।",
            subtitleNe = "साझा देवनागरी लिपि, संस्कृत मूल र खुला सिमानाको आत्मीय भ्रातृत्व।",
            descriptionEn = "Hindi and Nepali are sister languages born of the same mother Sanskrit. Both share the Devanagari script, identical grammatical word orders (Subject-Object-Verb), and thousands of identical vocabulary words (Tatsama words like जल, मित्र, शान्ति, सूर्य, विद्या, नमस्ते, धन्यवाद). The sacred Ramayana tradition connects Ayodhya in India with Janakpurdham in Nepal, celebrating the eternal bond of Shri Ram and Mata Sita.",
            descriptionHi = "नेपाल और भारत के बीच का संबंध केवल भौगोलिक नहीं, अपितु आत्मा और संस्कृति का गहरा नाता है। जनकपुर धाम (माता सीता की जन्मस्थली) और अयोध्या का संबंध सदियों से दोनों राष्ट्रों को एक सूत्र में पिरोता है। हिन्दी बोलने वालों के लिए नेपाली समझना और नेपाली भाषियों के लिए हिन्दी सीखना संसार में सबसे सहज भाषाई अनुभवों में से एक है।",
            descriptionNe = "नेपाल र भारत बीच रोटी-बेटी र सांस्कृतिक-आध्यात्मिक गहिरो सम्बन्ध छ। माता सीताको पवित्र जन्मभूमि जनकपुरधाम र अयोध्याको नाता यसको मुख्य आधार हो। दुवै भाषा देवनागरीमा लेखिने र ६०% भन्दा बढी शब्द संस्कृतबाट आएकाले नेपाली भाषीलाई हिन्दी सिक्न संसारकै सबैभन्दा सजिलो हुन्छ।",
            keyFactsEn = listOf(
                "Shared Devanagari script and phonetic rules.",
                "Over 60% shared cognate words derived directly from Sanskrit.",
                "Janakpur and Ayodhya connected by deep historical Ramayana cultural corridor.",
                "Mutual warmth, shared cinema, literature, and family ties."
            ),
            keyFactsHi = listOf(
                "साझा देवनागरी वर्णमाला और समान व्याकरण संरचना।",
                "संस्कृत के हजारों तत्सम शब्द दोनों भाषाओं में समान रूप से प्रयुक्त होते हैं।",
                "जनकपुर धाम और अयोध्या के मध्य आध्यात्मिक सांस्कृतिक गलियारा।",
                "पारस्परिक प्रेम, साहित्य, संगीत और सिनेमा का आदान-प्रदान।"
            ),
            keyFactsNe = listOf(
                "समान लिपि, समान वर्णमाला र उस्तै वाक्य संरचना (SOV)।",
                "संस्कृतबाट आएका हजारौं साझा शब्दहरू।",
                "जनकपुर र अयोध्या बीचको पौराणिक सम्बन्ध।",
                "नेपालीलाई हिन्दी र हिन्दीभाषीलाई नेपाली सिक्न अत्यन्तै सहज।"
            ),
            iconResName = "ic_nepal_india_bridge"
        )
    )
}
