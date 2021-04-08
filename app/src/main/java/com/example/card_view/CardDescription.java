package com.example.card_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CardDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_description);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        TextView tvName = (TextView) findViewById(R.id.nameDescription);
        TextView tvTag = (TextView) findViewById(R.id.tagDescription);
        TextView tvDescription = (TextView) findViewById(R.id.descriptionDescription);
        ImageView ivImage = (ImageView) findViewById(R.id.imageDescription);
        String nameExtra = (String) b.get("name");
        String tagExtra = (String) b.get("tag");
        String descriptionExtra = (String) b.get("description");
        int imageExtra = (int) b.get("image");
        tvName.setText(nameExtra);
        tvTag.setText(tagExtra);
        tvDescription.setText(descriptionExtra);
        ivImage.setImageResource(imageExtra);
    }
}