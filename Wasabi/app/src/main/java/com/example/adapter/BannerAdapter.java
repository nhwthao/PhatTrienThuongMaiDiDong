package com.example.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wasabi.R;
import com.example.model.Banner;

import java.util.ArrayList;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.ViewHolder> {
    Context context;
    ArrayList<Banner> banners;

    public BannerAdapter(Context context, ArrayList<Banner> banners) {
        this.context = context;
        this.banners = banners;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //phương thức dùng để nạp giao diện
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View customView= inflater.inflate(R.layout.item_banner,parent,false);

        return new ViewHolder(customView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // truyền dữ liệu
        holder.imvThumb.setImageResource(banners.get(position).getBannerThumb());
    }



    @Override
    public int getItemCount() {
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