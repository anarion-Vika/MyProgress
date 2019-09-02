package com.example.vika.myprogres.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import com.example.vika.myprogres.models.TaskModel;

import java.util.List;

public interface TaskDao {
    @Insert
    void insert(TaskModel taskModel);

    @Update
    void update(TaskModel taskModel);

    @Delete
    void delete(TaskModel taskModel);

    @Query("DELETE FROM task_table")
    void deleteAllTask();

    @Query("SELECT * FROM task_table ORDER BY name_task DESC")
    LiveData<List<TaskModel>> getAllTask();
}
