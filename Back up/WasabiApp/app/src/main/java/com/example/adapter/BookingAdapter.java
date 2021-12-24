package com.example.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.model.Booking;
import com.example.wasabiapp.R;

import java.util.List;

public class BookingAdapter extends BaseAdapter {
    private Context context ;
    private int item_layout;
    private List<Booking> bookings;

    public BookingAdapter(Context context, int item_layout, List<Booking> bookings) {
        this.context = context;
        this.item_layout = item_layout;
        this.bookings = bookings;
    }

    @Override
    public int getCount() {
        return bookings.size();
    }

    @Override
    public Object getItem(int i) {
        return bookings.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(item_layout,null);
            holder.imvThumb = view.findViewById(R.id.imvThumb);
            holder.txtName = view.findViewById(R.id.txtName);
            holder.txtDay=view.findViewById(R.id.txtDay);
            holder.txtHour=view.findViewById(R.id.txtHour);
            holder.txtDes = view.findViewById(R.id.txtDescription);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        Booking s = bookings.get(i);
        holder.txtName.setText(s.getwName());
        holder.txtDay.setText(s.getwDay());
        holder.txtHour.setText(s.getwHour());
        holder.txtDes.setText(s.getwDes());

        //convert byte array -> bitmap
        byte[] photo = s.getwThumb();
        Bitmap bitmap = BitmapFactory.decodeByteArray(photo, 0, photo.length);
        holder.imvThumb.setImageBitmap(bitmap);

        return view;
    }
    private static class ViewHolder {
        ImageView imvThumb;
        TextView txtName, txtDes,txtDay,txtHour;
    }
}