package com.example.month_3homework_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.month_3homework_3.model.NameAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String>nameUserList=new ArrayList<>();
    RecyclerView recyclerViewl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void loadData() {
        nameUserList.add("Diamond");
        nameUserList.add("Joodar");
        nameUserList.add("Bilal");
        nameUserList.add("Bakay");
        nameUserList.add("Nurbek");
        nameUserList.add("Nurel");
        nameUserList.add("Bekzat");
        nameUserList.add("Beksultan");
        nameUserList.add("Bulan");
        nameUserList.add("Farhat");
        nameUserList.add("Mustafa");
        nameUserList.add("Kumar");
        nameUserList.add("Nikita");
        nameUserList.add("Iman");
        nameUserList.add("Dmitry");
        nameUserList.add("Bayel");
        nameUserList.add("Imran");
        nameUserList.add("Azamat");
        nameUserList.add("Tynybek");
        nameUserList.add("Tagay");
        nameUserList.add("Adilet");
        nameUserList.add("Ramazan");
        nameUserList.add("Meerim");
        nameUserList.add("Meridiana");
        nameUserList.add("Nargiza");
        nameUserList.add("Rahat");
        nameUserList.add("Maksat");
        nameUserList.add("Ramil");
        nameUserList.add("Jumamidin");
        nameUserList.add("Amanaby");
        nameUserList.add("Aynura");
        nameUserList.add("Alina");
        nameUserList.add("Kamila");
        nameUserList.add("Keril");
        nameUserList.add("Katya");
        nameUserList.add("Jaku");
        nameUserList.add("Syrgak");
        nameUserList.add("Eku");
        nameUserList.add("Chynara");
        nameUserList.add("Askar");
        nameUserList.add("nurik");
        nameUserList.add("Sultan");
        nameUserList.add("Muslim");
        nameUserList.add("Nursultan");
        nameUserList.add("Temirlan");
        nameUserList.add("Ahniet");
        nameUserList.add("Habib");
        nameUserList.add("Ayjanka");
        nameUserList.add("Anarbek");
        nameUserList.add("Yryspek");
        nameUserList.add("Karina");
        nameUserList.add("Almir");
        nameUserList.add("Tilek");
        nameUserList.add("AruAyi");
        nameUserList.add("Elhan");
        nameUserList.add("Ayluu");
        nameUserList.add("Joomart");
        nameUserList.add("Ahmad");
        nameUserList.add("Ayjamal");
        nameUserList.add("Asema");
        itemAdapter();
    }

    private void itemAdapter() {
        NameAdapter adapter=new NameAdapter(nameUserList);
        recyclerViewl.setAdapter(adapter);
    }

    private void initView() {
        recyclerViewl=findViewById(R.id.rv_user_name);
    }
}