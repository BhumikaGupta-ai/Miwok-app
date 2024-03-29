package com.example.language_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","lutti"));
        words.add(new Word("two","otiiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oyyisa"));
        words.add(new Word("five","massokka"));
        words.add(new Word("six","kenekaku"));
        words.add(new Word("seven","kawinta"));
        words.add(new Word("eight","wo'e"));
        words.add(new Word("nine","na'aacha"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}