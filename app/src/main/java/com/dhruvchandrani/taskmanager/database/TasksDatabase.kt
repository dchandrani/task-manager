package com.dhruvchandrani.taskmanager.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.dhruvchandrani.taskmanager.model.Task

@Database(entities = [Task::class], version = 1)
@TypeConverters(Converters::class)
abstract class TasksDatabase : RoomDatabase() {

    abstract fun tasksDao(): TasksDao
}