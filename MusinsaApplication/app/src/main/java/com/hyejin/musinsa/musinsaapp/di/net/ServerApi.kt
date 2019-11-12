package com.hyejin.musinsa.musinsaapp.di.net

import com.hyejin.musinsa.musinsaapp.domain.local.model.User
import com.hyejin.musinsa.musinsaapp.domain.remote.model.Response
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ServerApi {
    @GET("/search/users")
    fun searchUsers(@Query("q") q: String,
                    @Query("sort") sort: String,
                    @Query("order") order: String): Single<Response<User>>
}