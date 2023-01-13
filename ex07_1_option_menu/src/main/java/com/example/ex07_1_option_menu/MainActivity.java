package com.example.ex07_1_option_menu;


import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    LinearLayout baseLayout;
//    Button button1;

    EditText edt1;
    ImageView iv1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main_jeju);
        setTitle("제주도");

//        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
//        button1 = (Button) findViewById(R.id.button1);

        edt1 = findViewById(R.id.edt1);
        iv1 = findViewById(R.id.iv1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu2, menu);

//        menu.add(0, 1, 0, "배경색 (빨강)");
//        menu.add(0, 2, 0, "배경색 (초록)");
//        menu.add(0, 3, 0, "배경색 (파랑)");
//
//        SubMenu sMenu = menu.addSubMenu("버튼 변경 >>");
//        sMenu.add(0, 4, 0, "버튼 45도 회전");
//        sMenu.add(0, 5, 0, "버튼 2배 확대");

        return true;
    }

    float fAngle =0;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemRotate:
                String str1 = edt1.getText().toString();
                fAngle += Float.parseFloat(str1);
                iv1.setRotation(fAngle);
                return true;
            case R.id.item1:
                item.setChecked(true);
                iv1.setImageResource(R.drawable.jeju2);
                return true;
            case R.id.item2:
                item.setChecked(true);
                iv1.setImageResource(R.drawable.jeju4);
                return true;
            case R.id.item3:
                item.setChecked(true);
                iv1.setImageResource(R.drawable.jeju9);
                return true;
        }
        return false;
    }

}