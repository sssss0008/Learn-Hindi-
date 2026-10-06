package com.example.util

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast

object ContactHelper {
    const val DEVELOPER_NAME = "Awiskar Acharya"
    const val EMAIL = "awiskaracharya@gmail.com"
    const val WHATSAPP_NUMBER = "+9779827106244"
    const val WHATSAPP_DISPLAY = "+977 9827106244"
    const val LINKEDIN_URL = "https://www.linkedin.com/in/awiskaracharya/"

    fun openEmail(context: Context, subject: String = "Feedback on Hindi Bhasha App") {
        try {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:$EMAIL")
                putExtra(Intent.EXTRA_SUBJECT, subject)
                putExtra(Intent.EXTRA_TEXT, "Hello Awiskar,\n\nI am using the Hindi Bhasha learning app and would like to share my feedback:\n\n")
            }
            context.startActivity(Intent.createChooser(intent, "Send Feedback Email"))
        } catch (e: Exception) {
            Toast.makeText(context, "Could not open email client: $EMAIL", Toast.LENGTH_LONG).show()
        }
    }

    fun openWhatsApp(context: Context, message: String = "Hello Awiskar, I am using the Hindi Bhasha learning app!") {
        try {
            // Clean number for international url: 9779827106244
            val cleanPhone = WHATSAPP_NUMBER.replace("+", "").replace(" ", "").trim()
            val encodedMsg = Uri.encode(message)
            val url = "https://wa.me/$cleanPhone?text=$encodedMsg"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            context.startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(context, "WhatsApp: $WHATSAPP_DISPLAY", Toast.LENGTH_LONG).show()
        }
    }

    fun openLinkedIn(context: Context) {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(LINKEDIN_URL))
            context.startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(context, "LinkedIn: $LINKEDIN_URL", Toast.LENGTH_LONG).show()
        }
    }
}
