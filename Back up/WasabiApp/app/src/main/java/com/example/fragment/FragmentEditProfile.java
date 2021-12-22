package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.wasabiapp.R;

import java.io.Serializable;

public class FragmentEditProfile extends Fragment {

    Button btnEditProfile, btnBackProfile;
    EditText edtNameEP, edtSDTEP, edtDiaChiEP;


    public FragmentEditProfile() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_edit_profile, container, false);

        btnEditProfile = view.findViewById(R.id.btnEditProfile);
        edtNameEP = view.findViewById(R.id.edtNameEP);
        edtSDTEP = view.findViewById(R.id.edtSDTEP);
        edtDiaChiEP = view.findViewById(R.id.edtDiaChiEP);
        btnBackProfile = view.findViewById(R.id.btnBackProfile);

        addEvents();

        return view;

    }

    private void addEvents() {
        btnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentProfile fragmentProfile = new FragmentProfile();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Bundle bundle = new Bundle();
                String nameEP = edtNameEP.getText().toString().trim();
                String sDTEP = edtSDTEP.getText().toString().trim();
                String diaChiEP = edtDiaChiEP.getText().toString().trim();
                bundle.putString("nameEP", nameEP);
                bundle.putString("SDTEP", sDTEP);
                bundle.putString("diaChiEP", diaChiEP);
                fragmentProfile.setArguments(bundle);
                transaction.replace(R.id.frFragmentProfileEdit, fragmentProfile);
                transaction.commit();
            }
        });
        btnBackProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentProfile fragmentProfile = new FragmentProfile();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frFragmentProfileEdit, fragmentProfile);
                transaction.commit();
            }
        });

    }
}