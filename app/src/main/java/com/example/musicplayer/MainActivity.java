package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
MediaPlayer mplayer;
    Button playbtn;
    Button stopbtn;
    Button resumebtn;
    ImageView img;
   int status=0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resumebtn=findViewById(R.id.button1);
        stopbtn=findViewById(R.id.button3);
        playbtn=findViewById(R.id.button2);

        mplayer=MediaPlayer.create(this,R.raw.song);

        if(mplayer.isPlaying()==true){
            status=1;
        }
        else if(mplayer.isPlaying()==false){
            status=0;
        }
        playbtn.setOnClickListener(this::play);
        resumebtn.setOnClickListener(this::resume);
        stopbtn.setOnClickListener(this::stop);
        }

        ////////////////////////////////////////
        public void play(View view){
        if (status==1){
            stat();
        }
        else{
            mplayer.start();
        }

        }
        ////////////////////////////////////////////////
    public void stop(View view){
mplayer.pause();
    }
    ////////////////////////////////////
    public void resume(View view){
if(status==1){
    stat();
}
else{
    mplayer.start();
}

    }
    public void stat() {
    }

    }
