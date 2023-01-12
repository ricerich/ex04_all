package com.example.ex6_2_viewflipper;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    static int index = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPrev, btnNext;
        final ViewFlipper vFlipper;

        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnNext = (Button) findViewById(R.id.btnNext);

        vFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);


        LinearLayout base1 = findViewById(R.id.baseLayout);

        int color1[] = {Color.RED, Color.GREEN, Color.BLUE};

        vFlipper.setFlipInterval(1000);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                vFlipper.showPrevious();
                vFlipper.startFlipping();

                if(index==0)
                    index=2;
                else
                    index--;
                index = index % 3;
                base1.setBackgroundColor(color1[index]);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                vFlipper.showNext();
                vFlipper.stopFlipping();

                index++;
                index = index % 3;
                base1.setBackgroundColor(color1[index]);
            }
        });
    }
}
