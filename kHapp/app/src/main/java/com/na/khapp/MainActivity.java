package com.na.khapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create mediaplayer field that will release memory used by sound after it's done playing
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.select);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });

        //create reference to layout in the xml (design) by creating a layour var and assigning the id of the layout in design
        final LinearLayout credits = (LinearLayout) findViewById(R.id.linearsplash);
        credits.setOnClickListener(new View.OnClickListener() {
            //after tapping the layout, this function will get triggered
            public void onClick(View v) {
                //start playing the sound and open the mainmenu activity
                mp.start();
                Intent in = new Intent(getApplicationContext(), mainmenu.class);
                startActivity(in);
            }
        });

    }
}
