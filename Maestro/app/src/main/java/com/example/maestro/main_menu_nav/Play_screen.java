package com.example.maestro.main_menu_nav;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.maestro.Dynamics;
import com.example.maestro.Notation;
import com.example.maestro.Play;
import com.example.maestro.R;
import com.example.maestro.Rhythm;
import com.example.maestro.test_easy.TestEasyOne;
import com.example.maestro.test_hard.TestHardOne;
import com.example.maestro.test_medium.TestMediumOne;


public class Play_screen extends Fragment {


    public Play_screen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inputView = inflater.inflate(R.layout.fragment_play_screen,
                container,
                false
        );

        final ImageButton easy = inputView.findViewById(R.id.NotationButton);
        final ImageButton medium = inputView.findViewById(R.id.RhythmButton);
        final ImageButton hard = inputView.findViewById(R.id.DynamicButton);


        easy.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        EasyNav(v);
                    }
                }
        );

        medium.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        MediumNav(v);
                    }
                }
        );

        hard.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        HardNav(v);
                    }
                }
        );


        return inputView;
    }

    public void EasyNav(View inputView){
        Intent i = new Intent(getActivity(), TestEasyOne.class);
        startActivity(i);
    }

    public void MediumNav(View inputView){
        Intent i = new Intent(getActivity(), TestMediumOne.class);
        startActivity(i);
    }

    public void HardNav(View inputView){
        Intent i = new Intent(getActivity(), TestHardOne.class);
        startActivity(i);
    }


}