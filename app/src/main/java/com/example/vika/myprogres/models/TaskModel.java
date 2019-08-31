package com.example.vika.myprogres.models;

public class TaskModel {

    private String nameTask, typeTask, nameParent, relationGoal, dataOfCreate;
    private int iconGoal, iconTaskStatus;

    public TaskModel(String nameTask, String typeTask, String nameParent, String relationGoal, String dataOfCreate, int iconGoal, int iconTaskStatus) {
        this.nameTask = nameTask;
        this.typeTask = typeTask;
        this.nameParent = nameParent;
        this.relationGoal = relationGoal;
        this.dataOfCreate = dataOfCreate;
        this.iconGoal = iconGoal;
        this.iconTaskStatus = iconTaskStatus;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getTypeTask() {
        return typeTask;
    }

    public void setTypeTask(String typeTask) {
        this.typeTask = typeTask;
    }

    public String getNameParent() {
        return nameParent;
    }

    public void setNameParent(String nameParent) {
        this.nameParent = nameParent;
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

    public int getIconGoal() {
        return iconGoal;
    }

    public void setIconGoal(int iconGoal) {
        this.iconGoal = iconGoal;
    }

    public int getIconTaskStatus() {
        return iconTaskStatus;
    }

    public void setIconTaskStatus(int iconTaskStatus) {
        this.iconTaskStatus = iconTaskStatus;
    }
}
