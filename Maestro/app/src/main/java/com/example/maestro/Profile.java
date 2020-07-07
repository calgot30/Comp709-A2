package com.example.maestro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    //click events
    public void LearnNav(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void PlayNav(View view){
        Intent i = new Intent(this, Play.class);
        startActivity(i);
    }
}
