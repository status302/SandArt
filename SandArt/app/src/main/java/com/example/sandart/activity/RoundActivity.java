package com.example.sandart.activity;

import android.app.Activity;
import android.os.Bundle;

import com.example.sandart.utils.Round;

/**
 * Created by qiuncheng on 2015/5/7.
 */
public class RoundActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Round(this));
    }
}
