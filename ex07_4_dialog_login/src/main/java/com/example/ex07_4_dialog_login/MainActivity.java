package com.example.ex07_4_dialog_login;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtEmail;
    Button button1;
    EditText dlgEdtName, dlgEdtEmail;
    TextView toastText;
    View dialogView, toastView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("사용자 정보 입력");

        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);

        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                String strName = edtName.getText().toString();
                String strEmail = edtEmail.getText().toString();

                dialogView = (View) View.inflate(MainActivity.this,
                        R.layout.dialog1, null);

                dlgEdtName = (EditText) dialogView.findViewById(R.id.dlgEdt1);
                dlgEdtEmail = (EditText) dialogView.findViewById(R.id.dlgEdt2);

                dlgEdtName.setText(strName);
                dlgEdtEmail.setText(strEmail);

                AlertDialog.Builder dlg = new AlertDialog.Builder(
                        MainActivity.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.ic_menu_allfriends);
                dlg.setView(dialogView);
                dlg.setPositiveButton("확인",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
//                                dlgEdtName = (EditText) dialogView
//                                        .findViewById(R.id.dlgEdt1);
//                                dlgEdtEmail = (EditText) dialogView
//                                        .findViewById(R.id.dlgEdt2);

                                edtName.setText(dlgEdtName.getText().toString());
                                edtEmail.setText(dlgEdtEmail.getText()
                                        .toString());
                                // dlgLayout = null;
                            }
                        });

                dlg.setNegativeButton("취소",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Toast toast = new Toast(MainActivity.this);


                                Display display = ((WindowManager) getSystemService(WINDOW_SERVICE))
                                        .getDefaultDisplay();
                                int xOffset = (int) (Math.random() * display.getWidth());
                                int yOffset = (int) (Math.random() * display.getHeight());

                                toast.setGravity(Gravity.TOP | Gravity.LEFT,
                                        xOffset, yOffset);

                                toastView = (View) View.inflate(
                                        MainActivity.this,
                                        R.layout.toast1, null);
                                toastText = (TextView) toastView
                                        .findViewById(R.id.toastText1);
                                toastText.setText("취소했습니다");

                                toast.setView(toastView);
                                toast.show();
                            }
                        });
                dlg.show();

            }
        });

    }
}
