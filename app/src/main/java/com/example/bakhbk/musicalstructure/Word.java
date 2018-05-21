package com.example.bakhbk.musicalstructure;

public class Word {

    // Songs name for the word
    private String mSongsName;

    // Artists name for the word
    private String mArtistsName;

    public Word(String songsName, String artistsName) {
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