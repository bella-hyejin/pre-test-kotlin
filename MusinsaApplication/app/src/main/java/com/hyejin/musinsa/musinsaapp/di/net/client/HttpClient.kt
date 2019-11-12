package com.hyejin.musinsa.musinsaapp.di.net.client

import okhttp3.OkHttpClient
import java.security.GeneralSecurityException
import java.util.concurrent.TimeUnit

class HttpClient {
    private val _defaultClient: OkHttpClient

    @Throws(GeneralSecurityException::class)
    constructor() {
        _defaultClient = OkHttpClient.Builder()
            .addInterceptor { chain ->
                val request = chain.request().newBuilder().addHeader("Connection", "close").build()
                chain.proceed(request)
            }
            .connectTimeout(5, TimeUnit.SECONDS)
            .build()
    }

    val client: OkHttpClient
        get() = _defaultClient
}