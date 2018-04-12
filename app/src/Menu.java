package com.example.marc_.workoutapp;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Menu extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    protected BottomNavigationView navigationView;

    private Profile_Fragment profileFragment;
    private Schedule_Fragment scheduleFragment;
    private Search_Fragment searchFragment;
    private Workout_Fragment workoutFragment;
    private Gym_Activity gymActivity;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mMainNav = (BottomNavigationView) findViewById(R.id.nav_bar);
        mMainNav.setOnNavigationItemSelectedListener(this);

//        mMainNav = (BottomNavigationView) findViewById(R.id.nav_bar);
//        mMainFrame = (FrameLayout) findViewById(R.id.nav_Profile);

//        profileFragment = new Profile_Fragment();
//        scheduleFragment = new Schedule_Fragment();
//        searchFragment = new Search_Fragment();
//        workoutFragment = new Workout_Fragment();
//        gymActivity = new Gym_Activity();
        //recyclerView = (RecyclerView) findViewById(R.id.fragment_workout);
        //recyclerView.setLayoutManager (new LinearLayoutManager((this));
        //recyclerView.setAdapter(new RecyclerViewAdapter(this));


        //setFragment(profileFragment);

//        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                switch (item.getItemId()){
//                    case R.id.nav_Profile:
//                        mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
//                        //setFragment(profileFragment);
//                        return true;
//
//                    case R.id.nav_Schedule:
//                        mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
//                        //setFragment(scheduleFragment);
//                        return true;
//
//                    case R.id.nav_Workout:
//                        mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
//                        //setFragment(workoutFragment);
//                        return true;
//
//                    case R.id.nav_Search:
//                        mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
//                        //setFragment(searchFragment);
//                        return true;
//
//                    case R.id.nav_Map:
//                        mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
//                        Intent newIntent = new Intent(Menu.getAcitivity(), Gym_Activity.class);
//                        startActivity(newIntent);
//                        //(gymActivity);
//                        return true;
//
//                        default:
//                            return false;
//                }
//            }
//        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_Profile:
                mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
                //setFragment(profileFragment);
                return true;

            case R.id.nav_Schedule:
                mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
                //setFragment(scheduleFragment);
                return true;

            case R.id.nav_Workout:
                mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
                //setFragment(workoutFragment);
                return true;

            case R.id.nav_Search:
                mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
                //setFragment(searchFragment);
                return true;

            case R.id.nav_Map:
                mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
                Intent newIntent = new Intent(this, Gym_Activity.class);
                startActivity(newIntent);
                //(gymActivity);
                return true;

            default:
                return false;
        }
    }

//    private void setFragment(android.support.v4.app.Fragment fragment){
//        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.profile_frame, fragment);
//        fragmentTransaction.commit();
//    }

}
