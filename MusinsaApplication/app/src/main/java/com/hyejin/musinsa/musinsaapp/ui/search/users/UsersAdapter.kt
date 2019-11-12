package com.hyejin.musinsa.musinsaapp.ui.search.users

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hyejin.musinsa.musinsaapp.R
import com.hyejin.musinsa.musinsaapp.domain.local.model.User
import com.hyejin.musinsa.musinsaapp.ui.base.BaseListAdapter
import com.hyejin.musinsa.musinsaapp.ui.search.common.UserViewHolder

class UsersAdapter constructor(list: List<User>, vm: UsersViewModel) : BaseListAdapter<User>(list) {

    private val viewModel:UsersViewModel = vm

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

        binding?.userFavoriteOff?.setOnClickListener { v ->
            if (v.visibility == View.VISIBLE) {
                v.visibility = View.GONE
                binding?.userFavoriteOn.visibility = View.VISIBLE
                user?.let { viewModel.addFav(it) }
            }
        }

        binding?.userFavoriteOn?.setOnClickListener { v ->
            if (v.visibility == View.VISIBLE) {
                v.visibility = View.GONE
                binding?.userFavoriteOff.visibility = View.VISIBLE
                user?.let { viewModel.removeFav(it) }
            }
        }
    }
}