package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void handleback(View view) {
        Intent move = new Intent(Settings.this, HomeChat.class);
        startActivity(move);
    }

    public void handleChange(View view) {
        Intent move = new Intent(Settings.this, newpw.class);
        startActivity(move);
    }
}