package com.example.bakhbk.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MyPlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_playlist);

        // Create ArrayList for songs
        final ArrayList<Track> songs = new ArrayList<>();
        songs.add(new Track("River", "Eminem feat. Ed Sheeran"));
        songs.add(new Track("La Calin", "Serhat Durmus"));
        songs.add(new Track("Capital Letters", "Hailee Steinfeld & BloodPop"));
        songs.add(new Track("Believer", "Imagine Dragons"));
        songs.add(new Track("Bella", "Wolfine"));
        songs.add(new Track("Walk It Talk It", "Walk It Talk It"));
        songs.add(new Track("Delicate", "Taylor Swift"));
        songs.add(new Track("Anywhere", "Rita Ora"));
        songs.add(new Track("Sit Next To Me", "Foster The People"));

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
                Intent songsIntent = new Intent(MyPlaylistActivity.this, NowPlayingActivity.class);
                // Start new Intent
                startActivity(songsIntent);

            }
        });
    }
}
