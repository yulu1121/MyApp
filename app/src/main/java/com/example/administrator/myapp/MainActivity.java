package com.example.administrator.myapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //这是我修改过的Git
    public void sayHello(Context context){
        Toast.makeText(this, "你好", Toast.LENGTH_SHORT).show();
    }
}
