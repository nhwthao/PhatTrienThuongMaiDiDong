package com.example.wasabiapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.adapter.ViewPagerAdapter;
import com.example.model.MyItemClick;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Navigation extends AppCompatActivity {
    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        viewPager = findViewById(R.id.view_paper);
        bottomNavigationView = findViewById(R.id.bottom_nav);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.action_calendar:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.action_profile:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.action_notification:
                        viewPager.setCurrentItem(3);
                        break;
                    case R.id.action_person:
                        viewPager.setCurrentItem(4);
                        break;
                }
                return true;
            }

        });

    }
}