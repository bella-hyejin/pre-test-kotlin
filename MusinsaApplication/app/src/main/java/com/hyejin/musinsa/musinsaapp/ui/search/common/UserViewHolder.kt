package com.hyejin.musinsa.musinsaapp.ui.search.common

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.hyejin.musinsa.musinsaapp.databinding.ViewUserItemBinding

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val binding: ViewUserItemBinding? = DataBindingUtil.bind(itemView)
}