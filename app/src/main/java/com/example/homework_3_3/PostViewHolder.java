package com.example.homework_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_post;
    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_post = itemView.findViewById(R.id.tv_post);
    }
    public void bind (String post){tv_post.setText(post);}
}
