package com.example.jeephysics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Drawing extends AppCompatActivity {
    String[] urls=new String[7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);
        urls[0]="https://drive.google.com/open?id=1ht7CdPo-mdMby1nhPBGfYFvxjoexbhMU";
        urls[1]="https://drive.google.com/open?id=1yxLEF2MMMfXMnj60rq2fgiRF9TtLEhIT";
        urls[2]="https://drive.google.com/open?id=1IRTcYNG8Mi8FocInXzyfa3kj7o7Ph_ts";
        urls[3]="https://drive.google.com/open?id=1SirgBw9gzpHd_iSER3YG3xnKOATx9ml1";
        urls[4]="https://drive.google.com/open?id=1VYDW7J3L_tXREahsgO3AcP_ztz2RoU72";
        urls[5]="https://drive.google.com/open?id=11jD__ImlaomJpF3m4quzQJ3L614pGkqC";
        urls[6]="https://drive.google.com/open?id=1VVEehRyxU8sHaQv0caRLmZU5Jn-6ZWha";



        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Engineering Drawing");
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
        Intent int1=new Intent(Drawing.this,web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }

    public void mechanics1(View view) {
        Intent int1=new Intent(Drawing.this,web_activity.class);
        int1.putExtra("links",urls[1]);
        startActivity(int1);
    }

    public void mechanics2(View view) {
        Intent int1=new Intent(Drawing.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);
    }

    public void mechanics3(View view) {
        Intent int1=new Intent(Drawing.this,web_activity.class);
        int1.putExtra("links",urls[3]);
        startActivity(int1);
    }

    public void mechanics4(View view) {
        Intent int1=new Intent(Drawing.this,web_activity.class);
        int1.putExtra("links",urls[4]);
        startActivity(int1);
    }

    public void mechanics5(View view) {
        Intent int1=new Intent(Drawing.this,web_activity.class);
        int1.putExtra("links",urls[5]);
        startActivity(int1);
    }

    public void mechanics6(View view) {
        Intent int1=new Intent(Drawing.this,web_activity.class);
        int1.putExtra("links",urls[6]);
        startActivity(int1);
    }




}
