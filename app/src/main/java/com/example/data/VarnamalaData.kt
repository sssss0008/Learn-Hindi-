package com.example.data

import com.example.model.CharType
import com.example.model.VarnamalaItem

object VarnamalaData {
    val vowels: List<VarnamalaItem> = listOf(
        VarnamalaItem(
            character = "अ",
            transliteration = "a",
            type = CharType.SWAR,
            exampleHindi = "अनार (Pomegranate)",
            exampleTransliteration = "Anaar",
            exampleEnglish = "Pomegranate",
            exampleNepali = "अनार",
            descriptionEn = "Short 'a' sound, like 'u' in 'cup'",
            descriptionHi = "ह्रस्व 'अ' ध्वनि (अनार, अमरूद)",
            descriptionNe = "ह्रस्व 'अ' स्वर (अनार)"
        ),
        VarnamalaItem(
            character = "आ",
            transliteration = "aa",
            type = CharType.SWAR,
            exampleHindi = "आम (Mango)",
            exampleTransliteration = "Aam",
            exampleEnglish = "Mango",
            exampleNepali = "आँप",
            descriptionEn = "Long 'aa' sound, like 'a' in 'father'",
            descriptionHi = "दीर्घ 'आ' ध्वनि (आम, आग)",
            descriptionNe = "दीर्घ 'आ' स्वर (आँप)"
        ),
        VarnamalaItem(
            character = "इ",
            transliteration = "i",
            type = CharType.SWAR,
            exampleHindi = "इमली (Tamarind)",
            exampleTransliteration = "Imli",
            exampleEnglish = "Tamarind",
            exampleNepali = "तित्री",
            descriptionEn = "Short 'i' sound, like 'i' in 'pin'",
            descriptionHi = "ह्रस्व 'इ' ध्वनि (इमली, इमारत)",
            descriptionNe = "ह्रस्व 'इ' स्वर (इमली/तित्री)"
        ),
        VarnamalaItem(
            character = "ई",
            transliteration = "ee / ii",
            type = CharType.SWAR,
            exampleHindi = "ईख (Sugarcane)",
            exampleTransliteration = "Eekh",
            exampleEnglish = "Sugarcane",
            exampleNepali = "उखु",
            descriptionEn = "Long 'ee' sound, like 'ee' in 'seed'",
            descriptionHi = "दीर्घ 'ई' ध्वनि (ईख, ईश्वर)",
            descriptionNe = "दीर्घ 'ई' स्वर (उखु/ईश्वर)"
        ),
        VarnamalaItem(
            character = "उ",
            transliteration = "u",
            type = CharType.SWAR,
            exampleHindi = "उल्लू (Owl)",
            exampleTransliteration = "Ullu",
            exampleEnglish = "Owl",
            exampleNepali = "लाटोकोसेरो",
            descriptionEn = "Short 'u' sound, like 'u' in 'put'",
            descriptionHi = "ह्रस्व 'उ' ध्वनि (उल्लू, उपहार)",
            descriptionNe = "ह्रस्व 'उ' स्वर (उल्लू)"
        ),
        VarnamalaItem(
            character = "ऊ",
            transliteration = "oo / uu",
            type = CharType.SWAR,
            exampleHindi = "ऊन (Wool)",
            exampleTransliteration = "Oon",
            exampleEnglish = "Wool",
            exampleNepali = "ऊन",
            descriptionEn = "Long 'oo' sound, like 'oo' in 'moon'",
            descriptionHi = "दीर्घ 'ऊ' ध्वनि (ऊन, ऊपर)",
            descriptionNe = "दीर्घ 'ऊ' स्वर (ऊन)"
        ),
        VarnamalaItem(
            character = "ऋ",
            transliteration = "ri / ru",
            type = CharType.SWAR,
            exampleHindi = "ऋषि (Sage)",
            exampleTransliteration = "Rishi",
            exampleEnglish = "Sage / Hermit",
            exampleNepali = "ऋषि",
            descriptionEn = "Vocalic 'ri' sound, like 'ri' in 'ring'",
            descriptionHi = "वैदिक स्वर 'ऋ' (ऋषि, ऋतु)",
            descriptionNe = "वैदिक स्वर 'ऋ' (ऋषि)"
        ),
        VarnamalaItem(
            character = "ए",
            transliteration = "e",
            type = CharType.SWAR,
            exampleHindi = "एड़ी (Heel)",
            exampleTransliteration = "Edee",
            exampleEnglish = "Heel",
            exampleNepali = "कुर्कुच्चो",
            descriptionEn = "Pure 'e' sound, like 'a' in 'gate'",
            descriptionHi = "स्वर 'ए' (एड़ी, एक)",
            descriptionNe = "स्वर 'ए' (एक)"
        ),
        VarnamalaItem(
            character = "ऐ",
            transliteration = "ai",
            type = CharType.SWAR,
            exampleHindi = "ऐनक (Spectacles)",
            exampleTransliteration = "Ainak",
            exampleEnglish = "Spectacles / Glasses",
            exampleNepali = "चस्मा",
            descriptionEn = "Diphthong 'ai', like 'ai' in 'aisle'",
            descriptionHi = "स्वर 'ऐ' (ऐनक, ऐतिहासिक)",
            descriptionNe = "स्वर 'ऐ' (ऐनक)"
        ),
        VarnamalaItem(
            character = "ओ",
            transliteration = "o",
            type = CharType.SWAR,
            exampleHindi = "ओखली (Mortar)",
            exampleTransliteration = "Okhli",
            exampleEnglish = "Mortar",
            exampleNepali = "ओखल",
            descriptionEn = "Pure 'o' sound, like 'o' in 'boat'",
            descriptionHi = "स्वर 'ओ' (ओखली, ओस)",
            descriptionNe = "स्वर 'ओ' (ओखल)"
        ),
        VarnamalaItem(
            character = "औ",
            transliteration = "au",
            type = CharType.SWAR,
            exampleHindi = "औरत (Woman)",
            exampleTransliteration = "Aurat",
            exampleEnglish = "Woman",
            exampleNepali = "महिला / नारी",
            descriptionEn = "Diphthong 'au', like 'ow' in 'cow'",
            descriptionHi = "स्वर 'औ' (औरत, औषधि)",
            descriptionNe = "स्वर 'औ' (औषधि)"
        ),
        VarnamalaItem(
            character = "अं",
            transliteration = "am / an",
            type = CharType.SWAR,
            exampleHindi = "अंगूर (Grapes)",
            exampleTransliteration = "Angoor",
            exampleEnglish = "Grapes",
            exampleNepali = "अंगुर",
            descriptionEn = "Anusvara nasal sound 'n/m'",
            descriptionHi = "अनुस्वार 'अं' (अंगूर, अंडा)",
            descriptionNe = "अनुस्वार 'अं' (अंगुर)"
        ),
        VarnamalaItem(
            character = "अः",
            transliteration = "ah",
            type = CharType.SWAR,
            exampleHindi = "प्रातः (Morning)",
            exampleTransliteration = "Praatah",
            exampleEnglish = "Morning / Dawn",
            exampleNepali = "बिहानी",
            descriptionEn = "Visarga breath sound ':h'",
            descriptionHi = "विसर्ग ध्वनि 'अः' (अतः, नमः)",
            descriptionNe = "विसर्ग ध्वनि 'अः'"
        )
    )

