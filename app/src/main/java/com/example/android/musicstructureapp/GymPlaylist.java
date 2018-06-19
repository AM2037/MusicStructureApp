package com.example.android.musicstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GymPlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Track> songs = new ArrayList<>();
        songs.add(new Track("Snails", "Snailed it vol.3 [Enter Slugz City]"));
        songs.add(new Track("Rufus X What So Not X Flume (Ekali Remix)", "Neverbloom"));
        songs.add(new Track("Urbanstep", "Welcome to Wonderland"));
        songs.add(new Track("Like a B****", "Zomboy"));
        songs.add(new Track("Flux Pavilion ft. Tom Cane (Cookie Monsta Remix)", "Feels Good"));
        songs.add(new Track("Excision & Dion Timmer", "Africa"));
        songs.add(new Track("Excision ft. Sam King", "G Sh**"));
        songs.add(new Track("Kodak To Graph", "I AM ANTHEM"));
        songs.add(new Track("Zeds Dead X Megalodon", "Wit Me Dub"));
        songs.add(new Track("Dizzy Wright", "Floyd Money Mayweather"));
        songs.add(new Track("Lil Boosie (Brillz & Snails Bootleg)", "Crazy"));
        songs.add(new Track("Sikdope", "Pieces"));
        songs.add(new Track("BoomBox Cartel", "Virus"));
        songs.add(new Track("Diskord", "Ur Luv"));
        songs.add(new Track("Seven Lions ft. Xilent", "The Fall"));
        songs.add(new Track("G Jones", "F*CK WHAT YOU HEARD"));
        songs.add(new Track("RL Grime (Mura Masa Remix)", "Kingpin"));
        songs.add(new Track("Mura Masa (Vincent Remix)", "Hell"));
        songs.add(new Track("Getter & Adair ft. Georgia Ku", "Blood"));
        songs.add(new Track("Zella Day (StéLouse Remix)", "East of Eden"));
        songs.add(new Track("NGHTMRE & SLANDER", "GUD VIBRATIONS"));

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
