package com.example.wasabiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.adapter.HospitalAdapter;
import com.example.model.Hospital;

import java.util.ArrayList;

public class BookingClinic extends AppCompatActivity {
    ListView lvPhongKham;
    HospitalAdapter hospitalAdapter;
    ArrayList<Hospital> hospitals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_clinic);
        linkViews();
        initData();
        loadData();
    }

    private void linkViews() {
        lvPhongKham=findViewById(R.id.lvPhongKham);
    }

    private void initData() {
        hospitals=new ArrayList<Hospital>();
        hospitals.add(new Hospital(R.drawable.pk_dungtin,"Phòng khám mắt Dung Tính","110 Nguyễn Duy Hiệu, P, TP.Thanh Hóa, Thanh Hoá"));
        hospitals.add(new Hospital(R.drawable.pk_thienantam,"Phòng khám đa khoa Thiện Tâm An ","21 Đ. Tô Ngọc Vân, Linh Tây, Thủ Đức, TP.HCM "));
        hospitals.add(new Hospital(R.drawable.pk_daiphuoc,"Phòng khám đa khoa Đại Phước","116 Gò Dầu, Tân Quý, Tân Phú, TP.HCM"));
        hospitals.add(new Hospital(R.drawable.pk_thudau1,"Phòng khám đa khoa Thủ Dầu Một","303 Đại lộ Bình Dương, Phú Thọ, Thủ Dầu Một, BD"));
        hospitals.add(new Hospital(R.drawable.pk_nhanai,"Phòng khám đa khoa Thân Ái Hà Nội ","956 Đ. La Thành, Láng Thượng, Ba Đình, Hà Nội"));

        hospitals.add(new Hospital(R.drawable.pk_gslam,"Phòng khám P.GS Lâm ","12 Sài Đồng, TT. Sài Đồng, Long Biên, Hà Nội"));
    }

    private void loadData() {
        hospitalAdapter=new HospitalAdapter(BookingClinic.this,R.layout.item_phongkham,hospitals);
        lvPhongKham.setAdapter(hospitalAdapter);
    }
}