    val consonants: List<VarnamalaItem> = listOf(
        // Ka-varga (Velar)
        VarnamalaItem("क", "ka", CharType.VYANJAN, "कमल (Lotus)", "Kamal", "Lotus", "कमल", "Unvoiced velar", "कण्ठ्य अघोष अल्पप्राण", "कण्ठ्य क"),
        VarnamalaItem("ख", "kha", CharType.VYANJAN, "खरगोश (Rabbit)", "Khargosh", "Rabbit", "खरायो", "Aspirated velar", "कण्ठ्य महाप्राण", "कण्ठ्य ख"),
        VarnamalaItem("ग", "ga", CharType.VYANJAN, "गमला (Flowerpot)", "Gamla", "Pot", "गमला", "Voiced velar", "कण्ठ्य घोष", "कण्ठ्य ग"),
        VarnamalaItem("घ", "gha", CharType.VYANJAN, "घर (Home)", "Ghar", "House / Home", "घर", "Voiced aspirated velar", "कण्ठ्य घोष महाप्राण", "कण्ठ्य घ"),
        VarnamalaItem("ङ", "nga", CharType.VYANJAN, "वाङ्मय (Literature)", "Vangmay", "Literature", "वाङ्मय", "Nasal velar", "कण्ठ्य नासिक्य", "नासिक्य ङ"),

        // Cha-varga (Palatal)
        VarnamalaItem("च", "cha", CharType.VYANJAN, "चम्मच (Spoon)", "Chammach", "Spoon", "चम्चा", "Palatal stop", "तालव्य अघोष", "तालव्य च"),
        VarnamalaItem("छ", "chha", CharType.VYANJAN, "छतरी (Umbrella)", "Chhatri", "Umbrella", "छाता", "Aspirated palatal", "तालव्य महाप्राण", "तालव्य छ"),
        VarnamalaItem("ज", "ja", CharType.VYANJAN, "जहाज़ (Ship)", "Jahaaz", "Ship", "पानीजहाज", "Voiced palatal", "तालव्य घोष", "तालव्य ज"),
        VarnamalaItem("झ", "jha", CharType.VYANJAN, "झंडा (Flag)", "Jhanda", "Flag", "झण्डा", "Voiced aspirated palatal", "तालव्य घोष महाप्राण", "तालव्य झ"),
        VarnamalaItem("ञ", "nya", CharType.VYANJAN, "चञ्चल (Restless)", "Chanchal", "Playful", "चञ्चल", "Palatal nasal", "तालव्य नासिक्य", "नासिक्य ञ"),

        // Ta-varga (Retroflex)
        VarnamalaItem("ट", "ta (retroflex)", CharType.VYANJAN, "टमाटर (Tomato)", "Tamaatar", "Tomato", "गोलभेंडा", "Retroflex unvoiced", "मूर्धन्य अघोष", "मूर्धन्य ट"),
        VarnamalaItem("ठ", "tha (retroflex)", CharType.VYANJAN, "ठठेरा (Coppersmith)", "Thathera", "Smith", "ठटेरा", "Retroflex aspirated", "मूर्धन्य महाप्राण", "मूर्धन्य ठ"),
        VarnamalaItem("ड", "da (retroflex)", CharType.VYANJAN, "डमरू (Drum)", "Damru", "Small drum", "डमरु", "Retroflex voiced", "मूर्धन्य घोष", "मूर्धन्य ड"),
        VarnamalaItem("ढ", "dha (retroflex)", CharType.VYANJAN, "ढोलक (Drum)", "Dholak", "Folk drum", "ढोलक", "Retroflex aspirated voiced", "मूर्धन्य घोष महाप्राण", "मूर्धन्य ढ"),
        VarnamalaItem("ण", "na (retroflex)", CharType.VYANJAN, "बाण (Arrow)", "Baan", "Arrow", "वाण", "Retroflex nasal", "मूर्धन्य नासिक्य", "मूर्धन्य ण"),

        // Ta-varga (Dental)
        VarnamalaItem("त", "ta (dental)", CharType.VYANJAN, "तरबूज (Watermelon)", "Tarbooz", "Watermelon", "खर्बुजा", "Dental unvoiced", "दन्त्य अघोष", "दन्त्य त"),
        VarnamalaItem("थ", "tha (dental)", CharType.VYANJAN, "थरमस (Flask)", "Thermos", "Flask", "थर्मस", "Dental aspirated", "दन्त्य महाप्राण", "दन्त्य थ"),
        VarnamalaItem("द", "da (dental)", CharType.VYANJAN, "दवात (Inkpot)", "Dawaat", "Inkpot", "मसिदानी", "Dental voiced", "दन्त्य घोष", "दन्त्य द"),
        VarnamalaItem("ध", "dha (dental)", CharType.VYANJAN, "धनुष (Bow)", "Dhanush", "Bow", "धनुष", "Dental aspirated voiced", "दन्त्य घोष महाप्राण", "दन्त्य ध"),
        VarnamalaItem("न", "na (dental)", CharType.VYANJAN, "नल (Tap)", "Nal", "Water Tap", "धारा", "Dental nasal", "दन्त्य नासिक्य", "दन्त्य न"),

        // Pa-varga (Labial)
        VarnamalaItem("प", "pa", CharType.VYANJAN, "पतंग (Kite)", "Patang", "Kite", "चङ्गा", "Labial unvoiced", "ओष्ठ्य अघोष", "ओष्ठ्य प"),
        VarnamalaItem("फ", "pha", CharType.VYANJAN, "फल (Fruit)", "Phal", "Fruits", "फलफूल", "Labial aspirated", "ओष्ठ्य महाप्राण", "ओष्ठ्य फ"),
        VarnamalaItem("ब", "ba", CharType.VYANJAN, "बस (Bus)", "Bus", "Bus", "बस", "Labial voiced", "ओष्ठ्य घोष", "ओष्ठ्य ब"),
        VarnamalaItem("भ", "bha", CharType.VYANJAN, "भालू (Bear)", "Bhaloo", "Bear", "भालु", "Labial aspirated voiced", "ओष्ठ्य घोष महाप्राण", "ओष्ठ्य भ"),
        VarnamalaItem("म", "ma", CharType.VYANJAN, "मछली (Fish)", "Machhli", "Fish", "माछा", "Labial nasal", "ओष्ठ्य नासिक्य", "ओष्ठ्य म"),

        // Semivowels / Approximants
        VarnamalaItem("य", "ya", CharType.VYANJAN, "यज्ञ (Sacred ritual)", "Yagya", "Ritual", "यज्ञ", "Palatal semivowel", "अन्तःस्थ तालव्य", "अन्तःस्थ य"),
        VarnamalaItem("र", "ra", CharType.VYANJAN, "रथ (Chariot)", "Rath", "Chariot", "रथ", "Alveolar trill", "मूर्धन्य लुण्ठित", "दन्तमूलीय र"),
        VarnamalaItem("ल", "la", CharType.VYANJAN, "लड्डू (Sweet)", "Laddu", "Sweet ball", "लड्डू", "Alveolar lateral", "दन्त्य पाश्विक", "दन्त्य ल"),
        VarnamalaItem("व", "va / wa", CharType.VYANJAN, "वक (Heron)", "Vak", "Crane / Heron", "बकुल्ला", "Labio-dental semivowel", "दन्तोष्ठ्य अन्तःस्थ", "दन्तोष्ठ्य व"),

        // Sibilants & Fricative
        VarnamalaItem("श", "sha (palatal)", CharType.VYANJAN, "शलगम (Turnip)", "Shalgam", "Turnip", "सलगम", "Palatal sibilant", "तालव्य श", "तालव्य श"),
        VarnamalaItem("ष", "sha (retroflex)", CharType.VYANJAN, "षट्कोण (Hexagon)", "Shatkon", "Hexagon", "षट्कोण", "Retroflex sibilant", "मूर्धन्य ष", "मूर्धन्य ष"),
        VarnamalaItem("स", "sa (dental)", CharType.VYANJAN, "सेब (Apple)", "Seb", "Apple", "स्याउ", "Dental sibilant", "दन्त्य स", "दन्त्य स"),
        VarnamalaItem("ह", "ha", CharType.VYANJAN, "हाथी (Elephant)", "Haathi", "Elephant", "हात्ती", "Glottal fricative", "कण्ठ्य ह", "काकल्य ह"),

        // Conjunct consonants (Sanyukt Vyanjan)
        VarnamalaItem("क्ष", "ksha", CharType.VYANJAN, "क्षत्रिय (Warrior)", "Kshatriya", "Warrior", "क्षत्रिय", "Conjunct k+sha", "क + ष संयुक्त व्यंजन", "संयुक्त क्ष"),
        VarnamalaItem("त्र", "tra", CharType.VYANJAN, "त्रिशूल (Trident)", "Trishool", "Trident", "त्रिशूल", "Conjunct t+ra", "त + र संयुक्त व्यंजन", "संयुक्त त्र"),
        VarnamalaItem("ज्ञ", "gya / jnya", CharType.VYANJAN, "ज्ञानी (Wise)", "Gyaani", "Scholar", "ज्ञानी", "Conjunct j+nya", "ज + ञ संयुक्त व्यंजन", "संयुक्त ज्ञ")
    )

