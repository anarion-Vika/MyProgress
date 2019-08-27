package com.example.vika.myprogres;

public class NavigationMenuModel {
    private String titile;
    private int points;


    public NavigationMenuModel(String titile, int points) {
        this.titile = titile;
        this.points = points;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
