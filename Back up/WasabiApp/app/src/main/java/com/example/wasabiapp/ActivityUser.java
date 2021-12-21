//package com.example.wasabiapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//public class ActivityUser extends AppCompatActivity {
//
//    private Button btnLogout;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_user);
//        linkViews();
//        addEvents();
//    }
//
//    private void linkViews (){
//        btnLogout = findViewById(R.id.btnLogout);
//    }
//    private void addEvents(){
//        btnLogout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent logout = new Intent(ActivityUser.this, ActivityLogout.class);
//                startActivity(logout);
//            }
//        });
//
//    }
//}