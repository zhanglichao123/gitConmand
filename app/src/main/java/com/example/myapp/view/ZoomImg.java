package com.example.myapp.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * 创建时间 2020/12/16
 *
 * @author: zhanglichao
 **/
public class ZoomImg extends androidx.appcompat.widget.AppCompatImageView {

    private Context mContext;
    private float beforeScale=1.0f;//之前的伸缩值
    private float nowScale;//当前的伸缩值



//
//    final ScaleGestureDetector scaleGestureDetector=  new ScaleGestureDetector(mContext, new ScaleGestureDetector.OnScaleGestureListener() {
//        @Override
//        public boolean onScale(ScaleGestureDetector detector) {
//            nowScale=detector.getScaleFactor()*beforeScale;
//            //设置缩放的范围
//            if (nowScale>3||nowScale<0.1){
//                beforeScale=nowScale;
//                return true;
//            }
//            Log.i("Scale","nowScale="+nowScale);
//            Matrix matrix=new Matrix();
//            matrix.setScale(nowScale,nowScale);
//            Drawable background = getBackground();
////            Bitmap bitmap = getDrawingCache();
////
////            //Bitmap bitmap= BitmapFactory.decodeResource(getResources(), R.drawable.myphoto);//获取图片
////
////            bitmap= Bitmap.createBitmap(bitmap,0,0,bitmap.getWidth(),bitmap.getHeight(),matrix,true);//转化成bitmap格式
////            setImageBitmap(bitmap);
////            beforeScale=nowScale;//保存上一次的缩放值！
//            return false;
//        }
//
//        @Override
//        public boolean onScaleBegin(ScaleGestureDetector detector) {
//            return false;
//        }
//
//        @Override
//        public void onScaleEnd(ScaleGestureDetector detector) {
//
//        }
//    });

    public ZoomImg(@NonNull Context context) {
        this(context,null);
    }

    public ZoomImg(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ZoomImg(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOnTouchListener(new View.OnTouchListener() {
            @Override

            public boolean onTouch(View v, MotionEvent event) {

                return true;
            }
        });
    }
}
