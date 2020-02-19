package com.example.myfirstloginapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Login extends AppCompatActivity implements View.OnClickListener{

    Button btnLogin1;
    EditText etUsername;
    EditText etPassword1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword1 = (EditText) findViewById(R.id.etPassword1);
        btnLogin1 = (Button) findViewById(R.id.btnLogin1);

        btnLogin1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
        case R.id.btnLogin1:
        }}}