package com.hyejin.musinsa.musinsaapp.ui.search.favourites

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hyejin.musinsa.musinsaapp.R
import com.hyejin.musinsa.musinsaapp.domain.local.model.User
import com.hyejin.musinsa.musinsaapp.ui.base.BaseListAdapter
import com.hyejin.musinsa.musinsaapp.ui.search.common.UserViewHolder

class FavouriteAdapter constructor(list: List<User>?) : BaseListAdapter<User>(list) {

    override fun onCreateViewHolderBase(
        parent: ViewGroup?,
        viewType: Int
    ): RecyclerView.ViewHolder {
        return UserViewHolder(
            LayoutInflater
                .from(parent?.context)
                .inflate(R.layout.view_user_item, parent, false))
    }

    override fun onBindViewHolderBase(holder: RecyclerView.ViewHolder?, position: Int) {
        val binding = (holder as UserViewHolder).binding
        val user = list?.get(position)

        binding?.user = user
    }

}