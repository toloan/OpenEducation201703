package toandoan.framgia.com.android_06;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
    View.OnLongClickListener {
    private Button mButtonTouchMe;
    private Button mButtonSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonTouchMe = (Button) findViewById(R.id.button_touch_me);
        mButtonSecond = (Button) findViewById(R.id.button_second);
        mButtonTouchMe.setOnClickListener(this);
        mButtonTouchMe.setOnLongClickListener(this);
        mButtonSecond.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this,
                        "mButtonSecond clicked", Toast.LENGTH_SHORT)
                        .show();
                }
            }
        );
    }

    public void touchMeClick(View v){

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "mButtonTouchMe clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onLongClick(View view) {
        Toast.makeText(this, "mButtonTouchMe onLongClick", Toast.LENGTH_SHORT).show();
        return false;
    }
}
