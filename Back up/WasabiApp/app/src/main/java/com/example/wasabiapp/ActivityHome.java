//package com.example.wasabiapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentTransaction;
//import androidx.viewpager.widget.ViewPager;
//
//import android.os.Bundle;
//import android.view.MenuItem;
//
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//
//public class ActivityHome extends AppCompatActivity {
//    private ViewPager viewPager_home;
//    private BottomNavigationView bottomNavigationView;
//    int FragmentHome = 0;
//    int FragmentCalendar = 1;
//    int FragmentFile = 2;
//    int FragmentNotice = 3;
//    int FragmentUser = 4;
//    int CurrentFragment = FragmentHome;
//    BottomNavigationView navigationView;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
//        navigationView = findViewById(R.id.bottom_nav);
//        navigationView.setOnItemSelectedListener(item -> {
//            swapScreen(item);
//            return false;
//        });
//        Fragment previousFragment = new FragmentHome();
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.add(R.id.view_paper_nav, previousFragment);
//        fragmentTransaction.commit();
//
//    }
//    private void replaceFragment(Fragment fragment) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.view_paper_nav, fragment).addToBackStack("my_fragment");
//        fragmentTransaction.commit();
//    }
//
//    private void swapScreen(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.action_home:
//                if (FragmentHome != CurrentFragment) {
//                    replaceFragment(new FragmentHome());
//                    CurrentFragment = FragmentHome;
//                    navigationView.getMenu().findItem(R.id.action_home).setChecked(true);
//                }
//                break;
//            case R.id.action_calendar:
//                if (FragmentCalendar != CurrentFragment) {
//                    replaceFragment(new FragmentCaledar());
//                    CurrentFragment = FragmentCalendar;
//                    navigationView.getMenu().findItem(R.id.action_calendar).setChecked(true);
//                }
//                break;
//
//            case R.id.action_file:
//                if (FragmentFile != CurrentFragment) {
//                    replaceFragment(new FragmentFile());
//                    CurrentFragment = FragmentFile;
//                    navigationView.getMenu().findItem(R.id.action_file).setChecked(true);
//                }
//                break;
//
//            case R.id.action_notification:
//                if (FragmentNotice != CurrentFragment) {
//                    replaceFragment(new FragmentNotice());
//                    CurrentFragment = FragmentNotice;
//                    navigationView.getMenu().findItem(R.id.action_notification).setChecked(true);
//                }
//                break;
//            case R.id.action_person:
//                if (FragmentUser != CurrentFragment) {
//                    replaceFragment(new FragmentUser());
//                    CurrentFragment = FragmentUser;
//                    navigationView.getMenu().findItem(R.id.action_person).setChecked(true);
//                }
//                break;
//        }
//    }
//}