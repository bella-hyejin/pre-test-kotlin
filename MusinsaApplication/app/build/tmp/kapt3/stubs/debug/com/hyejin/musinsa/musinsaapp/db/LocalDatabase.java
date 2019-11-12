package com.hyejin.musinsa.musinsaapp.db;

import java.lang.System;

@androidx.room.Database(entities = {com.hyejin.musinsa.musinsaapp.domain.local.model.User.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/db/LocalDatabase;", "Landroidx/room/RoomDatabase;", "()V", "userDao", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/UserDao;", "Companion", "app_debug"})
public abstract class LocalDatabase extends androidx.room.RoomDatabase {
    private static com.hyejin.musinsa.musinsaapp.db.LocalDatabase INSTANCE;
    public static final com.hyejin.musinsa.musinsaapp.db.LocalDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.hyejin.musinsa.musinsaapp.domain.local.model.UserDao userDao();
    
    public LocalDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/db/LocalDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/hyejin/musinsa/musinsaapp/db/LocalDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.hyejin.musinsa.musinsaapp.db.LocalDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}