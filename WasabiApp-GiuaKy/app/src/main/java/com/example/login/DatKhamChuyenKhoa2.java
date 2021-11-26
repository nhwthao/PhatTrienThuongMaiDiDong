package com.example.login;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adapter.DoctorAdapter;
import com.example.model.Doctor;

import java.util.ArrayList;

public class DatKhamChuyenKhoa2 extends AppCompatActivity {
    ListView lvDoctor;
    DoctorAdapter doctorAdapter;
    ArrayList<Doctor> doctors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat_kham_chuyen_khoa2);
        linkViews();
        initData();
        loadData();
    }

    private void linkViews() {
        lvDoctor=findViewById(R.id.lvDoctor);
    }

    private void initData() {
        doctors=new ArrayList<Doctor>();
        doctors.add(new Doctor(R.drawable.bs_nam,"BS-CK2","Lê Đình Thông","1900-2805","Hô hấp","Bệnh viện Phạm Ngọc Thạch","26 Phan Văn Hớn,P.Thống Nhất, Q.12, TP.HCM"));
        doctors.add(new Doctor(R.drawable.bs_nam,"BS-CK2","Nguyễn Đức Tuấn","1900-2806","Hô hấp ","Bệnh viện Đại học Y dược TP.HCM","215 Hồng Bàng, Phường 11 , Quận 5 , TP.HCM"));
        doctors.add(new Doctor(R.drawable.bs_nu,"BS-CK2","Nguyễn Thu Giang","1900-2807","Hô hấp","Bệnh viện quốc tế Hòa Bình","36 Phan chu Trinh, P.Thống Nhất, Q.Tân Bình, TP.HCM"));
        doctors.add(new Doctor(R.drawable.bs_nu,"BS-CK2","Trần Thị Diễm","1900-2808","Hô hấp","Bệnh viện Hùng Vương","1044 Trường Sa, P.2, Q.3, TP.HCM"));
        doctors.add(new Doctor(R.drawable.bs_nu,"BS-CK2","Nguyễn Hoàng Diễm Quỳnh","1900-2809","Hô hấp","Bệnh viện Nhi Đồng 1","371 Nơ Trang Lowng, P.13, Q.Bình Thạnh, TP.HCM"));
        doctors.add(new Doctor(R.drawable.bs_nam,"BS-CK2","Phạm Xuân Long","1900-2810","Hô hấp","Bệnh viện Quận Thủ Đức","123 Linh Trung, Thủ Đức, TP.HCM"));
    }

    private void loadData() {
        doctorAdapter=new DoctorAdapter(DatKhamChuyenKhoa2.this,R.layout.item_doctor,doctors);
        lvDoctor.setAdapter(doctorAdapter);
    }
}