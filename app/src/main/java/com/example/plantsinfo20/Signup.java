package com.example.plantsinfo20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

import android.widget.TextView;

public class Signup extends AppCompatActivity {

    TextView logtextview;

    Button signbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        signbtn =findViewById(R.id.upbtn);
        signbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent upintent = new Intent(Signup.this, homeActivity.class);
                startActivity(upintent);
            }
        });
        logtextview = findViewById(R.id.already);
        logtextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logintent = new Intent(Signup.this, login.class);
                startActivity(logintent);
            }
        });
    }
}