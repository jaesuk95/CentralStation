package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instagram);
    // 새 콘텐츠 View 로  resource 에 layout folder 에 있는 txtView xml 를 가지고 오겠다 이런 뜻이다.

       // txtView = (TextView) findViewById(R.id.textView45);        // 내가 만든 textView45 를 가지고 오겠다
       // txtView.setText("안녕하세요 안드로이드 3일차 수업");              // 그리고 거기에다가 쓰겠다.
    }
}