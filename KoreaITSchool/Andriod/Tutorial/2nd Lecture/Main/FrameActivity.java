package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FrameActivity extends AppCompatActivity {

    ImageView imgAos;
    ImageView imgIos;

    int flagImg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        imgAos = findViewById(R.id.aos);        // R = resource
        imgIos = findViewById(R.id.ios);

    }

    public void onBtn(View v) {

        if(flagImg == 0) {
            flagImg = 1;
            imgAos.setVisibility(View.VISIBLE);
            imgIos.setVisibility(View.INVISIBLE);

        } else if(flagImg == 1) {
            flagImg = 0;
            imgIos.setVisibility(View.VISIBLE);
            imgAos.setVisibility(View.INVISIBLE);
        }

    }

}