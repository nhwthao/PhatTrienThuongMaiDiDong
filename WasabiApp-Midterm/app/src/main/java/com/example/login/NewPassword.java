package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewPassword extends AppCompatActivity {
    EditText edtMatkhaumoi, edtXacnhanmatkhau;
    Button btnHoanthanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);

        linkViews();
        addEvents();
    }

    private void linkViews() {
        edtMatkhaumoi = findViewById(R.id.edtMaukhaumoi);
        edtXacnhanmatkhau = findViewById(R.id.edtXacnhanmatkhau);
        btnHoanthanh = findViewById(R.id.btnHoanthanh);
    }

    private void addEvents() {
        btnHoanthanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtMatkhaumoi.getText().length()!=0 && edtXacnhanmatkhau.getText().length()!=0){
                    Intent intent = new Intent(NewPassword.this, MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(NewPassword.this, "Bạn chưa nhập mật khẩu mới", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}