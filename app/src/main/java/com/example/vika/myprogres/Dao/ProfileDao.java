package com.example.vika.myprogres.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import com.example.vika.myprogres.models.ProfileModel;

import java.util.List;

public interface ProfileDao {

    @Insert
    void insert(ProfileModel profileModel);

    @Update
    void update(ProfileModel profileModel);

    @Delete
    void delete(ProfileModel profileModel);

    @Query("DELETE FROM profile_table")
    void deleteAllProfile();

    @Query("SELECT * FROM profile_table ORDER BY id_user DESC")
    LiveData<List<ProfileModel>> getAllProfile();
}
