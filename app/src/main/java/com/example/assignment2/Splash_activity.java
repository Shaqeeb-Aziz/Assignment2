package com.example.assignment2;

import static java.lang.Thread.sleep;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        Thread thread= new Thread(new Runnable() {
            @Override
            public void run(){
                try {
                    sleep(3000);
                    Intent i=new Intent(Splash_activity.this,login_activity.class);
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        thread.start();
    }
}