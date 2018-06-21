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
        songs.add(new Track(getString(R.string.hooping_artist1), getString(R.string.hooping_song1)));
        songs.add(new Track(getString(R.string.hooping_artist2), getString(R.string.hooping_song2)));
        songs.add(new Track(getString(R.string.hooping_artist3), getString(R.string.hooping_song3)));
        songs.add(new Track(getString(R.string.hooping_artist4), getString(R.string.hooping_song4)));
        songs.add(new Track(getString(R.string.hooping_artist5), getString(R.string.hooping_song5)));
        songs.add(new Track(getString(R.string.hooping_artist6), getString(R.string.hooping_song6)));
        songs.add(new Track(getString(R.string.hooping_artist7), getString(R.string.hooping_song7)));
        songs.add(new Track(getString(R.string.hooping_artist8), getString(R.string.hooping_song8)));
        songs.add(new Track(getString(R.string.hooping_artist9), getString(R.string.hooping_song9)));
        songs.add(new Track(getString(R.string.hooping_artist10), getString(R.string.hooping_song10)));
        songs.add(new Track(getString(R.string.hooping_artist11), getString(R.string.hooping_song11)));
        songs.add(new Track(getString(R.string.hooping_artist12), getString(R.string.hooping_song12)));
        songs.add(new Track(getString(R.string.hooping_artist13), getString(R.string.hooping_song13)));
        songs.add(new Track(getString(R.string.hooping_artist14), getString(R.string.hooping_song14)));
        songs.add(new Track(getString(R.string.hooping_artist15), getString(R.string.hooping_song15)));
        songs.add(new Track(getString(R.string.hooping_artist16), getString(R.string.hooping_song16)));
        songs.add(new Track(getString(R.string.hooping_artist17), getString(R.string.hooping_song17)));
        songs.add(new Track(getString(R.string.hooping_artist18), getString(R.string.hooping_song18)));
        songs.add(new Track(getString(R.string.hooping_artist19), getString(R.string.hooping_song19)));
        songs.add(new Track(getString(R.string.hooping_artist20), getString(R.string.hooping_song20)));

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
