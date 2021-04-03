package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import com.shafay.hp.learn_android.R;

public class Activity_Life_Cycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_life_cycle);


        getSupportActionBar().setTitle("Activity Life Cycle");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Toast.makeText(getApplicationContext(),"Activity Created",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub

        Toast.makeText(getApplicationContext(),"Start Activity",Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        Toast.makeText(getApplicationContext(),"Resume Activity",Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        Toast.makeText(getApplicationContext(),"Pause the Activity ",Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        Toast.makeText(getApplicationContext(),"Stop Activity",Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(getApplicationContext(),"Restart Activity",Toast.LENGTH_SHORT).show();
        // TODO Auto-generated method stub
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        Toast.makeText(getApplicationContext(),"Destroy Activity",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

}


