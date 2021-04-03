package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.shafay.hp.learn_android.R;

public class Frame_Layout extends AppCompatActivity {
    LinearLayout[] liners=new LinearLayout[3];
    View.OnClickListener butHandler=new View.OnClickListener(){
        @Override
        public void onClick(View view){
            switch (view.getId()){
                case R.id.but1:
                    liners[0].setVisibility(View.VISIBLE);
                    liners[1].setVisibility(View.INVISIBLE);
                    liners[2].setVisibility(View.INVISIBLE);
                    break;
                case R.id.but2:
                    liners[0].setVisibility(View.INVISIBLE);
                    liners[1].setVisibility(View.VISIBLE);
                    liners[2].setVisibility(View.INVISIBLE);
                    break;
                case R.id.but3:
                    liners[0].setVisibility(View.INVISIBLE);
                    liners[1].setVisibility(View.INVISIBLE);
                    liners[2].setVisibility(View.VISIBLE);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        getSupportActionBar().setTitle("Frame Layout");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button[] buts = new Button[3];
        for (int i = 0; i < buts.length; i++) {
            buts[i] = (Button) findViewById(R.id.but1 + i);
            liners[i] = (LinearLayout) findViewById(R.id.line1 + i);
            buts[i].setOnClickListener(butHandler);
        }

    }
}







