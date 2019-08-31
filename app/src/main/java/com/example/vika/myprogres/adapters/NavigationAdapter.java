package com.example.vika.myprogres.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vika.myprogres.R;
import com.example.vika.myprogres.models.NavigationMenuModel;

import java.util.ArrayList;

public class NavigationAdapter extends RecyclerView.Adapter<NavigationAdapter.ViewHolder> {

    Context context;
    ArrayList<NavigationMenuModel> arrayList = new ArrayList<>();

    public NavigationAdapter(Context context, ArrayList<NavigationMenuModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.area_model, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.bind(arrayList.get(i));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView navTitle;
        TextView navPoints;

        public ViewHolder(View itemView) {
            super(itemView);
            //    rootView = itemView.findViewById(R.id.rootView);
            navTitle = itemView.findViewById(R.id.tvTitle);
            navPoints = itemView.findViewById(R.id.tvPoints);

        }

        public void bind(NavigationMenuModel item) {
            navTitle.setText(item.getTitile());
            navPoints.setText(String.valueOf(item.getPoints()));


        }
    }

}
