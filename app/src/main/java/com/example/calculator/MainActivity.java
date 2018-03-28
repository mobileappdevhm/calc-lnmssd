package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText numberOne, numberTwo;
    Button add, subtract, divide, multiply;

    Button one, two, three, four, five, six, seven, eight, nine, zero;


    float result_num;

    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);
        numberOne = (EditText)findViewById(R.id.numberOne);
        numberTwo = (EditText)findViewById(R.id.numberTwo);
        add = (Button)findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);
        divide = (Button)findViewById(R.id.divide);
        multiply = (Button)findViewById(R.id.multiply);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 num1 = Integer.parseInt(numberOne.getText().toString());
                num2 = Integer.parseInt(numberTwo.getText().toString());

                result_num = num1 + num2;
                result.setText(String.valueOf(result_num));


            }

        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(numberOne.getText().toString());
                num2 = Integer.parseInt(numberTwo.getText().toString());

                result_num = num1 - num2;
                result.setText(String.valueOf(result_num));


            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(numberOne.getText().toString());
                num2 = Integer.parseInt(numberTwo.getText().toString());

                String myToastText = "Durch 0 teilen nicht möglich!";

                if (num2 == 0){
                    Toast myErrorMsg = Toast.makeText(getApplicationContext(), myToastText, Toast.LENGTH_LONG);
                    result.setText(String.valueOf("N/A"));
                    myErrorMsg.show();
                } else {
                    result_num = num1 / num2;
                    result.setText(String.valueOf(result_num));
                }

            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(numberOne.getText().toString());
                num2 = Integer.parseInt(numberTwo.getText().toString());

                result_num = num1 * num2;
                result.setText(String.valueOf(result_num));

            }
        });

    }

}
