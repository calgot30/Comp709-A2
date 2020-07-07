package com.example.maestro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
    }

    //click events
    public void LearnNav(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void ProfileNav(View view){
        Intent i = new Intent(this, Profile.class);
        startActivity(i);
    }
}
