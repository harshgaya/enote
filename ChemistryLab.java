package com.example.jeephysics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class ChemistryLab extends AppCompatActivity {
    String[] urls=new String[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_lab);
        urls[0]="https://drive.google.com/open?id=1JUvNm5gPDWZg84i6pjui5fQiGIhBxfxV";
        urls[1]="https://drive.google.com/open?id=1auPwt0DvWZalfv2aSf9uZ99Ic6fv77aO";
        urls[2]="https://drive.google.com/open?id=1bScgXmJbvbhdDQA3TZlv3uXyR4SY0jZ3";
        urls[3]="https://drive.google.com/open?id=11ck7NlVAP6w6x9c0LgeFtFZbjyjjhaZL";
        urls[4]="https://drive.google.com/open?id=1cbWHQphNWa7bBXKogERGynRTbnVwCo7a";
        urls[5]="https://drive.google.com/open?id=1mXjZKQwhTLJyRQQuF8z1-7sRzUCQldUM";
        urls[6]="https://drive.google.com/open?id=1dm_VPmbwpiyZUNCwquPslo9VOprhpsdV";
        urls[7]="https://drive.google.com/open?id=1gbx9VLcmeGt-yqJzgS_copO7Pkzkuwkq";
        urls[8]="https://drive.google.com/open?id=1BUESfPqi96sZcQwAxkdvB5tznEmU9Dco";

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chemistry Lab");
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
        Intent int1=new Intent(ChemistryLab.this,web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }
    public void mechanics1(View view) {
        Intent int1=new Intent(ChemistryLab.this,web_activity.class);
        int1.putExtra("links",urls[1]);
        startActivity(int1);

    }
    public void mechanics2(View view) {
        Intent int1=new Intent(ChemistryLab.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);

    }
    public void mechanics3(View view) {
        Intent int1=new Intent(ChemistryLab.this,web_activity.class);
        int1.putExtra("links",urls[3]);
        startActivity(int1);

    }
    public void mechanics4(View view) {
        Intent int1=new Intent(ChemistryLab.this,web_activity.class);
        int1.putExtra("links",urls[4]);
        startActivity(int1);

    }
    public void mechanics5(View view) {
        Intent int1=new Intent(ChemistryLab.this,web_activity.class);
        int1.putExtra("links",urls[5]);
        startActivity(int1);

    }
    public void mechanics6(View view) {
        Intent int1=new Intent(ChemistryLab.this,web_activity.class);
        int1.putExtra("links",urls[6]);
        startActivity(int1);

    }
    public void mechanics7(View view) {
        Intent int1=new Intent(ChemistryLab.this,web_activity.class);
        int1.putExtra("links",urls[7]);
        startActivity(int1);

    }
    public void mechanics8(View view) {
        Intent int1=new Intent(ChemistryLab.this,web_activity.class);
        int1.putExtra("links",urls[8]);
        startActivity(int1);

    }


}
