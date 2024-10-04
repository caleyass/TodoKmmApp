package com.naukma.todokmmapp.datasource

import com.naukma.todokmmapp.TodoTask


interface TodoDataSource {
    fun getAllTasks(): List<TodoTask>
    fun createTask(title: String)
    fun deleteTask(id: Long)
}