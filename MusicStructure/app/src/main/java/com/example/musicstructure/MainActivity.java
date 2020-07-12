package com.example.musicstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Dancehall category
        TextView dancehall = findViewById(R.id.dancehall);

        // Click listener on the View
        dancehall.setOnClickListener(new View.OnClickListener() {
            // This code  is  executed when the dancehall View is clicked.
            @Override
            public void onClick(View view) {
                Intent dancehallIntent = new Intent(MainActivity.this, DancehallActivity.class);
                startActivity(dancehallIntent);
            }
        });


        // Find the View that shows the Afrobeats category
        TextView afrobeats = findViewById(R.id.afrobeats);

        // Click listener on the View
        afrobeats.setOnClickListener(new View.OnClickListener() {
            // This code is executed when the afrobeats View is clicked.
            @Override
            public void onClick(View view) {
                Intent afrobeatsIntent = new Intent(MainActivity.this, AfrobeatsActivity.class);
                startActivity(afrobeatsIntent);
            }
        });


        // Find the View that shows the Zouklove category
        TextView zouklove = findViewById(R.id.zouklove);

        // Click listener on the View
        zouklove.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the romantic View is clicked on.
            @Override
            public void onClick(View view) {
                Intent zouklovelIntent = new Intent(MainActivity.this, ZoukloveActivity.class);
                startActivity(zouklovelIntent);
            }
        });
    }
}
