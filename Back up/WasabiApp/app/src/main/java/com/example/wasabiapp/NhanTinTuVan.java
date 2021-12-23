package com.example.wasabiapp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.model.Message;
import com.example.adapter.MessagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class NhanTinTuVan extends AppCompatActivity {
    private EditText edtMessage;
    private ImageButton imvSend;
    private RecyclerView rcrMessage ;
    private MessagerAdapter messagerAdapter;
    private List<Message> messageList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhan_tin_tu_van);
        // Message
        edtMessage =findViewById(R.id.edtMessage);
        imvSend = findViewById(R.id.imvSend);
        rcrMessage = findViewById(R.id.rcv_message);
        //luôn nhớ phải set  layout manager cho rcv
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        rcrMessage.setLayoutManager(linearLayoutManager);
        messageList = new ArrayList<>();
        messagerAdapter = new MessagerAdapter();
        messagerAdapter.setData(messageList);
        rcrMessage.setAdapter(messagerAdapter);
        imvSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessager();
            }
        });
    }

    private void sendMessager() {
        //xóa 2 khoảng trống đầu cuối
        String strMessage =edtMessage.getText().toString().trim();
        //nếu không nhập gì thì return
        if(TextUtils.isEmpty(strMessage)){
            return;
        }
        messageList.add(new Message(strMessage));
        messagerAdapter.notifyDataSetChanged();
        //luôn hiển thị tin nhắn cuối
        rcrMessage.scrollToPosition(messageList.size()-1);
        edtMessage.setText("");
    }
}