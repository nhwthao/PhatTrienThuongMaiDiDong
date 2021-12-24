package com.example.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;

import com.example.adapter.BannerAdapter;
import com.example.adapter.FunctionAdapter;
import com.example.adapter.ViewTinTucAdapter;
import com.example.model.Banner;
import com.example.model.Function;
import com.example.wasabiapp.BookingClinic;
import com.example.wasabiapp.BookingDoctor;
import com.example.wasabiapp.BookingHospital;
import com.example.wasabiapp.BookingSpecialist1;
import com.example.wasabiapp.DienDanYTe;
import com.example.wasabiapp.R;


import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wasabiapp.TuVanYTeOnline;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class FragmentHome extends Fragment {
    View view;
    private RecyclerView rcvBanner;
    private BannerAdapter bannerAdapter;
    ArrayList<Banner> banners;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    GridView gvFunction;
    TextView txtName,txtName2;
    ImageView imvThumb;
    ArrayList<Function> functions;
    FunctionAdapter adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false);
        view = inflater.inflate(R.layout.fragment_home, container, false);
        rcvBanner = view.findViewById(R.id.rcvBanner);
        bannerAdapter = new BannerAdapter(banners);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rcvBanner.setLayoutManager(manager);
        rcvBanner.setAdapter(bannerAdapter);
        initData();
        tabLayout = view.findViewById(R.id.tab_layout);
        viewPager = view.findViewById(R.id.view_paper);
        ViewTinTucAdapter viewTinTucAdapter = new ViewTinTucAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewTinTucAdapter);
        tabLayout.setupWithViewPager(viewPager);

//
//        // Inflate the layout for this fragment
//        View view=inflater.inflate(R.layout.fragment_home,container,false);
        gvFunction=view.findViewById(R.id.gvFunction);
        imvThumb=view.findViewById(R.id.imvThumb);
        txtName=view.findViewById(R.id.txtName);
        txtName2=view.findViewById(R.id.txtName2);
        adapter=new FunctionAdapter((Activity) getContext(),R.layout.item_function,initData2());
        gvFunction.setAdapter(adapter);
        gvFunction.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                // DO something
                Object o = gvFunction.getItemAtPosition(position);
                Function function = (Function) o;
                Intent intent;
                switch (function.getFunctionName2()){
                    case "Bác sĩ":
                         intent = new Intent(getActivity(), BookingDoctor.class);
                        startActivity(intent);
                        break;
                    case "Chuyên khoa":
                         intent = new Intent(getActivity(), BookingSpecialist1.class);
                        startActivity(intent);
                        break;
                    case "Bệnh viện":
                         intent = new Intent(getActivity(), BookingHospital.class);
                        startActivity(intent);
                        break;
                    case "Phòng khám":
                         intent = new Intent(getActivity(), BookingClinic.class);
                        startActivity(intent);
                        break;
                    case "Y tế online":
                        intent = new Intent(getActivity(), TuVanYTeOnline.class);
                        startActivity(intent);
                        break;
                    case "Y tế":
                        intent = new Intent(getActivity(), DienDanYTe.class);
                        startActivity(intent);
                        break;
                }
            }
        });

        return view;
    }
    private void initData() {
        //khởi tạo dữ liệu
        banners = new ArrayList<>();
        banners.add(new Banner(R.drawable.nf1));
        banners.add(new Banner(R.drawable.nf2));
        banners.add(new Banner(R.drawable.nf3));
        banners.add(new Banner(R.drawable.nf4));
        banners.add(new Banner(R.drawable.nf5));
        bannerAdapter = new BannerAdapter(banners);
        rcvBanner.setAdapter(bannerAdapter);
    }
    private ArrayList<Function> initData2() {

        functions=new ArrayList<>();
        functions.add(new Function(R.drawable.bacsi,"Đặt khám","Bác sĩ"));
        functions.add(new Function(R.drawable.chuyenkhoa,"Đặt khám","Chuyên khoa"));
        functions.add(new Function(R.drawable.benhvien,"Đặt khám","Bệnh viện"));
        functions.add(new Function(R.drawable.phongkham,"Đặt khám","Phòng khám"));
        functions.add(new Function(R.drawable.tuvan,"Tư vấn","Y tế online"));
        functions.add(new Function(R.drawable.diendan,"Diễn đàn","Y tế"));
        return functions;
    }




    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        FragmentManager fragmentManagerList = getChildFragmentManager();
        FragmentTransaction fragmentTransactionList = fragmentManagerList.beginTransaction();
        fragmentTransactionList.replace(R.id.view_paper, new FragmentTinTuc());
        fragmentTransactionList.commit();
    }
}
