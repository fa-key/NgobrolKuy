package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void handleOpen(View view) {
        Intent move = new Intent(LoginActivity.this, ProfilePicActivity.class);
        startActivity(move);
    }

    public void handleRegister(View view) {
        Intent move = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(move);
    }

}