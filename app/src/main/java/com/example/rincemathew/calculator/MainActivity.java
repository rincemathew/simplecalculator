package com.example.rincemathew.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,
            button6,button7,button8,button9,button0,
            buttonMultiplication,buttonAddition,
            buttonSubstraction,buttonDivision,
            buttonPoint,buttonEqual,buttonClear ;

    EditText androidstuff,answer;

    float value,value2;

    boolean Addition,Subtract,Multiplication,Division,point=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.zero);
        button1 = (Button) findViewById(R.id.one);
        button2 = (Button) findViewById(R.id.two);
        button3 = (Button) findViewById(R.id.three);
        button4 = (Button) findViewById(R.id.four);
        button5 = (Button) findViewById(R.id.five);
        button6 = (Button) findViewById(R.id.six);
        button7 = (Button) findViewById(R.id.seven);
        button8 = (Button) findViewById(R.id.eight);
        button9 = (Button) findViewById(R.id.nine);
        buttonAddition = (Button) findViewById(R.id.addition);
        buttonSubstraction = (Button) findViewById(R.id.substraction);
        buttonMultiplication = (Button) findViewById(R.id.multiplication);
        buttonDivision = (Button) findViewById(R.id.division);
        buttonPoint = (Button) findViewById(R.id.point);
        buttonEqual = (Button) findViewById(R.id.equalto);
        buttonClear = (Button) findViewById(R.id.clear);

        androidstuff =  findViewById(R.id.textview);
        answer = findViewById(R.id.answer);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidstuff.setText(androidstuff.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidstuff.setText(androidstuff.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidstuff.setText(androidstuff.getText()+"2");
                }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidstuff.setText(androidstuff.getText()+"3");
                }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidstuff.setText(androidstuff.getText()+"4");
                }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidstuff.setText(androidstuff.getText()+"5");
                }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidstuff.setText(androidstuff.getText()+"6");
                }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidstuff.setText(androidstuff.getText()+"7");
                }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidstuff.setText(androidstuff.getText()+"8");
                }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidstuff.setText(androidstuff.getText()+"9");
                }
        });

        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (androidstuff.getText().toString().equals("")){
                    androidstuff.setText("");
                    Subtract=false;
                    Multiplication=false;
                    Division=false;
                    Addition = true;
                }else {
                    value = Float.parseFloat(androidstuff.getText() + "");
                    calculation();
                    Subtract=false;
                    Multiplication=false;
                    Division=false;
                    Addition = true;
                    point=false;
                    }
            }
        });

        buttonSubstraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (androidstuff.getText().toString().equals("")){
                    androidstuff.setText("");
                    Addition=false;
                    Multiplication=false;
                    Division=false;
                    Subtract=true;
                }else {
                    value = Float.parseFloat(androidstuff.getText() + "");
                    calculation();
                    Addition=false;
                    Multiplication=false;
                    Division=false;
                    Subtract=true;
                    point=false;
                }
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (androidstuff.getText().toString().equals("")){
                    androidstuff.setText("");
                    Addition=false;
                    Subtract=false;
                    Division=false;
                    Multiplication=true;
                }else {
                    value = Float.parseFloat(androidstuff.getText() + "");
                    calculation();
                    Addition=false;
                    Subtract=false;
                    Division=false;
                    Multiplication=true;
                    point=false;
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (androidstuff.getText().toString().equals("")){
                    androidstuff.setText("");
                    Addition=false;
                    Subtract=false;
                    Multiplication=false;
                    Division=true;
                }else {
                    value = Float.parseFloat(androidstuff.getText() + "");
                    calculation();
                    Addition=false;
                    Subtract=false;
                    Multiplication=false;
                    Division=true;
                    point=false;
                }
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(point==false) {
                    androidstuff.setText(androidstuff.getText() + ".");
                    point=true;
                }
                else  {
                }
                }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (androidstuff.getText().toString().equals("")){
                    androidstuff.setText("");
                    value2=value;
                    androidstuff.setText(null);
                    answer.setText(value2+"");
                    Addition=false;
                    Subtract=false;
                    Multiplication=false;
                    Division=false;
                }else {
                    value = Float.parseFloat(androidstuff.getText() + "");
                    calculation();
                    Addition=false;
                    Subtract=false;
                    Multiplication=false;
                    Division=false;
                    point=false;
                }

            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidstuff.setText("");
                answer.setText("");
                value=0;
                value2=0;
                Addition=false;
                Subtract=false;
                Multiplication=false;
                Division=false;
                point=false;
                }
        });



    }

    private void calculation() {



        if (Addition == true){
            value2=value+value2;
            androidstuff.setText(null);
            answer.setText(value2+"");
            }

        else if (Subtract == true){
            value2=value2-value;
            androidstuff.setText(null);
            answer.setText(value2+""); }

        else if (Multiplication == true){
            value2=value2*value;
            androidstuff.setText(null);
            answer.setText(value2+"");
        }

        else if (Division == true){
            value2=value2/value;
            androidstuff.setText(null);
            answer.setText(value2+"");
        }

        else {
            value2=value;
            androidstuff.setText(null);
            answer.setText(value2+"");
        }

    }
}
