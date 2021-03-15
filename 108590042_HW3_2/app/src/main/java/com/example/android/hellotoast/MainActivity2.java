package com.example.android.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView mHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mHello = (TextView) findViewById(R.id.hello_toast_count);

        Intent intent = getIntent();
        int recvCount = intent.getIntExtra(MainActivity.EXTRA_COUNT, -1);

        mHello.setText(Integer.toString(recvCount));
    }
}