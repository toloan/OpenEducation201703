package com.example.asus.recycleview;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by ASUS on 3/22/2017.
 */

public class BigListItem {
   private RecyclerView SmallList;

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public RecyclerView getSmallList() {
        return SmallList;
    }

    public void setSmallList(RecyclerView smallList) {
        SmallList = smallList;
    }

    private String section;
   private ArrayList<App_infor> list;


   public ArrayList<App_infor> getList() {
        return list;
    }

    public void setList(ArrayList<App_infor> list) {
        this.list = list;
    }
}
