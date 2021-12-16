package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChiTietLichKham extends AppCompatActivity {
    Button btnOKChiTietLK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_lich_kham);

        linkViews();
        addEvents();
    }

    private void linkViews() {
        btnOKChiTietLK = findViewById(R.id.btnOKChiTietLK);
    }

    private void addEvents() {
        btnOKChiTietLK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChiTietLichKham.this, LichKham.class);
                startActivity(intent);
            }
        });
    }
}