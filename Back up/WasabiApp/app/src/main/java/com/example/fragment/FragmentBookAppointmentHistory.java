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
import androidx.fragment.app.FragmentTransaction;

import com.example.adapter.BookAppointmentAdapter;
import com.example.model.BookAppointment;
import com.example.model.MyItemClick;
import com.example.wasabiapp.R;

import java.util.ArrayList;

public class FragmentBookAppointmentHistory extends Fragment {

    ListView lvBookAppointmentHistory;
    TextView txtIdLK, txtTime, txtDoctor, txtSDTDoctor, txtChuyenNganhDoctor, txtAddress;
    ArrayList<BookAppointment> bookAppointments;
    BookAppointmentAdapter bookAppointmentAdapter;
    //MyItemClick itemClick;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book_appointment_history, container, false);

        lvBookAppointmentHistory = view.findViewById(R.id.lvBookAppointmentHistory);
        txtIdLK = view.findViewById(R.id.txtIdLk);
        txtTime = view.findViewById(R.id.txtTime);
        txtDoctor = view.findViewById(R.id.txtDoctor);
        txtSDTDoctor = view.findViewById(R.id.txtSDTDoctor);
        txtChuyenNganhDoctor = view.findViewById(R.id.txtChuyenNganhDoctor);
        txtAddress = view.findViewById(R.id.txtAddress);

        bookAppointments = new ArrayList<>();
        bookAppointments.add(new BookAppointment("0001", "9h Thứ hai 20/12/2021", "BS.Lê Đình B", "0909090909", "Khoa Tai Mũi Họng", "Bệnh viện Phạm Ngọc Thạch"));
        bookAppointments.add(new BookAppointment("0002", "9h Thứ hai 20/12/2021", "BS.Lê Đình B", "0909090909", "Khoa Tai Mũi Họng", "Bệnh viện Phạm Ngọc Thạch"));
        bookAppointments.add(new BookAppointment("0003", "9h Thứ hai 20/12/2021", "BS.Lê Đình B", "0909090909", "Khoa Tai Mũi Họng", "Bệnh viện Phạm Ngọc Thạch"));
        bookAppointments.add(new BookAppointment("0004", "9h Thứ hai 20/12/2021", "BS.Lê Đình B", "0909090909", "Khoa Tai Mũi Họng", "Bệnh viện Phạm Ngọc Thạch"));
        bookAppointments.add(new BookAppointment("0005", "9h Thứ hai 20/12/2021", "BS.Lê Đình B", "0909090909", "Khoa Tai Mũi Họng", "Bệnh viện Phạm Ngọc Thạch"));


        bookAppointmentAdapter = new BookAppointmentAdapter(getContext(), R.layout.itemlist_booking_appointment_new, bookAppointments);
        lvBookAppointmentHistory.setAdapter(bookAppointmentAdapter);

        lvBookAppointmentHistory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                transferData(i);
            }
        });

        return view;
    }

    public void transferData(int i) {

        FragmentBookAppointmentNewDetails fragment = new FragmentBookAppointmentNewDetails();
        Bundle bundle = new Bundle();
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        bundle.putInt("id", i);
        bundle.putSerializable("bookAppointment", bookAppointments);
        fragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.frLayout, fragment);
        fragmentTransaction.commit();
        //Toast.makeText(getActivity(),"test",Toast.LENGTH_SHORT).show();
    }
}