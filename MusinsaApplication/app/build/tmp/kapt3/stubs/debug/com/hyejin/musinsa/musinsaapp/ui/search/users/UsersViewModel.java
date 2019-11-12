package com.hyejin.musinsa.musinsaapp.ui.search.users;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/ui/search/users/UsersViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "appication", "Landroid/app/Application;", "(Landroid/app/Application;)V", "usersRepository", "Lcom/hyejin/musinsa/musinsaapp/repository/UsersRepository;", "addFav", "", "user", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/User;", "removeFav", "sendUserName", "Landroidx/lifecycle/LiveData;", "", "username", "", "app_debug"})
public final class UsersViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.hyejin.musinsa.musinsaapp.repository.UsersRepository usersRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.User>> sendUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    public final void addFav(@org.jetbrains.annotations.NotNull()
    com.hyejin.musinsa.musinsaapp.domain.local.model.User user) {
    }
    
    public final void removeFav(@org.jetbrains.annotations.NotNull()
    com.hyejin.musinsa.musinsaapp.domain.local.model.User user) {
    }
    
    public UsersViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application appication) {
        super(null);
    }
}