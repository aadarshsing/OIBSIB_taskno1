package com.example.unconvert;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
    }
    public void calculate(View view){
        String s=editText.getText().toString();
        int Kg = Integer.parseInt(s);
        double gram= Kg * 1000;
        textView2.setText("The corresponding value in gram is " + gram+"gram");

    }
}