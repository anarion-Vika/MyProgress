package com.example.vika.myprogres.models;

public class SubGoalModel {

    private String typeTask, nameSubGoal, relationGoal, dataOfCreate;
    private int iconGoal, iconTaskStatus;

    public SubGoalModel(String typeTask, String nameSubGoal, String relationGoal, String dataOfCreate, int iconGoal, int iconTaskStatus) {
        this.typeTask = typeTask;
        this.nameSubGoal = nameSubGoal;
        this.relationGoal = relationGoal;
        this.dataOfCreate = dataOfCreate;
        this.iconGoal = iconGoal;
        this.iconTaskStatus = iconTaskStatus;
    }

    public String getTypeTask() {
        return typeTask;
    }

    public void setTypeTask(String typeTask) {
        this.typeTask = typeTask;
    }

    public String getNameSubGoal() {
        return nameSubGoal;
    }

    public void setNameSubGoal(String nameSubGoal) {
        this.nameSubGoal = nameSubGoal;
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
