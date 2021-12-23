package com.example.fragment;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.wasabiapp.ActivityHealthTracking;
import com.example.wasabiapp.R;


public class FragmentProfile extends Fragment {

    LinearLayout layoutDetailProfile, layoutEditProfile, layoutHealthTracking;
    TextView txtNameProfile, txtSDTProfile,txtDiaChiProfile;
    ImageView imvChangeAvatarProfile;

    public FragmentProfile(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        layoutDetailProfile = view.findViewById(R.id.layoutDetailProfile);
        layoutEditProfile = view.findViewById(R.id.layoutEditProfile);
        layoutHealthTracking = view.findViewById(R.id.layoutHealthTracking);

        txtNameProfile = view.findViewById(R.id.txtNameProfile);
        txtSDTProfile = view.findViewById(R.id.txtSDTProfile);
        txtDiaChiProfile = view.findViewById(R.id.txtDiaChiProfile);

        imvChangeAvatarProfile = view.findViewById(R.id.imvChangeAvatarProfile);

        addEvents();
        getInformation();
        return view;

    }

    private void addEvents() {
        layoutDetailProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentProfileDetails fragmentProfileDetails = new FragmentProfileDetails();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frFragmentProfile,fragmentProfileDetails );
                transaction.commit();
            }
        });
        layoutEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentEditProfile fragmentEditProfile = new FragmentEditProfile();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frFragmentProfile, fragmentEditProfile);
                transaction.commit();
            }
        });
        layoutHealthTracking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ActivityHealthTracking.class);
                startActivity(intent);

            }
        });

        imvChangeAvatarProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });
    }
    private void getInformation() {
        Bundle bundle = getArguments();
        if(bundle!=null){
            txtNameProfile.setText(bundle.getString("nameEP"));
            txtSDTProfile.setText(bundle.getString("SDTEP"));
            txtDiaChiProfile.setText(bundle.getString("diaChiEP"));
        }

    }


}
