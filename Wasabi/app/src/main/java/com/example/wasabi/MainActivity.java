package com.example.wasabi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.adapter.BannerAdapter;
import com.example.adapter.Message;
import com.example.adapter.MessagerAdapter;
import com.example.adapter.ViewTinTucAdapter;
import com.example.model.Banner;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    RecyclerView rcvBanner;
    ArrayList<Banner> banners;
    BannerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linkViews();
        configRecyclerView();
        initData();
        tabLayout =findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_paper);
        ViewTinTucAdapter viewTinTucAdapter = new ViewTinTucAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewTinTucAdapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    private void linkViews() {
        rcvBanner=findViewById(R.id.rcvBanner);
    }

    private void configRecyclerView() {
        //thiết lập hướng cho rcvBanner
        LinearLayoutManager manager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        rcvBanner.setLayoutManager(manager);
    }

    private void initData() {
        //khởi tạo dữ liệu
        banners= new ArrayList<>();
        banners.add(new Banner(R.drawable.nf1));
        banners.add(new Banner(R.drawable.nf2));
        banners.add(new Banner(R.drawable.nf3));
        banners.add(new Banner(R.drawable.nf4));
        banners.add(new Banner(R.drawable.nf5));
        adapter=new BannerAdapter(getApplicationContext(),banners);
        rcvBanner.setAdapter(adapter);
    }

}