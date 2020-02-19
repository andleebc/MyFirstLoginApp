package com.example.myfirstloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Begin extends AppCompatActivity implements View.OnClickListener {

    TextView tvLogin;
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);

        tvRegister = (TextView)findViewById(R.id.tvRegister);
        tvLogin = (TextView)findViewById(R.id.tvLogin);

        tvRegister.setOnClickListener(this);
        tvLogin.setOnClickListener(this);}

    @Override
    public void onClick(View view) {
        switch(view.getId()){

            case R.id.tvLogin:
                startActivity(new Intent(this, Login.class));
                break;
            case R.id.tvRegister:
                startActivity(new Intent(this, Register.class ));
                break;

        }

    }}




