package com.example.gridviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerDetails extends AppCompatActivity {
    String name;
    String details;
    int image;
    TextView nameTextView;
    TextView detailTextView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_details);

        imageView = findViewById(R.id.firstDetailImageId);
        nameTextView = findViewById(R.id.detailsHeadingId);
        detailTextView = findViewById(R.id.detailId);

        image = getIntent().getIntExtra("pImage", 0);
        name = getIntent().getStringExtra("pName");
        details = getIntent().getStringExtra("pDetails");

        imageView.setImageResource(image);
        nameTextView.setText(name);
        detailTextView.setText(details);
    }
}
