package com.example.maestro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.maestro.rhythm_lessons.RhythmLessonFive;
import com.example.maestro.rhythm_lessons.RhythmLessonFour;
import com.example.maestro.rhythm_lessons.RhythmLessonOne;
import com.example.maestro.rhythm_lessons.RhythmLessonThree;
import com.example.maestro.rhythm_lessons.RhythmLessonTwo;


/*
    This method of fragment view is from the android developer documentation website
    https://developer.android.com/training/animation/screen-slide.html

    This class displays the fragments from the Rhythm lessons, and uses a switch statement to
    navigate between the separate fragments which are inside a pager view.

    The pager widget handles the animation transitions between each of the fragment screens

    The user can navigate out of this screen by pressing the back button, or they finish the lesson and head to the text screen.
 */

public class Rhythm extends FragmentActivity {

    /*
     * The number of pages that are created.
     */
    private static final int NUM_PAGES = 5;

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next fragments.
     */
    private ViewPager mPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhythm);

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(pagerAdapter);
    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    /*
    Creates the ScreenSlidePagerAdapter class, this class has a switch statement that handles
    where the user is situated within the fragments, if they are at the beginning or end, they cannot
    go any farther that way.
     */
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new RhythmLessonOne();
                case 1:
                    return new RhythmLessonTwo();
                case 2:
                    return new RhythmLessonThree();
                case 3:
                    return new RhythmLessonFour();
                case 4:
                    return new RhythmLessonFive();
                default:
                    break;
            }
            return new RhythmLessonOne();
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}