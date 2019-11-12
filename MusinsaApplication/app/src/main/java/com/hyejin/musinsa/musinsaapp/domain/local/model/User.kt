package com.hyejin.musinsa.musinsaapp.domain.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "login") val login: String,
    @ColumnInfo(name = "type") val type: String,
    @ColumnInfo(name = "avatar_url") val avatar_url: String?,
    @ColumnInfo(name = "score") val score: Double?,
    @ColumnInfo(name = "fav") var fav: Boolean
) {
    constructor() : this(null, "", "", null,null, false)
}