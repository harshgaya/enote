package com.example.jeephysics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class BasicElectronics extends AppCompatActivity {
    String[] urls=new String[3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_electronics);
        urls[0]="https://drive.google.com/open?id=1HGjgzG-ZwZ8JZ89qivHyci4XIYVsJgsn";
        urls[1]="https://m.youtube.com/channel/UCozOScy51HpPWZT1xWHqZbA";
        urls[2]="https://m.youtube.com/channel/UCozOScy51HpPWZT1xWHqZbA";


        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Basic Electronics");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void electronics(View view) {
        Intent int1=new Intent(BasicElectronics.this,web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }
    public void electronics1(View view) {
        Intent int1=new Intent(BasicElectronics.this,web_activity.class);
        int1.putExtra("links",urls[1]);
        startActivity(int1);

    }
    public void electronics2(View view) {
        Intent int1=new Intent(BasicElectronics.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);

    }
}
