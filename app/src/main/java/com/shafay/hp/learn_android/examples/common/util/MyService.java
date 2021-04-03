package com.shafay.hp.learn_android.examples.common.util;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import android.widget.Toast;
import androidx.annotation.Nullable;

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Let it continue running until it is stopped.
        Toast.makeText(this, "Service Started..", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed..", Toast.LENGTH_SHORT).show();
    }
}
