package com.hyejin.musinsa.musinsaapp.domain.local.model;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\n"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/domain/local/model/UserDao;", "", "addUser", "", "user", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/User;", "getAll", "Landroidx/lifecycle/LiveData;", "", "removeUser", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM users ORDER BY login ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.User>> getAll();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void addUser(@org.jetbrains.annotations.NotNull()
    com.hyejin.musinsa.musinsaapp.domain.local.model.User user);
    
    @androidx.room.Delete()
    public abstract void removeUser(@org.jetbrains.annotations.NotNull()
    com.hyejin.musinsa.musinsaapp.domain.local.model.User user);
}