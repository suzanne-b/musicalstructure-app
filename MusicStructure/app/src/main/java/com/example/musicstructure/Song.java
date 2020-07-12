package com.example.musicstructure;

public class Song {
    // The artist name.
    private String mNameOfArtist;

    // The song.
    private String mSong;

    /**
     * Create a new song object.
     *
     * @param nameOfArtist is the name of the artist .
     * @param song is the name of the song.
     */
    public Song (String nameOfArtist, String song) {
        mNameOfArtist = nameOfArtist;
        mSong = song;
    }

    // Get the name of the artist.
    public String getNameOfArtist() {
        return mNameOfArtist;
    }

    // Get the name of the song.
    public String getSong() {
        return mSong;
    }
}
