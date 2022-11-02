package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class confirmpw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmpw);
    }

    public void handleHome(View view) {
        Intent move = new Intent(confirmpw.this, HomeChat.class);
        startActivity(move);
    }
}