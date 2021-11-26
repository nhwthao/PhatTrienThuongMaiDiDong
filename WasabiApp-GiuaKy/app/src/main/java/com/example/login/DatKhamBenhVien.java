package com.example.login;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adapter.HopitalAdapter;
import com.example.model.Hopital;

import java.util.ArrayList;

public class DatKhamBenhVien extends AppCompatActivity {
    ListView lvBenhVien;
    HopitalAdapter hopitalAdapter;
    ArrayList<Hopital> hopitals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat_kham_benh_vien);
        linkViews();
        initData();
        loadData();
    }

    private void linkViews() {
        lvBenhVien=findViewById(R.id.lvBenhVien);
    }

    private void initData() {
        hopitals=new ArrayList<Hopital>();
        hopitals.add(new Hopital(R.drawable.bv_ranghammat,"Bệnh viện Răng Hàm Mặt TPHCM","263-265 Trần Hưng Đạo, Phường Cô Giang, Quận 1, TP.HCM"));
        hopitals.add(new Hopital(R.drawable.bv_yhocct,"Bệnh Viện Y Học Cổ Truyền TP.HCM","179 Nam Kỳ Khởi Nghĩa P.Võ Thị Sáu, Q.3, TP.HCM"));
        hopitals.add(new Hopital(R.drawable.bv_hungvuongi,"Bệnh viện Hùng Vương","128 Hồng Bàng, Phường 12, Quận 5, TP.HCM"));
        hopitals.add(new Hopital(R.drawable.bv_phusanqt,"Bệnh viện Phụ Sản Sài Gòn",""));
        hopitals.add(new Hopital(R.drawable.bv_minhanh,"Bệnh viện quốc tế Minh Anh","36,đường số 1B,P.Bình Trị Đông B, Q.Bình Tân, TP Hồ Chí Minh"));
        hopitals.add(new Hopital(R.drawable.bv_dalieu,"Bệnh viện da liễu Trung Ương","5A, Phương Mai, Quận Đống Đa, Hà Nội"));

    }

    private void loadData() {
        hopitalAdapter=new HopitalAdapter(DatKhamBenhVien.this,R.layout.item_benhvien,hopitals);
        lvBenhVien.setAdapter(hopitalAdapter);
    }
}