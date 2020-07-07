package com.example.maestro.Test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.maestro.R;

public class TestNotationThree extends AppCompatActivity {

    public TextView userAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_notation_three);
        userAnswer = findViewById(R.id.Choice);

    }







    public void minimClick(View v){
        userAnswer.setText("minim");
    }

    public void Click(View view){
        userAnswer.setText("semibreve");
    }

    public void croClick(View v){
        userAnswer.setText("crotchet");
    }

    public void answerClick(View v){
        RightAnswer(v);
    }


    public void RightAnswer(View inputView) {
        String guess = userAnswer.getText().toString();

        if (guess == "semibreve") {
            Toast.makeText(getApplicationContext(), "incorrect, please try again",
                    Toast.LENGTH_SHORT).show();

        } else if (guess == "crotchet") {
            Toast.makeText(getApplicationContext(),"incorrect, please try again",
                    Toast.LENGTH_SHORT).show();
        } else if (guess == "minim"){
            Toast.makeText(getApplicationContext(), "Correct!",
                    Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, TestNotationCongrats.class);
            startActivity(i);
        } else {
            Toast.makeText(getApplicationContext(), "Please enter a value", Toast.LENGTH_SHORT).show();
        }
    }
}