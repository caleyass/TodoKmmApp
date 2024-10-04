package com.naukma.todokmmapp.repository

import com.naukma.todokmmapp.TodoTask


interface TodoDataSource {
    fun getAllTasks(): List<TodoTask>
    fun createTask(title: String)
    fun deleteTask(id: Long)
}