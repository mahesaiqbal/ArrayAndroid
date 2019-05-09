package com.example.arrayandroid.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.arrayandroid.R;
import com.example.arrayandroid.data.KelompokDuaData;
import com.example.arrayandroid.model.KelompokDua;
import com.example.arrayandroid.ui.adapter.ListKelompokDuaAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvItem;
    private ArrayList<KelompokDua> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvItem = findViewById(R.id.list_item);
        rvItem.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(KelompokDuaData.getKelompokDuaList());

        setActionBarTitle("Mobile Programming");

        showRecyclerList();
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    private void showRecyclerList() {
        rvItem.setLayoutManager(new LinearLayoutManager(this));
        rvItem.addItemDecoration(new DividerItemDecoration(rvItem.getContext(), DividerItemDecoration.VERTICAL));
        ListKelompokDuaAdapter listKelompokDuaAdapter = new ListKelompokDuaAdapter(this, list);
        rvItem.setAdapter(listKelompokDuaAdapter);
    }
}
