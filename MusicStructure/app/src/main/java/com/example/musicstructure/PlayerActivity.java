package com.example.musicstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        playing();
    }
    public void playing() {
        // Get extras from Intent.
        Intent songIntent = getIntent();

        // Set the name of song to play.
        TextView songTextView = findViewById(R.id.player_song);
        String songForPlaying = songIntent.getStringExtra("song");
        songTextView.setText(songForPlaying);

        // Set the name of artist for play.
        TextView artistTextView = findViewById(R.id.player_artist);
        String artistForPlaying = songIntent.getStringExtra("artist");
        artistTextView.setText(artistForPlaying);
    }
}
