package com.example.assignment2;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class login_activity extends AppCompatActivity {

    TextView b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b= findViewById(R.id.signup);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent P= new Intent (login_activity.this,signup_activity.class);
                startActivity(P);

            }
        });

        TextView c;
        c= findViewById(R.id.aboutus);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Q= new Intent (login_activity.this,Aboutus_activity.class);
                startActivity(Q);

            }
        });

        TextView d;
        d= findViewById(R.id.contactus);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent R= new Intent (login_activity.this,contact_us.class);
                startActivity(R);

            }
        });

    }
}