package com.example.bakhbk.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create ArrayList for songs
        ArrayList<Word> songs = new ArrayList<>();
        songs.add(new Word("One Kiss", "Calvin Harris & Dua Lipa"));
        songs.add(new Word("Leave A Light On", "Tom Walker"));
        songs.add(new Word("Say Something", "Justin Timberlake feat. Chris Stapleton"));
        songs.add(new Word("Whatever It Takes", "Imagine Dragons"));
        songs.add(new Word("Chun-Li", "Nicki Minaj"));
        songs.add(new Word("One Kiss", "Calvin Harris & Dua Lipa"));
        songs.add(new Word("Leave A Light On", "Tom Walker"));
        songs.add(new Word("Say Something", "Justin Timberlake feat. Chris Stapleton"));
        songs.add(new Word("Whatever It Takes", "Imagine Dragons"));
        songs.add(new Word("Chun-Li", "Nicki Minaj"));
        songs.add(new Word("One Kiss", "Calvin Harris & Dua Lipa"));
        songs.add(new Word("Leave A Light On", "Tom Walker"));
        songs.add(new Word("Say Something", "Justin Timberlake feat. Chris Stapleton"));
        songs.add(new Word("Whatever It Takes", "Imagine Dragons"));
        songs.add(new Word("Chun-Li", "Nicki Minaj"));
        songs.add(new Word("One Kiss", "Calvin Harris & Dua Lipa"));
        songs.add(new Word("Leave A Light On", "Tom Walker"));
        songs.add(new Word("Say Something", "Justin Timberlake feat. Chris Stapleton"));
        songs.add(new Word("Whatever It Takes", "Imagine Dragons"));
        songs.add(new Word("Chun-Li", "Nicki Minaj"));

        //Create an {@link ArrayAdapter}, whose data source is a list of Strings.
        WordAdapter adapter = new WordAdapter(this, songs);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = findViewById(R.id.list);
        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        listView.setAdapter(adapter);

    }

}