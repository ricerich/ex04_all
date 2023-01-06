package com.example.ex04_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1.XML파일과 JAVA파일 연결
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.ex4_2);

        
//        //2.바인딩: XML의 뷰(에디트텍스트, 버튼, 텍스트뷰)를 JAVA 객체로 바인딩
//        EditText edt1 = findViewById(R.id.edt1);
//        Button btn1 = findViewById(R.id.btn1);
//        TextView tv1 = findViewById(R.id.tv1);
//
//        //3.이벤트 처리(버튼에 대해서) - 에디트텍스트 입력을 텍스트뷰에 출력
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String str1 = edt1.getText().toString();
//                tv1.setText(str1);
//
//                Toast.makeText(MainActivity.this,"클릭됨!",Toast.LENGTH_SHORT).show();
//            }
//        });




        
    }
}