package com.example.ex10_2_picture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        setTitle("투표 결과");

        Intent intent1 = getIntent();
        int[] voteCount = intent1.getIntArrayExtra("VoteCount");
        String[] imageName = intent1.getStringArrayExtra("ImageName");

        //최다 득표수의 인덱스를 배열에서 찾아낸다.
//        int max = 0;
//        int max_index = 0;
//        for(int i=0; i<voteCount.length;++i)
//        {
//            if(voteCount[i]>max) {
//                max = voteCount[i];
//                max_index = i;
//            }
//        }

        int max_index = 0;
        for(int i=0; i<voteCount.length;++i)
        {
            if(voteCount[i]>voteCount[max_index]) {
                max_index = i;
            }
        }

        TextView tvMax = findViewById(R.id.tvMax);
        ImageView ivMax = findViewById(R.id.ivMax);

        Integer imageFileId[] = { R.drawable.pic1, R.drawable.pic2,
                R.drawable.pic3, R.drawable.pic4, R.drawable.pic5,
                R.drawable.pic6, R.drawable.pic7, R.drawable.pic8,
                R.drawable.pic9 };

        tvMax.setText(imageName[max_index]);
        ivMax.setImageResource(imageFileId[max_index]);


        TextView tvArr[] = new TextView[9];
        RatingBar rbArr[] = new RatingBar[9];

        Integer tvID[] = { R.id.tv1, R.id.tv2, R.id.tv3, R.id.tv4, R.id.tv5,
                R.id.tv6, R.id.tv7, R.id.tv8, R.id.tv9 };
        Integer rbarID[] = { R.id.rbar1, R.id.rbar2, R.id.rbar3, R.id.rbar4,
                R.id.rbar5, R.id.rbar6, R.id.rbar7, R.id.rbar8, R.id.rbar9 };

        for(int i=0; i<9;++i)
        {
            tvArr[i] = findViewById(tvID[i]);
            rbArr[i] = findViewById(rbarID[i]);
        }

        for(int i=0; i<9;++i)
        {
            tvArr[i].setText(imageName[i]);
            rbArr[i].setRating((float) voteCount[i]);
        }

        Button btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}