package com.example.wasabiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.adapter.ViewSpecialistAdapter;
import com.google.android.material.tabs.TabLayout;

public class BookingSpecialist3 extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Object ViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_specialist3);
        linkViews();
    }

    private void linkViews() {
        tabLayout = findViewById(R.id.tabLayout_CG2);
        viewPager = findViewById(R.id.SpecialistPager);
        ViewSpecialistAdapter viewSpecialistAdapter = new ViewSpecialistAdapter(getSupportFragmentManager(),FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewSpecialistAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}