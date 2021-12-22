package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.wasabiapp.R;


public class FragmentProfileDetails extends Fragment {

    Button btnOkProfileDetail;

    public FragmentProfileDetails() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile_details, container, false);

        btnOkProfileDetail = view.findViewById(R.id.btnOKProfileDetail);

        returnFragment();

        return view;
    }

    private void returnFragment() {
        btnOkProfileDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentProfile fragmentProfile = new FragmentProfile();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frFragmentProfileDetail, fragmentProfile);
                transaction.commit();
            }
        });
    }
}