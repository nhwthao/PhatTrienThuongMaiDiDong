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

public class FragmentTBYTe extends Fragment {
    LinearLayout lnYTeNews;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tby_te, container, false);
        lnYTeNews = view.findViewById(R.id.lnYTeNews);
        addEvents();
        return view;
    }

    private void addEvents() {
        lnYTeNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentNewsDetails newsDetails = new FragmentNewsDetails();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frTBYTe, newsDetails);
                transaction.commit();
            }
        });
    }
}