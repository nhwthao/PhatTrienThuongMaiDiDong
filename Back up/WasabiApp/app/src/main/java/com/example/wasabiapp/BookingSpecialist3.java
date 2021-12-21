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

import com.example.adapter.ViewSpecialistAdapter;
import com.example.model.Doctor;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class BookingSpecialist3 extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Object ViewPagerAdapter;

    TextView txtTen,txtPhone,txtDiaChi,txtKhoa,txtCoQuan,txtChucVu;
    Button btnDatKham;
    ImageView imvHinh;
    ArrayList<Doctor> doctors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_specialist3);
        linkViews();
        getData();
        addEvents();
    }

    private void linkViews() {
        imvHinh=findViewById(R.id.imvHinh);

        txtChucVu=findViewById(R.id.txtChucVu);
        txtCoQuan=findViewById(R.id.txtCoQuan);
        txtDiaChi=findViewById(R.id.txtDiaChi);
        txtKhoa=findViewById(R.id.txtKhoa);
        txtPhone=findViewById(R.id.txtPhone);
        txtTen=findViewById(R.id.txtTen);

        btnDatKham=findViewById(R.id.btnDatKham);

        tabLayout = findViewById(R.id.tabLayout_CG2);
        viewPager = findViewById(R.id.SpecialistPager);
        ViewSpecialistAdapter viewSpecialistAdapter = new ViewSpecialistAdapter(getSupportFragmentManager(),FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewSpecialistAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void getData() {
        int code = getIntent().getIntExtra("Index",0);
        doctors = getIntent().getParcelableArrayListExtra("Doctor");
        imvHinh.setImageResource(doctors.get(code).getDoctorHinh());
        txtTen.setText(doctors.get(code).getDoctorTen());
        txtPhone.setText(doctors.get(code).getDoctorPhone());
        txtKhoa.setText(doctors.get(code).getDoctorKhoa());
        txtDiaChi.setText(doctors.get(code).getDoctorDiaChi());
        txtCoQuan.setText(doctors.get(code).getDoctorCoQuan());
        txtChucVu.setText(doctors.get(code).getDoctorChucVu());
    }

    private void addEvents() {
        btnDatKham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BookingSpecialist3.this,BookingSpecialist4.class);
                startActivity(intent);
            }
        });
    }
}