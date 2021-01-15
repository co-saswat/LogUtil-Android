package com.example.logutilexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.logutil.LogDebug;
import com.example.logutil.Message;
import com.example.logutil.MyMath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogDebug.deg("Hello");
        int value = MyMath.plus(4,5);
        Message.value(this,String.valueOf(value));
    }
}