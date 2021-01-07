package com.example.myapp.uitls;

import android.util.Log;

import com.example.myapp.view.Engine;

import javax.inject.Inject;

/**
 * 创建时间 2020/11/23
 *
 * @author: zhanglichao
 **/
public class ChinaEngine implements Engine {
    private static final String TAG = "ChinaEngine";
    @Inject
   public ChinaEngine(){

   }

    @Override
    public void off() {
        Log.e(TAG, "off: "+"offf" );
    }

    @Override
    public void on() {
        Log.e(TAG, "on: " );

    }
}
