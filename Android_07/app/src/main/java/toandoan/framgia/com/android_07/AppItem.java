package toandoan.framgia.com.android_07;

/**
 * Created by framgia on 21/03/2017.
 */
public class AppItem {
    private int mImageResource;
    private String mTitle;

    public AppItem(int imageResource, String title) {
        mImageResource = imageResource;
        mTitle = title;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public void setImageResource(int imageResource) {
        mImageResource = imageResource;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
