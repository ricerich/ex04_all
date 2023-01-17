package com.example.ex11_2_grid_view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("그리드뷰");

        GridView gv1 = findViewById(R.id.gridView1);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(1,2,3);
        MyGridAdapter adapter1 = new MyGridAdapter(this);
        gv1.setAdapter(adapter1);

    }

    class MyGridAdapter extends BaseAdapter {


        Integer[] posterID = { R.drawable.mov01, R.drawable.mov02,
                R.drawable.mov03, R.drawable.mov04, R.drawable.mov05,
                R.drawable.mov06, R.drawable.mov07, R.drawable.mov08,
                R.drawable.mov09, R.drawable.mov10, R.drawable.mov01,
                R.drawable.mov02, R.drawable.mov03, R.drawable.mov04,
                R.drawable.mov05, R.drawable.mov06, R.drawable.mov07,
                R.drawable.mov08, R.drawable.mov09, R.drawable.mov10,
                R.drawable.mov01, R.drawable.mov02, R.drawable.mov03,
                R.drawable.mov04, R.drawable.mov05, R.drawable.mov06,
                R.drawable.mov07, R.drawable.mov08, R.drawable.mov09,
                R.drawable.mov10 };

        String[] posterTitle = { "써니", "완득이", "괴물", "라디오스타", "비열한거리", "왕의남자",
                "아일랜드", "웰컴투동막골", "헬보이", "빽투더퓨처", "써니", "완득이", "괴물", "라디오스타",
                "비열한거리", "왕의남자", "아일랜드", "웰컴투동막골", "헬보이", "빽투더퓨처", "써니", "완득이",
                "괴물", "라디오스타", "비열한거리", "왕의남자", "아일랜드", "웰컴투동막골", "헬보이",
                "빽투더퓨처", "써니", "완득이", "괴물", "라디오스타", "비열한거리", "왕의남자", "아일랜드",
                "웰컴투동막골", "헬보이", "빽투더퓨처" };

        Context context1;
        public MyGridAdapter(Context context1) {
            this.context1 = context1;
        }

        @Override
        public int getCount() {
            return posterID.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {

            ImageView iv1 = new ImageView(context1);
            GridView.LayoutParams params = new GridView.LayoutParams(200,300);
            iv1.setLayoutParams(params);
            iv1.setScaleType(ImageView.ScaleType.FIT_CENTER);
            iv1.setPadding(5,5,5,5);
            iv1.setImageResource(posterID[position]);

            iv1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    View dView = View.inflate(context1,R.layout.dialog1,null);
                    ImageView iv1 = dView.findViewById(R.id.ivPoster);
                    iv1.setImageResource(posterID[position]);

                    AlertDialog.Builder dlg = new AlertDialog.Builder(context1);
//                    dlg.setTitle("포스터");
                    dlg.setTitle(posterTitle[position]);
                    dlg.setIcon(R.drawable.movie_icon);
                    dlg.setView(dView);
                    dlg.setNegativeButton("닫기", null);
                    dlg.show();

                }
            });

            return iv1;
        }
    }

}