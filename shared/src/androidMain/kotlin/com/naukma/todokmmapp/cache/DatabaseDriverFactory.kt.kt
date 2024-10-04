package com.naukma.todokmmapp.cache

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import com.naukma.todokmmapp.TodoDatabase
import app.cash.sqldelight.driver.android.AndroidSqliteDriver

class AndroidDatabaseDriverFactory(private val context: Context) : DatabaseDriverFactory {
    override fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(TodoDatabase.Schema, context, "launch.db")
    }
}