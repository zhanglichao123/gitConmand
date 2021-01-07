package com.example.myapp.uitls;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

/**
 * 创建时间 2020/11/26
 *
 * @author: zhanglichao
 **/
public class GlideUitls {
    private static volatile GlideUitls glideUitls;
    private Context mContext;
    private static RequestManager with;

    private GlideUitls(Context context) {
        mContext = context;
        with = Glide.with(mContext);
    }

    public static GlideUitls initGlideUilts(Context context) {
        if (glideUitls == null) {
            synchronized (GlideUitls.class) {
                if (null == glideUitls) {
                    glideUitls = new GlideUitls(context);

                }
            }
        }
        return glideUitls;
    }

    public static void setImg(ImageView img, String url) {
        with.load(url).into(img);
    }

}
