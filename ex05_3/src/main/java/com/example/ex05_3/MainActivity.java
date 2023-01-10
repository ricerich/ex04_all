package com.example.ex05_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params
                = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                                                LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout, params);

        EditText edt1 = new EditText(this);
        edt1.setHint("여기에 입력해 주세요!");
        baseLayout.addView(edt1);

        Button btn1 = new Button(this);
        btn1.setText("확인");
        btn1.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(btn1);

        TextView tv1 = new TextView(this);
        tv1.setText("텍스트뷰");
        tv1.setTextSize(20);
        tv1.setTextColor(Color.MAGENTA);
        baseLayout.addView(tv1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(edt1.getText().toString());
            }
        });
    }
}