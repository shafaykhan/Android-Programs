package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.shafay.hp.learn_android.R;

public class Custom_Fonts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_fonts);

        getSupportActionBar().setTitle("Custom Fonts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
