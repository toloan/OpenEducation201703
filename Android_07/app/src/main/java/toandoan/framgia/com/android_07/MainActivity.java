package toandoan.framgia.com.android_07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerStore;
    private StoreAdapter mAdapter;
    private List<AppItem> mAppItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerStore = (RecyclerView) findViewById(R.id.recycler_store);
        // 1. Set Layout manager
        mRecyclerStore.setLayoutManager(new LinearLayoutManager(this));

        // 2. Khoi tao adapter
        mAppItems = new ArrayList<>();
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo nhan gui yeu thuong1"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo nhan gui yeu thuong2"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo nhan gui yeu thuong3"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo nhan gui yeu thuong4"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo nhan gui yeu thuong5"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo nhan gui yeu thuong6"));
        mAppItems.add(new AppItem(R.mipmap.ic_launcher, "Zalo nhan gui yeu thuong7"));
        mAdapter = new StoreAdapter(mAppItems);

        // 3. set adapter cho recycler view
        mRecyclerStore.setAdapter(mAdapter);

    }
}
