package com.example.vika.myprogres.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "area_table", foreignKeys = @ForeignKey(entity = ProfileModel.class, parentColumns = "id", childColumns = "id_profile" ))
public class AreaModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_area")
    private int id;

    @ColumnInfo(name = "title_area")
    private String title;

    @ColumnInfo(name = "description_area")
    private String description;

    @ColumnInfo(name = "points_area")
    private int points;

    @ColumnInfo(name = "id_profile")
    private int profile_id_area;

    public AreaModel() {
    }

    public AreaModel(int id, String title, String description, int points, int profile_id_area) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.points = points;
        this.profile_id_area = profile_id_area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getProfile_id_area() {
        return profile_id_area;
    }

    public void setProfile_id_area(int profile_id_area) {
        this.profile_id_area = profile_id_area;
    }
}
