package com.example.adapter;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.model.News;
import com.example.wasabiapp.R;

import java.util.ArrayList;

public class NewsAdapter extends BaseAdapter {

    Context context;
    int item_layout;
    ArrayList<News> news;

    public NewsAdapter(Context context, int item_layout, ArrayList<News> news) {
        this.context = context;
        this.item_layout = item_layout;
        this.news = news;
    }

    @Override
    public int getCount() {
        return news.size();
    }

    @Override
    public Object getItem(int i) {
        return news.get(i);
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
            view = inflater.inflate(item_layout,null);
            holder.imvNewsPhoto = view.findViewById(R.id.imvNewsPhoto);
            holder.txtNewsTitle = view.findViewById(R.id.txtNewsTitle);
            holder.txtNewsAuthor = view.findViewById(R.id.txtNewsAuthor);
            holder.txtNewsSummary = view.findViewById(R.id.txtNewsSummary);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        News n = news.get(i);
        holder.imvNewsPhoto.setImageResource(n.getNewsPhoto());
        holder.txtNewsTitle.setText(n.getNewsTitle());
        holder.txtNewsAuthor.setText(n.getNewsAuthor());
        holder.txtNewsSummary.setText(n.getNewsSummary());

        return view;
    }
    private static class ViewHolder{
        ImageView imvNewsPhoto;
        TextView txtNewsTitle, txtNewsAuthor, txtNewsSummary;
    }
}
