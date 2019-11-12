package com.hyejin.musinsa.musinsaapp.ui.search.favourites

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.hyejin.musinsa.musinsaapp.domain.local.model.User
import com.hyejin.musinsa.musinsaapp.repository.UsersRepository

class FavourtiesViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: UsersRepository = UsersRepository.getInstance(application)
    private val users = repository.getLocalAll()

    fun getAll(): LiveData<List<User>> {
        return users
    }
}
