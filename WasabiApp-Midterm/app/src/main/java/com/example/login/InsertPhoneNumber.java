package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertPhoneNumber extends AppCompatActivity {
    EditText edtNhapSDT;
    Button btnTieptucSDT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_phone_number);

        linkViews();
        addEvents();
    }

    private void linkViews() {
        edtNhapSDT = findViewById(R.id.edtNhapSDT);
        btnTieptucSDT = findViewById(R.id.btnTiepTucSDT);
    }

    private void addEvents() {
        btnTieptucSDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNhapSDT.getText().length() != 0){
                    Intent intent = new Intent(InsertPhoneNumber.this, InsertOTPLogin.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(InsertPhoneNumber.this, "Bạn chưa nhập số điện thoại", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}