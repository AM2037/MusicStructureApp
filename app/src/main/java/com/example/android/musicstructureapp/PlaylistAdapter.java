package com.example.android.musicstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

//PlaylistAdapter extends or inherits behavior from the ArrayAdapter class

public class PlaylistAdapter extends ArrayAdapter<Track> {


    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param songs A List of Word objects to display in a list
     */
    PlaylistAdapter(Activity context, ArrayList<Track> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Check if existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        // Get the {@link Word} object located at this position on the list
        Track currentTrack = getItem(position);

        //Find TextView in list_item.xml layout with the ID song_text_view
        TextView songTextView = listItemView.findViewById(R.id.song_text_view);
        //Get miwok translation from current Word object and set this text on miwok TextView
        assert currentTrack != null;
        songTextView.setText(currentTrack.getSongName());

        //Find TextView in the list_item.xml layout with the ID artist_text_view
        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        //Get english translation from current Word object and set this text on default TextView
        artistTextView.setText(currentTrack.getArtistName());

        return listItemView;
    }
}