package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView chilled = null;
    TextView hooping = null;
    TextView gym = null;
    TextView favorites = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find view that shows the chilled category
        chilled = findViewById(R.id.chilled);

        //Set click listener on that view
        chilled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This code will be executed when chilled is clicked on
                Intent chilledIntent = new Intent(MainActivity.this, ChilledPlaylist.class);

                //Start activity
                startActivity(chilledIntent);
            }
        });

        //Find view that shows the hooping category
        hooping = findViewById(R.id.hooping);

        //Set click listener on that view
        hooping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This code will be executed when hooping is clicked on
                Intent hoopingIntent = new Intent(MainActivity.this, HoopingPlaylist.class);

                //Start activity
                startActivity(hoopingIntent);
            }
        });

        //Find view that shows the gym category
        gym = findViewById(R.id.gym);

        //Set click listener on that view
        gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This code will be executed when gym is clicked on
                Intent gymIntent = new Intent(MainActivity.this, GymPlaylist.class);

                //Start activity
                startActivity(gymIntent);
            }
        });

        //Find view that shows the favorites category
        favorites = findViewById(R.id.favorites);

        //Set click listener on that view
        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This code will be executed when favorites is clicked on
                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesPlaylist.class);

                //Start activity
                startActivity(favoritesIntent);
            }
        });
    }
}
