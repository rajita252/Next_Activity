package com.example.isha.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.next_activity_button1);
         btn.setOnClickListener(new View.OnClickListener()
         {
             @Override


             public void onClick(View View) {

                 Intent intent = new Intent(MainActivity.this, sample.class);


                 startActivity(intent);


             }
         });
    }}
