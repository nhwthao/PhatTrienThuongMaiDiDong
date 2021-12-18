package com.example.wasabiapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.example.adapter.BannerAdapter;
import com.example.adapter.ViewTinTucAdapter;
import com.example.model.Banner;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;

public class ActivityHome extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    RecyclerView rcvBanner;
    ArrayList<Banner> banners;
    BannerAdapter adapter;
    String[] items;
    ArrayList<String> listItems;
    ArrayAdapter<String> adapterSearch;
    ListView lvSearch;
    EditText edtSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        linkViews();
        configRecyclerView();
        initData();
//        navigation();
        tabLayout =findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_paper);
        ViewTinTucAdapter viewTinTucAdapter = new ViewTinTucAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewTinTucAdapter);
        tabLayout.setupWithViewPager(viewPager);
//        addEvents();
//        lvSearch = findViewById(R.id.lvSearch);
        //lvSearch.setVisibility(View.INVISIBLE);

        edtSearch = findViewById(R.id.edtSearch);
//        initList();
//        edtSearch.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int star, int count, int after) {
//                ActivityHome.this.adapterSearch.getFilter().filter(s);
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
    }

//    private void navigation() {
//        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);
//        navigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
//            @Override
//            public void onNavigationItemReselected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.action_home:
//                        Toast.makeText(ActivityHome.this, "Home", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.action_calendar:
//                        Toast.makeText(ActivityHome.this, "Calendar", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.action_file:
//                        Toast.makeText(ActivityHome.this, "File", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.action_notification:
//                        Toast.makeText(ActivityHome.this, "notification", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.action_person:
//                        Toast.makeText(ActivityHome.this, "person", Toast.LENGTH_SHORT).show();
//                        break;
//                }
//                return;
//            }
//        });
//    }

//    private void initList() { items = new String[]{
//            "Đặt khám bác sĩ",
//            "Đặt khám chuyên khoa",
//            "Đặt khám bệnh viện",
//            "Đặt khám phòng khám",
//            "Tư vấn y tế online",
//            "Diễn đàn y tế"
//    };
//        listItems = new ArrayList<>(Arrays.asList(items));
//        adapterSearch = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItems);
//        lvSearch.setAdapter(adapterSearch);
//    }
//
//    private void addEvents() {
//    }

    private void configRecyclerView() {
        //thiết lập hướng cho rcvBanner
        LinearLayoutManager manager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        rcvBanner.setLayoutManager(manager);
    }

    private void initData() { //khởi tạo dữ liệu
        banners= new ArrayList<>();
        banners.add(new Banner(R.drawable.nf1));
        banners.add(new Banner(R.drawable.nf2));
        banners.add(new Banner(R.drawable.nf3));
        banners.add(new Banner(R.drawable.nf4));
        banners.add(new Banner(R.drawable.nf5));
        adapter=new BannerAdapter(getApplicationContext(),banners);
        rcvBanner.setAdapter(adapter);
    }


    private void linkViews() {
        rcvBanner=findViewById(R.id.rcvBanner);

    }
}