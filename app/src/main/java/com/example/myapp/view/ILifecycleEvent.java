package com.example.myapp.view;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

/**
 * 创建时间 2020/12/12
 *
 * @author: zhanglichao
 **/
public class ILifecycleEvent extends Lifecycle {
    @Override
    public void addObserver(@NonNull LifecycleObserver observer) {

    }

    @Override
    public void removeObserver(@NonNull LifecycleObserver observer) {

    }

    @NonNull
    @Override
    public State getCurrentState() {
        return null;
    }

    public enum Ve{
      ON_ONCREATE,
     ON_TERMINATE,


    }



}
