package com.example.vika.myprogres.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "profile_table")
public class ProfileModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_user")
    private int id;

    @ColumnInfo(name = "name_user")
    private String name;
    @ColumnInfo(name = "surname_user")
    private String surname;

    @ColumnInfo(name = "email_user")
    private String email;

    @ColumnInfo(name = "photo_user",
            typeAffinity = ColumnInfo.BLOB)
    private byte[] photoId;

    public ProfileModel() {
    }

    public ProfileModel(int id, String name, String surname, String email, byte[] photoId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.photoId = photoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public  byte[] getPhotoId() {
        return photoId;
    }

    public void setPhotoId( byte[] photoId) {
        this.photoId = photoId;
    }
}
