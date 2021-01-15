package com.example.logutilexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.logutil.LogDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogDebug.deg("Hello");
    }
}