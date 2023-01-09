package com.example.ex04_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //멤버 변수 (MaintActivity 클래스의)
//    EditText edt1;
//    EditText edt2;
//    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //지역변수 (onCreate메소드의)

        //1.바인딩
        EditText edt1 = findViewById(R.id.edt1);
        EditText edt2 = findViewById(R.id.edt2);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);//나머지 버튼 추가

        TextView tv1 = findViewById(R.id.tv1);

//        버튼객체1.set리스너하는_메소드(리스너객체);
//        a1.set(b1);
//        View.OnTouchListener lis1 = new View.OnTouchListener() ;

        //1단계
//        class A implements View.OnTouchListener
//        {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                Toast.makeText(getApplicationContext(), "클릭!!", Toast.LENGTH_SHORT).show();
//                return false;
//            }
//        }
//
//        A a1 = new A();
//        btn1.setOnTouchListener(a1);

        //2단계
//        View.OnTouchListener b1 = new View.OnTouchListener(){
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                Toast.makeText(getApplicationContext(), "클릭!!", Toast.LENGTH_SHORT).show();
//                return false;
//            }
//        };
//
//        btn1.setOnTouchListener(b1);

        //3단계
        btn1.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Toast.makeText(getApplicationContext(), "333333", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        //2.이벤트 처리 : 버튼들에 대해서

//        btn1.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                String str1 = edt1.getText().toString();
//                String str2 = edt2.getText().toString();
//
//                if(str1.equals("") || str2.equals(""))
//                {
//                    Toast.makeText(MainActivity.this,"값을 입력해주셔요!",Toast.LENGTH_SHORT).show();
//                }
//                else
//                {
////                    int n1 = Integer.parseInt(str1);
////                    int n2 = Integer.parseInt(str2);
////                    int n3 = n1 + n2;
//
//                    double d1 = Double.parseDouble(str1);
//                    double d2 = Double.parseDouble(str2);
//                    double d3 = d1 + d2;
//
//                    tv1.setText("결과는: "+d3);
//                }
//
//
//
//                return false;
//            }
//        });

        btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();

                if(str1.equals("") || str2.equals(""))
                {
                    Toast.makeText(MainActivity.this,"값을 입력해주셔요!",Toast.LENGTH_SHORT).show();
                }
                else
                {
//                    int n1 = Integer.parseInt(str1);
//                    int n2 = Integer.parseInt(str2);
//                    int n3 = n1 - n2;


                    double d1 = Double.parseDouble(str1);
                    double d2 = Double.parseDouble(str2);
                    double d3 = d1 - d2;

                    tv1.setText("결과는: "+d3);
                }
                return false;
            }
        });

        btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();

                if(str1.equals("") || str2.equals(""))
                {
                    Toast.makeText(MainActivity.this,"값을 입력해주셔요!",Toast.LENGTH_SHORT).show();
                }
                else
                {
//                    int n1 = Integer.parseInt(str1);
//                    int n2 = Integer.parseInt(str2);
//                    int n3 = n1 * n2;

//                    tv1.setText("결과는: " + n3);

                    double d1 = Double.parseDouble(str1);
                    double d2 = Double.parseDouble(str2);
                    double d3 = d1 * d2;

                    tv1.setText("결과는: "+d3);
                }
                return false;
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();

                if(str1.equals("") || str2.equals(""))
                {
                    Toast.makeText(MainActivity.this,"값을 입력해주셔요!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(str2.equals("0"))
                    {
                        Toast.makeText(MainActivity.this,"0으로 나눌순 없어요!",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        //                    int n1 = Integer.parseInt(str1);
//                    int n2 = Integer.parseInt(str2);
//                    int n3 = n1 / n2;
//
//                    tv1.setText("결과는: " + n3);
                        double d1 = Double.parseDouble(str1);
                        double d2 = Double.parseDouble(str2);
                        double d3 = d1 / d2;
                        d3 = (int)(d3*100)/100.0;

                        tv1.setText("결과는: "+d3);
                    }
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();

                if(str1.equals("") || str2.equals(""))
                {
                    Toast.makeText(MainActivity.this,"값을 입력해주셔요!",Toast.LENGTH_SHORT).show();
                }
                else
                {
//                    int n1 = Integer.parseInt(str1);
//                    int n2 = Integer.parseInt(str2);
//                    int n3 = n1 % n2;
//
//                    tv1.setText("결과는: " + n3);

                    double d1 = Double.parseDouble(str1);
                    double d2 = Double.parseDouble(str2);
                    double d3 = d1 % d2;

                    tv1.setText("결과는: "+d3);
                }
            }
        });
    }
}