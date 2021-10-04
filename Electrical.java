package com.example.jeephysics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;


public class Electrical extends AppCompatActivity {
    String[] urls=new String[33];
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical);
        urls[0]="https://drive.google.com/open?id=1djmC1eW7OVCFP2GKgFRq4-KreEJknbnF";
        urls[1]="https://drive.google.com/open?id=1rw9awY92cu2S87nX1Au5282Rl57V7cSM";
        urls[2]="https://drive.google.com/open?id=18yTa8E-zOvAnbBXGf_njoVlO834oJIQc";
        urls[3]="https://drive.google.com/open?id=1bMqFnOItbthh24l4cvgEGCbqIQde2kCI";
        urls[4]="https://drive.google.com/open?id=10D2GNumgcw37jERGdDwyugFV0K3oMQYL";
        urls[5]="https://drive.google.com/open?id=1AiVzqTxEPhEHcLVTeWb5beDcsv9NrHxn";
        urls[6]="https://drive.google.com/open?id=11ogvknpZVjAYsYdNeMhrQ_iEU-Z23RNV";
        urls[7]="https://drive.google.com/open?id=16Tk-BrHFxF_WLGtinfAmAYiPO_eyMMCl";
        urls[8]="https://drive.google.com/open?id=1QFoLdnw7dDd_yurTDmwE7ybty3y6RLuV";
        urls[9]="https://drive.google.com/open?id=1xT1FKqniwrbnLYbL2HhOvJ7clC4kzuPT";
        urls[10]="https://drive.google.com/open?id=14ssSc9pXPVgEWN6DihywNUW-LOvxV-Qg";
        urls[11]="https://drive.google.com/open?id=1SwcQVajl_xNfhd0Y2ql0IR0DmqexvZHy";
        urls[12]="https://drive.google.com/open?id=1xLv_Oz1l2UwE75eUAHb33FQklnEs0Af8";
        urls[13]="https://drive.google.com/open?id=17Pv2UiAMzNRydoEJBjP7gwERjfgGdJQW";
        urls[14]="https://drive.google.com/open?id=1kC51ngAAXdv6L5bvqeiLnZhbgzTpH43F";
        urls[15]="https://drive.google.com/open?id=1AFm6-SsMC8Ea-YY674O_jYWaMUWHgh7z";
        urls[16]="https://drive.google.com/open?id=1hhcOO_dJ19n7RFUdsrWXT_kOkSxtVKuf";
        urls[17]="https://drive.google.com/open?id=10pGIOp3RydzL1PexVe2JA2ebiId_9b9T";
        urls[18]="https://drive.google.com/open?id=1bwt2gdwH6NupSFV29GnRUQfa9a7IU30x";
        urls[19]="https://drive.google.com/open?id=1ljrbU0UmIsgLgnB4VeCyHQeq4OHXPjVs";
        urls[20]="";
        urls[21]="";
        urls[22]="";
        urls[23]="";
        urls[24]="";
        urls[25]="";
        urls[26]="";
        urls[27]="";
        urls[28]="";
        urls[29]="";
        urls[30]="";
        urls[31]="";
        urls[32]="";



        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Basic Electrical");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        interstitialAd = new InterstitialAd(this, "2322060558043758_2430340313882448");
        // Set listeners for the Interstitial Ad
        interstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback
                //Log.e(TAG, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback
                //Log.e(TAG, "Interstitial ad dismissed.");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback
                //Log.e(TAG, "Interstitial ad failed to load: " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Interstitial ad is loaded and ready to be displayed
                // Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");
                // Show the ad
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback
                //Log.d(TAG, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback
                //Log.d(TAG, "Interstitial ad impression logged!");
            }
        });

        // For auto play video ads, it's recommended to load the ad
        // at least 30 seconds before it is shown
        interstitialAd.loadAd();






    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void electrical1(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }

    public void electrical2(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[1]);
        startActivity(int1);
    }

    public void electrical3(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);
    }

    public void electrical4(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[3]);
        startActivity(int1);
    }

    public void electrical5(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[4]);
        startActivity(int1);
    }

    public void electrical6(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[5]);
        startActivity(int1);
    }

    public void electrical7(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[6]);
        startActivity(int1);
    }

    public void electrical8(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[7]);
        startActivity(int1);
    }

    public void electrical9(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[8]);
        startActivity(int1);
    }

    public void electrical10(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[9]);
        startActivity(int1);
    }
    public void electrical11(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[10]);
        startActivity(int1);
    }
    public void electrical12(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[11]);
        startActivity(int1);
    }
    public void electrical13(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[12]);
        startActivity(int1);
    }

    public void electrical14(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[13]);
        startActivity(int1);
    }
    public void electrical15(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[14]);
        startActivity(int1);
    }
    public void electrical16(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[15]);
        startActivity(int1);
    }
    public void electrical17(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[16]);
        startActivity(int1);
    }
    public void electrical18(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[17]);
        startActivity(int1);
    }
    public void electrical19(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[18]);
        startActivity(int1);
    }
    public void electrical20(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[19]);
        startActivity(int1);
    }
    public void electrical21(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[20]);
        startActivity(int1);
    }
    public void electrical22(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[21]);
        startActivity(int1);
    }
    public void electrical23(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[22]);
        startActivity(int1);
    }
    public void electrical24(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[23]);
        startActivity(int1);
    }
    public void electrical25(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[24]);
        startActivity(int1);
    }
    public void electrical26(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[25]);
        startActivity(int1);
    }
    public void electrical27(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[26]);
        startActivity(int1);
    }
    public void electrical28(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[27]);
        startActivity(int1);
    }
    public void electrical29(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[28]);
        startActivity(int1);
    }
    public void electrical30(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[29]);
        startActivity(int1);
    }
    public void electrical31(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[30]);
        startActivity(int1);
    }
    public void electrical32(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[31]);
        startActivity(int1);
    }
    public void electrical33(View view) {
        Intent int1=new Intent(Electrical.this,web_activity.class);
        int1.putExtra("links",urls[32]);
        startActivity(int1);
    }

}

