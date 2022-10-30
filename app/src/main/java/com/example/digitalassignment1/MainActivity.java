package com.example.digitalassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    TextView t;
    RadioGroup rg;
    RadioButton rb;
    EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.radio);
        t = findViewById(R.id.result);
        num = findViewById(R.id.num);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                rb = findViewById(checkedId);
                String s = rb.getText().toString();

                if (s.equals("Prime Number")) {
                    int a = Integer.parseInt(num.getText().toString());
                    if(check(a)){
                        t.setText("This is a prime number");
                    }
                    else {
                        t.setText("This is not a prime number");
                    }
                }
                if (s.equals("Even Number")) {
                    int a = Integer.parseInt(num.getText().toString());
                    if (a % 2 == 0) {
                        t.setText("This is an even number");
                    } else {
                        t.setText("This is not a even number");
                    }
                }
                if (s.equals("Even digit")) {
                    int a = Integer.parseInt(num.getText().toString());
                    int b = 0;
                    for (int i = a; i > 0; i = i / 10) {
                        b++;
                    }
                    if (b % 2 == 0) {
                        t.setText("This is having even digit");
                    } else {
                        t.setText("This is have odd digit");
                    }
                }
            }
        });


    }

    public boolean check(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else {
            int b = n / 2;
            for (int i = b; i > 1; i--) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}