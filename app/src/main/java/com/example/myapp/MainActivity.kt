package com.example.myapp

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.Observable
import androidx.databinding.ViewDataBinding
import com.example.myapp.baen.UserBean
import com.example.myapp.databinding.ActivityMainBinding
import com.example.myapp.uitls.ChinaCar
import com.example.myapp.uitls.Image
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
//import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
//import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit
import java.util.function.Consumer
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userBean: UserBean

    @Inject
    lateinit var chinaCar: ChinaCar

    @Inject
    lateinit var iamgurl: Image
    var i = 0
    var isImae = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //  setContentView(R.layout.activity_main)
        lifecycle.addObserver(MyObserver())
        val contentView =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        contentView.user = userBean
        contentView.setListener {
            userBean.agr = 12
            userBean.name = "zhang"
            chinaCar.engine.off()
        }
        iamgurl.url =
            "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png"
        contentView.imgar = iamgurl
        //
        imagev.setOnClickListener {
            if (isImae) {
                iamgurl.url = "https://ae01.alicdn.com/kf/U263dd43ef1254f73b0dddac9562dc9bcB.jpg"
                isImae = !isImae
            } else {
                iamgurl.url =
                    "https://ae01.alicdn.com/kf/U3061240eed18487ab39fd4a36712ddc3y.jpg"
                isImae = !isImae
            }
        }
        val arrayListOf = arrayListOf<String>(
            "https://ae01.alicdn.com/kf/U263dd43ef1254f73b0dddac9562dc9bcB.jpg",
            "https://ae01.alicdn.com/kf/U3061240eed18487ab39fd4a36712ddc3y.jpg",
            "https://ae01.alicdn.com/kf/U263dd43ef1254f73b0dddac9562dc9bcB.jpg"
        )
        contentView.listImg = arrayListOf
//        io.reactivex.rxjava3.core.Observable.interval(3, TimeUnit.SECONDS)
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe {
//                i++
//                contentView.index = i % arrayListOf.size
//                Log.e("zhang",(i % arrayListOf.size).toString())
//            }
//
//        io.reactivex.rxjava3.core.Observable.timer(5,TimeUnit.SECONDS).subscribeOn(Schedulers.io())
//            .doOnNext {
//                Log.e("wang","---doOnNext")
//            }
//            .observeOn(AndroidSchedulers.mainThread())
//            .doOnSubscribe {
//                Log.e("wang","---doOnSubscribe")
//            }.subscribe {
//                Log.e("wang","---subscribe")
//            }

    }


}
