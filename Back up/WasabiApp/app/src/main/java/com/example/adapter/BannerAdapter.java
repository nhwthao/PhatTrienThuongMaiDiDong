package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.model.Banner;
import com.example.wasabiapp.R;

import java.util.ArrayList;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.ViewHolder> {
    ArrayList<Banner> banners;

    public BannerAdapter(ArrayList<Banner> banners) {
        this.banners = banners;
    }

    @NonNull
    @Override
    public BannerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //phương thức dùng để nạp giao diện
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View customView= inflater.inflate(R.layout.item_banner,parent,false);
        return new ViewHolder(customView);
    }

    @Override
    public void onBindViewHolder(@NonNull BannerAdapter.ViewHolder holder, int position) {
        // truyền dữ liệu
        final Banner banner = banners.get(position);
        if (banner == null) { return; }
        holder.imvThumb.setImageResource(banners.get(position).getBannerThumb());
    }
    @Override
    public int getItemCount()  {
        return banners.size();
    }
    //ViewHolder dùng để quản lý các thành phần giao diện mà chúng ta thiết kế
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imvThumb;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //link view
            imvThumb=itemView.findViewById(R.id.imvThumb);
        }
    }

}
