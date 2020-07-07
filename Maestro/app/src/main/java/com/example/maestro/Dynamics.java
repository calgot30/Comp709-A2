package com.example.maestro;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.maestro.dynamics_lessons.DynamicsLessonFive;
import com.example.maestro.dynamics_lessons.DynamicsLessonFour;
import com.example.maestro.dynamics_lessons.DynamicsLessonOne;
import com.example.maestro.dynamics_lessons.DynamicsLessonSix;
import com.example.maestro.dynamics_lessons.DynamicsLessonThree;
import com.example.maestro.dynamics_lessons.DynamicsLessonTwo;


/*
    This method of fragment view is from the android developer documentation website
    https://developer.android.com/training/animation/screen-slide.html

    This class displays the fragments from the dynamics lessons, and uses a switch statement to
    navigate between the separate fragments which are inside a pager view.

    The pager widget handles the animation transitions between each of the fragment screens

    The user can navigate out of this screen by pressing the back button, or they finish the lesson and head to the text screen.
 */
public class Dynamics extends FragmentActivity {

    /*
     * The number of pages that are created.
     */
    private static final int NUM_PAGES = 6;

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
        setContentView(R.layout.activity_dynamics);

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
                    return new DynamicsLessonOne();
                case 1:
                    return new DynamicsLessonTwo();
                case 2:
                    return new DynamicsLessonThree();
                case 3:
                    return new DynamicsLessonFour();
                case 4:
                    return new DynamicsLessonFive();
                case 5:
                    return new DynamicsLessonSix();
                default:
                    break;
            }
            return new DynamicsLessonOne();
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
