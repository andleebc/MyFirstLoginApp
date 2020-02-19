package com.example.myfirstloginapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {

    Button btnRegister;
    EditText etFirstName;
    EditText etLastName;
    EditText etDOB;
    EditText etPassword1;

    EditText etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etFirstName = (EditText) findViewById(R.id.etFirstName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        etDOB = (EditText) findViewById(R.id.etDOB);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword1 = (EditText) findViewById(R.id.etPassword1);
        btnRegister = (Button) findViewById(R.id.btnRegister);
    }
   /* public final static boolean isValidEmail(CharSequence etEmail) {
        if (etEmail == null)
            return false;
        return android.util.Patterns.EMAIL_ADDRESS.matcher(etEmail).matches();
    } */
    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btnRegister:
                if (etFirstName.length() < 3 || etFirstName.length() == 0) {
                    etFirstName.setError("Error! Enter a first name with more than 3 characters");
                } else if (etLastName.length() < 3 || etLastName.length() == 0) {
                    etLastName.setError("Error! Enter a last name with more than 3 characters");
                } else if (etDOB.length() < 8 || etDOB.length() == 0) {
                    etDOB.setError("Error! Enter a correct birthday in this format: MM-DD-YY");
                } else if (etPassword1.length() < 6 || etDOB.length() == 0) {
                    etPassword1.setError("Error! Enter a password that is atleast 6 characters");
                } else {
                    startActivity(new Intent(this, MainActivity.class));

                }
        }

    }}
