package com.naukma.todokmmapp.datasource.impl

import com.naukma.todokmmapp.TodoDatabase
import com.naukma.todokmmapp.TodoTask
import com.naukma.todokmmapp.datasource.TodoDataSource

class TodoDataSourceImpl(db:TodoDatabase) : TodoDataSource{

    private val queries = db.todoDatabaseQueries
    override fun getAllTasks(): List<TodoTask> {
        return queries.selectAll().executeAsList()
    }

    override fun createTask(title: String) {
        queries.insertTask(1, title, 0)
    }

    override fun deleteTask(id: Long) {
        queries.deleteTask(id)
    }

}