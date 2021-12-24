package com.example.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

//import com.example.wasabiapp.ActivityLogout;
import com.example.wasabiapp.R;

public class FragmentUser extends Fragment {
    LinearLayout lnLogout, lnHotline, lnShare;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        lnLogout = view.findViewById(R.id.lnLogout);
        lnHotline = view.findViewById(R.id.lnHotline);
        lnShare = view.findViewById(R.id.lnShare);

        addEvents();
        return view;
    }


    private void addEvents() {

        //nút đăng xuất
        lnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentLogout fragmentLogout = new FragmentLogout();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frUser, fragmentLogout);
                transaction.commit();
            }
        });
        // nút gọi hotline
        lnHotline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + "1900 2077"));
                startActivity(callIntent);
            }
        });
        lnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}

