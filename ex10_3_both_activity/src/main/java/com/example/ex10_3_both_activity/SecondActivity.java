package com.example.ex10_3_both_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("두번째");

        Intent intent1 = getIntent();

        int num1 = intent1.getIntExtra("Num1", 0);
        int num2 = intent1.getIntExtra("Num2", 0);
        String op1 = intent1.getStringExtra("Operator1");

        int nResult =0;
        if(op1.equals("+")) {
            nResult = num1 + num2;
        }
        else if(op1.equals("-")) {
            nResult = num1 -+ num2;
        }
        else if(op1.equals("*")) {
            nResult = num1 * num2;
        }
        else if(op1.equals("/")) {
            nResult = num1 / num2;
        }
        else{

        }

        Button btn1 = findViewById(R.id.btnReturn);
        int finalNResult = nResult;
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                intent1.putExtra("Result1", finalNResult);
                setResult(RESULT_OK,intent1);
                finish();
            }
        });
    }
}







