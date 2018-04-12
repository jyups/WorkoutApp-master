package com.example.marc_.workoutapp;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;

    private Profile_Fragment profileFragment;
    private Schedule_Fragment scheduleFragment;
    private Search_Fragment searchFragment;
    private Workout_Fragment workoutFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mMainNav = (BottomNavigationView) findViewById(R.id.nav_bar);
        mMainFrame = (FrameLayout) findViewById(R.id.nav_Profile);

        profileFragment = new Profile_Fragment();
        scheduleFragment = new Schedule_Fragment();
        searchFragment = new Search_Fragment();
        workoutFragment = new Workout_Fragment();

        setFragment(profileFragment);

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.nav_Profile:
                        mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
                        setFragment(profileFragment);
                        return true;

                    case R.id.nav_Schedule:
                        mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
                        setFragment(scheduleFragment);
                        return true;

                    case R.id.nav_Workout:
                        mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
                        setFragment(workoutFragment);
                        return true;

                    case R.id.nav_Search:
                        mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
                        setFragment(searchFragment);
                        return true;

                        default:
                            return false;
                }
            }
        });

    }
    private void setFragment(android.support.v4.app.Fragment fragment){
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.profile_frame, fragment);
        fragmentTransaction.commit();

    }
}
