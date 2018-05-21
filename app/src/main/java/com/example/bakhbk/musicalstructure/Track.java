package com.example.bakhbk.musicalstructure;

public class Track {

    // Songs name for the word
    private String mSongsName;

    // Artists name for the word
    private String mArtistsName;

    public Track(String songsName, String artistsName) {
        mSongsName = songsName;
        mArtistsName = artistsName;
    }

    // Get the songs name of the word.
    public String getSongsName() {
        return mSongsName;
    }

    // Get the artists of the word.
    public String getArtistsName() {
        return mArtistsName;
    }

}
