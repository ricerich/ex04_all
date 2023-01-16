package com.example.ex10_1_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg1 = findViewById(R.id.rg1);

        RadioButton rdoSecond = findViewById(R.id.rdoSecond);
        RadioButton rdoThird = findViewById(R.id.rdoThird);

        Button btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1=null;

                if(rdoSecond.isChecked())
                    intent1 = new Intent(MainActivity.this, SecondActivity.class);
                else if(rdoThird.isChecked())
                    intent1 = new Intent(MainActivity.this, ThirdActivity.class);
                else
                    Toast.makeText(getApplicationContext(), "선택해 주세요", Toast.LENGTH_SHORT).show();

                if(intent1 != null)
                    startActivity(intent1);
            }
        });



//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent1=null;
//
//                switch(rg1.getCheckedRadioButtonId())
//                {
//                    case R.id.rdoSecond:
//                        intent1 = new Intent(MainActivity.this, SecondActivity.class);
//                        break;
//                    case R.id.rdoThird:
//                        intent1 = new Intent(MainActivity.this, ThirdActivity.class);
//                        break;
//                    default:
//                        Toast.makeText(getApplicationContext(), "선택해 주세요", Toast.LENGTH_SHORT).show();
//                }
////                intent1.putExtra("firstName","Hong");
//                if(intent1 != null)
//                    startActivity(intent1);
//            }
//        });
    }
}