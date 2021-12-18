package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import com.example.wasabiapp.BookingSpecialist2;
import com.example.wasabiapp.R;
import com.example.model.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorAdapter extends BaseAdapter {



    Context context;
    int item_layout;
    ArrayList<Doctor> doctors;

    public DoctorAdapter(Context context, int item_layout, ArrayList<Doctor> doctors) {
        this.context = context;
        this.item_layout = item_layout;
        this.doctors = doctors;
    }


    @Override
    public int getCount() {
        return doctors.size();
    }

    @Override
    public Object getItem(int i) {
        return doctors.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder=null;
        LayoutInflater inflater=(LayoutInflater)  context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if(view==null){
            holder=new ViewHolder();
            view= inflater.inflate(item_layout,null);
            holder.imvHinh=view.findViewById(R.id.imvHinh);
            holder.txtChucVu=view.findViewById(R.id.txtChucVu);
            holder.txtTen=view.findViewById(R.id.txtTen);
            holder.txtPhone=view.findViewById(R.id.txtPhone);
            holder.txtKhoa=view.findViewById(R.id.txtKhoa);
            holder.txtCoQuan=view.findViewById(R.id.txtCoQuan);
            holder.txtDiaChi=view.findViewById(R.id.txtDiaChi);
            view.setTag(holder);
        }
        else{
            holder=(ViewHolder) view.getTag();
        }
        //binding
        Doctor d=doctors.get(i);
        holder.imvHinh.setImageResource(d.getDoctorHinh());
        holder.txtChucVu.setText(d.getDoctorChucVu());
        holder.txtTen.setText(d.getDoctorTen());
        holder.txtPhone.setText(d.getDoctorPhone());
        holder.txtKhoa.setText(d.getDoctorKhoa());
        holder.txtCoQuan.setText(d.getDoctorCoQuan());
        holder.txtDiaChi.setText(d.getDoctorDiaChi());
        return view;
    }
    private static class ViewHolder{
        ImageView imvHinh;
        TextView txtChucVu,txtTen,txtPhone,txtKhoa,txtCoQuan,txtDiaChi;
    }
}
