package com.hyejin.musinsa.musinsaapp.ui.meeting

import android.content.Context
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.hyejin.musinsa.musinsaapp.R
import com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom


object MeetingRoomBindings {
    @JvmStatic
    @BindingAdapter("load_data")
    fun loadData(recyclerView: RecyclerView, meetingRooms: List<MeetingRoom>?) {
        recyclerView.adapter =
            if (meetingRooms != null) MeetingRoomAdapter(meetingRooms) else MeetingRoomAdapter(
                emptyList()
            )
        val decoration = DividerItemDecoration(recyclerView.context, DividerItemDecoration.VERTICAL)
        recyclerView.context.getDrawable(R.drawable.list_decoration)?.let { decoration.setDrawable(it) }
        recyclerView.addItemDecoration(decoration)
    }

    @JvmStatic
    @BindingAdapter("add_meeting_room_view")
    fun addMeetingView(layout: LinearLayout, meetingRooms: List<MeetingRoom>?) {
        meetingRooms?.forEach {

            val context : Context = layout.context
            val newContext = ContextThemeWrapper(context, R.style.MeetingRoomText)
            val textView = TextView(newContext)
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)
            params.setMargins(0,
                0,
                context.resources.getDimensionPixelSize(R.dimen.available_meeting_room_text_margin_right),
                0)

            textView.text = it.name
            textView.layoutParams = params
            layout.addView(textView)
        }
    }

    @JvmStatic
    @BindingAdapter("arrow_position")
    fun showArrow(imageView: ImageView, position: Int) {
        val context = imageView.context
        val layout: ConstraintLayout = imageView.parent as ConstraintLayout
        when (position) {
            in 0..17 -> {
                imageView.visibility = View.VISIBLE

                val constraintSet = ConstraintSet()
                val position = position + 1
                constraintSet.clone(layout)
                val positionId =
                    context.resources.getIdentifier("progress_$position", "id", context.packageName)
                constraintSet.connect(imageView.id, ConstraintSet.LEFT, positionId, ConstraintSet.LEFT, 0)
                constraintSet.connect(imageView.id, ConstraintSet.BOTTOM, positionId, ConstraintSet.TOP, 0)
                constraintSet.applyTo(layout)
            }
            18 -> {
                imageView.visibility = View.VISIBLE

                val constraintSet = ConstraintSet()
                constraintSet.clone(layout)
                val positionId =
                    context.resources.getIdentifier("progress_18", "id", context.packageName)
                constraintSet.connect(imageView.id, ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT)
                constraintSet.connect(imageView.id, ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT)
                constraintSet.connect(imageView.id, ConstraintSet.BOTTOM, positionId, ConstraintSet.TOP)
                constraintSet.applyTo(layout)
            }
            else -> {
                imageView.visibility = View.GONE
            }
        }
    }

    @JvmStatic
    @BindingAdapter("text_position")
    fun showText(textView: TextView, position: Int) {
        val layout: ConstraintLayout = textView.parent as ConstraintLayout
        when (position) {
            in 1..17 -> {
                layout.getViewById(R.id.now_time).visibility = View.VISIBLE
            }
            0 -> {
                layout.getViewById(R.id.now_time).visibility = View.VISIBLE

                val constraintSet = ConstraintSet()
                constraintSet.clone(layout)
                constraintSet.setHorizontalBias(textView.id, 0f)
                constraintSet.applyTo(layout)
            }
            18 -> {
                layout.getViewById(R.id.now_time).visibility = View.VISIBLE

                val constraintSet = ConstraintSet()
                constraintSet.clone(layout)
                constraintSet.setHorizontalBias(textView.id, 1f)
                constraintSet.applyTo(layout)
            }
            else -> {
                layout.getViewById(R.id.now_time).visibility = View.GONE
            }
        }
    }
}