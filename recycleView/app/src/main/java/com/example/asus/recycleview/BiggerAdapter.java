package com.example.asus.recycleview;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 3/22/2017.
 */

public class BiggerAdapter extends RecyclerView.Adapter<BiggerAdapter.ViewHolder> {
    private List<BigListItem> mAppItems = new ArrayList<>();

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.small_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if(mAppItems.size()!=0)
             holder.bindData(mAppItems.get(position));
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView section;
        private RecyclerView slist;
        private SListAdapter adapter;
        private LinearLayoutManager manager;

        public ViewHolder(View itemView) {
            super(itemView);
            adapter = new SListAdapter();
            slist = (RecyclerView) itemView.findViewById(R.id.slist);
            section = (TextView) itemView.findViewById(R.id.textView);
            manager = new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false);
            slist.setLayoutManager(manager);
            slist.setAdapter(adapter);

        }

        public void bindData(BigListItem item) {
            // ArrayList<App_infor> list=new ArrayList<>();
            section.setText("section");

           // slist.setLayoutManager(manager);
            adapter.setmAppItems(item.getList());
            if(item.getList().size()!=0){
                adapter.setmAppItems(item.getList());
            //adapter=new SListAdapter(itemView.getContext(),R.layout.item,item.getList());
              section.setText("section"+Integer.toString(mAppItems.indexOf(item)));
             }
            slist.setAdapter(adapter);
        }
    }
}

