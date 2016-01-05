//package com.example.android.sunshine.app;
//
//import android.content.Context;
//import android.graphics.Paint;
//import android.util.AttributeSet;
//import android.view.View;
//
///**
// * Creating a custom view because I can
// */
//public class MyView extends View {
//
//    Paint paint = new Paint();
//
//    public MyView(Context context) {
//        super(context);
//    }
//
//    public MyView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    public MyView(Context context, AttributeSet attrs, int DefaultStyle) {
//        super(context, attrs, DefaultStyle);
//    }
//
//    @Override
//    protected void onMeasure(int wMeasureSpec, int hMeasureSpec) {
//        int hSpecMode = MeasureSpec.getMode(hMeasureSpec);
//        int hSpecSize = MeasureSpec.getSize(hMeasureSpec);
//        int myHeight = hSpecSize;
//
//        if (hSpecMode == MeasureSpec.EXACTLY) {
//            myHeight = hSpecSize;
//        } else if (hSpecMode == MeasureSpec.AT_MOST) {
//
//        }
//    }
//
//}