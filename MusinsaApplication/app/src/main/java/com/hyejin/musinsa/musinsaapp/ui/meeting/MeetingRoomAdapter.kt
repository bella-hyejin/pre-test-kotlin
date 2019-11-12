package com.hyejin.musinsa.musinsaapp.ui.meeting

import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.util.set
import androidx.recyclerview.widget.RecyclerView
import com.hyejin.musinsa.musinsaapp.R
import com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom
import com.hyejin.musinsa.musinsaapp.domain.local.model.Reservation
import com.hyejin.musinsa.musinsaapp.ui.base.BaseListAdapter
import kotlinx.android.synthetic.main.reservation_progress.view.*
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MeetingRoomAdapter constructor(list : List<MeetingRoom>?): BaseListAdapter<MeetingRoom>(list) {

    override fun onCreateViewHolderBase(
        parent: ViewGroup?,
        viewType: Int
    ): RecyclerView.ViewHolder {
        return MeetingRoomViewHolder(
            LayoutInflater
                .from(parent?.context)
                .inflate(R.layout.view_meeting_room_item, parent, false))
    }

    override fun onBindViewHolderBase(holder: RecyclerView.ViewHolder?, position: Int) {
        val binding = (holder as MeetingRoomViewHolder).binding
        val meetingRoom = list?.get(position)
        val nowPosition = getNowPosition()

        binding?.meetingRoom = meetingRoom
        if (meetingRoom != null) {
            binding?.isInTimes = makeInTimeList(meetingRoom.reservations, nowPosition)
        }
        if (binding != null) {
            binding?.nowPosition = nowPosition
        }
    }

    private fun makeInTimeList(reservationList : List<Reservation>, nowPosition: Int) : SparseBooleanArray {
        val inTimeList = SparseBooleanArray(18)

        reservationList.forEach {
            searchInTimePosition(it.startTime, it.endTime, nowPosition).forEach {
                intValue -> inTimeList[intValue] = true
            }
        }
        return inTimeList
    }

    private fun slideTime(time : String) : String {
        var result = time.substring(0, 2)
        val timeString = Integer.parseInt(time.substring(2))
        result += if (timeString > 30) "30"
            else "00"
        return result
    }

    private fun searchInTimePosition(startTime: String, endTime: String, nowPosition: Int): List<Int> {
        val resultList = ArrayList<Int>()
        val startPosition = convertTimeToPosition(startTime)
        val endPosition = convertTimeToPosition(endTime)

        for (i in startPosition until endPosition) {
            if (nowPosition <= i) {
                resultList.add(i)
            }
        }
        return resultList
    }

    private fun convertTimeToPosition(time: String) : Int {
        val pre = time.substring(0, 2)
        val post = time.substring(2)
        var position = (Integer.parseInt(pre) - 9) * 2
        position += if (post == "30") 1
            else 0
        return position
    }

    private fun getNowPosition() : Int {
        val date = Date()
        val df: DateFormat = SimpleDateFormat("HHmm")

        val stringTime = slideTime(df.format(date))
        return convertTimeToPosition(stringTime)
    }
}