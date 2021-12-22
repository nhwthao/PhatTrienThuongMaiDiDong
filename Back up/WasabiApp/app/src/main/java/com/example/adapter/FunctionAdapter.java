package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.model.Function;
import com.example.wasabiapp.R;

import java.util.List;

public class FunctionAdapter extends BaseAdapter {
    Activity context;
    int item_gridview;
    List<Function> functions;

    public FunctionAdapter(Activity context, int item_gridview, List<Function> functions) {
        this.context = context;
        this.item_gridview = item_gridview;
        this.functions = functions;
    }

    @Override
    public int getCount() {
        return functions.size();
    }

    @Override
    public Object getItem(int i) {
        return functions.get(i);
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
            holder.imvThumb=view.findViewById(R.id.imvThumb);
            holder.txtName=view.findViewById(R.id.txtName);
            holder.txtName2=view.findViewById(R.id.txtName2);
            view.setTag(holder);
        }
        else{
            holder=(ViewHolder)  view.getTag();
        }
        //binding data
        Function fc=functions.get(i);
        holder.imvThumb.setImageResource(fc.getFunctionThumb());
        holder.txtName.setText(fc.getFunctionName());
        holder.txtName2.setText(fc.getFunctionName2());
        return view;
    }
    public static  class ViewHolder{
        ImageView imvThumb;
        TextView txtName,txtName2;
    }
}
