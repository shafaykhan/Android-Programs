package com.shafay.hp.learn_android.programs.display_execute;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.view.ViewGroup;

import com.shafay.hp.learn_android.R;

public class ToastE extends AppCompatActivity {
    Button simpleToast, customToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        getSupportActionBar().setTitle("Toast");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        simpleToast = (Button) findViewById(R.id.simpleToast);
        customToast = (Button) findViewById(R.id.customToast);
        // perform setOnClickListener event on simple ToastE Button
        simpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // initiate Implicit_Intent_Code ToastE with message and duration
                android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), "Simple Toast In Android", android.widget.Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show(); // display the ToastE

            }
        });
        // perform setOnClickListener event on custom ToastE Button
        customToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the Layout Inflater and inflate the layout from xml
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast_layout,
                        (ViewGroup) findViewById(R.id.toast_layout_root));
                // get the reference of TextView and ImageVIew from inflated layout
                TextView toastTextView = (TextView) layout.findViewById(R.id.toastTextView);
                ImageView toastImageView = (ImageView) layout.findViewById(R.id.toastImageView);
                // set the text in the TextView
                toastTextView.setText("Custom Toast In Android");
                // set the Image in the ImageView
                toastImageView.setImageResource(R.mipmap.ic_launcher_round);
                // create Implicit_Intent_Code new ToastE using context
                android.widget.Toast toast = new android.widget.Toast(getApplicationContext());
                toast.setDuration(android.widget.Toast.LENGTH_LONG); // set the duration for the ToastE
                toast.setView(layout); // set the inflated layout
                toast.show(); // display the custom ToastE

            }
        });
    }
}




