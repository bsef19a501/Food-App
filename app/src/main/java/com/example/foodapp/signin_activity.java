package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signin_activity extends AppCompatActivity {
    Button signinbtmbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        getSupportActionBar().setTitle("Sign In");
        signinbtmbtn=findViewById(R.id.login_btm_btn);
        signinbtmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(signin_activity.this,signup_activity.class);
                startActivity(intent);
            }
        });
    }
}