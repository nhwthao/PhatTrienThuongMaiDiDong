package com.example.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.fragment.FragmentSpecialistChat;
import com.example.fragment.FragmentSpecialistInfor;
import com.example.fragment.FragmentSpecialistRate;

public class ViewSpecialistAdapter extends FragmentStatePagerAdapter {
    public ViewSpecialistAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentSpecialistInfor();
            case 1: return new FragmentSpecialistRate();
            case 2: return new FragmentSpecialistChat();
            default: return new FragmentSpecialistInfor();
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
