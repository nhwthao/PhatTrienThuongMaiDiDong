package com.example.wasabiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import com.example.adapter.DoctorAdapter;
import com.example.model.Doctor;

import java.util.ArrayList;

public class BookingDoctor extends AppCompatActivity {
    ListView lvDoctor2;
    DoctorAdapter doctorAdapter;
    ArrayList<Doctor> doctors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_doctor);
        linkViews();
        initData();
        loadData();
    }

    private void linkViews() {
        lvDoctor2=findViewById(R.id.lvDoctor2);
    }

    private void initData() {
        doctors=new ArrayList<Doctor>();
        doctors.add(new Doctor(R.drawable.bs_nam,"BS-CK2","Lê Đình Thông","1900-2811","Hô hấp","Bệnh viện Phạm Ngọc Thạch","26 Phan Văn Hớn,P.Thống Nhất, Q.12, TP.HCM"));
        doctors.add(new Doctor(R.drawable.bs_nu,"BS-CK2","Nguyễn Mai Phương","1900-2812","Khoa mắt","Bệnh viện Đại học Y dược TP.HCM","215 Hồng Bàng, Phường 11 , Quận 5 , TP.HCM"));
        doctors.add(new Doctor(R.drawable.bs_nam,"BS-CK2","Vũ Văn Minh","1900-2812","Tâm lý - Tâm thần","Bệnh viện Đại học Y dược TP.HCM","215 Hồng Bàng, Phường 11 , Quận 5 , TP.HCM"));
        doctors.add(new Doctor(R.drawable.bs_nu,"BS-CK2","Nguyễn Mai Hồng","1900-2812","Khoa sản","Bệnh viện Đại học Y dược TP.HCM","215 Hồng Bàng, Phường 11 , Quận 5 , TP.HCM"));
        doctors.add(new Doctor(R.drawable.bs_nam,"BS-CK2","Lê Anh Bảo","1900-2813","Ung bướu","Bệnh viện quốc tế Hòa Bình","36 Phan chu Trinh, P.Thống Nhất, Q.Tân Bình, TP.HCM"));
        doctors.add(new Doctor(R.drawable.bs_nu,"BS-CK2","Trần Thị Diễm","1900-2814","Hô hấp","Bệnh viện Hùng Vương","1044 Trường Sa, P.2, Q.3, TP.HCM"));
        doctors.add(new Doctor(R.drawable.bs_nam,"BS-CK2","Đặng Huy Hoàng","1900-2888","Tim mạch","Bệnh viện Hùng Vương","1044 Trường Sa, P.2, Q.3, TP.HCM"));
        doctors.add(new Doctor(R.drawable.bs_nu,"BS-CK2","Hoàng Xuân Mai","1900-2815","Máu - Miễn dịch","Bệnh viện Nhi Đồng 1","371 Nơ Trang Lơng, P.13, Q.Bình Thạnh, TP.HCM"));
        doctors.add(new Doctor(R.drawable.bs_nu,"BS-CK2","Đỗ Thu Nhi","1900-2816","Khoa sản","Bệnh viện Quận Thủ Đức","123 Linh Trung, Thủ Đức, TP.HCM"));
        doctors.add(new Doctor(R.drawable.bs_nam,"BS-CK2","Trần Xuân Thanh","1900-2816","Xương khớp","Bệnh viện Chợ Rẫy","201 B Nguyễn Chí Thanh, Phường 12, Quận 5"));
    }

    private void loadData() {
        doctorAdapter=new DoctorAdapter(BookingDoctor.this,R.layout.item_doctor,doctors);
        lvDoctor2.setAdapter(doctorAdapter);
    }
}