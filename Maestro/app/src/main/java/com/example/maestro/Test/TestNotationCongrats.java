package com.example.maestro.Test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.maestro.MainActivity;
import com.example.maestro.R;

public class TestNotationCongrats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_notation_congrats);
    }

    public void ReturnHome (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
