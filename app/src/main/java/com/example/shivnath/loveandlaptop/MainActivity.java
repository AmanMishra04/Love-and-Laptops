package com.example.shivnath.loveandlaptop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saythakyou(View view) {
        TextView tv;
        tv = (TextView) findViewById(R.id.text);
        tv.setVisibility(tv.VISIBLE);
    }
}
