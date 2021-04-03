package com.shafay.hp.learn_android.programs.display_execute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;
import com.shafay.hp.learn_android.R;

import java.util.Objects;

public class SnackBarExecute extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar_execute);

        Objects.requireNonNull(getSupportActionBar()).setTitle("SnackBar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button = findViewById(R.id.callbackButton);
        button.setOnClickListener(v -> {
            // Button was clicked/tapped
            View view = findViewById(R.id.callbackButton);
            String message = "Snackbar message example displayed";
            int duration = Snackbar.LENGTH_SHORT;

            showSnackbar(view, message, duration);
        });
    }

    public void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view, message, duration).show();
    }
}