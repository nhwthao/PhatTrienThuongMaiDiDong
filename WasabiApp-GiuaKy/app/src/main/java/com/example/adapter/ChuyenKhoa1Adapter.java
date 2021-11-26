package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.login.R;
import com.example.model.ChuyenKhoa1;

import java.util.List;

public class ChuyenKhoa1Adapter extends BaseAdapter {
    Activity context;
    int item_gridview;
    List<ChuyenKhoa1> chuyenKhoa1List;

    public ChuyenKhoa1Adapter(Activity context, int item_gridview, List<ChuyenKhoa1> chuyenKhoa1List) {
        this.context = context;
        this.item_gridview = item_gridview;
        this.chuyenKhoa1List = chuyenKhoa1List;
    }


    @Override
    public int getCount() {
        return chuyenKhoa1List.size();
    }

    @Override
    public Object getItem(int i) {
        return chuyenKhoa1List.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view==null){
            //Link item view
            holder=new ViewHolder();
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(item_gridview,null);
            holder.imvThumb1=view.findViewById(R.id.imvThumb1);
            holder.txtName=view.findViewById(R.id.txtName);
            view.setTag(holder);
        }
        else{
            holder=(ViewHolder)  view.getTag();
        }
        //binding data
        ChuyenKhoa1 ck=chuyenKhoa1List.get(i);
        holder.imvThumb1.setImageResource(ck.getProductThumb1());
        holder.txtName.setText(ck.getProductName());
        return view;
    }
    public static  class ViewHolder{
        ImageView imvThumb1;
        TextView txtName;
    }
}
