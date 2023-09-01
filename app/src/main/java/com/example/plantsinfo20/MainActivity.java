package com.example.plantsinfo20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int splashDelayMillis = 5000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent lottieintent = new Intent(MainActivity.this, Signup.class );
                startActivity(lottieintent);
                finish();
            }
        }, splashDelayMillis);
    }
}