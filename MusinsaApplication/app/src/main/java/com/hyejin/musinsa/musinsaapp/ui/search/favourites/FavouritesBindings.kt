package com.hyejin.musinsa.musinsaapp.ui.search.favourites

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hyejin.musinsa.musinsaapp.domain.local.model.User

object FavouritesBindings {
    @JvmStatic
    @BindingAdapter("load_users")
    fun loadUsers(recyclerView: RecyclerView, users: List<User>?) {
        recyclerView.adapter = if (users != null) FavouriteAdapter(users) else FavouriteAdapter(emptyList())
    }

    @BindingAdapter("bind_avata")
    fun bindAvata(view: ImageView, res: String) {
        Glide.with(view.context)
            .load(res)
            .into(view)
    }
}