package com.example.wasabiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.adapter.ChuyenKhoa1Adapter;
import com.example.model.ChuyenKhoa1;

import java.util.ArrayList;

public class BookingSpecialist1 extends AppCompatActivity {
    GridView gvChuyenKhoa;
    ChuyenKhoa1Adapter chuyenKhoa1Adapter;
    ArrayList<ChuyenKhoa1> chuyenKhoa1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_specialist1);
        linkViews();
        initData();
        loadData();
        addEvents();
    }

    private void linkViews() {
        gvChuyenKhoa=findViewById(R.id.gvChuyenKhoa);
    }

    private void initData() {
        chuyenKhoa1= new ArrayList<ChuyenKhoa1>();
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.ck_tieuhoa,"Tiêu hóa"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.ck_khoanhi,"Khoa nhi"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.ck_timmach,"Tim mạch"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.ck_khoasan,"Khoa sản"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.ck_xuongkhop,"Xương khớp"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.ck_ungbuou,"Ung bướu"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.ck_dalieu,"Tiêu hóa"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.ck_mau,"Máu - Miễn dịch"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.ck_naotamthan,"Tâm lý - Tâm thần"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.ck_taimuihong,"Tai - Mũi - Họng"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.ck_mat,"Khoa mắt"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.ck_phoi,"Hô hấp"));
    }

    private void loadData() {
        chuyenKhoa1Adapter=new ChuyenKhoa1Adapter(BookingSpecialist1.this,R.layout.item_chuyen_khoa_1,chuyenKhoa1);
        gvChuyenKhoa.setAdapter(chuyenKhoa1Adapter);
    }

    private void addEvents() {
        gvChuyenKhoa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(BookingSpecialist1.this,BookingSpecialist2.class);
                startActivity(intent);
            }
        });
    }
}