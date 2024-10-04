package com.naukma.todokmmapp.cache

import com.naukma.todokmmapp.TodoDatabase
import com.naukma.todokmmapp.datasource.impl.TodoDataSourceImpl

internal class Database(databaseDriverFactory: DatabaseDriverFactory) {
    private val database = TodoDatabase(databaseDriverFactory.createDriver())
    private val dbQuery = database.todoDatabaseQueries
    val dataSource = TodoDataSourceImpl(database)


}