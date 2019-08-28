package com.example.vika.myprogres;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {

    private ImageButton mIbAddArea;
    private DialogArea dialogArea;

    private RecyclerView mRvMenuItem;
    private ArrayList<NavigationMenuModel> modelArrayList = new ArrayList<>();
    private NavigationAdapter navigationAdapter;

    public static Fragment newInstanse() {
        return new ProfileFragment();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mIbAddArea = view.findViewById(R.id.ibAddArea_profile);
        dialogArea = new DialogArea();
        mIbAddArea.setOnClickListener(v->
                dialogArea.show(getFragmentManager(), "dialogArea"));
        //        mRvMenuItem = findViewById(R.id.rvMenuItems);
//        mRvMenuItem.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(this);
//        mRvMenuItem.setLayoutManager(layoutManager);
//        initArrayList();
//        navigationAdapter = new NavigationAdapter(this, modelArrayList);
//        mRvMenuItem.setAdapter(navigationAdapter);
    }

    private void initArrayList() {
        modelArrayList.add(new NavigationMenuModel("Здоров'є", 0));
        modelArrayList.add(new NavigationMenuModel("Розум", 0));
        modelArrayList.add(new NavigationMenuModel("Краса", 0));
        modelArrayList.add(new NavigationMenuModel("Успіх", 0));
        modelArrayList.add(new NavigationMenuModel("Відпочинок та розваги", 0));

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.profile_layout, container, false);
    }
}
