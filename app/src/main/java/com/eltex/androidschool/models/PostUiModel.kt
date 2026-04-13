package com.eltex.androidschool.models

data class PostUiModel(
    val id: Long = 0,
    val published: String = "",
    val content: String = "",
    val author: String = "",
    val likes: Int = 0,
    val likedByMe: Boolean = false,
)