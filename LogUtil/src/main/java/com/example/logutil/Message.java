package com.example.logutil;

import android.content.Context;
import android.widget.Toast;

public class Message {
    public static void value(Context context , String message ){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
