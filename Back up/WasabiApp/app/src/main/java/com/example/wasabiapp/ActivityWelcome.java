package com.example.wasabiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityWelcome extends AppCompatActivity {
    Button btnDangnhaplai, btnXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        linkViews();
        addEvents();
    }

    private void linkViews() {

        btnDangnhaplai = findViewById(R.id.btnDangnhaplai);
        btnXacNhan = findViewById(R.id.btnXacNhan);
    }

    private void addEvents() {
        btnDangnhaplai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityWelcome.this, ActivityLoginAndRegister.class);
                startActivity(intent);
            }
        });
    }
}