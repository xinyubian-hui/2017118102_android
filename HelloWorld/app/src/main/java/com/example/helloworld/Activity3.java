package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    private static final String TAG = "Activity3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Hello3");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Log.d(TAG,"onCreat execute");
       // settupButtons();

        Button Hello1=(Button) findViewById(R.id.Hello1);
        Hello1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, HelloWorldActivity.class);
                startActivity(intent);
            }
        });
        Button Hello2=(Button) findViewById(R.id.Hello2);
        Hello2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, Activity2.class);
                startActivity(intent);
            }
        });
        Button Hello3=(Button) findViewById(R.id.Hello3);
        Hello3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, Activity3.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
