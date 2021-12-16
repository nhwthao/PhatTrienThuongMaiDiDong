package com.example.login;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adapter.HopitalAdapter;
import com.example.model.Hopital;

import java.util.ArrayList;

public class DatKhamPhongKham extends AppCompatActivity {
    ListView lvPhongKham;
    HopitalAdapter hopitalAdapter;
    ArrayList<Hopital> hopitals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat_kham_phong_kham);
        linkViews();
        initData();
        loadData();
    }

    private void linkViews() {
        lvPhongKham=findViewById(R.id.lvPhongKham);
    }

    private void initData() {
        hopitals=new ArrayList<Hopital>();
        hopitals.add(new Hopital(R.drawable.bs_nam,"Nha Khoa","36 Phan chu Trinh"));
        hopitals.add(new Hopital(R.drawable.bs_nam,"Trần Thị Hạnh Trang","36 Phan chu Trinh"));
        hopitals.add(new Hopital(R.drawable.bs_nu,"Trần Thị Hạnh Trang","36 Phan chu Trinh"));
        hopitals.add(new Hopital(R.drawable.bs_nam,"Trần Thị Hạnh Trang","36 Phan chu Trinh"));
        hopitals.add(new Hopital(R.drawable.bs_nu,"Trần Thị Hạnh Trang","36 Phan chu Trinh"));

    }

    private void loadData() {
        hopitalAdapter=new HopitalAdapter(DatKhamPhongKham.this,R.layout.item_phongkham,hopitals);
        lvPhongKham.setAdapter(hopitalAdapter);
    }
}