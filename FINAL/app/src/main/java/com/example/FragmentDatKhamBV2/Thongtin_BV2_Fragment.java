package com.example.FragmentDatKhamBV2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doanck_mobile.R;

public class Thongtin_BV2_Fragment extends Fragment {


    public Thongtin_BV2_Fragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_thongtin_bv2, container, false);
    }
}