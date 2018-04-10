package com.example.marc_.workoutapp;

import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    List<Button> workouts;
    Context context;
    public RecyclerViewAdapter(Context context, List<Button> workouts){
        this.context=context;
        this.workouts=workouts;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.recyclerview_row,parent,false);
        Item item=new Item(row);
        return item;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return workouts.size();
    }

    public class Item extends RecyclerView.ViewHolder {
        Button button;
        public Item(View itemView) {
            super(itemView);
            button = (Button) itemView.findViewById(R.id.workoutButton);
        }
    }

    public void add(){

    }

}
