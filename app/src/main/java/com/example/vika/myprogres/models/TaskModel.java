package com.example.vika.myprogres.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "task_table",
        foreignKeys = @ForeignKey(entity = ProfileModel.class, parentColumns = "id", childColumns = "profile_id"))
public class TaskModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_task")
    private int id;
    @ColumnInfo(name = "name_task")
    private String name;

    @ColumnInfo(name = "type_task")
    private String type;

    @ColumnInfo(name = "id_parent_task")
    private int idParentTask;

    @ColumnInfo(name = "relation_goal_task")
    private String relationGoal;

    @ColumnInfo(name = "data_of_create_task")
    private String dataOfCreate;

    @ColumnInfo(name = "deadline_task")
    private String deadline;

    @ColumnInfo(name = "icon_task")
    private byte[] iconGoal;

    @ColumnInfo(name = "icon_status_task")
    private byte[] iconTaskStatus;

    @ColumnInfo(name = "profile_id")
    private int idProfile;

    public TaskModel() {
    }

    public TaskModel(int id, String name, String type, int idParentTask, String relationGoal, String dataOfCreate, String deadline, byte[] iconGoal, byte[] iconTaskStatus, int idProfile) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.idParentTask = idParentTask;
        this.relationGoal = relationGoal;
        this.dataOfCreate = dataOfCreate;
        this.deadline = deadline;
        this.iconGoal = iconGoal;
        this.iconTaskStatus = iconTaskStatus;
        this.idProfile = idProfile;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdParentTask() {
        return idParentTask;
    }

    public void setIdParentTask(int idParentTask) {
        this.idParentTask = idParentTask;
    }

    public String getRelationGoal() {
        return relationGoal;
    }

    public void setRelationGoal(String relationGoal) {
        this.relationGoal = relationGoal;
    }

    public String getDataOfCreate() {
        return dataOfCreate;
    }

    public void setDataOfCreate(String dataOfCreate) {
        this.dataOfCreate = dataOfCreate;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public byte[] getIconGoal() {
        return iconGoal;
    }

    public void setIconGoal(byte[] iconGoal) {
        this.iconGoal = iconGoal;
    }

    public byte[] getIconTaskStatus() {
        return iconTaskStatus;
    }

    public void setIconTaskStatus(byte[] iconTaskStatus) {
        this.iconTaskStatus = iconTaskStatus;
    }

    public int getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(int idProfile) {
        this.idProfile = idProfile;
    }
}
