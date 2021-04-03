package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.shafay.hp.learn_android.R;

public class Rating_Bar extends AppCompatActivity {
    RatingBar ratingbar1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick(){
        ratingbar1=(RatingBar)findViewById(R.id.ratingBar1);
        button=(Button)findViewById(R.id.button1);
        //Performing action on ButtonE Click
        button.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the ToastE
                String rating=String.valueOf(ratingbar1.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
            }

        });

        getSupportActionBar().setTitle("Rating Bar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}


