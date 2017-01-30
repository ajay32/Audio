package com.hackingbuzz.audio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // for playing media file like mp3.. we need media Player

        MediaPlayer musicPlayer = MediaPlayer.create(this, R.raw.enkore);

        musicPlayer.start();


    }
}
// it will create as our project build n start ( its in onCreate )
// one thing...try to rotate the device you will see when it gets to landscape its again starting (Lifecycle methods) and also its already playing..n if you do this again n again its gonna messed up.