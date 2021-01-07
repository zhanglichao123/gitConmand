package com.example.myapp.baen;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.myapp.BR;

import javax.inject.Inject;

/**
 * 创建时间 2020/11/23
 *
 * @author: zhanglichao
 **/
 public class UserBean extends BaseObservable {
     private String name;
     private int agr;
     @Inject
     public UserBean(){

     }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
   @Bindable
    public int getAgr() {
        return agr;
    }

    public void setAgr(int agr) {
        this.agr = agr;
        notifyPropertyChanged(BR.agr);
    }
}
