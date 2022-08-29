package com.vedantjain.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtno1;
    Button plus,minus,mul,div;

    boolean sum_bool=false, sub_bool=false, mul_bool=false, div_bool=false;
    float fans=0,number;

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttondot,buttonequal, buttonclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtno1 = findViewById(R.id.txtinput1);
        txtno1.setShowSoftInputOnFocus(false);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        mul = findViewById(R.id.multiply);
        div = findViewById(R.id.divide);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);
        buttondot = findViewById(R.id.buttondot);
        buttonequal = findViewById(R.id.buttonequal);
        buttonclear = findViewById(R.id.buttonclear);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtno1.setText(txtno1.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtno1.setText(txtno1.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtno1.setText(txtno1.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtno1.setText(txtno1.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtno1.setText(txtno1.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtno1.setText(txtno1.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtno1.setText(txtno1.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtno1.setText(txtno1.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtno1.setText(txtno1.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtno1.setText(txtno1.getText()+"0");
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtno1.setText(txtno1.getText()+".");
            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fans = 0;
                number = 0;
                txtno1.setText(null);
                sum_bool=sub_bool=mul_bool=div_bool = false;
            }
        });

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = Float.parseFloat(txtno1.getText() + "");
                if (sum_bool) {
                    fans += number;
                    txtno1.setText(fans + "");
                    sum_bool = false;
                    fans = 0;
                }
                else if (sub_bool){
                    fans -= number;
                    txtno1.setText(fans + "");
                    sub_bool = false;
                    fans = 0;
                }
                else if (mul_bool){
                    fans *= number;
                    txtno1.setText(fans + "");
                    mul_bool = false;
                    fans = 0;
                }
                else if (div_bool){
                    fans /= number;
                    txtno1.setText(fans + "");
                    div_bool = false;
                    fans = 0;
                }

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = Float.parseFloat(txtno1.getText().toString());
                fans += number;
                sum_bool = true;
                txtno1.setText(null);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = Float.parseFloat(txtno1.getText().toString());
                fans = number;
                sub_bool = true;
                txtno1.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = Float.parseFloat(txtno1.getText().toString());
                if (fans != 0){
                    fans*=number;
                }
                else {
                    fans = number;
                }
                mul_bool = true;
                txtno1.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = Float.parseFloat(txtno1.getText().toString());
                if (fans != 0){
                    fans/=number;
                }
                else {
                    fans = number;
                }
                div_bool = true;
                txtno1.setText(null);
            }
        });

    }
}