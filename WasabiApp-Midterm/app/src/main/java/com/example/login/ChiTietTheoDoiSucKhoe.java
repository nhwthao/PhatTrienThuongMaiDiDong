package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChiTietTheoDoiSucKhoe extends AppCompatActivity {
    Button btnOKTheoDoiSK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_theo_doi_suc_khoe);

        linkViews();
        addEvents();
    }

    private void linkViews() {
        btnOKTheoDoiSK = findViewById(R.id.btnOKTheoDoiSK);

    }

    private void addEvents() {
        btnOKTheoDoiSK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChiTietTheoDoiSucKhoe.this, HoSoCaNhan.class);
                startActivity(intent);
            }
        });
    }
}