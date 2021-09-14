package com.example.day6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;


public class MainTabActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintab);

        Intent i = getIntent();
        if (i.getParcelableExtra("join") != null){      // 꺼냈을때 데이터가 null 이 아니면
            userDataSetting(i.getParcelableExtra("join"));  // userDataSetting 에 "join" 이라는 함수안에 뽑은 데이터를 넘겨준다
        }

    }
    private void userDataSetting(ParcelData data ) // userDataSetting 은 ParcelData 에 이어받는다.
    {

        textView = findViewById(R.id.textView);
        textView.setText("name "+ data.name +
                "\nuserName "+data.userName+
                "\nphoneNumber "+data.phoneNumber+
                "\npassword "+data.password);   // 해당되는 데이터에 접근을 해서 textView 로 보여준다
    }

    private void moveLoginActivity() {
//        Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
//        startActivityForResult(intent,1001);//액티비티 띄우기
//        ParcelData data = new ParcelData("코리아","신촌","01011112222","안녕하세요");

        Intent intent = new Intent(MainTabActivity.this, LoginActivity.class);
        startActivityResult.launch(intent);
    }


    ActivityResultLauncher<Intent> startActivityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {

                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {

                    }
                }
            });
}