package com.example.wasabiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.fragment.FragmentBookAppointment;
import com.example.fragment.FragmentHome;
import com.example.fragment.FragmentNewsDetails;
import com.example.fragment.FragmentNotification;
import com.example.fragment.FragmentProfile;
import com.example.fragment.FragmentUser;
import com.example.model.MyItemClick;
import com.example.model.News;
import com.example.utils.Constant;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Navigation extends AppCompatActivity implements MyItemClick {
    private ViewPager viewPager_home;
    private BottomNavigationView bottomNavigationView;
    int FragmentHome = 0;
    int FragmentBookAppointment = 1;
    int FragmentFile = 2;
    int FragmentNotice = 3;
    int FragmentUser = 4;
    int CurrentFragment = FragmentHome;
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        navigationView = findViewById(R.id.bottom_nav);
        navigationView.setOnItemSelectedListener(item -> {
            swapScreen(item);
            return false;
        });
        Fragment previousFragment = new FragmentHome();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.view_paper_nav, previousFragment);
        fragmentTransaction.commit();

    }
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.view_paper_nav, fragment).addToBackStack("my_fragment");
        fragmentTransaction.commit();
    }

    private void swapScreen(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_home:
                if (FragmentHome != CurrentFragment) {
                    replaceFragment(new FragmentHome());
                    CurrentFragment = FragmentHome;
                    navigationView.getMenu().findItem(R.id.action_home).setChecked(true);
                }
                break;
            case R.id.action_calendar:
                if (FragmentBookAppointment != CurrentFragment) {
                    replaceFragment(new FragmentBookAppointment());
                    CurrentFragment = FragmentBookAppointment;
                    navigationView.getMenu().findItem(R.id.action_calendar).setChecked(true);
                }
                break;

            case R.id.action_profile:
                if (FragmentFile != CurrentFragment) {
                    replaceFragment(new FragmentProfile());
                    CurrentFragment = FragmentFile;
                    navigationView.getMenu().findItem(R.id.action_profile).setChecked(true);
                }
                break;

            case R.id.action_notification:
                if (FragmentNotice != CurrentFragment) {
                    replaceFragment(new FragmentNotification());
                    CurrentFragment = FragmentNotice;
                    navigationView.getMenu().findItem(R.id.action_notification).setChecked(true);
                }
                break;
            case R.id.action_person:
                if (FragmentUser != CurrentFragment) {
                    replaceFragment(new FragmentUser());
                    CurrentFragment = FragmentUser;
                    navigationView.getMenu().findItem(R.id.action_person).setChecked(true);
                }
                break;
        }
    }

    @Override
    public void click(News n) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        com.example.fragment.FragmentNewsDetails fragmentNewsDetails = new FragmentNewsDetails();

        Bundle bundle = new Bundle();
        bundle.putSerializable(Constant.SELECTED_ITEM, n);
        fragmentNewsDetails.setArguments(bundle);

        transaction.replace(R.id.view_paper_nav, fragmentNewsDetails);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}