package com.example.wasabiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragment.FragmentBookAppointmentHistory;
import com.example.fragment.FragmentBookAppointmentNew;
import com.example.fragment.FragmentBookAppointmentNewDetails;
import com.example.model.BookAppointment;
import com.example.model.MyItemClick;
import com.example.utils.Constant;

public class ActivityBookAppointment extends AppCompatActivity implements MyItemClick {

    Button btnLKMoiNhat, btnLKLichSu;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_appointment);


        linkViews();
        addEvent();

    }

    private void linkViews() {
        btnLKMoiNhat = findViewById(R.id.btnLKMoiNhat);
        btnLKLichSu = findViewById(R.id.btnLKLichSu);
    }

    private void addEvent() {
        btnLKMoiNhat.setOnClickListener(myClick);
        btnLKLichSu.setOnClickListener(myClick);
    }

    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            Fragment fragment = null;
            if(view.getId() == R.id.btnLKMoiNhat){
                fragment = new FragmentBookAppointmentNew();
            }
            if(view.getId() == R.id.btnLKLichSu){
                fragment = new FragmentBookAppointmentHistory();
            }
            transaction.replace(R.id.layoutContainer,fragment);
            transaction.commit();
        }
    };

    @Override
    public void click(BookAppointment bookAppointment) {
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentBookAppointmentNewDetails bookAppointmentNewDetails = new FragmentBookAppointmentNewDetails();


        Bundle bundle = new Bundle();
        bundle.putSerializable(Constant.SELECTED_ITEM, bookAppointment);
        bookAppointmentNewDetails.setArguments(bundle);

        transaction.replace(R.id.layoutContainer,bookAppointmentNewDetails);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}