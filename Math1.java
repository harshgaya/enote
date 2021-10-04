package com.example.jeephysics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Math1 extends AppCompatActivity {
    String[] urls=new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math1);
        urls[0]="https://drive.google.com/open?id=1dKISOvnqoiSu71XAdnbUUaFBFzM85jVJ";
        urls[1]="https://drive.google.com/open?id=1C7NivviRYIWLTEgOs6dKxoGYjV-VXdlz";
        urls[2]="hhttps://drive.google.com/open?id=1F-HdN3aWjyNQsyuOVl1gqxhAp-8gmBUI";
        urls[3]="https://drive.google.com/open?id=1pRTu53-D4dCBmSO-HgEqG9bjXVEqBe0a";
        urls[4]="https://drive.google.com/open?id=1DEUB7OflyeVQCQBM8jX0yyFPrVmF7dme";


        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Math-1");
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
        Intent int1=new Intent(Math1.this,web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }

    public void mechanics1(View view) {
        Intent int1=new Intent(Math1.this,web_activity.class);
        int1.putExtra("links",urls[1]);
        startActivity(int1);
    }
    public void mechanics2(View view) {
        Intent int1=new Intent(Math1.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);
    }
    public void mechanics3(View view) {
        Intent int1=new Intent(Math1.this,web_activity.class);
        int1.putExtra("links",urls[3]);
        startActivity(int1);
    }
    public void mechanics4(View view) {
        Intent int1=new Intent(Math1.this,web_activity.class);
        int1.putExtra("links",urls[4]);
        startActivity(int1);
    }


}
