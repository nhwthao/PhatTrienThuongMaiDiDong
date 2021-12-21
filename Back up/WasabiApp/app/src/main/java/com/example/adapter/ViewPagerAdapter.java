package com.example.adapter;

import android.content.ComponentCallbacks;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.fragment.FragmentBookAppointment;
import com.example.fragment.FragmentHome;
import com.example.fragment.FragmentNotification;
import com.example.fragment.FragmentProfile;
import com.example.fragment.FragmentUser;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentHome();
            case 1:
                return new FragmentBookAppointment();
            case 2:
                return new FragmentProfile();
            case 3:
                return new FragmentNotification();
            case 4:
                return new FragmentUser();
            default:
                return new FragmentHome();

        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
