package com.eltex.androidschool.models

import com.eltex.androidschool.EventFormat

data class EventUiModel(
    val id: Long = 0,
    val published: String = "",
    val content: String = "",
    val author: String = "",
    val likes: Int = 0,
    val likedByMe: Boolean = false,
    val format: EventFormat = EventFormat.Online,
    val eventDate: String = "",
    val link: String = "",
    val members: Int = 0,

    )