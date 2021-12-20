package com.example.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.fragment.FragmentTinCuaBan;
import com.example.fragment.FragmentTinTuc;

public class ViewTinTucAdapter extends FragmentStatePagerAdapter {
    public ViewTinTucAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentTinTuc();
            case 1:
                return new FragmentTinCuaBan();
            default:
                return new FragmentTinTuc();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title ="";
        switch (position){
            case 0:
                title = "Tin tức mới";
                break;
            case 1:
                title = "Tin của bạn";
                break;
        }
        return title;
    }
}
