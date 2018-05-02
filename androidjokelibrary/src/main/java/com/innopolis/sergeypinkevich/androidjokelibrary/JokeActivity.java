package com.innopolis.sergeypinkevich.androidjokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_GCE_KEY = "gce";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeText = findViewById(R.id.joke_gce_text);
        if (getIntent() != null) {
            if (getIntent().getExtras() != null) {
                if (getIntent().getExtras().containsKey(JOKE_GCE_KEY)) {
                    jokeText.setText(getIntent().getStringExtra(JOKE_GCE_KEY));
                }
            }
        }
    }
}
