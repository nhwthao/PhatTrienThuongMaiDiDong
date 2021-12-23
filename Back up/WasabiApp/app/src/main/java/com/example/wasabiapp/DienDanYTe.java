package com.example.wasabiapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adapter.DienDanAdapter;
import com.example.model.DienDan;

import java.util.ArrayList;

public class DienDanYTe extends AppCompatActivity {
    ListView lvDienDan;
    DienDanAdapter dienDanAdapter;
    ArrayList<DienDan> dienDan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dien_dan_yte);
        linkViews();
        initData();
        loadData();
    }

    private void loadData() {
        dienDanAdapter=new DienDanAdapter(DienDanYTe.this,R.layout.item_diendan,dienDan);
        lvDienDan.setAdapter(dienDanAdapter);
    }

    private void initData() {
        dienDan =new ArrayList<DienDan>();
        dienDan.add(new DienDan(R.drawable.icondiendan,"Nguyễn Thị B","31/10/2021","Hôm nay, tôi có đi khám ở bác sĩ Nguyễn Văn Thành và cảm thấy vô cùng hài lòng. Bác sĩ tận tâm, y tá nhiệt tình. Mọi người nên ghé thử nhé"));
        dienDan.add(new DienDan(R.drawable.icondiendan,"Trần Văn A","27/10/2021","Hôm nay, tôi có đi khám ở bác sĩ Nguyễn Văn Thành và cảm thấy vô cùng hài lòng. Bác sĩ tận tâm, y tá nhiệt tình. Mọi người nên ghé thử nhé"));
        dienDan.add(new DienDan(R.drawable.icondiendan,"Nguyễn Thị B","27/10/2021","Hôm nay, tôi có đi khám ở bác sĩ Nguyễn Văn Thành và cảm thấy vô cùng hài lòng. Bác sĩ tận tâm, y tá nhiệt tình. Mọi người nên ghé thử nhé"));
    }
    private void linkViews() {
        lvDienDan =findViewById(R.id.lvDienDan);
    }
}