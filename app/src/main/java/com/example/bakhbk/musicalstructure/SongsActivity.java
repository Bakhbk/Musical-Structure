package com.example.bakhbk.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ArrayList<Word> songs = new ArrayList<>();
        songs.add(new Word("One Kiss","Calvin Harris & Dua Lipa"));
        songs.add(new Word("Leave A Light On","Tom Walker"));
        songs.add(new Word("Say Something","Justin Timberlake feat. Chris Stapleton"));
        songs.add(new Word("Whatever It Takes","Imagine Dragons"));
        songs.add(new Word("Chun-Li","Nicki Minaj"));
        songs.add(new Word("One Kiss","Calvin Harris & Dua Lipa"));
        songs.add(new Word("Leave A Light On","Tom Walker"));
        songs.add(new Word("Say Something","Justin Timberlake feat. Chris Stapleton"));
        songs.add(new Word("Whatever It Takes","Imagine Dragons"));
        songs.add(new Word("Chun-Li","Nicki Minaj"));
        songs.add(new Word("One Kiss","Calvin Harris & Dua Lipa"));
        songs.add(new Word("Leave A Light On","Tom Walker"));
        songs.add(new Word("Say Something","Justin Timberlake feat. Chris Stapleton"));
        songs.add(new Word("Whatever It Takes","Imagine Dragons"));
        songs.add(new Word("Chun-Li","Nicki Minaj"));
        songs.add(new Word("One Kiss","Calvin Harris & Dua Lipa"));
        songs.add(new Word("Leave A Light On","Tom Walker"));
        songs.add(new Word("Say Something","Justin Timberlake feat. Chris Stapleton"));
        songs.add(new Word("Whatever It Takes","Imagine Dragons"));
        songs.add(new Word("Chun-Li","Nicki Minaj"));

        WordAdapter adapter = new WordAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}