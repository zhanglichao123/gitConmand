package com.example.myapp.uitls;

import android.widget.ImageView;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.Observable;

import com.example.myapp.BR;

import javax.inject.Inject;

import dagger.Binds;

/**
 * 创建时间 2020/11/23
 *
 * @author: zhanglichao
 **/
public class Image extends BaseObservable {
    private String url;

    @Inject
    public Image() {


    }

    @Bindable
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
        notifyPropertyChanged(BR.url);
    }

    @BindingAdapter({"url"})
    public static void loadImage(ImageView view, String url) {
        GlideUitls.setImg(view, url);
    }
}
