package com.example.jeephysics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Prrogramming extends AppCompatActivity {
    String[] urls=new String[13];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prrogramming);
        urls[0]="https://drive.google.com/open?id=1C2QALIXvdQ8O9k0_RxoXSGDA-rSMXUgz";
        urls[1]="https://drive.google.com/open?id=1OMpjY_NirRWiF086b7z__phCGNuGu7CG";
        urls[2]="https://drive.google.com/open?id=17S90e_gdUSVvXw0Y2vjcSuJqu5Uhrq1K";
        urls[3]="https://drive.google.com/open?id=1_XEWtipL4l9cuu0Sj5awSN2g272fWrpU";
        urls[4]="https://drive.google.com/open?id=1SfDszNcnE_6SUHUkIKCAxwRKzddcd-TC";
        urls[5]="https://drive.google.com/open?id=1w6P7DmK5mSpkimBd-Gb9NYpjwjihA4uK";
        urls[6]="https://drive.google.com/open?id=1gntMNcOLI7J5bWSVFozw8I2nNm_mWjqS";
        urls[7]="https://drive.google.com/open?id=1b5SXr-JQK2cOlQ3Jdcbb3wb325tZITBD";
        urls[8]="https://drive.google.com/open?id=1Hdf622M9TYsQbNpkMhohp3WV91eKE5Nd";
        urls[9]="https://drive.google.com/open?id=1QeeNFL7h3N6kZKjZTYI4tHmSCr4ubwsJ";
        urls[10]="https://drive.google.com/open?id=1k3RT8QuP9OPJv4VFd2Pu92CxnHL9rzBw";
        urls[11]="https://drive.google.com/open?id=1C_u19yTyuthCDskfyuHz1wBHxD5i3IM6";
        urls[12]="https://drive.google.com/open?id=1y9throc9K4Lhr-FYeiWma4GrVH6OG4Zw";




        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Basic Programming");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void program0(View view) {
        Intent int1=new Intent(Prrogramming.this,web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }

    public void program1(View view) {
        Intent int1=new Intent(Prrogramming.this,web_activity.class);
        int1.putExtra("links",urls[1]);
        startActivity(int1);
    }

    public void program2(View view) {
        Intent int1=new Intent(Prrogramming.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);
    }

    public void program3(View view) {
        Intent int1=new Intent(Prrogramming.this,web_activity.class);
        int1.putExtra("links",urls[3]);
        startActivity(int1);
    }

    public void program4(View view) {
        Intent int1=new Intent(Prrogramming.this,web_activity.class);
        int1.putExtra("links",urls[4]);
        startActivity(int1);
    }

    public void program5(View view) {
        Intent int1=new Intent(Prrogramming.this,web_activity.class);
        int1.putExtra("links",urls[5]);
        startActivity(int1);
    }

    public void program6(View view) {
        Intent int1=new Intent(Prrogramming.this,web_activity.class);
        int1.putExtra("links",urls[6]);
        startActivity(int1);
    }

    public void program7(View view) {
        Intent int1=new Intent(Prrogramming.this,web_activity.class);
        int1.putExtra("links",urls[7]);
        startActivity(int1);
    }

    public void program8(View view) {
        Intent int1=new Intent(Prrogramming.this,web_activity.class);
        int1.putExtra("links",urls[8]);
        startActivity(int1);
    }

    public void program9(View view) {
        Intent int1=new Intent(Prrogramming.this,web_activity.class);
        int1.putExtra("links",urls[9]);
        startActivity(int1);
    }
    public void program10(View view) {
        Intent int1=new Intent(Prrogramming.this,web_activity.class);
        int1.putExtra("links",urls[10]);
        startActivity(int1);
    }
    public void program11(View view) {
        Intent int1=new Intent(Prrogramming.this,web_activity.class);
        int1.putExtra("links",urls[11]);
        startActivity(int1);
    }
    public void program12(View view) {
        Intent int1=new Intent(Prrogramming.this,web_activity.class);
        int1.putExtra("links",urls[12]);
        startActivity(int1);
    }
}
