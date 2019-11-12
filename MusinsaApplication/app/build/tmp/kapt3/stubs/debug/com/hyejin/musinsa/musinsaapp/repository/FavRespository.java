package com.hyejin.musinsa.musinsaapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/repository/FavRespository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "userDao", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/UserDao;", "users", "Landroidx/lifecycle/LiveData;", "", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/User;", "usersLocalDatabase", "Lcom/hyejin/musinsa/musinsaapp/db/LocalDatabase;", "add", "", "user", "getAll", "remove", "app_debug"})
public final class FavRespository {
    private final com.hyejin.musinsa.musinsaapp.db.LocalDatabase usersLocalDatabase = null;
    private final com.hyejin.musinsa.musinsaapp.domain.local.model.UserDao userDao = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.User>> users = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.User>> getAll() {
        return null;
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    com.hyejin.musinsa.musinsaapp.domain.local.model.User user) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    com.hyejin.musinsa.musinsaapp.domain.local.model.User user) {
    }
    
    public FavRespository(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}