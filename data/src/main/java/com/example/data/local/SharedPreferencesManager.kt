package com.example.data.local

import android.content.SharedPreferences

class SharedPreferencesManager(
    private val prefs: SharedPreferences
) {

    fun saveAccessToken(accessToken: String?) {
        prefs.edit().putString(KEY_ACCESS_TOKEN, accessToken).apply()
    }

    fun getAccessToken(): String? {
        return prefs.getString(KEY_ACCESS_TOKEN, null)
    }

    fun saveBoolean(isShown: Boolean) {
        prefs.edit().putBoolean(KEY_BOOLEAN, isShown).apply()
    }

    fun getBoolean(): Boolean {
        return prefs.getBoolean(KEY_BOOLEAN, false)
    }

    companion object {
        private const val KEY_ACCESS_TOKEN = "ACCESS_TOKEN"
        private const val KEY_BOOLEAN = "KEY_BOOLEAN"
    }

}