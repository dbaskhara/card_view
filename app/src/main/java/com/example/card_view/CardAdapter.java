package com.example.card_view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<MyViewHolder> {
    List<CardData> listCardData = Collections.emptyList();
    Context context;
    AdapterView.OnItemClickListener click;
    public CardAdapter(List<CardData> listCardData, Context context) {
        this.listCardData = listCardData;
        this.context = context;
    }
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        MyViewHolder mvh = new MyViewHolder(v);
        return mvh;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myTextView1.setText(listCardData.get(position).getName());
        holder.myTextView2.setText(listCardData.get(position).getTag());
        holder.myImageView.setImageResource(listCardData.get(position).getImage());
        holder.myTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent description = new Intent(v.getContext(),CardDescription.class);
                description.putExtra("name" , listCardData.get(position).getName());
                description.putExtra("tag" , listCardData.get(position).getTag());
                description.putExtra("description" , listCardData.get(position).getDescription());
                description.putExtra("image",listCardData.get(position).getImage());
                v.getContext().startActivity(description);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCardData.size();
    }
}
