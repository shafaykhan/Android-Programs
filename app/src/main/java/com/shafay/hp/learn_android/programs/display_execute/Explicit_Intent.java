package com.shafay.hp.learn_android.programs.display_execute;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.shafay.hp.learn_android.R;


public class Explicit_Intent extends AppCompatActivity {
    Button explicit_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        getSupportActionBar().setTitle("Explicit Intent");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        explicit_btn = (Button)findViewById(R.id.explicit_Intent);
        //implement Onclick event for Explicit Intent
        explicit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getBaseContext(), IntentActivity.class);
                startActivity(intent);
            }
        });

    }
}


