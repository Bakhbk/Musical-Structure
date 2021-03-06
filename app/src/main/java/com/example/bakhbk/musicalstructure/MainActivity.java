package com.example.bakhbk.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the MyPlaylist category
        TextView nowPlaying = findViewById(R.id.now_playing);

        // Set a clickListener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MyPlaylistActivity}
                Intent nowPlaying = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlaying);
            }
        });

        // Find the View that shows the Songs category
        TextView songs = findViewById(R.id.songs);

        // Set a clickListener on that View
        songs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });


        // Find the View that shows the MyPlaylist category
        TextView myPlaylist = findViewById(R.id.my_playlist);

        // Set a clickListener on that View
        myPlaylist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MyPlaylistActivity}
                Intent myPlaylistIntent = new Intent(MainActivity.this, MyPlaylistActivity.class);

                // Start the new activity
                startActivity(myPlaylistIntent);
            }
        });


    }
}
