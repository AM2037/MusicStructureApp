package com.example.android.musicstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HoopingPlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Track> songs = new ArrayList<>();
        songs.add(new Track("San Holo (Taska Black Remix)", "Light"));
        songs.add(new Track("Rufus X What So Not X Flume (Ekali Remix)", "Neverbloom"));
        songs.add(new Track("Virtual Self", "Eon Break"));
        songs.add(new Track("Said the Sky ft. Kwesi", "All I Got"));
        songs.add(new Track("Jauz X Ghastly", "Ghosts N' Sharks"));
        songs.add(new Track("Griz", "Griz Unreleased"));
        songs.add(new Track("kua X Pretty Lights X Bassnectar", "One Thing & Solar Sailor"));
        songs.add(new Track("Alison Wonderland (Vincent Remix)", "U don't know"));
        songs.add(new Track("Alina Baraz & Galimatias (Ekali Mix)", "Can I"));
        songs.add(new Track("BoomBox Cartel & QUIX ft. Anjulie", "Supernatural"));
        songs.add(new Track("Khalid & Normandi", "Love Lies"));
        songs.add(new Track("Marshmello X Ookay", "Chasing Colors"));
        songs.add(new Track("Sikdope", "Stardust"));
        songs.add(new Track("Neovaii", "Not You"));
        songs.add(new Track("Point Point (Khamsin Mix)", "Life in Grey"));
        songs.add(new Track("Bassnectar & G Jones", "The Mystery Spot"));
        songs.add(new Track("Lostboycrow (Kill Paris Remix)", "Powers"));
        songs.add(new Track("Above & Beyond (Seven Lions Mix)", "You Got To Go"));
        songs.add(new Track("Tory Lanez x Play Picasso x CoopChardonnay", "Proud Family"));
        songs.add(new Track("BLU J x MOONZz", "GDBYE"));
        songs.add(new Track("Aero Chord x Fractal (ft. Q'AILA)", "Until the End"));

        /*Create {@link PlaylistAdapter} which creates layouts for each list item
         @param songs represents a list of tracks, shown above*/

        PlaylistAdapter adapter = new PlaylistAdapter(this, songs);

        //find {@link ListView} in hierarchy of linked activity with view ID list

        ListView listView = findViewById(R.id.list);

        /*Make {@link ListView} use {@link ArrayAdapter} previously created so ListView can
          display list items for each word in list. Call setAdapter on {@link ListView} object and pass in an argument: {@link ArrayAdapter}
          @param itemAdapter is the variable name of ArrayAdapter*/
        assert listView != null;
        listView.setAdapter(adapter);
    }

}
