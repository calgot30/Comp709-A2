package com.example.maestro.main_menu_nav;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.maestro.Dynamics;
import com.example.maestro.Notation;
import com.example.maestro.R;
import com.example.maestro.Rhythm;

/**
 * A simple {@link Fragment} subclass.
 */
public class Learn_screen extends Fragment {


    public Learn_screen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inputView = inflater.inflate(R.layout.fragment_learn_screen,
                container,
                false
        );

        final ImageButton notation = inputView.findViewById(R.id.NotationButton);
        final ImageButton rhythm = inputView.findViewById(R.id.RhythmButton);
        final ImageButton dynamics = inputView.findViewById(R.id.DynamicButton);


        notation.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        NotationNav(v);
                    }
                }
        );

        rhythm.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        RhythmNav(v);
                    }
                }
        );

        dynamics.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        DynamicsNav(v);
                    }
                }
        );


        return inputView;
    }

    public void NotationNav(View inputView){
        Intent i = new Intent(getActivity(), Notation.class);
        startActivity(i);
    }

    public void RhythmNav(View inputView){
        Intent i = new Intent(getActivity(), Rhythm.class);
        startActivity(i);
    }

    public void DynamicsNav(View inputView){
        Intent i = new Intent(getActivity(), Dynamics.class);
        startActivity(i);
    }


}
