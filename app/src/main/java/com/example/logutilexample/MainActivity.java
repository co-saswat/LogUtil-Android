package com.example.logutilexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.logutil.LogDebug;
import com.example.logutil.Message;
import com.example.logutil.MyMath;

public class MainActivity extends AppCompatActivity {

    private EditText editTextA;
    private EditText editTextB;
    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonMul;
    private Button buttonDiv;
    private Button buttonMod;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextA = findViewById(R.id.value_a);
        editTextB = findViewById(R.id.value_b);
        buttonAdd = findViewById(R.id.btn_add);
        buttonDiv = findViewById(R.id.btn_div);
        buttonMul = findViewById(R.id.btn_mul);
        buttonSub = findViewById(R.id.btn_sub);
        buttonMod = findViewById(R.id.btn_mod);
        textViewResult = findViewById(R.id.tv_result);

        buttonAdd.setOnClickListener(v -> {
            int val = MyMath.plus(Integer.parseInt(editTextA.getText().toString()),Integer.parseInt(editTextB.getText().toString()));
            textViewResult.setText(String.valueOf(val));
            Message.value(getApplicationContext(),String.valueOf(val));
        });
        buttonSub.setOnClickListener(v -> {
            int val = MyMath.minus(Integer.parseInt(editTextA.getText().toString()),Integer.parseInt(editTextB.getText().toString()));
            textViewResult.setText(String.valueOf(val));
            Message.value(getApplicationContext(),String.valueOf(val));
        });
        buttonMul.setOnClickListener(v -> {
            int val = MyMath.mul(Integer.parseInt(editTextA.getText().toString()),Integer.parseInt(editTextB.getText().toString()));
            textViewResult.setText(String.valueOf(val));
            Message.value(getApplicationContext(),String.valueOf(val));
        });
        buttonDiv.setOnClickListener(v -> {
            float val = MyMath.div(Float.parseFloat(editTextA.getText().toString()),Float.parseFloat(editTextB.getText().toString()));
            textViewResult.setText(String.valueOf(val));
            Message.value(getApplicationContext(),String.valueOf(val));
        });
        buttonMod.setOnClickListener(v -> {
            float val = MyMath.mod(Float.parseFloat(editTextA.getText().toString()),Float.parseFloat(editTextB.getText().toString()));
            textViewResult.setText(String.valueOf(val));
            Message.value(getApplicationContext(),String.valueOf(val));
        });
    }
}