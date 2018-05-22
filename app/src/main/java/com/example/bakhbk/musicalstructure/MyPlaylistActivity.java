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
        songs.add(new Track(getString(R.string.river), getString(R.string.eminem_river)));
        songs.add(new Track(getString(R.string.la_calin), getString(R.string.serhat_durmus_la_calin)));
        songs.add(new Track(getString(R.string.capital_letters), getString(R.string.hailee_steinfeld_capital_letters)));
        songs.add(new Track(getString(R.string.believer), getString(R.string.imagine_dragons_believer)));
        songs.add(new Track(getString(R.string.bella), getString(R.string.wolfine_bella)));
        songs.add(new Track(getString(R.string.walk_it_talk_it), getString(R.string.migos_walk_it_talk_it)));
        songs.add(new Track(getString(R.string.delicate), getString(R.string.taylor_swift_delicate)));
        songs.add(new Track(getString(R.string.anywhere), getString(R.string.rita_ora_anywhere)));
        songs.add(new Track(getString(R.string.sit_next_to_me), getString(R.string.foster_the_people_sit_next_to_me)));

        //Create an {@link ArrayAdapter}, whose data source is a list of Strings.
        TrackAdapter adapter = new TrackAdapter(this, songs);
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
