package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChinhSuaHSCN extends AppCompatActivity {
    Button btnChinhSuaHSCN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinh_sua_hscn);

        linkViews();
        addEvents();
    }

    private void linkViews() {
        btnChinhSuaHSCN = findViewById(R.id.btnChinhSuaHSCN);
    }

    private void addEvents() {
        btnChinhSuaHSCN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChinhSuaHSCN.this, HoSoCaNhan.class);
                startActivity(intent);
            }
        });
    }
}