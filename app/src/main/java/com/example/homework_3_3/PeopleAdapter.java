package com.example.homework_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleViewHolder> {
    public PeopleAdapter(ArrayList<String> peopleList) {
        this.peopleList = peopleList;
    }

    private ArrayList<String> peopleList;

    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PeopleViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.people_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {
        holder.bind(peopleList.get(position));
    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }
}
