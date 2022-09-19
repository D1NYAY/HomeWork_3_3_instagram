package com.example.homework_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PeopleViewHolder extends RecyclerView.ViewHolder {
    private TextView tvPeople;
    public PeopleViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPeople = itemView.findViewById(R.id.tv_people);


    }
    public void bind (String people){
        tvPeople.setText(people);
    }
}
