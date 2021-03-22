package edu.ntut.uwu.a108590042_hw4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mCount != 0)
        {
            outState.putInt("mCount", mCount);
            Log.d(LOG_TAG, "save the count");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        if (savedInstanceState != null)
        {
            mCount = savedInstanceState.getInt("mCount", 0);
            mShowCount.setText(Integer.toString(mCount));
            Log.d(LOG_TAG, "restore the count");
        }
    }

    public void countUp(View view) {
        mCount ++;
        mShowCount.setText(Integer.toString(mCount));
        Log.d(LOG_TAG, "count");
    }
}