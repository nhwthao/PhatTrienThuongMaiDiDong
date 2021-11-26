package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTaiKhoanCaNhan extends AppCompatActivity {
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tai_khoan_ca_nhan);
        linkViews();
        addEvents();
    }
    private void linkViews (){
        btnLogout = findViewById(R.id.btnLogout);
    }
    private void addEvents(){
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logout = new Intent(ActivityTaiKhoanCaNhan.this, ActivityLogout.class);
                startActivity(logout);
            }
        });

    }
}