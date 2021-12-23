package com.example.wasabiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;

import com.example.adapter.BookingAdapter;
import com.example.model.Booking;

import java.util.ArrayList;

public class BookingNoticate extends AppCompatActivity {
    ListView lvBooking;
    BookingAdapter adapter;
    ArrayList<Booking> bookings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_noticate);
        linkViews();
        loadData();
    }

    private void linkViews() {
        lvBooking=findViewById(R.id.lvBooking);
    }

    private void loadData() {
        bookings=new ArrayList<>();
        Cursor cursor= BookingSpecialist4.db.getData("SELECT *FROM " + MyDataBaseBooking.TBL_NAME);
        while (cursor.moveToNext()){
            bookings.add(new Booking(cursor.getInt(0),cursor.getString(1), cursor.getString(2),cursor.getString(3),cursor.getString(4), cursor.getBlob(5)));

        }
        cursor.close();
        adapter = new BookingAdapter(BookingNoticate.this,R.layout.item_booking,bookings);
        lvBooking.setAdapter(adapter);
    }
}