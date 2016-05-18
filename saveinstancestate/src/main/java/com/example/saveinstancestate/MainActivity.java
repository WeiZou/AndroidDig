package com.example.saveinstancestate;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

public class MainActivity extends FragmentActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    private FrameLayout fl_container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fl_container = (FrameLayout) findViewById(R.id.fl_container);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fl_container,new MyFragment()).commit();
        Log.e(TAG,this + "--->"+"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,this + "--->"+"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,this + "--->"+"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,this + "--->"+"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,this + "--->"+"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,this + "--->"+"onDestroy");
    }
}
