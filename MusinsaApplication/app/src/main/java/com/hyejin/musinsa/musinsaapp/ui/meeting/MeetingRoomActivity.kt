package com.hyejin.musinsa.musinsaapp.ui.meeting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.hyejin.musinsa.musinsaapp.R
import com.hyejin.musinsa.musinsaapp.databinding.ActivityMeetingRoomBinding

class MeetingRoomActivity : AppCompatActivity() {

    private lateinit var viewModel: MeetingRoomViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMeetingRoomBinding =  DataBindingUtil.setContentView(this,
            R.layout.activity_meeting_room)

        viewModel = ViewModelProviders.of(this).get(MeetingRoomViewModel::class.java)

        viewModel.getAll()
        binding.nowDate = viewModel.getNowDate()
        viewModel.getMeetingRooms().observe(this, Observer {
            binding.meetingRooms = it
        })
    }
}
