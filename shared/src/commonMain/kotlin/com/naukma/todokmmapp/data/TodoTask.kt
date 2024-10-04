package com.naukma.todokmmapp.data

data class TodoTask(
    val id: String,
    val title: String,
    val isCompleted: Boolean = false
)