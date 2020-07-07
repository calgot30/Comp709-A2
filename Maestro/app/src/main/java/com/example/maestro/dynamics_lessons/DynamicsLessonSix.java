package com.example.maestro.dynamics_lessons;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.maestro.R;
import com.example.maestro.test_dynamics.TestDynamicsOne;


/**
 * A simple {@link Fragment} subclass.
 */
public class DynamicsLessonSix extends Fragment {


    public DynamicsLessonSix() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inputView = inflater.inflate(R.layout.fragment_dynamics_lesson_six,
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
        Intent i = new Intent(getActivity(), TestDynamicsOne.class);
        startActivity(i);
    }
}
