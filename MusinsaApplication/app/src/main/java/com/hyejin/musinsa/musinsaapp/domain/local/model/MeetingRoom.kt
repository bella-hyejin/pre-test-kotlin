package com.hyejin.musinsa.musinsaapp.domain.local.model

data class MeetingRoom(
    val name: String,
    val location: String,
    val reservations: List<Reservation>
)