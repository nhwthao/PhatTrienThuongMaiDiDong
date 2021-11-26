package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class InsertOTPLogin extends AppCompatActivity {
    EditText edtNhapOTP;
    private LinearLayout layoutGuilaima;
    Button btnXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_otp);

        linkViews();
        addEvents();

    }

    private void linkViews() {
        edtNhapOTP = findViewById(R.id.edtNhapOTP);
        layoutGuilaima = findViewById(R.id.layoutGuilaima);
        btnXacNhan = findViewById(R.id.btnXacNhan);

    }

    private void addEvents() {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNhapOTP.getText().length()!=0){
                    Intent intent = new Intent(InsertOTPLogin.this, NewPassword.class);
                    startActivity(intent);
                }else
                    Toast.makeText(InsertOTPLogin.this, "Bạn chưa nhập mã OTP", Toast.LENGTH_SHORT).show();
            }
        });
    }
}