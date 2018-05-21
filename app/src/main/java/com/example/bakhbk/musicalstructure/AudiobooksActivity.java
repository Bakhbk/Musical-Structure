package com.example.bakhbk.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AudiobooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audiobooks);

        // Create ArrayList for songs
        ArrayList<String> audioBooks = new ArrayList<>();
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");
        audioBooks.add("This Book Will Change Everything! :)");

        // Find the root view of the whole layout
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        // Create a variable to keep track of the current index position
        int index = 0;
        while (index < audioBooks.size()) {
            // Create a new {@link TextView} that displayed the word at
            // and add the View as a child to the rootView
            TextView wordView = new TextView(this);
            wordView.setText(audioBooks.get(index));
            rootView.addView(wordView);

            // Update counter variable
            index++; //index = index + 1
        }
    }
}
