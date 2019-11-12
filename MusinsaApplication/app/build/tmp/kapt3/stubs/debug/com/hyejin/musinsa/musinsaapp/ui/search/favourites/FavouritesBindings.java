package com.hyejin.musinsa.musinsaapp.ui.search.favourites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J \u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/ui/search/favourites/FavouritesBindings;", "", "()V", "bindAvata", "", "view", "Landroid/widget/ImageView;", "res", "", "loadUsers", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "users", "", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/User;", "app_debug"})
public final class FavouritesBindings {
    public static final com.hyejin.musinsa.musinsaapp.ui.search.favourites.FavouritesBindings INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"load_users"})
    public static final void loadUsers(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.User> users) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"bind_avata"})
    public final void bindAvata(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
    java.lang.String res) {
    }
    
    private FavouritesBindings() {
        super();
    }
}