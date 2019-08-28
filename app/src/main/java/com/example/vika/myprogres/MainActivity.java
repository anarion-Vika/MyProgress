package com.example.vika.myprogres;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends HostActivity {

    @Override
    protected Fragment getFragment() {
        return TaskListFragment.newInstance();

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}
