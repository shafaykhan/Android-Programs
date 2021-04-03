package com.shafay.hp.learn_android.programs.display_execute;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.shafay.hp.learn_android.R;

import com.shafay.hp.learn_android.examples.common.util.MyService;


public class Service_Life_Cycle extends AppCompatActivity {
    String msg = "Android : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_life_cycle);


        getSupportActionBar().setTitle("Service Life Cycle");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Log.d(msg, "The onCreate() event");
    }

    public void startService(View view) {
        startService(new Intent(getBaseContext(), MyService.class));
    }

    // Method to stop the service
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), MyService.class));
    }
}



