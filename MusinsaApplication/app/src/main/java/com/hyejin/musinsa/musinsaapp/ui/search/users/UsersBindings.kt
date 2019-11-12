package com.hyejin.musinsa.musinsaapp.ui.search.users

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hyejin.musinsa.musinsaapp.domain.local.model.User

object UsersBindings {

    private lateinit var viewmodel: UsersViewModel

    fun setViewModel(vm: UsersViewModel) {
        viewmodel = vm
    }

    @JvmStatic
    @BindingAdapter("load_users")
    fun loadUsers(recyclerView: RecyclerView, users: List<User>?) {
        recyclerView.adapter = if (users != null) UsersAdapter(users, viewmodel) else UsersAdapter(emptyList(), viewmodel)
    }

    @JvmStatic
    @BindingAdapter("bind_avata")
    fun bindAvata(view: ImageView, res: String) {
        Glide.with(view.context)
            .load(res)
            .into(view)
    }

    @JvmStatic
    @BindingAdapter("active_fav")
    fun activeFav(view: ImageView, isFav: Boolean) {
        view.visibility = if (isFav) View.VISIBLE else View.GONE
    }

    @JvmStatic
    @BindingAdapter("disable_fav")
    fun disableFav(view: ImageView, isFav: Boolean) {
        view.visibility = if (isFav) View.GONE else View.VISIBLE
    }
}