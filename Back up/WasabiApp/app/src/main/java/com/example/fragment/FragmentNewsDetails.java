package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.model.News;
import com.example.utils.Constant;
import com.example.wasabiapp.R;

import java.util.ArrayList;


public class FragmentNewsDetails extends Fragment {
    News news;
    TextView txtTitle, txtAuthor, txtContent;
    ImageButton imbBack;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news_details, container, false);
        txtTitle = view.findViewById(R.id.txtTitle);
        txtAuthor = view.findViewById(R.id.txtAuthor);
        txtContent = view.findViewById(R.id.txtContent);

        imbBack = view.findViewById(R.id.imbBack);
        Bundle bundle = getArguments();
        if(bundle != null){
            news = (News) bundle.getSerializable(Constant.SELECTED_ITEM);
            txtTitle.setText(news.getNewsTitle());
            txtAuthor.setText(news.getNewsAuthor());
            txtContent.setText(news.getNewsContent());
        }
        imbBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTinTuc fragmentTinTuc = new FragmentTinTuc();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.view_paper_nav, fragmentTinTuc);
                transaction.commit();
            }
        });

        return view;
    }
}