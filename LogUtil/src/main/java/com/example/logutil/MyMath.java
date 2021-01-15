package com.example.logutil;

public class MyMath {
    public static int plus(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static float div(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Divided by Zero Error");
        }else {
            return a/b;
        }
    }
    public static float mod(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Divided by Zero Error");
        }else {
            return a%b;
        }
    }
}
