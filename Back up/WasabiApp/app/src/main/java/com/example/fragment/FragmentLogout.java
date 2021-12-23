package com.example.fragment;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.wasabiapp.ActivityLoginAndRegister;
import com.example.wasabiapp.R;


public class FragmentLogout extends Fragment {
    Button btnYes, btnNo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_logout, container, false);
        btnYes = view.findViewById(R.id.btnYes);
        btnNo = view.findViewById(R.id.btnNo);
        addEvents();
        return view;
    }

    private void addEvents() {
        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Đồng ý đăng xuất, chuyển đến màn hình đăng nhập ban đầu
                Intent intent = new Intent(getActivity(), ActivityLoginAndRegister.class);
                startActivity(intent);
            }
        });
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Không đăng xuất, quay về fragment user
                FragmentUser fragmentReturn = new FragmentUser();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frUser,fragmentReturn );
                transaction.commit();
            }
        });
    }
}
