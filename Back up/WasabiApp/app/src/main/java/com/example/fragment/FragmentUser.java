package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
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
import com.example.wasabiapp.R;

import com.example.wasabiapp.R;

public class FragmentUser extends Fragment {
    TextView txtLogout;
    ImageView imvLogout;
    private FragmentManager manager;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        txtLogout = view.findViewById(R.id.txtLogout);
        imvLogout = view.findViewById(R.id.imvLogout);
        addEvents();
        return view;
    }

    private void addEvents() {
        txtLogout.setOnClickListener(myClick);
        imvLogout.setOnClickListener(myClick);
    }
    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
//            FragmentActivity transaction = getActivity();
//            ActivityLogout fragment = null;
//            if(view.getId() == R.id.txtLogout){
//                fragment = new ActivityLogout();
//            }
//            if(view.getId() == R.id.imvLogout) {
//                fragment = new ActivityLogout();
//            }
        }
    };
}

