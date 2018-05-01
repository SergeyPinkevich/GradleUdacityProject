package com.innopolis.sergeypinkevich.androidjokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeText = findViewById(R.id.joke_intent_text);
        jokeText.setText(getIntent().getStringExtra(JOKE_KEY));
    }
}
