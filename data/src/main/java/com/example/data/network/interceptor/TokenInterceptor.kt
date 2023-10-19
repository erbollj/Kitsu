package com.example.data.network.interceptor

import com.example.data.local.SharedPreferencesManager
import okhttp3.Interceptor
import okhttp3.Response

class TokenInterceptor(private val sharedPreferencesManager: SharedPreferencesManager) :
    Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("Authorization", "Bearer ${sharedPreferencesManager.getAccessToken()}")
            .build()
        return chain.proceed(request)
    }

}