package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.wasabiapp.R;

public class FragmentBookAppointment extends Fragment {
    Button btnLKMoiNhat, btnLKLichSu;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book_appointment, container, false);
        btnLKMoiNhat = view.findViewById(R.id.btnLKMoiNhat);
        btnLKLichSu = view.findViewById(R.id.btnLKLichSu);
        addEvent();
        return view;

    }


    private void addEvent() {
        btnLKMoiNhat.setOnClickListener(myClick);
        btnLKLichSu.setOnClickListener(myClick);
    }

    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            Fragment fragment = null;
            if(view.getId() == R.id.btnLKMoiNhat){
                fragment = new FragmentBookAppointmentNew();
            }
            if(view.getId() == R.id.btnLKLichSu){
                fragment = new FragmentBookAppointmentHistory();
            }
            transaction.replace(R.id.layoutContainer,fragment);
            transaction.commit();
        }
    };

}
