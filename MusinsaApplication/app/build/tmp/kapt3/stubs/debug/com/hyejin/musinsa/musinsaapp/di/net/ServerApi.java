package com.hyejin.musinsa.musinsaapp.di.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H\'\u00a8\u0006\n"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/di/net/ServerApi;", "", "searchUsers", "Lio/reactivex/Single;", "Lcom/hyejin/musinsa/musinsaapp/domain/remote/model/Response;", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/User;", "q", "", "sort", "order", "app_debug"})
public abstract interface ServerApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/search/users")
    public abstract io.reactivex.Single<com.hyejin.musinsa.musinsaapp.domain.remote.model.Response<com.hyejin.musinsa.musinsaapp.domain.local.model.User>> searchUsers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sort")
    java.lang.String sort, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "order")
    java.lang.String order);
}