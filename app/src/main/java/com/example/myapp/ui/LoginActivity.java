package com.example.myapp.ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.myapp.MyApp;
import com.example.myapp.R;
import com.example.myapp.model.LoginViewModel;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {
    @Inject
    LoginViewModel loginViewModel;
    private String TAG = "LoginActivity";
    private TextView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ((MyApp) getApplicationContext()).applicationComponent.inject(this);
        Lifecycle lifecycle = getLifecycle();
        viewById = findViewById(R.id.text2s);

    }

    @Override
    protected void onResume() {
        super.onResume();
        //     AlertDialog alertDialog = new AlertDialog.Builder(this).setTitle("12324123").show();
        PopupWindow popupWindow = new PopupWindow();
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        TextView textView = new TextView(this);
        textView.setText("zhanghafn");
        linearLayout.addView(textView);
        popupWindow.setContentView(linearLayout);
        popupWindow.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.showAsDropDown(viewById);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: ");
    }
}