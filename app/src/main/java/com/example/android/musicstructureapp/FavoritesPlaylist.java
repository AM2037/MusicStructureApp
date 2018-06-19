package com.example.android.musicstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoritesPlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Track> songs = new ArrayList<>();
        songs.add(new Track("Tritonal ft. Cristina Soto (Seven Lions Mix)", "Still With Me"));
        songs.add(new Track("Paramore (Live in Philadelphia)", "I Caught Myself"));
        songs.add(new Track("G Jones & Bleep Bloop", "A$∆¶ M'§"));
        songs.add(new Track("Plantrae", "Enter the Seed"));
        songs.add(new Track("Minnesota", "Stardust Redux"));
        songs.add(new Track("Zhu", "Secret Weapon"));
        songs.add(new Track("Alina Baraz ft. Khalid", "Electric"));
        songs.add(new Track("Tash Sultana (Live Bedroom Recording)", "Gemini"));
        songs.add(new Track("Aurora", "Queendom"));
        songs.add(new Track("Neo Noir ft. Brooke Williams", "When I Was Young"));
        songs.add(new Track("Blackmill", "Spirit of Life"));
        songs.add(new Track("Pendulum", "Watercolour"));
        songs.add(new Track("Snavs & ReauBeau", "Dreams"));
        songs.add(new Track("Crywolf", "Wake [E-bow]"));
        songs.add(new Track("Seven Lions", "Isis (Deep Mix)"));
        songs.add(new Track("Quixotic & The Human Experience", "From the Outside Looking In"));
        songs.add(new Track("The Weeknd", "Outside"));
        songs.add(new Track("Brothel", "Q"));
        songs.add(new Track("Halsey (Oscar's Remix)", "Gasoline"));
        songs.add(new Track("alt-J", "Hunger of the Pine"));
        songs.add(new Track("Porter Robinson (Big Sandz Remix)", "Fellow Feeling"));

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
