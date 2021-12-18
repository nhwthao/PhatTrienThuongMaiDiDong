package com.example.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.fragment.FragmentClinicChat;
import com.example.fragment.FragmentClinicInfor;
import com.example.fragment.FragmentClinicRate;

public class ViewClinicAdapter extends FragmentStatePagerAdapter {
    public ViewClinicAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentClinicInfor();
            case 1: return new FragmentClinicRate();
            case 2: return new FragmentClinicChat();
            default: return new FragmentClinicInfor();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Thông tin";
                break;
            case 1:
                title = "Đánh giá";
                break;
            case 2:
                title = "Trò chuyện";
                break;

        }
        return title;
    }
}
