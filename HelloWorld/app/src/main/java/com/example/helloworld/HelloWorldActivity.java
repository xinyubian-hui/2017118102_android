package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HelloWorldActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "HelloWorldActivity";
    //private static int objCount=0;
    //private int mObjCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Hello1");
        setContentView(R.layout.hello_world_layout);
      //  objCount++;
       // mObjCount=objCount;
        Log.d(TAG,"onCreat execute");
        Button Hello1 = (Button) findViewById(R.id.Hello1);
        Hello1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelloWorldActivity.this, HelloWorldActivity.class);
                startActivity(intent);
            }
        });
        Button Hello2 = (Button) findViewById(R.id.Hello2);
        Hello2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelloWorldActivity.this, Activity2.class);
                startActivity(intent);
            }
        });
        Button Hello3 = (Button) findViewById(R.id.Hello3);
        Hello3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelloWorldActivity.this, Activity3.class);
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
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        //Log.d(TAG, msg:mobjCount+"-onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //objCount--;
        Log.d(TAG, "onDestroy");
    }

    @Override
    public void onClick(View view) {

    }


}
