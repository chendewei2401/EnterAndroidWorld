package com.example.chendw.myapplication.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.chendw.myapplication.R;

/**
 * Created by chendw on 2018/3/29.
 */

public class NetWorkBroadcast extends AppCompatActivity {

    private IntentFilter filter;

    private NetWorkChangeReceiver netWorkBroadcast;

    private static final String TAG = "NetWorkBroadcast";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_bc);

        Log.e(TAG, "onCreate: ===============asdfafad=");

        filter = new IntentFilter();
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        netWorkBroadcast = new NetWorkChangeReceiver();
        registerReceiver(netWorkBroadcast, filter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(netWorkBroadcast);
    }

    class NetWorkChangeReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {

            ConnectivityManager manager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo info = manager.getActiveNetworkInfo();

            if (info != null && info.isAvailable()) {
                Log.e(TAG, "onReceive: " + info.toString());
                Toast.makeText(context, info.toString(), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "network changed", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
