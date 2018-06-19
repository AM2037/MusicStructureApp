package com.example.android.musicstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ChilledPlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Track> songs = new ArrayList<>();
        songs.add(new Track("Ekali & Zhu", "Blame"));
        songs.add(new Track("6lack", "Free"));
        songs.add(new Track("Sonder", "Too Fast"));
        songs.add(new Track("Duke Dumont", "Ocean Drive"));
        songs.add(new Track("Billie Eilish & Khalid", "Lovely"));
        songs.add(new Track("Marshmello ft. Khalid", "Silence"));
        songs.add(new Track("Ookay", "Thief"));
        songs.add(new Track("Ghastly", "I'll Wait"));
        songs.add(new Track("Dpat", "Bloom"));
        songs.add(new Track("James Blake", "Retrograde"));
        songs.add(new Track("BoomBox Cartel ft. Nevve", "Whisper"));
        songs.add(new Track("Rezz", "Clear"));
        songs.add(new Track("Dabin", "Lillith"));
        songs.add(new Track("Feder ft. Lyse", "GOODBYE"));
        songs.add(new Track("Blackmill", "Gaia"));
        songs.add(new Track("Taska Black ft. Pauline Herr", "Nothing Lasts"));
        songs.add(new Track("Daniel Caesar ft. Kali Uchis", "Get You"));
        songs.add(new Track("Kaskade vs ZHU", "In the Morning"));
        songs.add(new Track("What So Not ft. George Maple -- Ekali Mix", "Gemini"));
        songs.add(new Track("Elliot Moss", "Without the Lights"));
        songs.add(new Track("Gallant", "Manhattan-- Real Slow Mix"));

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
