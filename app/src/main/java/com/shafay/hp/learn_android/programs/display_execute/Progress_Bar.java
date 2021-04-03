package com.shafay.hp.learn_android.programs.display_execute;

import android.app.ProgressDialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.shafay.hp.learn_android.R;

public class Progress_Bar extends AppCompatActivity {

    Button b1;
    private ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        b1 = (Button) findViewById(R.id.p2button2);
    }

    public void download(View view) {
        progress = new ProgressDialog(this);
        progress.setMessage("Progress Bar Start");
        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progress.setIndeterminate(true);
        progress.setProgress(0);
        progress.show();


        final int totalProgressTime = 100;
        final Thread t = new Thread() {
            @Override
            public void run() {
                int jumpTime = 0;

                while (jumpTime < totalProgressTime) {
                    try {
                        sleep(200);
                        jumpTime += 10;
                        progress.setProgress(jumpTime);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();

        getSupportActionBar().setTitle("Progress Bar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}

