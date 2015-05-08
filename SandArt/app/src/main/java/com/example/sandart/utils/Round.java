package com.example.sandart.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by qiuncheng on 2015/5/6.
 */
public class Round extends View implements Runnable {

    private Paint mPaint = null;

    private int edWidth = getWidth();
    private int edHeight = getHeight();
//    private Round roundView;

    public Round(Context context) {
        super(context);
        mPaint = new Paint();
//        roundView = new Round(context);
        //开启线程
        new Thread(this).start();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画布的颜色。
        canvas.drawColor(Color.GRAY);
        //设置取消锯齿效果
        mPaint.setAntiAlias(false);
        mPaint.setColor(Color.GREEN);
        //绘制图形
//        mPaint.setStyle(Paint.Style.STROKE);{
        canvas.drawCircle(50, 50, 50, mPaint);
//        }
        //添加到当前View
//        roundView.draw(canvas);
    }


    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            postInvalidate();
        }
    }
}
