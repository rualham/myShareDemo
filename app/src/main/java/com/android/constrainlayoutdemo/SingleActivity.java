package com.android.constrainlayoutdemo;

import android.app.Activity;
import android.os.Bundle;

public class SingleActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CommUtil instance = CommUtil.getInstance(getApplicationContext());
    }
}
