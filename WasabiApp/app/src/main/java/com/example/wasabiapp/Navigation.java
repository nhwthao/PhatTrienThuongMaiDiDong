package com.example.wasabiapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Navigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);
        navigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        Toast.makeText(Navigation.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_calendar:
                        Toast.makeText(Navigation.this, "Calendar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_file:
                        Toast.makeText(Navigation.this, "File", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_notification:
                        Toast.makeText(Navigation.this, "notification", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_person:
                        Toast.makeText(Navigation.this, "person", Toast.LENGTH_SHORT).show();
                        break;
                }
                return;
            }
        });
    }
}