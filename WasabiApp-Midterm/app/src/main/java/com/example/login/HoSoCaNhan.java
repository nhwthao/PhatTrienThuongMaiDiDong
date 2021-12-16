package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class HoSoCaNhan extends AppCompatActivity {
    ImageButton imbTrangChu, imbLichKham;
    private LinearLayout layoutChinhSuaHSCN, layoutHoSoSucKhoe, layoutTheoDoiSucKhoe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ho_so_ca_nhan);
        linkViews();
        addEvents();
    }

    private void linkViews() {
        imbTrangChu = findViewById(R.id.imbTrangChu);
        imbLichKham = findViewById(R.id.imbLich);
        layoutChinhSuaHSCN = findViewById(R.id.layoutChinhSuaHSCN);
        layoutHoSoSucKhoe = findViewById(R.id.layoutHoSoSucKhoe);
        layoutTheoDoiSucKhoe = findViewById(R.id.layoutTheoDoiSucKhoe);

    }

    private void addEvents() {
        imbTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSoCaNhan.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        layoutChinhSuaHSCN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSoCaNhan.this, ChinhSuaHSCN.class);
                startActivity(intent);
            }
        });
        layoutHoSoSucKhoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSoCaNhan.this, ChiTietHoSoCaNhan.class);
                startActivity(intent);
            }
        });
        layoutTheoDoiSucKhoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSoCaNhan.this, ChiTietTheoDoiSucKhoe.class);
                startActivity(intent);
            }
        });
        imbLichKham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSoCaNhan.this, LichKham.class);
                startActivity(intent);
            }
        });
    }
}