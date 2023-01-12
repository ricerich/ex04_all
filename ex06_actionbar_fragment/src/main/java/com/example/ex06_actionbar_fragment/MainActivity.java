package com.example.ex06_actionbar_fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        //1-1.액션바 (메뉴바)
        //1-2.탭1,탭2,탭3 (메뉴)
        //2.프레그먼트 (콘텐트) : 프래그먼트 만들기(생성) 중요하고 어려움
        //3.1과2를 연동 - 예)탭1을 클릭하면, 아래(프래그먼트의 1개 리니어레이아웃) 내용이 바뀐다

        //1-1.액션바 (메뉴바)
        ActionBar bar = getSupportActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        //1-2.탭1,탭2,탭3 (메뉴)
        ActionBar.Tab tab1, tab2, tab3;

        tab1 = bar.newTab();
        tab1.setText("음악별");
        tab1.setTabListener(this);
        bar.addTab(tab1);

        tab2 = bar.newTab();
        tab2.setText("가수별");
        tab2.setTabListener(this);
        bar.addTab(tab2);

        tab3 = bar.newTab();
        tab3.setText("앨범별");
        tab3.setTabListener(this);
        bar.addTab(tab3);

        //2.프레그먼트 (콘텐트) : 프래그먼트 만들기(생성) 중요하고 어려움

    }

    //프래그먼트 객체 배열 만들기
    MyTabFragment myFrags[] = new MyTabFragment[3];

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        //1.프레그먼트 객체 배열에 프래그먼트가 존재하는지 체크
        //2.배열 안에 "없으면" 프래그먼트 new 한 후에,
        //  액티비티(프래그먼트트랜잭션)에 꽂아줌, 그리고 객체배열에 저장
        //3.배열안에 "있으면",
        //  배열안에 있는 프로그먼트 객체 꺼내서, 화면(프래그먼트트랜잭션)에 꽂아줌!

        if(myFrags[tab.getPosition()]==null)//배열안에 없으면
        {
            MyTabFragment myTabFrag = new MyTabFragment();

            Bundle data = new Bundle();
            data.putString("tabName", tab.getText().toString());
            myTabFrag.setArguments(data);

            ft.replace(android.R.id.content,myTabFrag);
            myFrags[tab.getPosition()] = myTabFrag;
        }
        else//배열 안에 있으면,
        {
            MyTabFragment myTabFrag = myFrags[tab.getPosition()];

            ft.replace(android.R.id.content,myTabFrag);
        }
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    //멤버영역 = 4번 이너클래스~!
    public static class MyTabFragment extends Fragment {
        //2단계로 프래그먼트 만든다
        //1.프레그먼트 생성 - onCreate(){}
        //2.프레그먼트 뷰(=화면) 생성  - onCreateView(){}

        //1.프레그먼트 생성 - onCreate(){}

        String tabName;
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            //액션바의 탭이 가수별,앨범별 뭐가 눌러졌는지 OS로 부터 받아온다.
            Bundle data = getArguments();
            tabName = data.getString("tabName");
        }

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            LinearLayout.LayoutParams params
                    = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                                                    LinearLayout.LayoutParams.MATCH_PARENT);
            LinearLayout baseLayout = new LinearLayout(super.getActivity());
            baseLayout.setOrientation(LinearLayout.VERTICAL);
            baseLayout.setLayoutParams(params);

            if(tabName.equals("음악별"))
                baseLayout.setBackgroundColor(Color.RED);
            else if(tabName.equals("가수별"))
                baseLayout.setBackgroundColor(Color.GREEN);
            else if(tabName.equals("앨범별"))
                baseLayout.setBackgroundColor(Color.BLUE);

            return baseLayout;
        }
    }

}