package com.example.FragmentDatKhamBV2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.Fragment.Chat_Fragment;
import com.example.Fragment.Danhgia_Fragment;
import com.example.Fragment.Thongtin_Fragment;

public class ViewPagerAdapter3 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter3(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Thongtin_Fragment();
            case 1: return new Danhgia_Fragment();
            case 2: return new Chat_Fragment();
            default: return new Thongtin_Fragment();
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
