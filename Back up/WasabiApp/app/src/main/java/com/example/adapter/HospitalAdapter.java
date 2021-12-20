package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wasabiapp.R;
import com.example.model.Hospital;

import java.util.ArrayList;

public class HospitalAdapter extends BaseAdapter {
    Context context;
    int item_layout;
    ArrayList<Hospital> hospitals;

    public HospitalAdapter(Context context, int item_layout, ArrayList<Hospital> hopitals) {
        this.context = context;
        this.item_layout = item_layout;
        this.hospitals = hopitals;
    }

    @Override
    public int getCount() {
        return hospitals.size();
    }

    @Override
    public Object getItem(int i) {
        return hospitals.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        HospitalAdapter.ViewHolder holder=null;
        LayoutInflater inflater=(LayoutInflater)  context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if(view==null){
            holder=new ViewHolder();
            view= inflater.inflate(item_layout,null);
            holder.imvHinh=view.findViewById(R.id.imvHinh);
            holder.txtTen=view.findViewById(R.id.txtTen);
            holder.txtDiaChi=view.findViewById(R.id.txtDiaChi);
            view.setTag(holder);
        }
        else{
            holder=(HospitalAdapter.ViewHolder) view.getTag();
        }
        //binding
        Hospital h =hospitals.get(i);
        holder.imvHinh.setImageResource(h.getHopitalImage());
        holder.txtTen.setText(h.getHopitalName());
        holder.txtDiaChi.setText(h.getHopitalAddress());
        return view;
    }
    private static class ViewHolder{
        ImageView imvHinh;
        TextView txtTen,txtDiaChi;
    }
}
