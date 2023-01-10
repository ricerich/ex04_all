package com.example.ex04_animal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.tv1);
//        CheckBox chk1 = findViewById(R.id.chk1);
        Switch sw1 = findViewById(R.id.sw1);
        RadioGroup rg1 = findViewById(R.id.rg1);

        RadioButton rdo1 = findViewById(R.id.rdo1);
        RadioButton rdo2 = findViewById(R.id.rdo2);
        RadioButton rdo3 = findViewById(R.id.rdo3);

//        Button btn1 = findViewById(R.id.btn1);
        ImageView iv1 = findViewById(R.id.iv1);

        Button btnFinish = findViewById(R.id.btnFinish);
        Button btnInit = findViewById(R.id.btnInit);

        rdo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setImageResource(R.drawable.dog2);
            }
        });

        rdo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setImageResource(R.drawable.cat);
            }
        });

        rdo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setImageResource(R.drawable.rabbit);
            }
        });

        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (sw1.isChecked())//체크가 된 상태로 끝
                {
                    tv1.setVisibility(View.VISIBLE);
                    rg1.setVisibility(View.VISIBLE);
//                    btn1.setVisibility(View.VISIBLE);
                    iv1.setVisibility(View.VISIBLE);
                    btnFinish.setVisibility(View.VISIBLE);
                    btnInit.setVisibility(View.VISIBLE);
                } else {
                    tv1.setVisibility(View.INVISIBLE);
                    rg1.setVisibility(View.INVISIBLE);
//                    btn1.setVisibility(View.INVISIBLE);
                    iv1.setVisibility(View.INVISIBLE);
                    btnFinish.setVisibility(View.INVISIBLE);
                    btnInit.setVisibility(View.INVISIBLE);
                }

            }
        });

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnInit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setVisibility(View.INVISIBLE);
                rg1.setVisibility(View.INVISIBLE);
                iv1.setVisibility(View.INVISIBLE);
                btnFinish.setVisibility(View.INVISIBLE);
                btnInit.setVisibility(View.INVISIBLE);

                sw1.setChecked(false);
                rg1.clearCheck();
                iv1.setImageResource(0);

            }
        });




//        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if(chk1.isChecked())//체크가 된 상태로 끝
//                {
//                    tv1.setVisibility(View.VISIBLE);
//                    rg1.setVisibility(View.VISIBLE);
//                    btn1.setVisibility(View.VISIBLE);
//                    iv1.setVisibility(View.VISIBLE);
//                }
//                else
//                {
//                    tv1.setVisibility(View.INVISIBLE);
//                    rg1.setVisibility(View.INVISIBLE);
//                    btn1.setVisibility(View.INVISIBLE);
//                    iv1.setVisibility(View.INVISIBLE);
//                }
//
//            }
//        });

//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switch(rg1.getCheckedRadioButtonId())
//                {
//                    case R.id.rdo1:
//                        iv1.setImageResource(R.drawable.dog2);
//                        break;
//                    case R.id.rdo2:
//                        iv1.setImageResource(R.drawable.cat);
//                        break;
//                    case R.id.rdo3:
//                        iv1.setImageResource(R.drawable.rabbit);
//                        break;
//                    default:
//                        Toast.makeText(getApplicationContext(), "동물 선택해ㅅ주세요!", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

    }
}








