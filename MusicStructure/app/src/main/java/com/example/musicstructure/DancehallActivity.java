package com.example.musicstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DancehallActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);

        // Create an array of songs.
        ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs to an array.
        songs.add(new Song("Popcaan",
                "Mamakita"));
        songs.add(new Song("Intence",
                "Yeng"));
        songs.add(new Song("Kranium",
                "Gal Policy"));
        songs.add(new Song("Buju Banton",
                "Trust"));
        songs.add(new Song("Aidonia",
                "Aircraft"));
        songs.add(new Song("Twani",
                "Honda"));
        songs.add(new Song("Squash",
                "Pinocchio)"));

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
