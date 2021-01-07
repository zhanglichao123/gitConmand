package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import com.samton.IBenRobotSDK.core.IBenRecordUtil;
import com.samton.IBenRobotSDK.interfaces.IBenRecordCallBack;
import com.samton.IBenRobotSDK.utils.LogUtils;

public class WabActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wab);
        button = findViewById(R.id.recognize);
        textView = findViewById(R.id.recognoze_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //处理数据
                processingData();
            }
        });
        IBenRecordUtil.getInstance().init(this);
        IBenRecordUtil.getInstance().setCallBack(new IBenRecordCallBack() {
            @Override
            public void onBeginOfSpeech() {

            }

            @Override
            public void onVolumeChanged(int i, byte[] bytes) {

            }

            @Override
            public void onEndOfSpeech(String s, String s1) {
                LogUtils.e(s+"===="+s1);
                textView.setText(s);
            }
        });
    }

    private void processingData() {
        IBenRecordUtil.getInstance().startRecognize();
    }
}