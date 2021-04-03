package com.shafay.hp.learn_android.programs.display_execute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.shafay.hp.learn_android.R;

import java.util.Objects;

public class SpinnerExecute extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] country = {"India", "United States of America", "United Kingdom",
            "United Arab Emirates", "Australia", "Russia", "China", "Japan",
            "Africa", "Other"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_execute);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Spinner");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), country[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}