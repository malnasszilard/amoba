package com.example.dragoon.amoba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class Amoba extends AppCompatActivity {
    int i=0;
    TableLayout table;

    Button one,two,three,four,five,six,seven,eight,nine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amoba);
        one=(Button)findViewById(R.id.button);
        two=(Button)findViewById(R.id.button2);
        three=(Button)findViewById(R.id.button3);
        four=(Button)findViewById(R.id.button4);
        five=(Button)findViewById(R.id.button5);
        six=(Button)findViewById(R.id.button6);
        seven=(Button)findViewById(R.id.button7);
        eight=(Button)findViewById(R.id.button8);
        nine=(Button)findViewById(R.id.button9);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one.setOnClickListener(null);
                if(i==0){
                    one.setText("X");
                    i++;
                }
                else{
                    one.setText("0");
                    i--;
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two.setOnClickListener(null);
                if(i==0){
                    two.setText("X");
                    i++;
                }
                else{
                    two.setText("0");
                    i--;
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                three.setOnClickListener(null);
                if(i==0){
                    three.setText("X");
                    i++;
                }
                else{
                    three.setText("0");
                    i--;
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                four.setOnClickListener(null);
                if(i==0){
                    four.setText("X");
                    i++;
                }
                else{
                    four.setText("0");
                    i--;
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                five.setOnClickListener(null);
                if(i==0){
                    five.setText("X");
                    i++;
                }
                else{
                    five.setText("0");
                    i--;
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                six.setOnClickListener(null);
                if(i==0){
                    six.setText("X");
                    i++;
                }
                else{
                    six.setText("0");
                    i--;
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seven.setOnClickListener(null);
                if(i==0){
                    seven.setText("X");
                    i++;
                }
                else{
                    seven.setText("0");
                    i--;
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eight.setOnClickListener(null);
                if(i==0){
                    eight.setText("X");
                    i++;
                }
                else{
                    eight.setText("0");
                    i--;
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nine.setOnClickListener(null);
                if(i==0){
                    nine.setText("X");
                    i++;
                }
                else{
                    nine.setText("0");
                    i--;
                }
            }
        });
    }
}
