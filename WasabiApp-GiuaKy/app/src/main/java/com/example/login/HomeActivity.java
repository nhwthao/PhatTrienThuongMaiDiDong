package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.login.adapter.BannerAdapter;
import com.example.login.adapter.ViewTinTucAdapter;
import com.example.login.model.Banner;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    RecyclerView rcvBanner;
    ArrayList<Banner> banners;
    BannerAdapter adapter;
    ImageButton imbLichKham, imbHoSoCaNhan, imbCaNhan, imbThongBao;

    String[] items;
    ArrayList<String> listItems;
    ArrayAdapter<String> adapterSearch;
    ListView lvSearch;
    EditText edtSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        linkViews();
        configRecyclerView();
        initData();
        tabLayout =findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_paper);
        ViewTinTucAdapter viewTinTucAdapter = new ViewTinTucAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewTinTucAdapter);
        tabLayout.setupWithViewPager(viewPager);
        addEvents();

        lvSearch = findViewById(R.id.lvSearch);
        //lvSearch.setVisibility(View.INVISIBLE);

        edtSearch = findViewById(R.id.edtSearch);
        initList();
        edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                HomeActivity.this.adapterSearch.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
    public void initList() {
        items = new String[]{
                "Đặt khám bác sĩ",
                "Đặt khám chuyên khoa",
                "Đặt khám bệnh viện",
                "Đặt khám phòng khám",
                "Tư vấn y tế online",
                "Diễn đàn y tế"
        };
        listItems = new ArrayList<>(Arrays.asList(items));
        adapterSearch = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItems);
        lvSearch.setAdapter(adapterSearch);
    }

    private void linkViews() {
        rcvBanner=findViewById(R.id.rcvBanner);
        imbLichKham = findViewById(R.id.imbLich);
        imbHoSoCaNhan = findViewById(R.id.imbHoSo);
        imbCaNhan = findViewById(R.id.imbCaNhan);
        imbThongBao = findViewById(R.id.imbThongBao);
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

    private void addEvents() {
        imbLichKham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, LichKham.class);
                startActivity(intent);
            }
        });
        imbHoSoCaNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HoSoCaNhan.class);
                startActivity(intent);
            }
        });
        imbCaNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ActivityTaiKhoanCaNhan.class);
                startActivity(intent);
            }
        });
        imbThongBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ActivityThongBao.class);
                startActivity(intent);
            }
        });
    }


}
