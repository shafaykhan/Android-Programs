package com.shafay.hp.learn_android.programs.display_execute;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;

import com.shafay.hp.learn_android.R;

public class Map extends AppCompatActivity {
    Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        getSupportActionBar().setTitle("Map");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        but1=(Button)findViewById(R.id.button);
        but1.setOnClickListener(v -> {
            Uri gmmIntentUri=Uri.parse("geo:37.7749,-122.4194");
            Intent i = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            i.setPackage("com.google.android.apps.maps");
            startActivity(i);
        });
        }
    }



