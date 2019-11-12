package com.hyejin.musinsa.musinsaapp.repository

import android.annotation.SuppressLint
import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hyejin.musinsa.musinsaapp.db.LocalDatabase
import com.hyejin.musinsa.musinsaapp.di.net.ApiModule
import com.hyejin.musinsa.musinsaapp.domain.local.model.User
import com.hyejin.musinsa.musinsaapp.domain.local.model.UserDao

class UsersRepository private constructor(context: Context){

    private val apiModule: ApiModule = ApiModule.getInstance(context)

    private val usersLocalDatabase = LocalDatabase.getInstance(context)!!

    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile private var INSTANCE: UsersRepository? = null

        fun getInstance(context: Context): UsersRepository = INSTANCE ?: synchronized(this) {
            INSTANCE ?: UsersRepository(context).also { INSTANCE = it }
        }
    }

    private val userDao: UserDao = usersLocalDatabase.userDao()

    private val users: LiveData<List<User>> = userDao.getAll()

    fun getLocalAll(): LiveData<List<User>> {
        return users
    }

    @SuppressLint("CheckResult")
    fun getRemoteAll(name: String): LiveData<List<User>> {
        val mutableUsers: MutableLiveData<List<User>> = MutableLiveData()

        apiModule.requestSearchUser(name).subscribe({
            resp -> mutableUsers.postValue(resp.items)
        },{
            it.printStackTrace()
        })
        return mutableUsers
    }

    fun addFav(user: User) {
        try {
            val thread = Thread(Runnable {
                user.fav = true
                userDao.addUser(user)
            })

            thread.start()
        } catch (e: Exception) { e.printStackTrace() }
    }

    fun removeFav(user: User) {
        try {
            val thread = Thread(Runnable {
                user.fav = false
                userDao.removeUser(user)
            })
            thread.start()
        } catch (e: Exception) { e.printStackTrace() }

    }
}