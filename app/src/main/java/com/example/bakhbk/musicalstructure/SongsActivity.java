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
        songs.add(new Track(getString(R.string.one_kiss), getString(R.string.calvin_harris_dua_lipa_one_kiss)));
        songs.add(new Track(getString(R.string.leave_a_light_on), getString(R.string.tom_walker_leave_a_light_on)));
        songs.add(new Track(getString(R.string.say_something), getString(R.string.say_something_justin_timb)));
        songs.add(new Track(getString(R.string.whatever_it_takes), getString(R.string.imagine_dragons_whatever_it_takes)));
        songs.add(new Track(getString(R.string.chun_li), getString(R.string.nicki_minaj_chun_li)));
        songs.add(new Track(getString(R.string.one_kiss), getString(R.string.calvin_harris_dua_lipa_one_kiss)));
        songs.add(new Track(getString(R.string.leave_a_light_on), getString(R.string.tom_walker_leave_a_light_on)));
        songs.add(new Track(getString(R.string.say_something), getString(R.string.say_something_justin_timb)));
        songs.add(new Track(getString(R.string.whatever_it_takes), getString(R.string.imagine_dragons_whatever_it_takes)));
        songs.add(new Track(getString(R.string.chun_li), getString(R.string.nicki_minaj_chun_li)));
        songs.add(new Track(getString(R.string.one_kiss), getString(R.string.calvin_harris_dua_lipa_one_kiss)));
        songs.add(new Track(getString(R.string.leave_a_light_on), getString(R.string.tom_walker_leave_a_light_on)));
        songs.add(new Track(getString(R.string.say_something), getString(R.string.say_something_justin_timb)));
        songs.add(new Track(getString(R.string.whatever_it_takes), getString(R.string.imagine_dragons_whatever_it_takes)));
        songs.add(new Track(getString(R.string.chun_li), getString(R.string.nicki_minaj_chun_li)));
        songs.add(new Track(getString(R.string.one_kiss), getString(R.string.calvin_harris_dua_lipa_one_kiss)));
        songs.add(new Track(getString(R.string.leave_a_light_on), getString(R.string.tom_walker_leave_a_light_on)));
        songs.add(new Track(getString(R.string.say_something), getString(R.string.say_something_justin_timb)));
        songs.add(new Track(getString(R.string.whatever_it_takes), getString(R.string.imagine_dragons_whatever_it_takes)));
        songs.add(new Track(getString(R.string.chun_li), getString(R.string.nicki_minaj_chun_li)));

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
                Intent songsIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                // Start new Intent
                startActivity(songsIntent);

            }
        });
    }
}
