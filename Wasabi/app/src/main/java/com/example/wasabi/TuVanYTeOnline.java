package com.example.wasabi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class TuVanYTeOnline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tu_van_yte_online);
    }



    public  void GoiTuVan(View view){
        Intent intent = new Intent(this,GoiTuVan.class);
        startActivity(intent);
    }
    public  void NhanTinTuVan(View view){
        Intent intent = new Intent(this,NhanTinTuVan.class);
        startActivity(intent);
    }
}