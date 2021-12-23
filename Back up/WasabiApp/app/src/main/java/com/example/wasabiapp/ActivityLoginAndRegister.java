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

import java.util.ArrayList;
import java.util.List;

public class ActivityLoginAndRegister extends AppCompatActivity {
    EditText edtTaikhoan, edtMatkhau;
    Button btnDangnhap;
    private LinearLayout layoutQuenmatkhau, layoutTaotaikhoan;
    private List<User> userList = new ArrayList<User>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);
        linkViews();
        addEvents();
    }

    private void linkViews() {
        edtTaikhoan = findViewById(R.id.edtTaikhoan);
        edtMatkhau = findViewById(R.id.edtMatkhau);
        btnDangnhap = findViewById(R.id.btnDangnhap);
        layoutQuenmatkhau = findViewById(R.id.layoutQuenMatKhau);
        layoutTaotaikhoan = findViewById(R.id.layoutTaoTaiKhoan);
    }

    private void addEvents() {


        btnDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLoginAndRegister.this, Navigation.class);
                startActivity(intent);

//                if(edtTaikhoan.getText().length() !=0 && edtMatkhau.getText().length() !=0){
//                    if(edtTaikhoan.getText().toString().equals("0856228468") && edtMatkhau.getText().toString().equals("123456")){
//                        Intent intent = new Intent(ActivityLoginAndRegister.this, HomeActivity.class);
//                        startActivity(intent);
//                    }
//                    else {
//                        Toast.makeText(ActivityLoginAndRegister.this, "Tài khoản hoặc mật khẩu chưa chính xác", Toast.LENGTH_SHORT).show();
//                    }
//                }else {
//                    Toast.makeText(ActivityLoginAndRegister.this, "Bạn phải điền đầy đủ thông tin đăng nhập", Toast.LENGTH_SHORT).show();
//                }
//
            }
        });

        layoutQuenmatkhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLoginAndRegister.this, ActivityInsertPhoneNumber.class);
                startActivity(intent);
            }
        });
        layoutTaotaikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLoginAndRegister.this, ActivityRegister.class);
                startActivity(intent);
            }
        });
    }
    private List<User> getListUsers() {
        Intent i = getIntent();
        if(!i.hasExtra("userList")) {
            List<User> userList = new ArrayList<User>();
            return userList;
        }
        return (List<User>) i.getSerializableExtra("userList");
    }

}