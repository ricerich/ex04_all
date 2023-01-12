package com.example.ex6_1_resevation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

//    int nYear, nMonth, nDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("시간예약");

        Chronometer chrno = findViewById(R.id.chronometer1);
//        Button btnStart = findViewById(R.id.btnStart);

        RadioButton rdo1 = findViewById(R.id.rdoCal);
        RadioButton rdo2 = findViewById(R.id.rdoTime);

//        CalendarView cal1 = findViewById(R.id.calendarView1);
        DatePicker dPicker1 = findViewById(R.id.dPicker1);
        TimePicker tPicker1 = findViewById(R.id.timePicker1);

//        Button btnEnd = findViewById(R.id.btnEnd);

        TextView tvYear = findViewById(R.id.tvYear);
        TextView tvMonth = findViewById(R.id.tvMonth);
        TextView tvDay = findViewById(R.id.tvDay);

        TextView tvHour = findViewById(R.id.tvHour);
        TextView tvMinute = findViewById(R.id.tvMinute);

//        cal1.setVisibility(View.INVISIBLE);
        dPicker1.setVisibility(View.INVISIBLE);
        tPicker1.setVisibility(View.INVISIBLE);

        rdo1.setVisibility(View.INVISIBLE);
        rdo2.setVisibility(View.INVISIBLE);

//        btnStart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                chrno.setBase(SystemClock.elapsedRealtime());
//                chrno.start();
//                chrno.setTextColor(Color.RED);
//            }
//        });

        chrno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrno.setBase(SystemClock.elapsedRealtime());
                chrno.start();
                chrno.setTextColor(Color.RED);

                rdo1.setVisibility(View.VISIBLE);
                rdo2.setVisibility(View.VISIBLE);

                tvYear.setText("0000");
                tvMonth.setText("00");
                tvDay.setText("00");
                tvHour.setText("00");
                tvMinute.setText("00");

            }
        });


        rdo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                cal1.setVisibility(View.VISIBLE);
                dPicker1.setVisibility(View.VISIBLE);
                tPicker1.setVisibility(View.INVISIBLE);
            }
        });

        rdo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                cal1.setVisibility(View.INVISIBLE);
                dPicker1.setVisibility(View.INVISIBLE);
                tPicker1.setVisibility(View.VISIBLE);
            }
        });

//        int nYear=0;
//        int nMonth=0;
//        int nDay=0;

//        btnEnd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                chrno.stop();
//                chrno.setTextColor(Color.BLUE);
//
//                //년,월,일 -> 텍스트뷰에 출력
////                tvYear.setText(""+nYear);
////                tvMonth.setText(""+nMonth);
////                tvDay.setText(""+nDay);
//                tvYear.setText(""+dPicker1.getYear());
//                tvMonth.setText(""+dPicker1.getMonth()+1);
//                tvDay.setText(""+dPicker1.getDayOfMonth());
//
//                //시,분 -> 텍스트뷰에 출력
//                tvHour.setText(""+tPicker1.getCurrentHour());
//                tvMinute.setText(""+tPicker1.getCurrentMinute());
//            }
//        });

        tvYear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                chrno.stop();
                chrno.setTextColor(Color.BLUE);

                //년,월,일 -> 텍스트뷰에 출력
//                tvYear.setText(""+nYear);
//                tvMonth.setText(""+nMonth);
//                tvDay.setText(""+nDay);
                tvYear.setText("" + dPicker1.getYear());
                tvMonth.setText("" + dPicker1.getMonth() + 1);
                tvDay.setText("" + dPicker1.getDayOfMonth());

                //시,분 -> 텍스트뷰에 출력
                tvHour.setText("" + tPicker1.getCurrentHour());
                tvMinute.setText("" + tPicker1.getCurrentMinute());

                rdo1.setVisibility(View.INVISIBLE);
                rdo2.setVisibility(View.INVISIBLE);
                tPicker1.setVisibility(View.INVISIBLE);
                dPicker1.setVisibility(View.INVISIBLE);

                rdo1.setChecked(false);
                rdo2.setChecked(false);

                return false;
            }
        });

//        cal1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//            @Override
//            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
//                nYear = year;
//                nMonth = month + 1;
//                nDay = day;
//            }
//        });

    }

}








