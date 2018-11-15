package com.codepath.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button signUp = findViewById(R.id.signUp);
        Button signIn = findViewById(R.id.signIn);

        signUp.setOnClickListener(this);
        signIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signIn:
                Toast.makeText(this, "Sign In!", Toast.LENGTH_SHORT).show();
                openSignin();
                break;
            case R.id.signUp:
                Toast.makeText(this, "Sign Up!", Toast.LENGTH_SHORT).show();
                openSignup();
                break;
        }
    }
    public void openSignin(){
        Intent intent = new Intent(this, stream.class);
        startActivity(intent);
    }
    public void openSignup(){
        Intent intent = new Intent(this, signUp.class);
        startActivity(intent);
    }
}