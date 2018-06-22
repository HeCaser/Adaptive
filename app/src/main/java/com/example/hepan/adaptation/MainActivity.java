package com.example.hepan.adaptation;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Configuration config = getResources().getConfiguration();
        int  smallestScreenWidth = config.smallestScreenWidthDp;
        System.out.println("最小宽度 "+smallestScreenWidth);
    }
}
