package com.example.logutil;

import android.util.Log;

public class LogDebug {
    public static final String TAG = "LOG DEBUGGER";

    public static void deg(String message){
        Log.d(TAG,message);
    }
}
