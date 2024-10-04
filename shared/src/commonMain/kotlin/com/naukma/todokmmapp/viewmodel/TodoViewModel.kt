package com.naukma.todokmmapp.viewmodel

import com.naukma.todokmmapp.TodoTask
import com.naukma.todokmmapp.datasource.TodoDataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


class TodoViewModel(private val todoDataSource: TodoDataSource)  {

    private val _tasks = MutableStateFlow<List<TodoTask>>(emptyList())
    val tasks: StateFlow<List<TodoTask>> = _tasks

    fun loadTasks() {
        _tasks.value = todoDataSource.getAllTasks()

    }

    fun addTask(title: String) {
            todoDataSource.createTask(title)
            loadTasks() // Reload the tasks after insertion

    }

    fun removeTask(id: Long) {
            todoDataSource.deleteTask(id)
            loadTasks() // Reload the tasks after deletion

    }
}