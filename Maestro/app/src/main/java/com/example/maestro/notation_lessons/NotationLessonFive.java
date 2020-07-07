package com.example.maestro.notation_lessons;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.maestro.R;
import com.example.maestro.TestNotation;

public class NotationLessonFive extends Fragment {


    public NotationLessonFive() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        View inputView = inflater.inflate(R.layout.fragment_notation_lesson_five,
                container,
                false
        );


        //assigns the object to the button on the screen
        final Button button = (Button) inputView.findViewById(R.id.testButton);
        //listen event for the fragment
        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        takeTest(v);
                    }
                }
        );

        return inputView;
    }



    /*
    Takes the user to the test activity with an intent after the method is called
     */
    public void takeTest(View inputView){
        Intent i = new Intent(getActivity(), TestNotation.class);
        startActivity(i);
    }

}
