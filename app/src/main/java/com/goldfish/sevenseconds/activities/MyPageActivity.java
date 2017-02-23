package com.goldfish.sevenseconds.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.goldfish.sevenseconds.R;
import com.goldfish.sevenseconds.bean.Information;
import com.goldfish.sevenseconds.bean.MyFollow;
import com.goldfish.sevenseconds.db.ChattingDatabaseHelper;

import org.litepal.tablemanager.Connector;

import java.io.ByteArrayOutputStream;

public class MyPageActivity extends AppCompatActivity {

    private SQLiteOpenHelper dbChattingDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page);

        // 测试
        /*Connector.getWritableDatabase();
        MyFollow test = new MyFollow();
        test.setName("世吹雀");
        test.setAccount("noend22");
        test.setIntroduction("大提琴/甜甜圈四重奏");
        Resources res = getResources();
        Bitmap bmp = ((BitmapDrawable) res.getDrawable(R.drawable.app_icon)).getBitmap();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, os);
        test.setFace(os.toByteArray());
        test.save();*/

        /*dbChattingDatabaseHelper = new ChattingDatabaseHelper(
                this, "MessageStore.db", null, 1);
        SQLiteDatabase dbMessage1 = dbChattingDatabaseHelper.getWritableDatabase();
        dbMessage1.execSQL("create table if not exists noend22 ("
                + "id integer primary key autoincrement, "
                + "account text, "
                + "message text, "
                + "time text, "
                + "sendOrReceive integer, "
                + "readOrNot integer)");
        dbMessage1.execSQL("insert into noend22 (account, message, time, sendOrReceive, readOrNot) " +
                        "values(?, ?, ?, ?, ?)",
                new String[]{"noend22", "Hey", "2017/2/24 10:32", "0", "0"});
        dbMessage1.execSQL("insert into noend22 (account, message, time, sendOrReceive, readOrNot) " +
                        "values(?, ?, ?, ?, ?)",
                new String[]{"y741323965", "Hey! What's up!", "2017/2/24 10:32", "1", "1"});
        dbMessage1.execSQL("insert into noend22 (account, message, time, sendOrReceive, readOrNot) " +
                        "values(?, ?, ?, ?, ?)",
                new String[]{"noend22", "Miss me?", "2017/2/24 10:33", "0", "0"});*/

        /*Resources res = getResources();
        Bitmap bmp = ((BitmapDrawable) res.getDrawable(R.drawable.app_icon)).getBitmap();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, os);
        Information test1 = new Information();
        test1.setFace(os.toByteArray());
        test1.setSex("男");
        test1.setIntroduction("穿睡服的金鱼/梦幻西游");
        test1.setName("Goldfish");
        test1.setAccount("y741323965");
        test1.setBirthday("1997-1-2");
        test1.setPhone("13719326474");
        test1.save();

        Information test2 = new Information();
        test2.setPhone("13502852468");
        test2.setBirthday("1997-1-1");
        test2.setAccount("noend22");
        test2.setName("世吹雀");
        test2.setIntroduction("大提琴/甜甜圈四重奏");
        test2.setSex("女");
        test2.save();*/

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

        myMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myToMessage = new Intent(MyPageActivity.this, MessageActivity.class);
                startActivity(myToMessage);
            }
        });
    }
}
