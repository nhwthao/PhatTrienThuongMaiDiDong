package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.model.DienDan;
import com.example.wasabiapp.R;

import java.util.ArrayList;

public class DienDanAdapter extends BaseAdapter {
    Context context;
    int item_layout;
    ArrayList<DienDan> diendan;

    public DienDanAdapter(Context context, int item_layout, ArrayList<DienDan> diendan) {
        this.context = context;
        this.item_layout = item_layout;
        this.diendan = diendan;
    }


    @Override
    public int getCount() {
        return diendan.size();
    }

    @Override
    public Object getItem(int i) {
        return diendan.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(item_layout, null);
            holder.imvHinh = view.findViewById(R.id.imvHinh);
            holder.txtTen = view.findViewById(R.id.txtTen);
            holder.txtNgayDang = view.findViewById(R.id.txtNgayDang);
            holder.txtNoiDung = view.findViewById(R.id.txtNoiDung);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        //binding
        DienDan d = diendan.get(i);
        holder.imvHinh.setImageResource(d.getDienDanHinh());
        holder.txtTen.setText(d.getDienDanTen());
        holder.txtNgayDang.setText(d.getDiendanNgayDang());
        holder.txtNoiDung.setText(d.getDienDanND());
        return view;
    }

    private static class ViewHolder {
        ImageView imvHinh;
        TextView txtNgayDang, txtTen, txtNoiDung;
    }
}
