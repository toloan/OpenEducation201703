package toandoan.framgia.com.android_07;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by framgia on 21/03/2017.
 */
public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.ViewHolder> {
    private List<AppItem> mAppItems;

    public StoreAdapter(List<AppItem> appItems) {
        mAppItems = appItems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Hàm cho phép tạo ra 1 view mới
        View v = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_store, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // TODO: 21/03/2017 fill data to recyclerview
        // 1 laays ra object tai vi tri thu position
        AppItem item = mAppItems.get(position);
        holder.bindData(item);
    }

    @Override
    public int getItemCount() {
        // Số lượng item có trong recycler view
        return mAppItems.size();
    }

    // 1 tạo class view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextTitle;
        private ImageView mImageAvatar;

        public ViewHolder(View itemView) {
            super(itemView);
            mTextTitle = (TextView) itemView.findViewById(R.id.text_title);
            mImageAvatar = (ImageView) itemView.findViewById(R.id.image_avatar);
        }

        public void bindData(AppItem item) {
            mTextTitle.setText(item.getTitle());
            mImageAvatar.setImageResource(item.getImageResource());
        }
    }
}

