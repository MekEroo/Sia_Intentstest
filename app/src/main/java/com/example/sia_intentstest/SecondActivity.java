package com.example.sia_intentstest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textView);
        int month = 0;

        Intent next = getIntent();

        month = next.getIntExtra("input_number", 0);

        switch (month) {
            case 1:
                textView.setText("This month is January");
                break;
            case 2:
                textView.setText("This month is February");
                break;
            case 3:
                textView.setText("This month is March");
                break;
            case 4:
                textView.setText("This month is April");
                break;
            case 5:
                textView.setText("This month is May");
                break;
            case 6:
                textView.setText("This month is June");
                break;
            case 7:
                textView.setText("This month is July");
                break;
            case 8:
                textView.setText("This month is August");
                break;
            case 9:
                textView.setText("This month is September");
                break;
            case 10:
                textView.setText("This month is October");
                break;
            case 11:
                textView.setText("This month is November");
                break;
            case 12:
                textView.setText("This month is December");
                break;
            case 13:
                textView.setText("ERROR: Input is invalid");
                break;
        }

    }
}