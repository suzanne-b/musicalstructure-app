package com.example.musicstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    SongAdapter( Context context, ArrayList<Song> object) {
        super(context, 0,object);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }

        Song currentWord= (Song) getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_text_view
        TextView songTextView = listItemView.findViewById(R.id.song_text_view);
        // Get the name of song from the current song object and
        // set this text on the name TextView
        songTextView.setText(currentWord.getSong());

        // Find the TextView in the list_item.xml layout with the ID artist_text_view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the name of artist from the current song object and
        // set this text on the name TextView
        artistTextView.setText(currentWord.getNameOfArtist());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}