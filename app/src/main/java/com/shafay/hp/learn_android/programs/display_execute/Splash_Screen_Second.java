package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.shafay.hp.learn_android.R;

public class Splash_Screen_Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_second);

        getSupportActionBar().setTitle("Splash Screen");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
