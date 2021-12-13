package com.example.doanck_mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class DatKhamBS2 extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Object ViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat_kham_bs2);
        linkViews();
    }

    private void linkViews() {
        tabLayout = findViewById(R.id.tabLayout_BS2);
        viewPager = findViewById(R.id.viewPager_BS2);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}