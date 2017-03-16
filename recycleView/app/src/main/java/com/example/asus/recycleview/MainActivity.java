package com.example.asus.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
private RecyclerView view;
    private ListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view=(RecyclerView)findViewById(R.id.activity_main);
        view.setLayoutManager(new LinearLayoutManager(this));
        adapter=new ListAdapter();
        view.setAdapter(adapter);
    }
}
