package com.example.ex7_3_dialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            boolean[] checkArray = new boolean[] { false, false, false };

            public void onClick(View v) {

                final String[] versionArray = new String[] { "누가", "오레오", "파이" };
//                final boolean[] checkArray = new boolean[] { true, false, false };
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("좋아하는 버전은?");
                dlg.setIcon(R.mipmap.ic_launcher);


                dlg.setMultiChoiceItems(versionArray, checkArray,
                        new DialogInterface.OnMultiChoiceClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which, boolean isChecked) {

                                String str1="선택 안됨!";
                                int cnt = 0;
                                for(int i=0; i<checkArray.length;i++)
                                {
                                    if(checkArray[i])
                                    {
                                        if(cnt == 0)
                                            str1 = versionArray[i];
                                        else
                                            str1 = str1 + "," + versionArray[i];

                                        cnt++;
                                    }

                                }
//                                button1.setText(versionArray[which]);
                                button1.setText(str1);
                            }
                        });
                dlg.setPositiveButton("닫기", null);
                dlg.show();

            }
        });
    }
}
