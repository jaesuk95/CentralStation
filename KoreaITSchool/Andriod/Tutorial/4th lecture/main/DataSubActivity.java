package com.example.day4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DataSubActivity extends AppCompatActivity {

    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent i = getIntent();
        ParcelData data = i.getParcelableExtra("data");

        Toast.makeText(this, data.name, Toast.LENGTH_SHORT).show();

        txtView = findViewById(R.id.sbtext);
        txtView.setText("phone  :" + data.phone +
                "\nname      : " + data.name +
                "\nuserName : " + data.userName +
                "\npassword : " + data.password);
    }
}