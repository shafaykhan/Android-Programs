package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.shafay.hp.learn_android.R;

public class Text_View extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        getSupportActionBar().setTitle("Text View");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
