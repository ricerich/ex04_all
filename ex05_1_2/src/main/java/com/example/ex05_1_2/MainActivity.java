package com.example.ex05_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main); //xml로 화면 구성

        //0.레이아웃 레이아웃 param(너비, 높이) 객체
        //1.레이아웃 java객체 만들기
        //2.레이아웃 java객체의 속성 설정(orientation, backgroundcolor)
        //3.view java 객체 만들기(예:버튼, 텍스트뷰, 에딧텍스트)
        //4.view 객체의 속성 설정
        //5.view 객체를 레이아웃 객체에 add한다.
        //6.레이아웃과 param 를 set콘텐트View 한다.

        //0.레이아웃 레이아웃 param(너비, 높이) 객체
        LinearLayout.LayoutParams param
                = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                                                LinearLayout.LayoutParams.MATCH_PARENT);

        //1.레이아웃 java객체 만들기
        LinearLayout baseLayout = new LinearLayout(this);//소속 액티비티 명시(=this)
        //2.레이아웃 java객체의 속성 설정(orientation, backgroundcolor
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));

        //3.view java 객체 만들기(예:버튼, 텍스트뷰, 에딧텍스트)
        Button btn1 = new Button(this);

        //4.view 객체의 속성 설정(text, 배경색)
        btn1.setText("버튼입니다");
        btn1.setBackgroundColor(Color.MAGENTA);

        //5.view객체를 레이아웃 객체에 add한다
        baseLayout.addView(btn1);

        //5-2.이벤트 처리
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "클릭하셨음", Toast.LENGTH_SHORT).show();

            }
        });


        //6.레이아웃과 param 를 set콘텐트View 한다.
        setContentView(baseLayout, param);

    }
}