package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChiTietHoSoCaNhan extends AppCompatActivity {
    Button btnOKHoSoCaNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_ho_so_ca_nhan);

        Linkviews();
        addEvents();
    }

    private void Linkviews() {
        btnOKHoSoCaNhan = findViewById(R.id.btnOKHoSoCaNhan);
    }

    private void addEvents() {
        btnOKHoSoCaNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChiTietHoSoCaNhan.this,HoSoCaNhan.class);
                startActivity(intent);
            }
        });
    }
}