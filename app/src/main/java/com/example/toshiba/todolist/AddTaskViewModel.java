package com.example.toshiba.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.toshiba.todolist.database.AppDatabase;
import com.example.toshiba.todolist.database.TaskEntry;

public class AddTaskViewModel extends ViewModel {

    // COMPLETED (6) Add a task member variable for the TaskEntry object wrapped in a LiveData
    private LiveData<TaskEntry> task;

    // COMPLETED (8) Create a constructor where you call loadTaskById of the taskDao to initialize the tasks variable
    // Note: The constructor should receive the database and the taskId
    public AddTaskViewModel(AppDatabase database, int taskId) {
        task = database.taskDao().loadTaskById(taskId);
    }

    // COMPLETED (7) Create a getter for the task variable
    public LiveData<TaskEntry> getTask() {
        return task;
    }
}