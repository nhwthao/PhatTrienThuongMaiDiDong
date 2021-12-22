package com.example.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.adapter.FunctionAdapter;
import com.example.model.BookAppointment;
import com.example.model.Function;
import com.example.model.MyItemClick;
import com.example.utils.Constant;
import com.example.wasabiapp.R;


import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wasabiapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentHome#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentHome extends Fragment {
    GridView gvFunction;
    TextView txtName,txtName2;
    ImageView imvThumb;
    ArrayList<Function> functions;
    FunctionAdapter adapter;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentHome() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentHome.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentHome newInstance(String param1, String param2) {
        FragmentHome fragment = new FragmentHome();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home,container,false);
        gvFunction=view.findViewById(R.id.gvFunction);
        imvThumb=view.findViewById(R.id.imvThumb);
        txtName=view.findViewById(R.id.txtName);
        txtName2=view.findViewById(R.id.txtName2);
        adapter=new FunctionAdapter((Activity) getContext(),R.layout.item_function,initData());
        gvFunction.setAdapter(adapter);
        return view;
    }

    private ArrayList<Function> initData() {
        functions=new ArrayList<>();
        functions.add(new Function(R.drawable.bacsi,"Đặt khám","Bác sĩ"));
        functions.add(new Function(R.drawable.chuyenkhoa,"Đặt khám","Chuyên khoa"));
        functions.add(new Function(R.drawable.benhvien,"Đặt khám","Bệnh viện"));
        functions.add(new Function(R.drawable.phongkham,"Đặt khám","Phòng khám"));
        functions.add(new Function(R.drawable.tuvan,"Tư vấn","Y tế online"));
        functions.add(new Function(R.drawable.diendan,"Diễn đàn","Y tế"));
        return functions;
    }
}
