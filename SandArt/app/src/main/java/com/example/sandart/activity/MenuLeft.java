//package com.example.sandart.activity;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//
//import com.example.sandart.utils.Round;
//
//
///**
// * Created by qiuncheng on 2015/5/5.
// */
//public class MenuLeft extends Activity implements View.OnClickListener {
//    private Button round1, round2, round3, round4;
//    private Round round = null;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.menu_left);
//
//        initView();
//
//    }
//
//    private void initView() {
//        round1 = (Button) findViewById(R.id.round1);
//        round2 = (Button) findViewById(R.id.round2);
//        round3 = (Button) findViewById(R.id.round3);
//        round4 = (Button) findViewById(R.id.round4);
//        //设置监听事件
//        round1.setOnClickListener(this);
//        round2.setOnClickListener(this);
//        round3.setOnClickListener(this);
//        round4.setOnClickListener(this);
//
//    }
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.round1:
//                //处理事件
//                Log.i("info", "click me !");
//                //绘图没法实现，暂时不用
////                round = new Round(this);
//                Intent intent2 =new Intent(MenuLeft.this, RoundActivity.class);
//                startActivity(intent2);
//                break;
//            case R.id.round2:
//                break;
//            case R.id.round3:
//                break;
//            case R.id.round4:
//                break;
//
//        }
//    }
//
//}
