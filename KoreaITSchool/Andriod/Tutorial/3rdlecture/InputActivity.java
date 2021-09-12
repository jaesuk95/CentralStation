package com.example.day3;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class InputActivity extends AppCompatActivity {

    EditText editPhone;
    EditText editName;
    EditText editUserName;
    EditText editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instagram);
    // 새 콘텐츠 View 로  resource 에 layout folder 에 있는 txtView xml 를 가지고 오겠다 이런 뜻이다.

       // txtView = (TextView) findViewById(R.id.textView45);        // 내가 만든 textView45 를 가지고 오겠다
       // txtView.setText("안녕하세요 안드로이드 3일차 수업");              // 그리고 거기에다가 쓰겠다.


        editPhone = findViewById(R.id.editPhone);
        editName = findViewById(R.id.editName);
        editUserName = findViewById(R.id.editUserName);
        editPassword = findViewById(R.id.editPassword);

        Button btnResult = findViewById(R.id.result);
        btnResult.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(InputActivity.this);

                builder.setTitle("가입");
                builder.setMessage("회원가입을 진행합니다");
                builder.setIcon(android.R.drawable.ic_dialog_info);



                builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),                                 // toast 기능
                                "가입 진행" +
                                        editPhone.getText() +
                                        editName.getText() +
                                        editUserName.getText() +
                                        editPassword.getText()
                                , Toast.LENGTH_LONG).show();
                    }
                });



                builder.setNeutralButton("아니오", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Snackbar.make(view, "회원가입 취소.", Snackbar.LENGTH_SHORT).show();  // snackBar 기능
                        editPhone.setText("");
                        editName.setText("");
                        editUserName.setText("");
                        editPassword.setText("");
                    }
                });



                builder.setNegativeButton("다음에!", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Snackbar.make(view, "회원가입 취소.", Snackbar.LENGTH_SHORT).show();  // snackBar 기능
                        editPhone.setText("");
                        editName.setText("");
                        editUserName.setText("");
                        editPassword.setText("");
                    }
                });



                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }
    
}