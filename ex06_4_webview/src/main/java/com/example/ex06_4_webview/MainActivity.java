package com.example.ex06_4_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtUrl = findViewById(R.id.edtUrl);
        Button btnGo = findViewById(R.id.btnGo);
        Button btnBack = findViewById(R.id.btnBack);

        WebView webView = findViewById(R.id.webView1);

        //1.웹뷰는 웹뷰클라이언트 객체가 필요함
//        webView.setWebViewClient(new MyWebViewClinet());

//        A a1 = new A();
        MyWebViewClinet c1 = new MyWebViewClinet();
        webView.setWebViewClient(c1);

        //2.버튼 클릭 이벤트
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.loadUrl(edtUrl.getText().toString());
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.goBack();
            }
        });

    }
    //내부(inner) 클래스로, 멤버, 가족임
    class MyWebViewClinet extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}