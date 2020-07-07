package com.example.maestro.test_easy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.maestro.R;
import com.example.maestro.test_easy.TestEasyTwo;

public class TestEasyOne extends AppCompatActivity {

    public TextView userAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_easy_one);
        userAnswer = findViewById(R.id.Choice);

    }







    public void ForteClick(View v){
        userAnswer.setText("forte");
    }

    public void PianoClick(View view){
        userAnswer.setText("piano");
    }

    public void CrescendoClick(View v){
        userAnswer.setText("crescendo");
    }

    public void answerClick(View v){
        RightAnswer(v);
    }


    public void RightAnswer(View inputView) {
        String guess = userAnswer.getText().toString();

        if (guess == "forte") {
            Toast.makeText(getApplicationContext(), "incorrect, please try again",
                    Toast.LENGTH_SHORT).show();

        } else if (guess == "crescendo") {
            Toast.makeText(getApplicationContext(),"incorrect, please try again",
                    Toast.LENGTH_SHORT).show();
        } else if (guess == "piano"){
            Toast.makeText(getApplicationContext(), "Correct!",
                    Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, TestEasyTwo.class);
            startActivity(i);
        } else {
            Toast.makeText(getApplicationContext(), "Please enter a value", Toast.LENGTH_SHORT).show();
        }
    }
}
