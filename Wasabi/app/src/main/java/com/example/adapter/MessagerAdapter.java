package com.example.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wasabi.R;

import java.util.List;

public class MessagerAdapter extends RecyclerView.Adapter<MessagerAdapter.MessageViewHolder> {
    private List<Message> messageList ;
    public  void setData(List<Message> list){
        this.messageList = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message,parent,false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {

        //xét dữ liệu cho textview
        Message message =messageList.get(position);
        if(message == null)
        {
            return;
        }
        holder.txtmessage.setText(message.getMessage());
    }

    @Override
    public int getItemCount() {
        if(messageList != null){
            return  messageList.size();
        }
        return 0;
    }

    public class MessageViewHolder extends RecyclerView.ViewHolder {

        private TextView txtmessage;
        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);
            txtmessage = itemView.findViewById(R.id.txtMessage);
        }
    }
}
