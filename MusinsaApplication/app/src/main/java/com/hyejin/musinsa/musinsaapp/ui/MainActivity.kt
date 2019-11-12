package com.hyejin.musinsa.musinsaapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hyejin.musinsa.musinsaapp.R
import com.hyejin.musinsa.musinsaapp.ui.meeting.MeetingRoomActivity
import com.hyejin.musinsa.musinsaapp.ui.search.SearchUserActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupToolbar()

        btn_go_github.setOnClickListener { openSearchUser() }
        btn_go_meeting.setOnClickListener { openMeetingRoom() }
    }

    fun openSearchUser() {
        val searchUserIntent = Intent(this, SearchUserActivity::class.java)
        startActivity(searchUserIntent)
    }

    fun openMeetingRoom() {
        val meetingRoomIntent = Intent(this, MeetingRoomActivity::class.java)
        startActivity(meetingRoomIntent)
    }

    fun setupToolbar() {
        setSupportActionBar(main_toolbar)
        main_toolbar.title = getString(R.string.app_name)
    }
}
