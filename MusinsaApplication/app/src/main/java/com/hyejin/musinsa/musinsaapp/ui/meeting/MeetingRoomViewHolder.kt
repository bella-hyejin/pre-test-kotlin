package com.hyejin.musinsa.musinsaapp.ui.meeting

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.hyejin.musinsa.musinsaapp.databinding.ViewMeetingRoomItemBinding


class MeetingRoomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val binding: ViewMeetingRoomItemBinding? = DataBindingUtil.bind(itemView)
}