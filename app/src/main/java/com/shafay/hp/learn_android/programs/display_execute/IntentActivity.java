package com.shafay.hp.learn_android.programs.display_execute;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.shafay.hp.learn_android.R;

public class IntentActivity extends AppCompatActivity {
    Button explicit_btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent_second);
        getSupportActionBar().setTitle("Explicit Intent");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                Toast.makeText(getApplicationContext(), "We are moved to Second Activity",Toast.LENGTH_LONG).show();
        explicit_btn2 = (Button)findViewById(R.id.explicit_Intent2);
        explicit_btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        Explicit_Intent.class);
                startActivity(i);
            }
        });
    }
            }


