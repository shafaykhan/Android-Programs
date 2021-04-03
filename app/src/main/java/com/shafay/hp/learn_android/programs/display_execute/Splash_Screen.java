package com.shafay.hp.learn_android.programs.display_execute;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.shafay.hp.learn_android.R;

import java.util.Timer;
import java.util.TimerTask;

public class Splash_Screen extends AppCompatActivity {
    TextView textView;
    private Timer timer;
    private ProgressBar progressBar;
    private int i=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().setTitle("Splash Screen");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        progressBar.setProgress(0);
        textView=(TextView)findViewById(R.id.textView);
        textView.setText("");

        final long period = 100;
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (i<100){
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            textView.setText(String.valueOf(i)+"%");
                        }
                    });
                    progressBar.setProgress(i);
                    i++;
                }else{

                    timer.cancel();
                    Intent intent = new Intent(Splash_Screen.this, Splash_Screen_Second.class);
                    startActivity(intent);

                    finish();
                }
            }
        }, 0, period);
    }

}
