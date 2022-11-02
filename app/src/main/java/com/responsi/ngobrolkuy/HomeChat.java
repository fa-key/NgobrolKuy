package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeChat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_chat);
    }
    public void handlechat(View view) {
        Intent move = new Intent(HomeChat.this, PersonalChat.class);
        startActivity(move);
    }
    public void handlesettings(View view) {
        Intent move = new Intent(HomeChat.this, Settings.class);
        startActivity(move);
    }

    public void handleLogin(View view) {
        Intent move = new Intent(HomeChat.this, LoginActivity.class);
        startActivity(move);
    }
}