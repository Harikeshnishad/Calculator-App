package com.hari.calculaterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView result;
    private Button sub;
    private Button mul;
    private Button div;
    private Button rem;
    private Button pow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.textView4);
        Button add = findViewById(R.id.button);
        sub = findViewById(R.id.button3);
        mul = findViewById(R.id.button4);
        div = findViewById(R.id.button5);
        rem = findViewById(R.id.button6);
        pow = findViewById(R.id.button7);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = num1.getText().toString();
                String r = num2.getText().toString();
                double number1 = Double.parseDouble(s);
                double number2 = Double.parseDouble(r);
                double res = number1 + number2;
                result.setText("After Additon : " + res);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = num1.getText().toString();
                String r = num2.getText().toString();
                double number1 = Double.parseDouble(s);
                double number2 = Double.parseDouble(r);
                double res = number1 - number2;
                result.setText("After Substraction : " + res);

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = num1.getText().toString();
                String r = num2.getText().toString();
                double number1 = Double.parseDouble(s);
                double number2 = Double.parseDouble(r);
                double res = number1*number2;
                result.setText("After Multiplication : " + res);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = num1.getText().toString();
                String r = num2.getText().toString();
                double number1 = Double.parseDouble(s);
                double number2 = Double.parseDouble(r);
                double res = number1/(number2);
                result.setText("After Division : " + res);

            }
        });
        rem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = num1.getText().toString();
                String r = num2.getText().toString();
                double number1 = Double.parseDouble(s);
                double number2 = Double.parseDouble(r);
                double res = number1 % number2;
                result.setText("After Division the Remainder is : " + res);

            }
        });
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = num1.getText().toString();
                String r = num2.getText().toString();
                double number1 = Double.parseDouble(s);
                double number2 = Double.parseDouble(r);
                double res = Math.pow(number1,number2);
                result.setText(number1 + " ^ " + number2 + " = " + res);

            }
        });
    }
}