    val matras: List<VarnamalaItem> = listOf(
        VarnamalaItem("ा", "aa matra", CharType.MATRA, "क + ा = का (Kaam - काम)", "Kaa", "Sound: aa (Work)", "काम", "Matra for आ", "आ की मात्रा", "आ को मात्रा"),
        VarnamalaItem("ि", "chhoti i matra", CharType.MATRA, "क + ि = कि (Kitaab - किताब)", "Ki", "Sound: short i (Book)", "किताब", "Matra for इ (left side)", "इ की मात्रा (बाएँ)", "इ को मात्रा"),
        VarnamalaItem("ी", "badi ee matra", CharType.MATRA, "क + ी = की (Keemat - कीमत)", "Kee", "Sound: long ee (Price)", "कीमत", "Matra for ई (right side)", "ई की मात्रा (दाएँ)", "ई को मात्रा"),
        VarnamalaItem("ु", "chhota u matra", CharType.MATRA, "क + ु = कु (Kutta - कुत्ता)", "Ku", "Sound: short u (Dog)", "कुकुर", "Matra for उ (bottom left curve)", "उ की मात्रा", "उ को मात्रा"),
        VarnamalaItem("ू", "bada oo matra", CharType.MATRA, "क + ू = कू (Koodna - कूदना)", "Koo", "Sound: long oo (Jump)", "उफ्रनु", "Matra for ऊ (bottom right tail)", "ऊ की मात्रा", "ऊ को मात्रा"),
        VarnamalaItem("ृ", "ri matra", CharType.MATRA, "क + ृ = कृ (Kripa - कृपा)", "Kri", "Sound: ri (Grace/Kindness)", "कृपा", "Matra for ऋ", "ऋ की मात्रा", "ऋ को मात्रा"),
        VarnamalaItem("े", "e matra", CharType.MATRA, "क + े = के (Kela - केला)", "Ke", "Sound: e (Banana)", "केरा", "Matra for ए (single slant on top)", "ए की मात्रा", "ए को मात्रा"),
        VarnamalaItem("ै", "ai matra", CharType.MATRA, "क + ै = कै (Kaisa - कैसा)", "Kai", "Sound: ai (How/Which)", "कस्तो", "Matra for ऐ (double slant on top)", "ऐ की मात्रा", "ऐ को मात्रा"),
        VarnamalaItem("ो", "o matra", CharType.MATRA, "क + ो = को (Koyal - कोयल)", "Ko", "Sound: o (Cuckoo)", "कोइली", "Matra for ओ (vertical line + slant)", "ओ की मात्रा", "ओ को मात्रा"),
        VarnamalaItem("ौ", "au matra", CharType.MATRA, "क + ौ = कौ (Kauwa - कौआ)", "Kau", "Sound: au (Crow)", "काग", "Matra for औ (vertical line + 2 slants)", "औ की मात्रा", "औ को मात्रा")
    )
}
