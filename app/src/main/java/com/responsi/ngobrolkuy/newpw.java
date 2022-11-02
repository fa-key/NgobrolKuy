package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class newpw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpw);
    }
    public void handleback(View view) {
        Intent move = new Intent(newpw.this, HomeChat.class);
        startActivity(move);
    }
    public void handleconfirm(View view) {
        Intent move = new Intent(newpw.this, confirmpw.class);
        startActivity(move);
    }
}