package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.model.BookAppointment;
import com.example.wasabiapp.R;

import java.util.ArrayList;

public class BookAppointmentAdapter extends BaseAdapter {
    Context context;
    int item_layout_ba;
    ArrayList<BookAppointment> bookAppointments;

    public BookAppointmentAdapter(Context context, int item_layout_ba, ArrayList<BookAppointment> bookAppointments) {
        this.context = context;
        this.item_layout_ba = item_layout_ba;
        this.bookAppointments = bookAppointments;
    }

    @Override
    public int getCount() {
        return bookAppointments.size();
    }

    @Override
    public Object getItem(int i) {
        return bookAppointments.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(view == null){
            holder = new ViewHolder();
            view = inflater.inflate(item_layout_ba,null);
            holder.txtIdLK = view.findViewById(R.id.txtBAId);
            holder.txtTime = view.findViewById(R.id.txtBATime);
            holder.txtDoctor = view.findViewById(R.id.txtBADoctor);
            holder.txtAddress = view.findViewById(R.id.txtBAAddress);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        BookAppointment ba = bookAppointments.get(i);
        holder.txtIdLK.setText(ba.getBaId());
        holder.txtTime.setText(ba.getBaTime());
        holder.txtDoctor.setText(ba.getBaDoctor());
        holder.txtAddress.setText(ba.getBaAddress());

        return view;
    }
    private static class ViewHolder{
        TextView txtIdLK, txtTime, txtDoctor, txtAddress;
    }
}
