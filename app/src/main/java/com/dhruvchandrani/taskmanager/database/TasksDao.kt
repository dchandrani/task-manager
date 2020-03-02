package com.dhruvchandrani.taskmanager.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.dhruvchandrani.taskmanager.model.Task

@Dao
interface TasksDao {
    @Query("SELECT * FROM task ORDER BY modified_at")
    suspend fun getAllTasks(): List<Task>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: Task)

    @Query("SELECT * FROM task WHERE id=:id")
    suspend fun getSingleTask(id: Long): Task
}