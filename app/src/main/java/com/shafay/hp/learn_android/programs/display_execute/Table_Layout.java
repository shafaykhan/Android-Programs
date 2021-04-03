package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.shafay.hp.learn_android.R;

public class Table_Layout extends AppCompatActivity {

    EditText editTextUserName, editTextUserPassword;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        getSupportActionBar().setTitle("Table Layout");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editTextUserName = findViewById(R.id.userName);
        editTextUserPassword = findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.loginBtn);

        loginButton.setOnClickListener(v -> {
            if (validateForm()) {
                Toast.makeText(getApplicationContext(), "Login Successful.....", Toast.LENGTH_SHORT).show();  // display Toast message
            } else {
                Toast.makeText(getApplicationContext(), "Login Failed.....", Toast.LENGTH_SHORT).show();  // display Toast message
            }
        });

    }

    public boolean validateForm() {
        final String userName = editTextUserName.getText().toString();
        final String password = editTextUserPassword.getText().toString();

        //  click event on the login button
        if (TextUtils.isEmpty(userName)) {
            editTextUserName.setError("Please enter your user name");
            editTextUserName.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(password)) {
            editTextUserPassword.setError("Please enter your password");
            editTextUserPassword.requestFocus();
            return false;
        }
        if (password.length() < 6) {
            editTextUserPassword.setError("Password should be at least 6 character long");
            editTextUserPassword.requestFocus();
            return false;
        }
        return true;
    }
}
