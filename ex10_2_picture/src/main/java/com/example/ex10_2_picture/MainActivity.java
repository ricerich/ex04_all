package com.example.ex10_2_picture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("명화 선호도 투표");

        int ivID[] = {R.id.iv1, R.id.iv2, R.id.iv3,
                      R.id.iv4, R.id.iv5, R.id.iv6,
                      R.id.iv7, R.id.iv8, R.id.iv9};
        ImageView []ivArr = new ImageView[ivID.length];
        //1.바인딩을 배열에
        for(int i=0; i<ivID.length; ++i)
            ivArr[i] = findViewById(ivID[i]);

        int voteCount[] = new int[9];
        for(int i=0; i<voteCount.length; ++i)
            voteCount[i] = 0;


        for(int i=0; i<voteCount.length; ++i)
        {
            int index = i;
            ivArr[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    voteCount[index]++;

                    Toast.makeText(getApplicationContext(), "총"+ voteCount[index]+" 표", Toast.LENGTH_SHORT).show();

                }
            });
        }

        final String imgName[] = { "독서하는 소녀", "꽃장식 모자 소녀", "부채를 든 소녀",
                "이레느깡 단 베르양", "잠자는 소녀", "테라스의 두 자매", "피아노 레슨", "피아노 앞의 소녀들",
                "해변에서" };

        Button btnResult = findViewById(R.id.btnResult);
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), ResultActivity.class);
                intent1.putExtra("VoteCount", voteCount);
                intent1.putExtra("ImageName", imgName);
                startActivity(intent1);
            }
        });


    }
}