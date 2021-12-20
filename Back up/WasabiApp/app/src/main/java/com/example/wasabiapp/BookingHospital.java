package com.example.wasabiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import com.example.adapter.DoctorAdapter;
import com.example.adapter.HospitalAdapter;
import com.example.adapter.HospitalAdapter;
import com.example.model.Doctor;
import com.example.model.Hospital;
import com.example.model.Hospital;

import java.util.ArrayList;

public class BookingHospital extends AppCompatActivity {
    ListView lvBenhVien;
    HospitalAdapter hospitalAdapter;
    ArrayList<Hospital> hospitals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_hopital);
        linkViews();
        initData();
        loadData();
    }

    private void linkViews() {
        lvBenhVien=findViewById(R.id.lvBenhVien);
    }

    private void initData() {
        hospitals=new ArrayList<Hospital>();
        hospitals.add(new Hospital(R.drawable.bv_ranghammat,"Bệnh viện Răng Hàm Mặt TPHCM","263-265 Trần Hưng Đạo, P.Cô Giang, Q.1, TP.HCM"));
        hospitals.add(new Hospital(R.drawable.bv_yhocct,"Bệnh Viện Y Học Cổ Truyền TP.HCM","179 Nam Kỳ Khởi Nghĩa P.Võ Thị Sáu, Q.3, TP.HCM"));
        hospitals.add(new Hospital(R.drawable.bv_hungvuongi,"Bệnh viện Hùng Vương","128 Hồng Bàng, Phường 12, Quận 5, TP.HCM"));
        hospitals.add(new Hospital(R.drawable.bv_phusanqt,"Bệnh viện Phụ Sản Sài Gòn","63 Bùi Thị Xuân, P.Phạm Ngũ Lão, Q.1, TP.HCM"));
        hospitals.add(new Hospital(R.drawable.bv_minhanh,"Bệnh viện quốc tế Minh Anh","36,đường số 1B,P.Bình Trị Đông B, Q.Bình Tân, TP.HCM"));
        hospitals.add(new Hospital(R.drawable.bv_dalieu,"Bệnh viện da liễu Trung Ương","5A, Phương Mai, Quận Đống Đa, Hà Nội"));

    }

    private void loadData() {
        hospitalAdapter=new HospitalAdapter(BookingHospital.this,R.layout.item_benhvien,hospitals);
        lvBenhVien.setAdapter(hospitalAdapter);
    }
}