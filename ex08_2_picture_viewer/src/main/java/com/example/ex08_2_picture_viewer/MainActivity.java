package com.example.ex08_2_picture_viewer;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import java.io.File;
public class MainActivity extends AppCompatActivity {

    Button btnPrev, btnNext;
    MyPictureView myPicture;
    TextView tvNumber;
    int curNum;
    File[] imageFiles;
    String imageFname;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단 이미지 뷰어 (변경)");
        ActivityCompat.requestPermissions(this, new String[] {android.Manifest.permission.WRITE_EXTERNAL_STORAGE},MODE_PRIVATE);

        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnNext = (Button) findViewById(R.id.btnNext);
        tvNumber = (TextView) findViewById(R.id.tvNumber);
        myPicture = (MyPictureView) findViewById(R.id.myPictureView1);

        String path1 = Environment.getExternalStorageDirectory().getAbsolutePath()+"/Pictures";
        imageFiles = new File(path1).listFiles();

        imageFname = imageFiles[0].toString();
        myPicture.imagePath = imageFname;
        tvNumber.setText("1" + "/" + imageFiles.length);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (curNum <= 0) {
                    curNum = imageFiles.length - 1;
                } else {
                    curNum--;
                }
                imageFname = imageFiles[curNum].toString();
                myPicture.imagePath = imageFname;
                myPicture.invalidate();
                tvNumber.setText((curNum + 1) + "/" + imageFiles.length);

            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (curNum >= imageFiles.length - 1) {
                    curNum = 0;
                } else {
                    curNum++;
                }
                imageFname = imageFiles[curNum].toString();
                myPicture.imagePath = imageFname;
                myPicture.invalidate();
                tvNumber.setText((curNum + 1) + "/" + imageFiles.length);
            }
        });

    }

}
