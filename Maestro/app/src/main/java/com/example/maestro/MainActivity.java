package com.example.maestro;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.maestro.main_menu_nav.Learn_screen;
import com.example.maestro.main_menu_nav.Play_screen;
import com.example.maestro.main_menu_nav.Profile_screen;


/*
This main activity is the screen that the user sees upon entering the app,
the three main navigation screens are split into three separate activities and upon clicking on
one of the buttons they're taken to the separate activities with intents.
 */
/*
        This method of fragment view is from the android developer documentation website
        https://developer.android.com/training/animation/screen-slide.html

        This class displays the fragments for the main screen, and uses a switch statement to
        navigate between the separate fragments which are inside a pager view.

        The pager widget handles the animation transitions between each of the fragment screens
        */
public class MainActivity extends FragmentActivity {

    /*
     * The number of pages that are created.
     */
    private static final int NUM_PAGES = 3;

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
        setContentView(R.layout.activity_main);

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) findViewById(R.id.MainPager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(pagerAdapter);
    }


    //sets the current item in the list as the central screen
    @Override
    protected void onResume(){
        super.onResume();
        mPager.setCurrentItem(1);
    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem());
        }
    }

    public void Learn_nav_button(View v) {
        mPager.setCurrentItem(1);
    }

    public void Profile_nav(View view) {
        mPager.setCurrentItem(0);
    }

    public void Play_nav(View view) {
        mPager.setCurrentItem(2);
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
                    return new Profile_screen();
                case 1:
                    return new Learn_screen();
                case 2:
                    return new Play_screen();

                default:
                    break;
            }
            return new Learn_screen();
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
