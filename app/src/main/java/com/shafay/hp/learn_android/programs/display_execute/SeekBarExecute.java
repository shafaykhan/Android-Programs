package com.shafay.hp.learn_android.programs.display_execute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

import com.shafay.hp.learn_android.R;

import java.util.Objects;

public class SeekBarExecute extends AppCompatActivity {

    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar_execute);

        Objects.requireNonNull(getSupportActionBar()).setTitle("SeekBar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                Toast.makeText(getApplicationContext(), "SeekBar Progress: " + progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "SeekBar Touch Started!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "SeekBar Touch Stopped!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
