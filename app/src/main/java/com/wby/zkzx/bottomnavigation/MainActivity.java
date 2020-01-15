package com.wby.zkzx.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.into_home_btn).setOnClickListener(view ->{
            HomeActivity.newInstance(this);
        } );
    }
}
