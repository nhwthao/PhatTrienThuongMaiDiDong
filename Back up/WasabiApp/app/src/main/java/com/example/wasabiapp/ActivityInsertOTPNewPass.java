package com.example.wasabiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.model.User;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

public class ActivityInsertOTPNewPass extends AppCompatActivity {
    EditText edtNhapOTP;
    private LinearLayout layoutGuilaima;
    Button btnXacNhan;
    int otpCode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_otp_newpass);

        otpCode = new Random().nextInt(900000) + 100000;
        Toast.makeText(ActivityInsertOTPNewPass.this, String.format("Mã OTP của bạn là %s", otpCode), Toast.LENGTH_LONG).show();

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
                    if( Integer.parseInt(edtNhapOTP.getText().toString()) != otpCode){
                        Toast.makeText(ActivityInsertOTPNewPass.this, "Bạn nhập sai mã OTP", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    Intent i = getIntent();
                    List<User> userList = (List<User>) i.getSerializableExtra("userList");
                    Intent intent = new Intent(ActivityInsertOTPNewPass.this, ActivityWelcome.class);
                    intent.putExtra("userList", (Serializable) userList);
                    startActivity(intent);
                }else
                    Toast.makeText(ActivityInsertOTPNewPass.this, "Bạn chưa nhập mã OTP", Toast.LENGTH_SHORT).show();
            }
        });
    }
}