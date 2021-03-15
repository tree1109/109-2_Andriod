/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.scrollingtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * This app displays a scrollable TextView (a magazine article).
 * All changes were made to the layout. No code changes.
 * The code below is part of the Empty Activity template.
 */

public class MainActivity extends AppCompatActivity {
    private int count_cute = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cute_function(View view) throws InterruptedException {
        Button cute_button = (Button) view;
        cute_button.setBackgroundColor(getResources().getColor(R.color.colorCute_default));
        count_cute ++;
        switch (count_cute) {
            case 1:
                cute_button.setText("WOW!! you click me once!");
                break;
            case 2:
                cute_button.setText("WOW!! you click me twice!");
                break;
            case 3:
                cute_button.setText("yeah you click me 3 times.");
                break;
            case 50:
                cute_button.setText("Congratulations!!! You click " + count_cute + " times.");
                cute_button.setBackgroundColor(getResources().getColor(R.color.colorCute_2nd));
                break;
            case 51:
                cute_button.setText("Set count to Zero");
                cute_button.setBackgroundColor(getResources().getColor(R.color.colorCute_2nd));
                count_cute = 0;
                break;
            default:
                cute_button.setText("well. you click me " + count_cute + " times.");
                break;
        }
    }
}
