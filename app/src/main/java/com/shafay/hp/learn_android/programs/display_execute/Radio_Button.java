package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.shafay.hp.learn_android.R;

public class Radio_Button extends AppCompatActivity {
    RadioButton Red, Green, Blue, Yellow, White;
    String selectedColor;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        Red = (RadioButton) findViewById(R.id.Red);
        Green = (RadioButton) findViewById(R.id.Green);
        Blue = (RadioButton) findViewById(R.id.Blue);
        Yellow = (RadioButton) findViewById(R.id.Yellow);
        White = (RadioButton) findViewById(R.id.White);
        submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Green.isChecked()) {
                    selectedColor = Green.getText().toString();
                } else if (White.isChecked()) {
                    selectedColor= White.getText().toString();
                } else if (Red.isChecked()) {
                    selectedColor = Red.getText().toString();
                } else if (Yellow.isChecked()) {
                    selectedColor = Yellow.getText().toString();
                } else if (Blue.isChecked()) {
                    selectedColor =Blue.getText().toString();
                }
                Toast.makeText(getApplicationContext(), selectedColor, Toast.LENGTH_LONG).show(); // print the value of selected Colour

            }
        });

        getSupportActionBar().setTitle("Radio Button ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

