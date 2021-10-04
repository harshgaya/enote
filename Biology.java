package com.example.jeephysics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Biology extends AppCompatActivity {
    String[] urls=new String[24];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biology);
        urls[0]="https://drive.google.com/open?id=17h_tTcXKtAJwN0vUczn6XPtKXtw4kAca";
        urls[1]="https://drive.google.com/open?id=1NmdwaKs2gDlMQQ1_jJvgyIlng6OYE3P2";
        urls[2]="https://drive.google.com/open?id=19zY2IdLZ4e9PJiK7jY_x0Q5S9pvufGYh";
        urls[3]="https://drive.google.com/open?id=1IHE9gj0aLNKuhdhHOn9mWMk8TSoSM0z-";
        urls[4]="https://drive.google.com/open?id=1Hn7DM2tqqWe_P4I_FI7UUcTiM4ZQ-D3a";
        urls[5]="https://drive.google.com/open?id=1qt-mbzxSKm_w7HWG8bkMqJC7Zn3N6Nz-";
        urls[6]="https://drive.google.com/open?id=1IbEoJTZsB0ISWqfyVinbGfhvxX8ZpgT7";
        urls[7]="https://drive.google.com/open?id=1_98d3JQyMG8oi3E3h54sF-8VXaVuSx1O";
        urls[8]="https://drive.google.com/open?id=1clOpxKeKUQe4IC2KMoTy2SI4tIGNuuYT";
        urls[9]="https://drive.google.com/open?id=1DMpRD_rHv2juBTO7j-nrxnaUGLZdFFON";
        urls[10]="https://drive.google.com/open?id=1hWtRtAFer1k9x6vrapGqG0viZW9v07BQ";
        urls[11]="https://drive.google.com/open?id=1Hs4e28Y1cMmg8gS_o7-8gzbedsmqqovN";
        urls[12]="https://drive.google.com/open?id=11kP69oQTlra2zctoJY3an0_1c0BMVPoF";
        urls[13]="https://drive.google.com/open?id=19I3rxwbxbIKRDCgFlZ-8oJdRgyZMmz2r";
        urls[14]="https://drive.google.com/open?id=1nXuaXmgkfXJV4FpqyQxVOnRCh16Dqvrk";
        urls[15]="https://drive.google.com/open?id=1vmBI5BJgBBVADudLNjYH1WT_jDFgZ3P_";
        urls[16]="https://drive.google.com/open?id=1EnC-BC4GdmZ9500y0t1h0bBbjnTYCwcl";
        urls[17]="https://drive.google.com/open?id=1mRY4oZ4mWGGkwEvYDxcXgKoDzSKr-zUR";
        urls[18]="https://drive.google.com/open?id=1toAXOyPYCYXa0A9L5ae6tdn5TVYKRyds";
        urls[19]="https://drive.google.com/open?id=1D2mOeHfroibxYeX70ZXGSSx79oC8KfRf";
        urls[20]="https://drive.google.com/open?id=1s-EkE2o2Afqf-aVAeWtU1JQT2QQOGpHD";
        urls[21]="https://drive.google.com/open?id=1M3Ik5rSW1zTNsq3ElZJmmcHjD7Ch0YXK";
        urls[22]="https://drive.google.com/open?id=12mByR8MA5HfSPpnKzCh1JkSaeVhkkdqo";
        urls[23]="https://drive.google.com/open?id=1FN5LQz0wYh6D0h0QiVY08MRp3Q0gQfI8";

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Biology");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void biology0(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }

    public void biology1(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[1]);
        startActivity(int1);
    }

    public void biology2(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);
    }

    public void biology3(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[3]);
        startActivity(int1);
    }

    public void biology4(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[4]);
        startActivity(int1);
    }

    public void biology5(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[5]);
        startActivity(int1);
    }

    public void biology6(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[6]);
        startActivity(int1);
    }

    public void biology7(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[7]);
        startActivity(int1);
    }

    public void biology8(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[8]);
        startActivity(int1);
    }

    public void biology9(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[9]);
        startActivity(int1);
    }
    public void biology10(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[10]);
        startActivity(int1);
    }
    public void biology11(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[11]);
        startActivity(int1);
    }
    public void biology12(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[12]);
        startActivity(int1);
    }
    public void biology13(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[13]);
        startActivity(int1);
    }
    public void biology14(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[14]);
        startActivity(int1);
    }
    public void biology15(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[15]);
        startActivity(int1);
    }
    public void biology16(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[16]);
        startActivity(int1);
    }
    public void biology17(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[17]);
        startActivity(int1);
    }
    public void biology18(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[18]);
        startActivity(int1);
    }
    public void biology19(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[19]);
        startActivity(int1);
    }
    public void biology20(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[20]);
        startActivity(int1);
    }
    public void biology21(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);
    }
    public void biology22(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[22]);
        startActivity(int1);
    }
    public void biology23(View view) {
        Intent int1=new Intent(Biology.this,web_activity.class);
        int1.putExtra("links",urls[23]);
        startActivity(int1);
    }
}
