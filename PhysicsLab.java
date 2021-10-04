package com.example.jeephysics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class PhysicsLab extends AppCompatActivity {
    String[] urls=new String[12];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_lab);
        urls[0]="https://drive.google.com/open?id=1VOVZTinozmO4QLW_T-y9R4LdMs55LALO";
        urls[1]="https://drive.google.com/open?id=1_N5zgBYVwSucbuGjVFhvQDRKKU__tsyV";
        urls[2]="https://drive.google.com/open?id=1h8cE-mm1k_ZFqbjuRbkj2BMt5i9TYVjJ";
        urls[3]="https://drive.google.com/open?id=1H6Iuw_yEVwl_ybp5soh2yY9zpJC6zO8_";
        urls[4]="https://drive.google.com/open?id=1FhbIk0IQcsyrONH-QZY6Rx5AYEmk8qiC";
        urls[5]="https://drive.google.com/open?id=1w4So433VM9nVk2W2hUdC4Kn6hYDjz7rK";
        urls[6]="https://drive.google.com/open?id=1SPpttI3NvNDtrt3usKeqLl-Bcsg_Z7go";
        urls[7]="https://drive.google.com/open?id=1MvlB5UKJhw4z5-tMz_Y3Oq97wDGGpGn6";
        urls[8]="https://drive.google.com/open?id=1Jyjh3UYwFxcFr4gwy5EsdDg_wkWqytAk";
        urls[9]="https://drive.google.com/open?id=16I8px0A64SK1HGtDWkbbJ1gcrhzLiQKu";
        urls[10]="https://drive.google.com/open?id=1_8cBh7ivteHHhYrF14PT9LY4nCyVkAxJ";
        urls[11]="https://drive.google.com/open?id=1sncymU-LhJwTnw0i7CE0n1WFzoC0Im-K";



        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Physics Lab");
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
        Intent int1=new Intent(PhysicsLab.this,web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }

    public void mechanics1(View view) {
        Intent int1=new Intent(PhysicsLab.this,web_activity.class);
        int1.putExtra("links",urls[1]);
        startActivity(int1);
    }

    public void mechanics2(View view) {
        Intent int1=new Intent(PhysicsLab.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);
    }

    public void mechanics3(View view) {
        Intent int1=new Intent(PhysicsLab.this,web_activity.class);
        int1.putExtra("links",urls[3]);
        startActivity(int1);
    }

    public void mechanics4(View view) {
        Intent int1=new Intent(PhysicsLab.this,web_activity.class);
        int1.putExtra("links",urls[4]);
        startActivity(int1);
    }

    public void mechanics5(View view) {
        Intent int1=new Intent(PhysicsLab.this,web_activity.class);
        int1.putExtra("links",urls[5]);
        startActivity(int1);
    }

    public void mechanics6(View view) {
        Intent int1=new Intent(PhysicsLab.this,web_activity.class);
        int1.putExtra("links",urls[6]);
        startActivity(int1);
    }

    public void mechanics7(View view) {
        Intent int1=new Intent(PhysicsLab.this,web_activity.class);
        int1.putExtra("links",urls[7]);
        startActivity(int1);
    }

    public void mechanics8(View view) {
        Intent int1=new Intent(PhysicsLab.this,web_activity.class);
        int1.putExtra("links",urls[8]);
        startActivity(int1);
    }

    public void mechanics9(View view) {
        Intent int1=new Intent(PhysicsLab.this,web_activity.class);
        int1.putExtra("links",urls[9]);
        startActivity(int1);
    }
    public void mechanics10(View view) {
        Intent int1=new Intent(PhysicsLab.this,web_activity.class);
        int1.putExtra("links",urls[10]);
        startActivity(int1);
    }
    public void mechanics11(View view) {
        Intent int1=new Intent(PhysicsLab.this,web_activity.class);
        int1.putExtra("links",urls[11]);
        startActivity(int1);
    }

}
