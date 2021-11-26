package com.example.login;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adapter.ChuyenKhoa1Adapter;
import com.example.model.ChuyenKhoa1;

import java.util.ArrayList;

public class DatKhamChuyenKhoa1 extends AppCompatActivity {
    GridView gvChuyenKhoa;
    ChuyenKhoa1Adapter chuyenKhoa1Adapter;
    ArrayList<ChuyenKhoa1> chuyenKhoa1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat_kham_chuyen_khoa1);
        linkViews();
        initData();
        loadData();
    }

    private void linkViews() {
        gvChuyenKhoa=findViewById(R.id.gvChuyenKhoa);
    }

    private void initData() {
        chuyenKhoa1= new ArrayList<ChuyenKhoa1>();
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.tieuhoa,"Tiêu hóa"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.khoanhi,"Khoa nhi"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.timmach,"Tim mạch"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.khoasan,"Khoa sản"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.xuongkhop,"Xương khớp"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.ungbuou,"Ung bướu"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.dalieu,"Tiêu hóa"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.mau,"Máu - Miễn dịch"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.nao_tamthan,"Tâm lý - Tâm thần"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.taimuihong,"Tai - Mũi - Họng"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.mat,"Khoa mắt"));
        chuyenKhoa1.add(new ChuyenKhoa1(R.drawable.phoi,"Hô hấp"));
    }

    private void loadData() {
        chuyenKhoa1Adapter=new ChuyenKhoa1Adapter(DatKhamChuyenKhoa1.this,R.layout.item_chuyen_khoa_1,chuyenKhoa1);
        gvChuyenKhoa.setAdapter(chuyenKhoa1Adapter);
    }
}