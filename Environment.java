package com.example.jeephysics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Environment extends AppCompatActivity {
    String[] urls=new String[22];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_environment);
        urls[0]="https://stackoverflow.com/questions/36826829/display-content-under-toolbar";
        urls[1]="https://drive.google.com/open?id=1yHJfZ29kSHz-sIS-1147MPq63hym1UJs";
        urls[2]="https://drive.google.com/open?id=1z38ulnLLExAObynTuNbMN0WBpDUPvC-u";
        urls[3]="https://drive.google.com/open?id=16KBJH_RpRqgJWIlV1R91L9995MfG-rPv";
        urls[4]="https://drive.google.com/open?id=1D6TyWXhDa9l7WdkaCEVp_HP-H4-QsbZ3";
        urls[5]="https://drive.google.com/open?id=1PUqbsPP7peFImOcxQkAazEqdRedb7-q_";
        urls[6]="https://drive.google.com/open?id=1AaR1Vr4UsqEtMz2vKieY2ReOvtYK_bOH";
        urls[7]="https://drive.google.com/open?id=1BTo772jMJ9S-Y3xNyIHMDxqr_zogCkf3";
        urls[8]="https://drive.google.com/open?id=1Hn1GLQ1MznjIqbb6Eg2-qrselFQA1FJ9";
        urls[9]="https://drive.google.com/open?id=1lwryLWTmWjp58WQTN_rixYsogHSBcbcA";
        urls[10]="https://drive.google.com/open?id=1jy50DpxUpYs6FmzPOkJIaFytEddz1XHd";
        urls[11]="https://drive.google.com/open?id=1JocKuJHUkAvBfU2XjaiTUEVxz6ybpNA5";
        urls[12]="https://drive.google.com/open?id=1MzNn4WLYziEqjoTX8_CuuZyEjS_crIis";
        urls[13]="https://drive.google.com/open?id=1mPgvuU1WekpvT6a3TDavXcqAVXXEJiPw";
        urls[14]="https://drive.google.com/open?id=1iFqEZ7-S3altX0zAWi7VNUr0vvqwFEnP";
        urls[15]="https://drive.google.com/open?id=1qDiBrEeG5XW8MJof7YJutACO5mcvh20_";
        urls[16]="https://drive.google.com/open?id=1T4dQyXWUvhgcKsKFJxhixyPIrce9gYcT";
        urls[17]="https://drive.google.com/open?id=1FV8tTbjxRxfe3fBTVVkw-5iP6BXAl5uM";
        urls[18]="https://drive.google.com/open?id=1yrr0O2o4niqxlxAFYsxvJ3QqKUBsbk1Q";
        urls[19]="https://drive.google.com/open?id=14jdhMR6ksMHt7_GXDUl1VRdlqtmQF8Ew";
        urls[20]="https://drive.google.com/open?id=1TeVqeJFslwerUc1di5tS_3BWGTbLVF7m";
        urls[21]="https://drive.google.com/open?id=1lXbrt8kx4qqHpJIn1eEFA5DFv6jwAwB2";




        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Environmental");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void evs0(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }

    public void evs1(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[1]);
        startActivity(int1);
    }

    public void evs2(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);
    }

    public void evs3(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[3]);
        startActivity(int1);
    }

    public void evs4(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[4]);
        startActivity(int1);
    }

    public void evs5(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[5]);
        startActivity(int1);
    }

    public void evs6(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[6]);
        startActivity(int1);
    }

    public void evs7(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[7]);
        startActivity(int1);
    }

    public void evs8(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[8]);
        startActivity(int1);
    }

    public void evs9(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[9]);
        startActivity(int1);
    }
    public void evs10(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[10]);
        startActivity(int1);
    }
    public void evs11(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[11]);
        startActivity(int1);
    }
    public void evs12(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[12]);
        startActivity(int1);
    }
    public void evs13(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[13]);
        startActivity(int1);
    }
    public void evs14(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[14]);
        startActivity(int1);
    }
    public void evs15(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[15]);
        startActivity(int1);
    }
    public void evs16(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[16]);
        startActivity(int1);
    }
    public void evs17(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[17]);
        startActivity(int1);
    }
    public void evs18(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[18]);
        startActivity(int1);
    }
    public void evs19(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[19]);
        startActivity(int1);
    }
    public void evs20(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[20]);
        startActivity(int1);
    }
    public void evs21(View view) {
        Intent int1=new Intent(Environment.this,web_activity.class);
        int1.putExtra("links",urls[21]);
        startActivity(int1);
    }

}
