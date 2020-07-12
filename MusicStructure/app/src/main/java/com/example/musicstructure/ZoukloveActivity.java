package com.example.musicstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ZoukloveActivity extends AppCompatActivity implements ListView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);

        // Create an array of songs.
        ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs to an array.
        songs.add(new Song("Kim",
                "Confidence"));
        songs.add(new Song("Princess Lover",
                "Mon Soleil"));
        songs.add(new Song("Slaï",
                "Flamme"));
        songs.add(new Song("Fanny J",
                "Ancree a ton port"));
        songs.add(new Song("Lele Pons",
                "Celoso"));
        songs.add(new Song("Barcelona",
                "Touch"));
        songs.add(new Song("Alan Cavé",
                "Se pa pou dat)"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongAdapter adapter = new SongAdapter(this, songs);


        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);

        // Set OnClickListener on ListView to identify the item on ListView clicked by user
        // Text on the ListView item clicked is passed on to PlayerActivity
        listView.setOnItemClickListener(this);
    }

    /**
     * Method to identify ListView item clicked and launch PlayerActivity
     */
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        // Get the selected song.
        Song currentSong = (Song) adapterView.getItemAtPosition(position);

        // Extract strings from songs object.
        String songForPlaying = currentSong.getSong();
        String artistForPlaying = currentSong.getNameOfArtist();

        // Sending the name of artist and song to PlayerActivity.
        Intent songIntent = new Intent(this, PlayerActivity.class);
        songIntent.putExtra("song", songForPlaying);
        songIntent.putExtra("artist", artistForPlaying);
        startActivity(songIntent);
    }

}
