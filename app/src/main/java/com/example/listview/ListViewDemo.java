package com.example.listview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;

import utils.LogUtils;

/**
 * Created by guanyifeng on 2016/3/16.
 */
public class ListViewDemo extends AppCompatActivity {
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.listview_demo);
        LogUtils.showLog("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtils.showLog("onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtils.showLog("onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtils.showLog("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtils.showLog("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtils.showLog("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtils.showLog("onDestroy");
    }
}
