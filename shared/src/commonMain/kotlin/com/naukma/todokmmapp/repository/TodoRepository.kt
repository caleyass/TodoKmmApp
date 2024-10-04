package com.naukma.todokmmapp.repository

import com.naukma.todokmmapp.data.TodoTask

interface TodoRepository {
    fun getAllTasks(): List<TodoTask>
    fun createTask(title: String): TodoTask
    fun deleteTask(id: String)
}