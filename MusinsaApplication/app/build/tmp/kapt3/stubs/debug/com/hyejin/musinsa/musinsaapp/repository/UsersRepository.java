package com.hyejin.musinsa.musinsaapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/repository/UsersRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "apiModule", "Lcom/hyejin/musinsa/musinsaapp/di/net/ApiModule;", "userDao", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/UserDao;", "users", "Landroidx/lifecycle/LiveData;", "", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/User;", "usersLocalDatabase", "Lcom/hyejin/musinsa/musinsaapp/db/LocalDatabase;", "addFav", "", "user", "getLocalAll", "getRemoteAll", "name", "", "removeFav", "Companion", "app_debug"})
public final class UsersRepository {
    private final com.hyejin.musinsa.musinsaapp.di.net.ApiModule apiModule = null;
    private final com.hyejin.musinsa.musinsaapp.db.LocalDatabase usersLocalDatabase = null;
    private final com.hyejin.musinsa.musinsaapp.domain.local.model.UserDao userDao = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.User>> users = null;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static volatile com.hyejin.musinsa.musinsaapp.repository.UsersRepository INSTANCE;
    public static final com.hyejin.musinsa.musinsaapp.repository.UsersRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.User>> getLocalAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final androidx.lifecycle.LiveData<java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.User>> getRemoteAll(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public final void addFav(@org.jetbrains.annotations.NotNull()
    com.hyejin.musinsa.musinsaapp.domain.local.model.User user) {
    }
    
    public final void removeFav(@org.jetbrains.annotations.NotNull()
    com.hyejin.musinsa.musinsaapp.domain.local.model.User user) {
    }
    
    private UsersRepository(android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/repository/UsersRepository$Companion;", "", "()V", "INSTANCE", "Lcom/hyejin/musinsa/musinsaapp/repository/UsersRepository;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.hyejin.musinsa.musinsaapp.repository.UsersRepository getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}