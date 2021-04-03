package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.shafay.hp.learn_android.R;

public class Animation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        getSupportActionBar().setTitle("Animation");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void zoom(View view){
        ImageView image = (ImageView)findViewById(R.id.imageView);
        android.view.animation.Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom);
        image.startAnimation(animation);
    }

    public void fade(View view){
        ImageView image = (ImageView)findViewById(R.id.imageView);
        android.view.animation.Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade);
        image.startAnimation(animation1);
    }

    public void clockwise(View view){
        ImageView image = (ImageView)findViewById(R.id.imageView);
        android.view.animation.Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        image.startAnimation(animation1);
    }

    public void slide(View view){
        ImageView image = (ImageView)findViewById(R.id.imageView);
        android.view.animation.Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        image.startAnimation(animation1);
    }

    public void move(View view){
        ImageView image = (ImageView)findViewById(R.id.imageView);
        android.view.animation.Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        image.startAnimation(animation1);
    }

    public void blink(View view){
        ImageView image = (ImageView)findViewById(R.id.imageView);
        android.view.animation.Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        image.startAnimation(animation1);
    }
}


