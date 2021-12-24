package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.model.BookAppointment;
import com.example.wasabiapp.R;

import java.util.ArrayList;

public class FragmentBookAppointmentNewDetails extends Fragment {

    TextView txtIdLk, txtDoctor, txtSDTDoctor, txtChuyenNganhDoctor, txtTime, txtAddress;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book_appointment_detail, container,false);

        txtIdLk = view.findViewById(R.id.txtIdLk);
        txtDoctor = view.findViewById(R.id.txtDoctor);
        txtSDTDoctor = view.findViewById(R.id.txtSDTDoctor);
        txtChuyenNganhDoctor = view.findViewById(R.id.txtChuyenNganhDoctor);
        txtTime = view.findViewById(R.id.txtTime);
        txtAddress = view.findViewById(R.id.txtAddress);

        Bundle bundle = getArguments();
        if(bundle != null){
            int id = bundle.getInt("id");
            ArrayList<BookAppointment> bookAppointment = (ArrayList<BookAppointment>) bundle.getSerializable("bookAppointment");
            txtIdLk.setText(bookAppointment.get(id).getBaId());
            txtDoctor.setText(bookAppointment.get(id).getBaDoctor());
            txtSDTDoctor.setText(bookAppointment.get(id).getBaSDTDoctor());
            txtChuyenNganhDoctor.setText(bookAppointment.get(id).getBaChuyenNganhDoctor());
            txtTime.setText(bookAppointment.get(id).getBaTime());
            txtAddress.setText(bookAppointment.get(id).getBaAddress());
        }
        return view;
    }
}
