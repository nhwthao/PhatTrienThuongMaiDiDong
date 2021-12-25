package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.wasabiapp.R;

public class FragmentTBLichKham extends Fragment {
    LinearLayout lnMaLichKham0001;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tblich_kham, container, false);
        lnMaLichKham0001 = view.findViewById(R.id.lnMaLichKham0001);
        addEvents();
        return view;
    }

    private void addEvents() {
        lnMaLichKham0001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentBookAppointmentNewDetails details = new FragmentBookAppointmentNewDetails();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frTBLichKham, details);
                transaction.commit();
            }
        });
    }
}