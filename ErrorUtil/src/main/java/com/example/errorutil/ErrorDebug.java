package com.example.errorutil;

import android.util.Log;

public class ErrorDebug {
    public static final String TAG = "ERROR DEBUGGER";
        public static void err(String message){
            Log.e(TAG,message);
        }
}
