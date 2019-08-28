package com.example.vika.myprogres;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskListFragment extends Fragment {

    private Toolbar mToolBar;
    private ImageView mIvIconProfile;
    private DialogTask dialogTask;
    private ImageButton mIbAddTask;

    public static Fragment newInstance() {
        return new TaskListFragment();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dialogTask = new DialogTask();
        mIvIconProfile = view.findViewById(R.id.ivIconProfile);
        mIbAddTask = view.findViewById(R.id.ibAddtask);
        mIbAddTask.setOnClickListener(v ->
                dialogTask.show(getFragmentManager(), "dialogTask"));

        mIvIconProfile.setOnClickListener(v -> onOpenProfile());
//        mToolBar = findViewById(R.id.tbToolBar_main);
//        setSupportActionBar(mToolBar);

    }

    private void onOpenProfile() {
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, ProfileFragment.newInstanse())
                .addToBackStack(ProfileFragment.class.getName())
                .commit();

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_main, container, false);
    }
}
