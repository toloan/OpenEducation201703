package com.example.asus.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 3/22/2017.
 */

public class SListAdapter extends RecyclerView.Adapter<SListAdapter.ViewHolder> {
    private List<App_infor> mAppItems = new ArrayList<>();

 public void setmAppItems(List<App_infor> mAppItems) {
        this.mAppItems = mAppItems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // App_infor item = mAppItems.get(position);
    }

    @Override
    public int getItemCount() {
        return 10;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView Appname;
        private ImageView mImageAvatar;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageAvatar = (ImageView) itemView.findViewById(R.id.imageView2);
            Appname = (TextView) itemView.findViewById(R.id.textView2);

        }

        public void bindData(App_infor item) {
            Appname.setText(item.getName());
            mImageAvatar.setImageResource(item.getSource());
        }
    }
}
