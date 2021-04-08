package com.example.card_view;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView myTextView1 , myTextView2;
    ImageView myImageView;
    MyViewHolder(View itemView){
        super(itemView);
        myTextView1 = itemView.findViewById(R.id.name);
        myTextView2 = itemView.findViewById(R.id.tag);
        myImageView = itemView.findViewById(R.id.ilustration);
    }
}
