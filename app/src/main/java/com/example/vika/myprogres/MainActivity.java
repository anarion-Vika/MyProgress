package com.example.vika.myprogres;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolBar;
    private RecyclerView mRvMenuItem;
    private LinearLayoutManager layoutManager;
    private ArrayList<NavigationMenuModel> modelArrayList = new ArrayList<>();
    private NavigationAdapter navigationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolBar = findViewById(R.id.tbToolBar_main);
        setSupportActionBar(mToolBar);
        mRvMenuItem = findViewById(R.id.rvMenuItems);
        mRvMenuItem.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        mRvMenuItem.setLayoutManager(layoutManager);
        initArrayList();
        navigationAdapter = new NavigationAdapter(this, modelArrayList);
        mRvMenuItem.setAdapter(navigationAdapter);
    }
    private void initArrayList() {
        modelArrayList.add(new NavigationMenuModel("Здоров'є",0));
        modelArrayList.add(new NavigationMenuModel("Розум",0));
        modelArrayList.add(new NavigationMenuModel("Краса",0));
        modelArrayList.add(new NavigationMenuModel("Успіх",0));
        modelArrayList.add(new NavigationMenuModel("Відпочинок та розваги",0));




    }
}
