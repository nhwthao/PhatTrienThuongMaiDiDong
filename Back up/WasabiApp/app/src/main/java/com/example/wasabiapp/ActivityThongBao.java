package com.example.wasabiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragment.FragmentTBLichKham;
import com.example.fragment.FragmentTBTatCa;
import com.example.fragment.FragmentTBYTe;

public class ActivityThongBao extends AppCompatActivity {
    Button btnTatCa, btnLichKham, btnYTe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_bao);

        linkviews();
        addEvents();
    }

    private void linkviews() {
        btnTatCa = findViewById(R.id.btnTatCa);
        btnLichKham = findViewById(R.id.btnLichKham);
        btnYTe = findViewById(R.id.btnYTe);
    }

    private void addEvents() {
        btnTatCa.setOnClickListener(myClick);
        btnLichKham.setOnClickListener(myClick);
        btnYTe.setOnClickListener(myClick);
    }

    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            Fragment fragment = null;
            if(view.getId() == R.id.btnTatCa){
                fragment = new FragmentTBTatCa();
            }
            if(view.getId() == R.id.btnLichKham){
                fragment = new FragmentTBLichKham();
                //dinh kem du lieu
                Bundle bundle = new Bundle();
                bundle.putString("Say", "Hallo");
                fragment.setArguments(bundle);
            }
            if(view.getId() == R.id.btnYTe){
                fragment = new FragmentTBYTe();
                //dinh kem du lieu
                Bundle bundle = new Bundle();
                bundle.putString("Say", "Hallo");
                fragment.setArguments(bundle);
            }
            transaction.replace(R.id.layoutContainerTB,fragment);
            transaction.commit();
        }
    };
}