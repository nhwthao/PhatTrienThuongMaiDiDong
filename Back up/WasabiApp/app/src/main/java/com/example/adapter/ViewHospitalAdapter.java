package com.example.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.fragment.FragmentDoctorChat;
import com.example.fragment.FragmentDoctorInfor;
import com.example.fragment.FragmentDoctorRate;
import com.example.fragment.FragmentHospitalChat;
import com.example.fragment.FragmentHospitalInfor;
import com.example.fragment.FragmentHospitalRate;

public class ViewHospitalAdapter extends FragmentStatePagerAdapter {
    public ViewHospitalAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentHospitalInfor();
            case 1: return new FragmentHospitalRate();
            case 2: return new FragmentHospitalChat();
            default: return new FragmentHospitalInfor();
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
