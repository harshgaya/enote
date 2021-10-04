package com.example.jeephysics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Chemistry extends AppCompatActivity {
    String[] urls=new String[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry);
        urls[0]="https://drive.google.com/open?id=1mHQz0KBYyYotrBbV7MfIAdMezZuBujrO";
        urls[1]="https://drive.google.com/open?id=1GxCWrcXIqNNUV-KpYvO6GAKU6FnLnleu";
        urls[2]="https://drive.google.com/open?id=1TdFlU6GXthNg24dQEKA80bqFo2_pnM2W";
        urls[3]="https://drive.google.com/open?id=1Fe8A60wNG9t77MKrW77YW9rxhQWkn-JU";
        urls[4]="https://drive.google.com/open?id=1XHPcJKXwatEc0sDG3cEkqgytD4aM31yr";
        urls[5]="https://drive.google.com/open?id=1l4oKD4BvhFd5UA_M0KQSU02WQsF3P18Q";
        urls[6]="https://drive.google.com/open?id=1LC_qXFwOQlRXfJF1bXJUzt_6iSPtypxT";
        urls[7]="";


        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chemistry");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void chemistry1(View view) {
        Intent int1=new Intent(Chemistry.this,web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }

    public void chemistry2(View view) {
        Intent int1=new Intent(Chemistry.this,web_activity.class);
        int1.putExtra("links",urls[1]);
        startActivity(int1);
    }

    public void chemistry3(View view) {
        Intent int1=new Intent(Chemistry.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);
    }

    public void chemistry4(View view) {
        Intent int1=new Intent(Chemistry.this,web_activity.class);
        int1.putExtra("links",urls[3]);
        startActivity(int1);
    }

    public void chemistry5(View view) {
        Intent int1=new Intent(Chemistry.this,web_activity.class);
        int1.putExtra("links",urls[4]);
        startActivity(int1);
    }

    public void chemistry6(View view) {
        Intent int1=new Intent(Chemistry.this,web_activity.class);
        int1.putExtra("links",urls[5]);
        startActivity(int1);
    }

    public void chemistry7(View view) {
        Intent int1=new Intent(Chemistry.this,web_activity.class);
        int1.putExtra("links",urls[6]);
        startActivity(int1);
    }


}
