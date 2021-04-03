package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.shafay.hp.learn_android.R;


public class Time_Picker extends AppCompatActivity {
    TextView textview1;
    TimePicker timepicker;
    Button changetime;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        textview1=(TextView)findViewById(R.id.textView1);
        timepicker=(TimePicker)findViewById(R.id.timePicker);
        getSupportActionBar().setTitle("Time Picker");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        timepicker.setIs24HourView(true);
        changetime=(Button)findViewById(R.id.button1);

        textview1.setText(getCurrentTime());

        changetime.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                textview1.setText(getCurrentTime());


            }
        });

    }

    public String getCurrentTime() {
        String currentTime = "Selected Time: " + timepicker.getCurrentHour() + ":" + timepicker.getCurrentMinute();
        return currentTime;



    }

}