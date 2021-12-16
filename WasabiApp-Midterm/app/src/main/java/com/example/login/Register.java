package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText edtSDT, edtMatkhau, edtNhaplaimatkhau, edtHovaten, edtDiachi;
    RadioButton radNam, radNu;
    Button btnTieptucdangky;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        linkViews();
        addEvents();
    }

    private void linkViews() {
        edtSDT = findViewById(R.id.edtSDT);
        edtMatkhau = findViewById(R.id.edtMatkhau);
        edtNhaplaimatkhau = findViewById(R.id.edtNhaplaimatkhau);
        edtHovaten = findViewById(R.id.edtHovaten);
        edtDiachi = findViewById(R.id.edtDiachi);
        radNam = findViewById(R.id.radNam);
        radNu = findViewById(R.id.radNu);
        btnTieptucdangky = findViewById(R.id.btnTieptucdangky);
        
    }

    private void addEvents() {
        btnTieptucdangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtSDT.getText().length()!=0 && edtMatkhau.getText().length()!=0 && edtNhaplaimatkhau.getText().length()!=0
                && edtHovaten.getText().length()!=0 && edtDiachi.getText().length()!=0 ){
                    Intent intent = new Intent(Register.this, InsertOTPRegister.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(Register.this, "Bạn phải điền đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}