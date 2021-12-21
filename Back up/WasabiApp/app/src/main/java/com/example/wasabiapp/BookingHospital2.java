package com.example.wasabiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adapter.ViewDoctorAdapter;
import com.example.adapter.ViewHospitalAdapter;
import com.example.model.Hospital;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class BookingHospital2 extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Object ViewPagerAdapter;
    ImageView imvHinh;
    Button btnDatKham;
    TextView txtTen,txtDiaChi;
    ArrayList<Hospital> hospitals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_hospital2);
        linkViews();
        getData();
        addEvents();
    }

    private void linkViews() {
        imvHinh=findViewById(R.id.imvHinh);

        txtTen=findViewById(R.id.txtTen);
        txtDiaChi=findViewById(R.id.txtDiaChi);

        btnDatKham=findViewById(R.id.btnDatKham);

        tabLayout = findViewById(R.id.tabLayout_BV2);
        viewPager = findViewById(R.id.HospitalPager);
        ViewHospitalAdapter viewHospitalAdapter = new ViewHospitalAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewHospitalAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void getData() {
        int code = getIntent().getIntExtra("Index",0);
        hospitals= getIntent().getParcelableArrayListExtra("Hospital");
        imvHinh.setImageResource(hospitals.get(code).getHopitalImage());
        txtTen.setText(hospitals.get(code).getHopitalName());
        txtDiaChi.setText(hospitals.get(code).getHopitalAddress());
    }
    private void addEvents() {
        btnDatKham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(BookingHospital2.this, BookingHospital3.class);
                startActivity(intent);
            }
        });
    }
}