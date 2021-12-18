package com.example.wasabiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.adapter.ViewDoctorAdapter;
import com.example.adapter.ViewHospitalAdapter;
import com.google.android.material.tabs.TabLayout;

public class BookingHospital2 extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Object ViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_hospital2);
        linkViews();
    }

    private void linkViews() {
        tabLayout = findViewById(R.id.tabLayout_BV2);
        viewPager = findViewById(R.id.HospitalPager);
        ViewHospitalAdapter viewHospitalAdapter = new ViewHospitalAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewHospitalAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}