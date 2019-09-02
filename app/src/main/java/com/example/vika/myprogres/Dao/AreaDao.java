package com.example.vika.myprogres.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Index;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.vika.myprogres.models.AreaModel;
import com.example.vika.myprogres.models.ProfileModel;
import com.example.vika.myprogres.models.TaskModel;

import java.util.List;

@Dao
public interface AreaDao {
    @Insert
    void insert(AreaModel areaModel);

    @Update
    void update(AreaModel areaModel);

    @Delete
    void delete(AreaModel areaModel);

    @Query("DELETE FROM area_table")
    void deleteAllAreas();

    @Query("SELECT * FROM area_table ORDER BY title_area DESC")
    LiveData<List<AreaModel>> getAllAreas();



}
