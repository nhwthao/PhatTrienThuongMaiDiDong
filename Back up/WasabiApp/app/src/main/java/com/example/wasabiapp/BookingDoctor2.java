package com.example.wasabiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.adapter.ViewDoctorAdapter;
import com.example.adapter.ViewSpecialistAdapter;
import com.google.android.material.tabs.TabLayout;

public class BookingDoctor2 extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Object ViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_doctor2);
        linkViews();
    }

    private void linkViews() {
        tabLayout = findViewById(R.id.tabLayout_BS2);
        viewPager = findViewById(R.id.doctorPager);
         ViewDoctorAdapter viewDoctorAdapter = new ViewDoctorAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewDoctorAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}