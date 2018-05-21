package com.example.bakhbk.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create ArrayList for songs
        final ArrayList<Track> songs = new ArrayList<>();
        songs.add(new Track("One Kiss", "Calvin Harris & Dua Lipa"));
        songs.add(new Track("Leave A Light On", "Tom Walker"));
        songs.add(new Track("Say Something", "Justin Timberlake feat. Chris Stapleton"));
        songs.add(new Track("Whatever It Takes", "Imagine Dragons"));
        songs.add(new Track("Chun-Li", "Nicki Minaj"));
        songs.add(new Track("One Kiss", "Calvin Harris & Dua Lipa"));
        songs.add(new Track("Leave A Light On", "Tom Walker"));
        songs.add(new Track("Say Something", "Justin Timberlake feat. Chris Stapleton"));
        songs.add(new Track("Whatever It Takes", "Imagine Dragons"));
        songs.add(new Track("Chun-Li", "Nicki Minaj"));
        songs.add(new Track("One Kiss", "Calvin Harris & Dua Lipa"));
        songs.add(new Track("Leave A Light On", "Tom Walker"));
        songs.add(new Track("Say Something", "Justin Timberlake feat. Chris Stapleton"));
        songs.add(new Track("Whatever It Takes", "Imagine Dragons"));
        songs.add(new Track("Chun-Li", "Nicki Minaj"));
        songs.add(new Track("One Kiss", "Calvin Harris & Dua Lipa"));
        songs.add(new Track("Leave A Light On", "Tom Walker"));
        songs.add(new Track("Say Something", "Justin Timberlake feat. Chris Stapleton"));
        songs.add(new Track("Whatever It Takes", "Imagine Dragons"));
        songs.add(new Track("Chun-Li", "Nicki Minaj"));

        //Create an {@link ArrayAdapter}, whose data source is a list of Strings.
        WordAdapter adapter = new WordAdapter(this, songs);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        final ListView listView = findViewById(R.id.list);
        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        listView.setAdapter(adapter);

        // Set a clickListener on that View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Create a new Intent to open the NowPlayingActivity
                Intent songsIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                // Start new Intent
                startActivity(songsIntent);

            }
        });
    }
}