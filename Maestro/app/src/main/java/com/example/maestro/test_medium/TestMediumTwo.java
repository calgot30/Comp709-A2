package com.example.maestro.test_medium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.maestro.R;
import com.example.maestro.test_medium.TestMediumThree;

public class TestMediumTwo extends AppCompatActivity {

    public TextView userAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_medium_two);
        userAnswer = findViewById(R.id.Choice);

    }







    public void LoudClick(View v){
        userAnswer.setText("loud");
    }

    public void QuietClick(View view){
        userAnswer.setText("play softer");
    }

    public void CrescendoClick(View v){
        userAnswer.setText("play louder");
    }

    public void answerClick(View v){
        RightAnswer(v);
    }


    public void RightAnswer(View inputView) {
        String guess = userAnswer.getText().toString();

        if (guess == "loud") {
            Toast.makeText(getApplicationContext(), "incorrect, please try again",
                    Toast.LENGTH_SHORT).show();

        } else if (guess == "play softer") {
            Toast.makeText(getApplicationContext(),"incorrect, please try again",
                    Toast.LENGTH_SHORT).show();
        } else if (guess == "play louder"){
            Toast.makeText(getApplicationContext(), "Correct!",
                    Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, TestMediumThree.class);
            startActivity(i);
        } else {
            Toast.makeText(getApplicationContext(), "Please enter a value", Toast.LENGTH_SHORT).show();
        }
    }
}
