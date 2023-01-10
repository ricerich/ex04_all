package com.example.ex05_calc;

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

        //5-1숫자버튼 java객체 만들기, xml객체 가져와서 바인딩(findViewById메소드)

        Button btnNum0 = findViewById(R.id.num0);
        Button btnNum1 = findViewById(R.id.num1);
        Button btnNum2 = findViewById(R.id.num2);
        Button btnNum3 = findViewById(R.id.num3);
        Button btnNum4 = findViewById(R.id.num4);
        Button btnNum5 = findViewById(R.id.num5);
        Button btnNum6 = findViewById(R.id.num6);
        Button btnNum7 = findViewById(R.id.num7);
        Button btnNum8 = findViewById(R.id.num8);
        Button btnNum9 = findViewById(R.id.num9);

        //개별 버튼 10개를 1개의 객체배열에 넣고, 배열 멤버로 만든다.
        //객체 배열
        Button btnNumArr[] = new Button[10];
        //btnNumArr[0] = new Button(this);
//        btnNumArr[0] = findViewById(R.id.num0);
//        btnNumArr[1] = findViewById(R.id.num1);
//        btnNumArr[2] = findViewById(R.id.num2);
//        btnNumArr[3] = findViewById(R.id.num3);
//        btnNumArr[4] = findViewById(R.id.num4);
//        btnNumArr[5] = findViewById(R.id.num5);
//        btnNumArr[6] = findViewById(R.id.num6);
//        btnNumArr[7] = findViewById(R.id.num7);
//        btnNumArr[8] = findViewById(R.id.num8);
//        btnNumArr[9] = findViewById(R.id.num9);

//        int nBtnArr[] = new int[10];
//        int nBtnArr[] = {1,3,4,5,6,6,7,8,89}''
        int nBtnArr[] = {R.id.num0, R.id.num1, R.id.num2, R.id.num3, R.id.num4,
                         R.id.num5, R.id.num6, R.id.num7, R.id.num8, R.id.num9};

        for(int i=0; i<btnNumArr.length;++i)  {
            //btnNumArr[i] = findViewById(R.id.num + i);
            btnNumArr[i] = findViewById(nBtnArr[i]);
        }



        for(int i=0; i<btnNumArr.length;++i)
        {
            final int final_i = i;
            btnNumArr[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //if(edt1.isFocused() == true)
                    if(edt1.isFocused()){
                        String str1 = edt1.getText().toString()+ final_i;
                        edt1.setText(str1);
                    }
                    else if(edt2.isFocused()){
                        String str1 = edt2.getText().toString()+ final_i;
                        edt2.setText(str1);
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"에디트를 선택해 주세요",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        btnNumArr[0] = findViewById(R.id.num7);




        //5-2 이벤트 처리
//        btnNum0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //if(edt1.isFocused() == true)
//                if(edt1.isFocused())
//                {
//                    String str1 = edt1.getText().toString()+ "0";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())
//                {
//                    String str1 = edt2.getText().toString()+ "0";
//                    edt2.setText(str1);
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해 주세요",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //if(edt1.isFocused() == true)
//                if(edt1.isFocused())
//                {
//                    String str1 = edt1.getText().toString()+ "1";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())
//                {
//                    String str1 = edt2.getText().toString()+ "1";
//                    edt2.setText(str1);
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해 주세요",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //if(edt1.isFocused() == true)
//                if(edt1.isFocused())
//                {
//                    String str1 = edt1.getText().toString()+ "2";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())
//                {
//                    String str1 = edt2.getText().toString()+ "2";
//                    edt2.setText(str1);
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해 주세요",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //if(edt1.isFocused() == true)
//                if(edt1.isFocused())
//                {
//                    String str1 = edt1.getText().toString()+ "3";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())
//                {
//                    String str1 = edt2.getText().toString()+ "3";
//                    edt2.setText(str1);
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해 주세요",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //if(edt1.isFocused() == true)
//                if(edt1.isFocused())
//                {
//                    String str1 = edt1.getText().toString()+ "4";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())
//                {
//                    String str1 = edt2.getText().toString()+ "4";
//                    edt2.setText(str1);
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해 주세요",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //if(edt1.isFocused() == true)
//                if(edt1.isFocused())
//                {
//                    String str1 = edt1.getText().toString()+ "5";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())
//                {
//                    String str1 = edt2.getText().toString()+ "5";
//                    edt2.setText(str1);
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해 주세요",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //if(edt1.isFocused() == true)
//                if(edt1.isFocused())
//                {
//                    String str1 = edt1.getText().toString()+ "6";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())
//                {
//                    String str1 = edt2.getText().toString()+ "6";
//                    edt2.setText(str1);
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해 주세요",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //if(edt1.isFocused() == true)
//                if(edt1.isFocused())
//                {
//                    String str1 = edt1.getText().toString()+ "7";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())
//                {
//                    String str1 = edt2.getText().toString()+ "7";
//                    edt2.setText(str1);
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해 주세요",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //if(edt1.isFocused() == true)
//                if(edt1.isFocused())
//                {
//                    String str1 = edt1.getText().toString()+ "8";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())
//                {
//                    String str1 = edt2.getText().toString()+ "8";
//                    edt2.setText(str1);
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해 주세요",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnNum9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //if(edt1.isFocused() == true)
//                if(edt1.isFocused())
//                {
//                    String str1 = edt1.getText().toString()+ "9";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())
//                {
//                    String str1 = edt2.getText().toString()+ "9";
//                    edt2.setText(str1);
//                }
//                else{
//                    Toast.makeText(getApplicationContext(),
//                            "에디트를 선택해 주세요",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });



        btn1.setOnTouchListener(new View.OnTouchListener() {
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
//                    int n3 = n1 + n2;

                    double d1 = Double.parseDouble(str1);
                    double d2 = Double.parseDouble(str2);
                    double d3 = d1 + d2;

                    tv1.setText("결과는: "+d3);
                }



                return false;
            }
        });

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