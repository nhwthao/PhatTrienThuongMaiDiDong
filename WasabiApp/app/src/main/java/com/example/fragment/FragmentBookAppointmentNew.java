package com.example.fragment;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.adapter.BookAppointmentAdapter;
import com.example.model.BookAppointment;
import com.example.model.MyItemClick;
import com.example.wasabiapp.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentBookAppointmentNew extends Fragment {
    
    ListView lvBookAppointmentNew;
    TextView txtIdLK, txtTime, txtDoctor, txtSDTDoctor, txtChuyenNganhDoctor, txtAddress;
    ArrayList<BookAppointment> bookAppointments;
    BookAppointmentAdapter bookAppointmentAdapter;

    MyItemClick itemClick;
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book_appointment_new, container, false);
        
        lvBookAppointmentNew = view.findViewById(R.id.lvBookAppointmentNew);
        txtIdLK = view.findViewById(R.id.txtIdLk);
        txtTime = view.findViewById(R.id.txtTime);
        txtDoctor = view.findViewById(R.id.txtDoctor);
        txtSDTDoctor = view.findViewById(R.id.txtSDTDoctor);
        txtChuyenNganhDoctor = view.findViewById(R.id.txtChuyenNganhDoctor);
        txtAddress = view.findViewById(R.id.txtAddress);

        bookAppointmentAdapter = new BookAppointmentAdapter(getContext(), R.layout.itemlist_booking_appointment_new, initData());
        lvBookAppointmentNew.setAdapter(bookAppointmentAdapter);

        lvBookAppointmentNew.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
                    itemClick = (MyItemClick) getActivity();
                    if(itemClick !=null){
                        itemClick.click(bookAppointments.get(i));
                    }else {
                        txtIdLK.setText(bookAppointments.get(i).getBaId());
                        txtDoctor.setText(bookAppointments.get(i).getBaDoctor());
                        txtSDTDoctor.setText(bookAppointments.get(i).getBaSDTDoctor());
                        txtChuyenNganhDoctor.setText(bookAppointments.get(i).getBaChuyenNganhDoctor());
                        txtTime.setText(bookAppointments.get(i).getBaTime());
                        txtAddress.setText(bookAppointments.get(i).getBaAddress());
                    }
                }
            }
        });

        return view;
    }


    private ArrayList<BookAppointment> initData() {
        bookAppointments = new ArrayList<>();
        bookAppointments.add(new BookAppointment("0001", "9h Thứ hai 20/12/2021", "BS.Lê Đình B","0909090909","Khoa Tai Mũi Họng","Bệnh viện Phạm Ngọc Thạch"));
        bookAppointments.add(new BookAppointment("0002", "9h Thứ hai 20/12/2021", "BS.Lê Đình B","0909090909","Khoa Tai Mũi Họng","Bệnh viện Phạm Ngọc Thạch"));

        return bookAppointments;
    }
}
