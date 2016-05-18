package com.example.schemedetection;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity {
    public static final String TAG = MainActivity.class.getSimpleName();
    Button btnSendScheme ;
    EditText et_scheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_scheme = (EditText) findViewById(R.id.tv_scheme);
        btnSendScheme = (Button)findViewById(R.id.btn_send_scheme);
        btnSendScheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAppInstalled(MainActivity.this,et_scheme.getText().toString())) {
                    Toast.makeText(MainActivity.this,"find the dealer",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"don't find the dealer",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean resolveIntentByPackageManager(Context context, String scheme ){
        Intent intent = new Intent();
        intent.setData(Uri.parse(scheme));
        return context.getPackageManager().resolveActivity(intent, PackageManager.MATCH_ALL) != null;
    }

    private boolean isAppInstalled(Context context,String pkgName){
        List<PackageInfo> packages = context.getPackageManager().getInstalledPackages(0);
        if(packages != null){
            for(PackageInfo packageInfo:packages){
                if(!TextUtils.isEmpty(packageInfo.packageName) && packageInfo.packageName.contains(pkgName)){
                    Log.e(TAG,packageInfo.packageName);
                    return true;
                }
            }
        }
        return false;
    }
}
