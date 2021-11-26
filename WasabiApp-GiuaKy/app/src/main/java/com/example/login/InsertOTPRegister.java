package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class InsertOTPRegister extends AppCompatActivity {
    EditText edtNhapOTPDangKy;
    private LinearLayout layoutGuilaima;
    Button btnXacNhanDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_otpregister);

        linkViews();
        addEvents();
    }
    private void linkViews() {
        edtNhapOTPDangKy = findViewById(R.id.edtNhapOTPDangKy);
        layoutGuilaima = findViewById(R.id.layoutGuilaima);
        btnXacNhanDangKy = findViewById(R.id.btnXacNhanDangKy);

    }

    private void addEvents() {
        btnXacNhanDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNhapOTPDangKy.getText().length()!=0){
                    Intent intent = new Intent(InsertOTPRegister.this, WelcomeToWasabi.class);
                    startActivity(intent);
                }else
                    Toast.makeText(InsertOTPRegister.this, "Bạn chưa nhập mã OTP", Toast.LENGTH_SHORT).show();
            }
        });
    }
}