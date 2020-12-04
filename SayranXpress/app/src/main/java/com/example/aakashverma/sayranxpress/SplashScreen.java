package com.example.aakashverma.sayranxpress;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.example.aakashverma.sayranxpress.SayranXpress;

public class SplashScreen extends AppCompatActivity {

    // Set Duration of the Splash Screen
    long Delay = 8000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Remove the Title Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Get the view from splash_screen.xml
        setContentView(R.layout.splash);

        // Create a Timer
        Timer RunSplash = new Timer();

        // Task to do when the timer ends
        TimerTask ShowSplash = new TimerTask() {
            @Override
            public void run() {
                // Close SplashScreen.class
                finish();

                // Start SayranXpress.class
                Intent myIntent = new Intent(SplashScreen.this,
                        SayranXpress.class);
                startActivity(myIntent);
            }
        };

        // Start the timer
        RunSplash.schedule(ShowSplash, Delay);
    }
}