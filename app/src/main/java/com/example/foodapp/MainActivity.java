package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login ;
    Button reg;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //transparent action bar
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS

        );

        getSupportActionBar().hide();
    login=findViewById(R.id.loginbutton);
    reg= findViewById(R.id.cracc2);

    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "Login Clicked", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(MainActivity.this,signin_activity.class);
            startActivity(intent);

        }

    });
    reg.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "Signup Clicked", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(MainActivity.this,signup_activity.class);
            startActivity(intent);
        }
    });
     }
}