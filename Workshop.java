package com.example.jeephysics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Workshop extends AppCompatActivity {
    String[] urls=new String[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop);
        urls[0]="https://drive.google.com/open?id=1hBJf-eNQZTiuef9lPJ4VwrhlFn3NUsiN";
        urls[1]="https://drive.google.com/open?id=1QQfDWZAaUxtWTONU4qOKdBwRo1vPIwYe";
        urls[2]="https://drive.google.com/open?id=1h730BD7He0u4nSTc0OoCHm9kqbh6Hqjo";
        urls[3]="https://drive.google.com/open?id=1_StCT1vvakvCU8T4toHZdFurT1QR8EOy";
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Workshop Lab");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void workshop1(View view) {
        Intent int1=new Intent(Workshop.this,web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }
    public void workshop2(View view) {
        Intent int1=new Intent(Workshop.this,web_activity.class);
        int1.putExtra("links",urls[1]);
        startActivity(int1);

    }
    public void workshop3(View view) {
        Intent int1=new Intent(Workshop.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);

    }
    public void workshop4(View view) {
        Intent int1=new Intent(Workshop.this,web_activity.class);
        int1.putExtra("links",urls[3]);
        startActivity(int1);

    }
}
