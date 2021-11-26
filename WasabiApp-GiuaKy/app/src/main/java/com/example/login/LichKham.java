package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class LichKham extends AppCompatActivity {
    private LinearLayout layoutLichKham;
    ImageButton imbTrangChu, imbHoSoCaNhan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lich_kham);

        linkViews();
        addEvents();
    }

    private void linkViews() {
        layoutLichKham = findViewById(R.id.layoutLichKham);
        imbTrangChu = findViewById(R.id.imbTrangChu);
        imbHoSoCaNhan = findViewById(R.id.imbHoSo);
    }

    private void addEvents() {
        layoutLichKham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LichKham.this, ChiTietLichKham.class);
                startActivity(intent);
            }
        });
        imbTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LichKham.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        imbHoSoCaNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LichKham.this, HoSoCaNhan.class);
                startActivity(intent);
            }
        });

    }
}