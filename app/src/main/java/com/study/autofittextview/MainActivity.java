package com.study.autofittextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.study.library.AutoFitTextView;

public class MainActivity extends AppCompatActivity {
    private AutoFitTextView mTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv = (AutoFitTextView) findViewById(R.id.tv_auto);
        mTv.setText("随意随意随意随意");
    }
}
