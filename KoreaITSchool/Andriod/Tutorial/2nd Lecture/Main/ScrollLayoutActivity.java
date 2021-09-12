package com.example.myapplication;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

public class ScrollLayoutActivity extends AppCompatActivity {

    ImageView imgRoadster;
    BitmapDrawable bitmap;      // A Drawable that wraps a bitmap and can be tiled, stretched, or aligned.
                                // You can create a BitmapDrawable from a file path, an input stream, through XML inflation
    ScrollView scrView;         // ScrollView is a view group that is used to make vertically scrollable views.

    // imageView 객체를 가지고 오기 위해서 imageView
    // bitmap 접근하기 위해서는 bitmap  // everything that is drawn in android is a Bitmap.
    // ScrollView 객체를 사용하기 위해서는 scrollView


    int flagImg = 0;

    @Override   // overriding is a feature that allows a subclass to provide a specific implementation of a method that is already provided by super class
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_main);

        imgRoadster = findViewById(R.id.imageView3);
        scrView = findViewById(R.id.scrollView);
        scrView.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();     // getResource() method finds a resource with the specified name. Returns the resources of the module in which this class exists.
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.roadster); // bitmap 에 이미지를 입력한다.
        int bitmapH = bitmap.getIntrinsicHeight();  // 비트맵에서 이미지의 높이 원본을 가지고 온다 (int 형식으로)
        int bitmapW = bitmap.getIntrinsicWidth();   // 비트맵에서 이미지의 넓이 원본을 가지고 온다 (int 형식으로)

        imgRoadster.setImageDrawable(bitmap);
        imgRoadster.getLayoutParams().width = bitmapW;  // getLayoutParams() = 현재 레이아웃 요소의 속성객체를 얻어오는 것
        imgRoadster.getLayoutParams().height = bitmapH; // 이미지를 찾을때, int 형식으로 다시 찾을 수 있고,
        // from my understanding, the image is saved in to bitmap -> converted into integer (with real values)-> then put it back in img under integer & bitmap format so for later it is already in actual size + integer form
    }

    public void onBtn(View v) {
        Resources res = getResources();

        if(flagImg == 0) {  // click 하지 않고 초기단계 에서는 설정된 이미지로
            flagImg = 1;    // 1 번 이지미로 변경
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.roadster);

        } else if(flagImg == 1) {
            flagImg = 0;
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.roadster);

        }

        int bitmapH = bitmap.getIntrinsicHeight();
        int bitmapW = bitmap.getIntrinsicWidth();

        imgRoadster.setImageDrawable(bitmap);
        imgRoadster.getLayoutParams().width = bitmapW;
        imgRoadster.getLayoutParams().height = bitmapH;
    }
}