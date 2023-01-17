package com.example.ex10_3_both_activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edt1 = findViewById(R.id.edtNum1);
        EditText edt2 = findViewById(R.id.edtNum2);

        RadioGroup rg1 = findViewById(R.id.rdoGroup);

        RadioButton rdo1 = findViewById(R.id.rdoAdd);
        RadioButton rdo2 = findViewById(R.id.rdoSub);
        RadioButton rdo3 = findViewById(R.id.rdoMul);
        RadioButton rdo4 = findViewById(R.id.rdoDiv);

        Button btn1 = findViewById(R.id.btnNewActivity);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, SecondActivity.class );
                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                intent1.putExtra("Num1", num1);
                intent1.putExtra("Num2", num2);

                String operator1 = "";
                switch(rg1.getCheckedRadioButtonId())
                {
                    case R.id.rdoAdd:
                        operator1 = "+";
                        break;
                    case R.id.rdoSub:
                        operator1 = "-";
                        break;
                    case R.id.rdoMul:
                        operator1 = "*";
                        break;
                    case R.id.rdoDiv:
                        operator1 = "/*";
                        break;
                    default:
                        operator1 = "";
                }

                intent1.putExtra("Operator1", operator1);
                startActivityForResult(intent1, 0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){
            int result = data.getIntExtra("Result1", 0);
            Toast.makeText(getApplicationContext(), "결과:"+result, Toast.LENGTH_SHORT).show();;
        }

    }
}









