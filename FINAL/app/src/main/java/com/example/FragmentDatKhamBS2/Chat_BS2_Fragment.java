package com.example.FragmentDatKhamBS2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doanck_mobile.R;


public class Chat_BS2_Fragment extends Fragment {


    public Chat_BS2_Fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_chat_bs2, container, false);
    }
}