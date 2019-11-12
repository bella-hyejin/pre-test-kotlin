package com.hyejin.musinsa.musinsaapp.ui.search.users

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.hyejin.musinsa.musinsaapp.domain.local.model.User
import com.hyejin.musinsa.musinsaapp.repository.UsersRepository

class UsersViewModel(appication: Application) : AndroidViewModel(appication) {

    private val usersRepository: UsersRepository = UsersRepository.getInstance(appication)

    fun sendUserName(username: String): LiveData<List<User>> {
        return usersRepository.getRemoteAll(username)
    }

    fun addFav(user: User) {
        usersRepository.addFav(user)
    }

    fun removeFav(user: User) {
        usersRepository.removeFav(user)
    }
}
