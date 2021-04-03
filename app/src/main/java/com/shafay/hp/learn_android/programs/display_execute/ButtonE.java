package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.shafay.hp.learn_android.R;

public class ButtonE extends AppCompatActivity {

    android.widget.Button b1, b2;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_button);

            b1 = (android.widget.Button) findViewById(R.id.pButton1);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "Welcome to Button 1", Toast.LENGTH_LONG).show();
                    /// /display the text of button2
                }
            });
            b2 = (android.widget.Button) findViewById(R.id.pButton2);
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "Welcome to Button 2", Toast.LENGTH_LONG).show();
                    /// /display the text of button2
                }
            });

        getSupportActionBar().setTitle("Button");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}


