package com.example.fragment;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.model.BookAppointment;
import com.example.model.MyItemClick;
//import com.example.wasabiapp.ActivityLogout;
import com.example.wasabiapp.ActivityLoginAndRegister;
import com.example.wasabiapp.R;

import com.example.wasabiapp.R;

public class FragmentUser extends Fragment {
    LinearLayout lnLogout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        lnLogout = view.findViewById(R.id.lnLogout);
        addEvents();
        return view;
    }


    private void addEvents() {
        lnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentLogout fragmentLogout = new FragmentLogout();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frUser, fragmentLogout);
                transaction.commit();
            }
        });

    }
}

