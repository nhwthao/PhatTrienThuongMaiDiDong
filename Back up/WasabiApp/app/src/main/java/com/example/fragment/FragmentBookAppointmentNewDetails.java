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
import com.example.utils.Constant;
import com.example.wasabiapp.R;

import org.w3c.dom.Text;

public class FragmentBookAppointmentNewDetails extends Fragment {
    BookAppointment bookAppointment;
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
            bookAppointment = (BookAppointment) bundle.getSerializable(Constant.SELECTED_ITEM);
            txtIdLk.setText(bookAppointment.getBaId());
            txtDoctor.setText(bookAppointment.getBaDoctor());
            txtSDTDoctor.setText(bookAppointment.getBaSDTDoctor());
            txtChuyenNganhDoctor.setText(bookAppointment.getBaChuyenNganhDoctor());
            txtTime.setText(bookAppointment.getBaTime());
            txtAddress.setText(bookAppointment.getBaAddress());
        }
        return view;
    }
}
