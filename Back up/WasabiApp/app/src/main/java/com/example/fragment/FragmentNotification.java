package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.model.BookAppointment;
import com.example.model.MyItemClick;
import com.example.wasabiapp.R;

public class FragmentNotification extends Fragment {
    Button btnTatCa, btnLichKham, btnYTe;
    private FragmentManager manager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notification, container, false);
        btnTatCa = view.findViewById(R.id.btnTatCa);
        btnLichKham = view.findViewById(R.id.btnLichKham);
        btnYTe = view.findViewById(R.id.btnYTe);
        addEvents();
        return view;
    }

    private void addEvents() {
        btnTatCa.setOnClickListener(myClick);
        btnLichKham.setOnClickListener(myClick);
        btnYTe.setOnClickListener(myClick);
    }
    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            Fragment fragment = null;
            if(view.getId() == R.id.btnTatCa){
                fragment = new FragmentTBTatCa();
            }
            if(view.getId() == R.id.btnLichKham){
                fragment = new FragmentTBLichKham();
            }
            if(view.getId() == R.id.btnYTe){
                fragment = new FragmentTBYTe();
            }
            transaction.replace(R.id.layoutContainerTB,fragment);
            transaction.commit();
        }
    };

}
