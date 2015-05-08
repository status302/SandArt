package com.example.sandart.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends Activity {
    private Button button_left;
    private Button button_right;

    private LinearLayout menu_left;
    static WindowManager.LayoutParams wmParams;
    WindowManager mWindowManager;
    LinearLayout mFloatLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();

        button_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppearLeft();

//                Log.i("info", "button left");
//                Intent i1 = new Intent(MainActivity.this, MenuLeft.class);
//                startActivity(i1);
            }
        });

        button_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("info", "button right");
                Intent i2 = new Intent(MainActivity.this, MenuRight.class);
                startActivity(i2);
            }
        });
    }

    private void findView() {
        button_left = (Button) findViewById(R.id.button1);
        button_right = (Button) findViewById(R.id.button2);

        menu_left = (LinearLayout) findViewById(R.id.menu_left);
    }


    public void AppearLeft() {

        wmParams = new WindowManager.LayoutParams();
        // 获取的是WindowManagerImpl.CompatModeWrapper
        mWindowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);

//        Log.i("123", "mWindowManager--->" + mWindowManager);
        // 设置window type
        wmParams.type = WindowManager.LayoutParams.TYPE_PHONE;
        // 设置图片格式，效果为背景透明
        wmParams.format = PixelFormat.RGBA_8888;
        // 设置浮动窗口不可聚焦（实现操作除浮动窗口外的其他可见窗口的操作）
        wmParams.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        // 调整悬浮窗显示的停靠位置为左侧置顶
        wmParams.gravity = Gravity.LEFT | Gravity.BOTTOM;
        // 以屏幕左上角为原点，设置x、y初始值，相对于gravity
        wmParams.x = 0;
        wmParams.y = 0;
        LayoutInflater inflater = LayoutInflater.from(getApplication());
        mFloatLayout = (LinearLayout) inflater.inflate(R.layout.menu_left,
                null);
        ViewTreeObserver vto = mFloatLayout.getViewTreeObserver();


        //获取menu_left控件的width与height
//        int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
//        int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
//        Log.i("info", "  " + w);
//        menu_left.measure(w, h);
//        int height = menu_left.getMeasuredHeight();
//        int width = menu_left.getMeasuredWidth();
//        Log.i("info", "i am " + height);
        wmParams.width = 415;
        wmParams.height = 560;


        // 获取浮动窗口视图所在布局

        mWindowManager.addView(mFloatLayout, wmParams);


    }
}
