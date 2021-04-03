package com.shafay.hp.learn_android.programs.display_execute;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shafay.hp.learn_android.R;

import java.util.Objects;

public class CustomDialogExecute extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog_excecute);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Custom Dialog");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //attaching click listener
        findViewById(R.id.buttonShowDialog).setOnClickListener(v -> {
            //calling this method to show our android custom alert dialog
            showCustomDialog();
        });
    }

    private void showCustomDialog() {
        //before inflating the custom alert dialog layout, we will get the current activity viewgroup
        ViewGroup viewGroup = findViewById(android.R.id.content);
        //then we will inflate the custom alert dialog xml that we created
        View dialogView = LayoutInflater.from(this).inflate(R.layout.my_dialog, viewGroup, false);
        //Now we need an AlertDialog.Builder object
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //setting the view of the builder to our custom view that we already inflated
        builder.setView(dialogView);
        //finally creating the alert dialog and displaying it
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}