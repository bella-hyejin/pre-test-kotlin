package com.hyejin.musinsa.musinsaapp.di.net

import android.annotation.SuppressLint
import android.content.Context
import com.hyejin.musinsa.musinsaapp.di.net.client.HttpClient
import com.hyejin.musinsa.musinsaapp.domain.local.model.User
import com.hyejin.musinsa.musinsaapp.domain.remote.model.Response
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {
    private val _httpClient = HttpClient()

    fun create(): ServerApi {
        val retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.github.com/")
            .client(_httpClient.client)
            .build()
        return retrofit.create(ServerApi::class.java)
    }
}

class ApiModule private constructor(context: Context) {
    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile private var INSTANCE: ApiModule? = null

        fun getInstance(context: Context): ApiModule = INSTANCE ?: synchronized(this) {
            INSTANCE ?: ApiModule(context.applicationContext).also { INSTANCE = it }
        }
    }

    private val _apiService: ServerApi by lazy { ApiService.create() }

    fun requestSearchUser(user: String): Single<Response<User>> {
        return _apiService.searchUsers(q = user, sort = "repositories", order = "asc")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}