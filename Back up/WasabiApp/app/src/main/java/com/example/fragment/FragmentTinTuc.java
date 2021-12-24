package com.example.fragment;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.adapter.NewsAdapter;
import com.example.model.MyItemClick;
import com.example.model.News;
import com.example.wasabiapp.R;

import java.util.ArrayList;


public class FragmentTinTuc extends Fragment {

    ListView lvNews;
    ArrayList<News> news;
    NewsAdapter adapter;
    TextView txtTitle, txtAuthor, txtContent;
    MyItemClick itemClick;

    public FragmentTinTuc() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tin_tuc, container, false);

        lvNews = view.findViewById(R.id.lvNews);
        txtTitle = view.findViewById(R.id.txtTitle);
        txtAuthor = view.findViewById(R.id.txtAuthor);
        txtContent = view.findViewById(R.id.txtContent);

        adapter = new NewsAdapter(getContext(), R.layout.itemlist_news, initData());
        lvNews.setAdapter(adapter);

        lvNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                itemClick = (MyItemClick) getActivity();
                if (itemClick != null) {
                    itemClick.click(news.get(i));
                }
            }

        });
        return view;

    }
    private ArrayList<News> initData(){
        news = new ArrayList<>();
        news.add(new News(R.drawable.news,"Đây là tiêu đề bài viết","Sương","Đây là nội dung tóm tắt bài viết", "Đây là nội dung bài viết đầy đủ"));
        news.add(new News(R.drawable.news,"Đây là tiêu đề bài viết","Châu","Đây là nội dung tóm tắt bài viết", "Đây là nội dung bài viết đầy đủ"));
        news.add(new News(R.drawable.news,"Đây là tiêu đề bài viết","Thắm","Đây là nội dung tóm tắt bài viết", "Đây là nội dung bài viết đầy đủ"));
        news.add(new News(R.drawable.news,"Đây là tiêu đề bài viết","Trang","Đây là nội dung tóm tắt bài viết", "Đây là nội dung bài viết đầy đủ"));
        news.add(new News(R.drawable.news,"Đây là tiêu đề bài viết","Thảo","Đây là nội dung tóm tắt bài viết", "Đây là nội dung bài viết đầy đủ"));
        news.add(new News(R.drawable.news,"Đây là tiêu đề bài viết","Thu","Đây là nội dung tóm tắt bài viết", "Đây là nội dung bài viết đầy đủ"));
        return news;
    }

}