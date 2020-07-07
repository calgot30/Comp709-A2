package com.example.maestro.rhythm_lessons;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.maestro.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RhythmLessonTwo extends Fragment {


    public RhythmLessonTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rhythm_lesson_two, container, false);
    }

}
