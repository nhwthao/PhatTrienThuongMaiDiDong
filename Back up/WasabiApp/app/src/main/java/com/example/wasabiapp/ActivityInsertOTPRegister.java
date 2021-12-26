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

public class ActivityInsertOTPRegister extends AppCompatActivity {
    EditText edtNhapOTPDangKy;
    private LinearLayout layoutGuilaimaRegister;
    Button btnXacNhanDangKy;
    int otpCode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_otp_register);

        otpCode = new Random().nextInt(900000) + 100000;
        Toast.makeText(ActivityInsertOTPRegister.this, String.format("Mã OTP của bạn là %s", otpCode), Toast.LENGTH_LONG).show();

        linkViews();
        addEvents();
    }
    private void linkViews() {
        edtNhapOTPDangKy = findViewById(R.id.edtNhapOTPDangKy);
        layoutGuilaimaRegister = findViewById(R.id.layoutGuilaimaRegister);
        btnXacNhanDangKy = findViewById(R.id.btnXacNhanDangKy);

    }

    private void addEvents() {
        btnXacNhanDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNhapOTPDangKy.getText().length()!=0){
                    if( Integer.parseInt(edtNhapOTPDangKy.getText().toString()) != otpCode){
                        Toast.makeText(ActivityInsertOTPRegister.this, "Bạn nhập sai mã OTP", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    Intent i = getIntent();
                    List<User> userList = (List<User>) i.getSerializableExtra("userList");
                    Intent intent = new Intent(ActivityInsertOTPRegister.this, ActivityWelcome.class);
                    intent.putExtra("userList", (Serializable) userList);
                    startActivity(intent);
                }else
                    Toast.makeText(ActivityInsertOTPRegister.this, "Bạn chưa nhập mã OTP", Toast.LENGTH_SHORT).show();
            }
        });
        layoutGuilaimaRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //otpCode = new Random().nextInt(900000) + 100000;
                //gửi lại OTP lúc nãy nếu chưa nhìn thấy kịp
                Toast.makeText(ActivityInsertOTPRegister.this, String.format("Mã OTP của bạn là %s", otpCode), Toast.LENGTH_LONG).show();

            }
        });
    }

}