package com.hyejin.musinsa.musinsaapp.ui.search.users;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0007J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/ui/search/users/UsersBindings;", "", "()V", "viewmodel", "Lcom/hyejin/musinsa/musinsaapp/ui/search/users/UsersViewModel;", "activeFav", "", "view", "Landroid/widget/ImageView;", "isFav", "", "bindAvata", "res", "", "disableFav", "loadUsers", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "users", "", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/User;", "setViewModel", "vm", "app_debug"})
public final class UsersBindings {
    private static com.hyejin.musinsa.musinsaapp.ui.search.users.UsersViewModel viewmodel;
    public static final com.hyejin.musinsa.musinsaapp.ui.search.users.UsersBindings INSTANCE = null;
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.hyejin.musinsa.musinsaapp.ui.search.users.UsersViewModel vm) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"load_users"})
    public static final void loadUsers(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.User> users) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"bind_avata"})
    public static final void bindAvata(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
    java.lang.String res) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"active_fav"})
    public static final void activeFav(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, boolean isFav) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"disable_fav"})
    public static final void disableFav(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, boolean isFav) {
    }
    
    private UsersBindings() {
        super();
    }
}