package com.goldfish.sevenseconds.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.goldfish.sevenseconds.R;

public class MyPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page);

        Button myMessage = (Button) findViewById(R.id.myMessage);
        Button myInformation = (Button) findViewById(R.id.myInformation);
        Button mySetting = (Button) findViewById(R.id.mySetting);
        Button myFollow = (Button) findViewById(R.id.myFollow);

        mySetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myToSetting = new Intent(MyPageActivity.this, SettingActivity.class);
                startActivity(myToSetting);
            }
        });

        myInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myToInformation = new Intent(MyPageActivity.this, InformationActivity.class);
                myToInformation.putExtra("currentUser", "y741323965");  // 到时候改成登陆成功的对象账号
                startActivity(myToInformation);
            }
        });

        myFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myToFollow = new Intent(MyPageActivity.this, MyFollowActicity.class);
                startActivity(myToFollow);
            }
        });
    }
}
