 package com.example.myfirstloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     Button btnBegin;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         btnBegin = (Button)findViewById(R.id.btnBegin);
         btnBegin.setOnClickListener(this);

     }
         @Override
         public void onClick(View view){
             switch(view.getId()) {
                 case R.id.btnBegin:
                     startActivity(new Intent(this, Begin.class));
             }


         }
     }




