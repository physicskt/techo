package com.example.rihoy.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static com.example.rihoy.myapplication2.R.layout.activity_main2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // ボタンクリック時のイベント処理    ボタンを押されたらテストという表示をする
//    public void clickbutton5(View view) {
//        Toast toast = Toast.makeText(MainActivity.this, "テスト", Toast.LENGTH_LONG);
//        toast.show();
//    }


    // ボタンクリック時のイベント処理
    public void clickbutton5(View view) {
        Intent clickbutton5intent = new Intent(this, Main2Activity.class);
        startActivity(clickbutton5intent);
    }
}
