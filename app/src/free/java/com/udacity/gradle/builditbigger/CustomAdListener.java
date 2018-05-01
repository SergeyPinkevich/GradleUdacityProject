package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.innopolis.sergeypinkevich.androidjokelibrary.JokeActivity;
import com.innopolis.sergeypinkevich.javajokelibrary.Joker;

import static com.innopolis.sergeypinkevich.androidjokelibrary.JokeActivity.JOKE_KEY;

/**
 * @author Sergey Pinkevich
 */
public class CustomAdListener extends AdListener {

    private Context mContext;

    public CustomAdListener(Context context) {
        mContext = context;
    }

    @Override
    public void onAdClosed() {
        super.onAdClosed();
        new EndpointsAsyncTask().execute(new Pair<Context, String>(mContext, "Manfred"));
        Toast.makeText(mContext, Joker.tellJokeForToast(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(mContext, JokeActivity.class);
        intent.putExtra(JOKE_KEY, Joker.tellJokeForIntent());
        mContext.startActivity(intent);
    }
}
