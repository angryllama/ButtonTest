package com.example.dan.buttontest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Dan on 9/23/2015.
 */
public class ButtonsTest2 extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttonstest2);

        // set up media player object
        final MediaPlayer buttonSound = MediaPlayer.create(ButtonsTest2.this, R.raw.combobreaker);

        //set up buttona1 as sound button
        Button buttona1 = (Button) findViewById(R.id.buttona1);
        buttona1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
            }
        });

    }
}
