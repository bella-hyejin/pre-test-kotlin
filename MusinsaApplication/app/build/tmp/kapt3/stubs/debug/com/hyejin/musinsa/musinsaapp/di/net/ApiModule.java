package com.hyejin.musinsa.musinsaapp.di.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/di/net/ApiModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_apiService", "Lcom/hyejin/musinsa/musinsaapp/di/net/ServerApi;", "get_apiService", "()Lcom/hyejin/musinsa/musinsaapp/di/net/ServerApi;", "_apiService$delegate", "Lkotlin/Lazy;", "requestSearchUser", "Lio/reactivex/Single;", "Lcom/hyejin/musinsa/musinsaapp/domain/remote/model/Response;", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/User;", "user", "", "Companion", "app_debug"})
public final class ApiModule {
    private final kotlin.Lazy _apiService$delegate = null;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static volatile com.hyejin.musinsa.musinsaapp.di.net.ApiModule INSTANCE;
    public static final com.hyejin.musinsa.musinsaapp.di.net.ApiModule.Companion Companion = null;
    
    private final com.hyejin.musinsa.musinsaapp.di.net.ServerApi get_apiService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.hyejin.musinsa.musinsaapp.domain.remote.model.Response<com.hyejin.musinsa.musinsaapp.domain.local.model.User>> requestSearchUser(@org.jetbrains.annotations.NotNull()
    java.lang.String user) {
        return null;
    }
    
    private ApiModule(android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/di/net/ApiModule$Companion;", "", "()V", "INSTANCE", "Lcom/hyejin/musinsa/musinsaapp/di/net/ApiModule;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.hyejin.musinsa.musinsaapp.di.net.ApiModule getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}