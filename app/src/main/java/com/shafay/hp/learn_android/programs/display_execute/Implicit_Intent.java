package com.shafay.hp.learn_android.programs.display_execute;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.shafay.hp.learn_android.R;

public class Implicit_Intent extends AppCompatActivity {
    Button but1,but2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
        getSupportActionBar().setTitle("Implicit Intent");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        but1=(Button)findViewById(R.id.button);
        but1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://basicandroidprogram.blogspot.com"));
                startActivity(i);
            }
        });

        but2=(Button)findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:1234567890"));
                startActivity(i);
            }
        });
    }
}
