package com.example.saveinstancestate;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by wei on 16/5/18.
 */
public class MyFragment extends Fragment{
    private static final String TAG = MyFragment.class.getSimpleName();

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.w(TAG,this + "--->"+"onAttach");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.w(TAG,this +"--->"+ "onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.w(TAG,this + "--->"+"onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.w(TAG,this + "--->"+"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.w(TAG,this + "--->"+"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.w(TAG,this + "--->"+"onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.w(TAG,this + "--->"+"onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.w(TAG,this + "--->"+"onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.w(TAG,this + "--->"+"onDetach");
    }
}
