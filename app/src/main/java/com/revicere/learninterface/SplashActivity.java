package com.revicere.learninterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent toMain = new Intent(this, MainActivity.class);
        startActivity(toMain);
        finish();
    }
}
