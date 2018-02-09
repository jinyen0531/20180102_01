package com.yenyu.a20180102_01;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
    //直接在主class 上 繼承View.OnClickListenter 的類別
    //若有多個按鈕，可以使用此方法搭配 switch-case的方法

{

    Button btn3; //宣告一個Button 變數
    ToggleButton tb;
    Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn3=(Button) findViewById(R.id.button3); //將宣告的btn3 指定id
        btn3.setOnClickListener(this); //若是使用直接繼承類別，這邊打this

        tb=(ToggleButton) findViewById(R.id.toggleButton);
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tb.isChecked()) {
                    Toast.makeText(MainActivity.this, "開啟", Toast.LENGTH_SHORT).show();
                }
                else //再次點擊後所響應的事情
                {
                    Toast.makeText(MainActivity.this, "關閉", Toast.LENGTH_SHORT).show();
                }
            }
        });

        sw=(Switch) findViewById(R.id.switch1);
        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sw.isChecked())
                {
                    Toast.makeText(MainActivity.this,"開啟",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"關閉",Toast.LENGTH_SHORT).show();
                }

            }
        });



    }

    public void click1(View v) {
        switch (v.getId())  //switch(
        {
            case R.id.button:
                Toast.makeText(this, "HELLO", Toast.LENGTH_LONG).show();
                //點擊後出現輸入的內容，通常使用於DEBUG
                //Toast.makeText(位址,"內容",顯示時間長度).show()
                break;
            case R.id.button2:
                Toast.makeText(this,"second",Toast.LENGTH_SHORT).show();
                break;

        }
    }

    @Override
    public void onClick(View view) //複寫在最下方 ，使用switch-case的方法可以輸入多個按鈕
    {
        switch (view.getId()) {
            case R.id.button3:
                Toast.makeText(MainActivity.this, "third", Toast.LENGTH_SHORT).show();

        }

    }
}
