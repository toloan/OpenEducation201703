package com.example.asus.recycleview;

import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by ASUS on 3/22/2017.
 */

public class Main2Activity extends AppCompatActivity {
    private RecyclerView view;
    private BiggerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_hor);
        view=(RecyclerView)findViewById(R.id.list_hor);
        view.setLayoutManager(new LinearLayoutManager(this));
        adapter=new BiggerAdapter();
        view.setAdapter(adapter);
    }
}
