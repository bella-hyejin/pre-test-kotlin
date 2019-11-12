package com.hyejin.musinsa.musinsaapp.ui.meeting

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom
import java.text.SimpleDateFormat
import java.util.*

class MeetingRoomViewModel (application: Application) : AndroidViewModel(application) {
    private var mApplication : Application = application
    private var meetingRooms : MutableLiveData<List<MeetingRoom>> = MutableLiveData()

    fun getAll() {
        ReadAssetsDataTask(mApplication, meetingRooms).execute()
    }

    fun getMeetingRooms() : MutableLiveData<List<MeetingRoom>> {
        return meetingRooms
    }

    fun getNowDate() : String {
        val date = Date()
        val df = SimpleDateFormat("MM월 dd일 (E)", Locale.KOREAN)
        return df.format(date)
    }

    class ReadAssetsDataTask(application: Application, meetingRooms: MutableLiveData<List<MeetingRoom>>) : AsyncTask<Void, Void, List<MeetingRoom>>() {
        private val mApplication : Application = application
        private val mMeetingRooms = meetingRooms
        override fun doInBackground(vararg params: Void?): List<MeetingRoom>? {
            val fileName = "MUSINSA.json"
            val jsonString = mApplication.assets.open(fileName).bufferedReader().use{
                it.readText()
            }

            return Gson().fromJson(jsonString, Array<MeetingRoom>::class.java).toList()
        }

        override fun onPostExecute(result: List<MeetingRoom>) {
            mMeetingRooms.postValue(result)
        }
    }
}