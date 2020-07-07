package com.example.maestro;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.maestro.Test.TestNotationTwo;


/*
This is the basic test class that I created for all of the activities, I just made a basic test set of if statements
for the user to select from. The user is prompted to press one of the buttons, it places their choice inside of the textview
underneath the symbol.  Then they can check their answer with the answer button, if its correct they will continue.  If they are incorrect it
won't let them progress. The original idea was to have these as fragments but became activities instead as it was much easier to implement and control.
 */
public class TestNotation extends AppCompatActivity {

    public TextView userAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
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

        if (guess == "minim") {
            Toast.makeText(getApplicationContext(), "incorrect, please try again",
                    Toast.LENGTH_SHORT).show();

        } else if (guess == "semibreve") {
            Toast.makeText(getApplicationContext(),"incorrect, please try again",
                    Toast.LENGTH_SHORT).show();
        } else if (guess == "crotchet"){
            Toast.makeText(getApplicationContext(), "Correct!",
                    Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, TestNotationTwo.class);
            startActivity(i);
        } else {
            Toast.makeText(getApplicationContext(), "Please enter a value", Toast.LENGTH_SHORT).show();
        }
    }
}