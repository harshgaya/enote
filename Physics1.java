package com.example.jeephysics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;



public class Physics1 extends AppCompatActivity {
    String[] urls=new String[6];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics1);
        urls[0]="https://drive.google.com/open?id=1xabRl-r2lKqUNiB6HZQZZvFoBr1rQMed";
        urls[1]="https://drive.google.com/open?id=1Ygt3BzTPiqng37teuWTavQNYUwfwgt1S";
        urls[2]="https://drive.google.com/open?id=1bE8jeO6y3fTpJ6ZCUFWOyu3QwQmv39vZ";
        urls[3]="";
        urls[4]="";
        urls[5]="";


        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Physics-1");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);





    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void mechanics(View view) {
        Intent int1=new Intent(Physics1.this,web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }

    public void mechanics1(View view) {
        Intent int1=new Intent(Physics1.this,web_activity.class);
        int1.putExtra("links",urls[1]);
        startActivity(int1);
    }

    public void mechanics2(View view) {
        Intent int1=new Intent(Physics1.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);
    }

    public void mechanics3(View view) {
        Intent int1=new Intent(Physics1.this,web_activity.class);
        int1.putExtra("links",urls[3]);
        startActivity(int1);
    }

    public void mechanics4(View view) {
        Intent int1=new Intent(Physics1.this,web_activity.class);
        int1.putExtra("links",urls[4]);
        startActivity(int1);
    }

    public void mechanics5(View view) {
        Intent int1=new Intent(Physics1.this,web_activity.class);
        int1.putExtra("links",urls[5]);
        startActivity(int1);
    }




}
