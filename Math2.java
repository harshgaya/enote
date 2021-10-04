package com.example.jeephysics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Math2 extends AppCompatActivity {
    String[] urls=new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math2);
        urls[0]="https://stackoverflow.com/questions/36826829/display-content-under-toolbar";
        urls[1]="https://stackoverflow.com/questions/36826829/display-content-under-toolbar";
        urls[2]="https://stackoverflow.com/questions/36826829/display-content-under-toolbar";
        urls[3]="https://stackoverflow.com/questions/36826829/display-content-under-toolbar";
        urls[4]="https://stackoverflow.com/questions/36826829/display-content-under-toolbar";
        urls[5]="https://stackoverflow.com/questions/36826829/display-content-under-toolbar";
        urls[6]="https://stackoverflow.com/questions/36826829/display-content-under-toolbar";
        urls[7]="https://stackoverflow.com/questions/36826829/display-content-under-toolbar";
        urls[8]="https://stackoverflow.com/questions/36826829/display-content-under-toolbar";
        urls[9]="https://stackoverflow.com/questions/36826829/display-content-under-toolbar";



        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Math-2");
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
        Intent int1=new Intent(Math2.this,web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }

    public void mechanics1(View view) {
        Intent int1=new Intent(Math2.this,web_activity.class);
        int1.putExtra("links",urls[1]);
        startActivity(int1);
    }

    public void mechanics2(View view) {
        Intent int1=new Intent(Math2.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);
    }

    public void mechanics3(View view) {
        Intent int1=new Intent(Math2.this,web_activity.class);
        int1.putExtra("links",urls[3]);
        startActivity(int1);
    }

    public void mechanics4(View view) {
        Intent int1=new Intent(Math2.this,web_activity.class);
        int1.putExtra("links",urls[4]);
        startActivity(int1);
    }

    public void mechanics5(View view) {
        Intent int1=new Intent(Math2.this,web_activity.class);
        int1.putExtra("links",urls[5]);
        startActivity(int1);
    }

    public void mechanics6(View view) {
        Intent int1=new Intent(Math2.this,web_activity.class);
        int1.putExtra("links",urls[6]);
        startActivity(int1);
    }

    public void mechanics7(View view) {
        Intent int1=new Intent(Math2.this,web_activity.class);
        int1.putExtra("links",urls[7]);
        startActivity(int1);
    }

    public void mechanics8(View view) {
        Intent int1=new Intent(Math2.this,web_activity.class);
        int1.putExtra("links",urls[8]);
        startActivity(int1);
    }

    public void mechanics9(View view) {
        Intent int1=new Intent(Math2.this,web_activity.class);
        int1.putExtra("links",urls[9]);
        startActivity(int1);
    }
}
