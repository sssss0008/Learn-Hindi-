package com.example.util

import android.content.Context
import android.content.SharedPreferences
import com.example.model.AppLanguage
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class PreferencesManager(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("hindi_bhasha_prefs", Context.MODE_PRIVATE)

    companion object {
        private const val KEY_LANGUAGE = "app_language"
        private const val KEY_STREAK = "user_streak"
        private const val KEY_LAST_ACTIVE_DATE = "last_active_date"
        private const val KEY_FAVORITES = "favorite_word_ids"
        private const val KEY_SPEECH_RATE = "speech_rate"
        private const val KEY_HIGH_SCORE = "quiz_high_score"
        private const val KEY_TOTAL_QUIZZES = "total_quizzes_taken"
    }

    var appLanguage: AppLanguage
        get() {
            val code = prefs.getString(KEY_LANGUAGE, AppLanguage.ENGLISH.name) ?: AppLanguage.ENGLISH.name
            return try {
                AppLanguage.valueOf(code)
            } catch (e: Exception) {
                AppLanguage.ENGLISH
            }
        }
        set(value) {
            prefs.edit().putString(KEY_LANGUAGE, value.name).apply()
        }

    var speechRate: Float
        get() = prefs.getFloat(KEY_SPEECH_RATE, 0.85f)
        set(value) = prefs.edit().putFloat(KEY_SPEECH_RATE, value).apply()

    var highScore: Int
        get() = prefs.getInt(KEY_HIGH_SCORE, 0)
        set(value) = prefs.edit().putInt(KEY_HIGH_SCORE, value).apply()

    var totalQuizzes: Int
        get() = prefs.getInt(KEY_TOTAL_QUIZZES, 0)
        set(value) = prefs.edit().putInt(KEY_TOTAL_QUIZZES, value).apply()

    fun getStreak(): Int {
        checkAndUpdateStreak()
        return prefs.getInt(KEY_STREAK, 1)
    }

    private fun checkAndUpdateStreak() {
        val today = SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(Date())
        val lastDate = prefs.getString(KEY_LAST_ACTIVE_DATE, null)

        if (lastDate == null) {
            prefs.edit().putString(KEY_LAST_ACTIVE_DATE, today).putInt(KEY_STREAK, 1).apply()
        } else if (lastDate != today) {
            val sdf = SimpleDateFormat("yyyyMMdd", Locale.getDefault())
            try {
                val lastTime = sdf.parse(lastDate)?.time ?: 0L
                val todayTime = sdf.parse(today)?.time ?: 0L
                val diffDays = (todayTime - lastTime) / (1000 * 60 * 60 * 24)

                val currentStreak = prefs.getInt(KEY_STREAK, 1)
                val newStreak = if (diffDays == 1L) currentStreak + 1 else 1

                prefs.edit()
                    .putString(KEY_LAST_ACTIVE_DATE, today)
                    .putInt(KEY_STREAK, newStreak)
                    .apply()
            } catch (e: Exception) {
                prefs.edit().putString(KEY_LAST_ACTIVE_DATE, today).apply()
            }
        }
    }

    fun getFavoriteIds(): Set<String> {
        return prefs.getStringSet(KEY_FAVORITES, emptySet()) ?: emptySet()
    }

    fun toggleFavorite(wordId: String): Boolean {
        val current = getFavoriteIds().toMutableSet()
        val isFavNow = if (current.contains(wordId)) {
            current.remove(wordId)
            false
        } else {
            current.add(wordId)
            true
        }
        prefs.edit().putStringSet(KEY_FAVORITES, current).apply()
        return isFavNow
    }
}
