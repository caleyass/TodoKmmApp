package com.naukma.todokmmapp.android

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.naukma.todokmmapp.viewmodel.TodoViewModel
import kotlinx.coroutines.flow.forEach
import java.lang.reflect.Modifier

@Composable
fun TodoListScreen(viewModel: TodoViewModel) {
    val tasks = viewModel.tasks

    Column {
        tasks.value.forEach {
            Text(text = it.title)
            Button(onClick = { viewModel.removeTask(it.id.toLong()) }) {
                Text(text = "Delete")
            }
        }

        //Spacer(modifier = Modifier.height(12.dp))

        var newTaskTitle = remember { mutableStateOf("") }
//        TextField(value = newTaskTitle, onValueChange = { newTaskTitle = it }, label = { Text("New Task") })
//
//        Button(onClick = { viewModel.addTask(newTaskTitle) }) {
//            Text(text = "Add Task")
//        }
    }
}