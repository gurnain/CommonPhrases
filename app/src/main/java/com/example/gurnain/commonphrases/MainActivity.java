package com.example.gurnain.commonphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void play(View view) {
        mediaPlayer.pause();
        mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(view.getTag().toString(),"raw",getPackageName()));
        mediaPlayer.start();
        /*if(view.getTag().equals("doyouspeakenglish")){
            mediaPlayer.pause();
            mediaPlayer = MediaPlayer.create(this,R.raw.doyouspeakenglish);
            mediaPlayer.start();
        } else if (view.getTag().equals("goodevening")) {
            mediaPlayer.pause();
            mediaPlayer = MediaPlayer.create(this,R.raw.goodevening);
            mediaPlayer.start();
        } else if (view.getTag().equals("hello")) {
            mediaPlayer.pause();
            mediaPlayer = MediaPlayer.create(this,R.raw.hello);
            mediaPlayer.start();
        } else if (view.getTag().equals("howareyou")) {
            mediaPlayer.pause();
            mediaPlayer = MediaPlayer.create(this,R.raw.howareyou);
            mediaPlayer.start();
        } else if (view.getTag().equals("ilivein")) {
            mediaPlayer.pause();
            mediaPlayer = MediaPlayer.create(this,R.raw.ilivein);
            mediaPlayer.start();
        } else if (view.getTag().equals("mynameis")) {
            mediaPlayer.pause();
            mediaPlayer = MediaPlayer.create(this,R.raw.mynameis);
            mediaPlayer.start();
        } else if (view.getTag().equals("please")) {
            mediaPlayer.pause();
            mediaPlayer = MediaPlayer.create(this,R.raw.please);
            mediaPlayer.start();
        } else {
            mediaPlayer.pause();
            mediaPlayer = MediaPlayer.create(this,R.raw.welcome);
            mediaPlayer.start();
        }*/
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this,R.raw.doyouspeakenglish);
    }
}
