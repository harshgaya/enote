package com.example.jeephysics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.facebook.ads.*;



public class Mechanics extends AppCompatActivity {
    String[] urls=new String[25];

    private AdView adView;
    private InterstitialAd interstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanics);

        urls[0]="https://drive.google.com/open?id=1leKC0afI6DrE3yvGkjMLeWDc3TmXzunE";
        urls[1]="https://drive.google.com/open?id=15xCTqd6EtRcra7PEGMQ7IsySd48bKE-A";
        urls[2]="https://drive.google.com/open?id=15xCTqd6EtRcra7PEGMQ7IsySd48bKE-A";
        urls[3]="https://drive.google.com/open?id=1YVyFSwhR-u6g3lvqDuNKY496Ka4lrhJU";
        urls[4]="https://drive.google.com/open?id=1d81qUOPcDVWbmxfY-tadFm3HoqrLxhCi";
        urls[5]="https://drive.google.com/open?id=1pxaQVrFKPNxOrsCWTGEPze-WyFD2SAd-";
        urls[6]="https://drive.google.com/open?id=1nfvuB8WLB2UBkVll-wJkBruc4qVuD9Jj";
        urls[7]="https://drive.google.com/open?id=16NqTDyMeKzLAZ68GNFYl9KOg4n0fkkIE";
        urls[8]="https://drive.google.com/open?id=1T6_4P5PHuz7kTq0p6Y6ZWO55BeZlttgR";
        urls[9]="https://drive.google.com/open?id=1LconLcbGbXlx44t8o611iXqP8Wkn6EGV";
        urls[10]="https://drive.google.com/open?id=1UlHJwzVL_4BnRvNg6FpW-Zs71yd7pxoj";
        urls[11]="https://drive.google.com/open?id=15-s4ottsWZZyjSwZNCujukNSrLUPysUY";
        urls[12]="https://drive.google.com/open?id=16CxO3OVYJ_wmNxjxxX4Vp94pagrl5_iW";
        urls[13]="https://drive.google.com/open?id=1IRyc9HwsPc7DmCDHy8WRwfNbnbZBf0O6";
        urls[14]="https://drive.google.com/open?id=1xBmd7rJzpEzoZqLajCNCix53TwaiAehN";
        urls[15]="https://drive.google.com/open?id=1G2ohPFp0hxqrHeFF4_q4VhVtgF8zVNX1";
        urls[16]="https://drive.google.com/open?id=1zmX0m07JBFNlpAmA7yKi7HWtGgh76MOF";
        urls[17]="https://drive.google.com/open?id=12h1Hzo_b1KeNkHrd0oOMQx3HkdYAGY-7";
        urls[18]="https://drive.google.com/open?id=1YHxvJ4wsPM82RYVsHxtmD15rZecb4mTf";
        urls[19]="https://drive.google.com/open?id=1KOoMOOmbwMhzBg-D2HaeFxPNGm69r32C";
        urls[20]="https://drive.google.com/open?id=1V__8ZhjAcevqvOGV9jp1IKH9gBru-JwR";
        urls[21]="https://drive.google.com/open?id=16pCHi59w-Up4pFN-ZVJNHgXnSVBT0skz";
        urls[22]="https://drive.google.com/open?id=1kMTVc5bAWciiIrd-cZbE5pkiiOXCMIAp";
        urls[23]="";
        urls[24]="";


        adView = new AdView(this, "2322060558043758_2322116421371505", AdSize.BANNER_HEIGHT_50);

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


        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();







        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
       setSupportActionBar(toolbar);
       getSupportActionBar().setTitle("Mechanics");
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
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[0]);
        startActivity(int1);

    }

    public void mechanics1(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[1]);
        startActivity(int1);
    }

    public void mechanics2(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[2]);
        startActivity(int1);
    }

    public void mechanics3(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[3]);
        startActivity(int1);
    }

    public void mechanics4(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[4]);
        startActivity(int1);
    }

    public void mechanics5(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[5]);
        startActivity(int1);
    }

    public void mechanics6(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[6]);
        startActivity(int1);
    }

    public void mechanics7(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[7]);
        startActivity(int1);
    }

    public void mechanics8(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[8]);
        startActivity(int1);
    }
    public void mechanics9(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[9]);
        startActivity(int1);
    }

    public void mechanics10(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[10]);
        startActivity(int1);
    }
    public void mechanics11(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[11]);
        startActivity(int1);
    }
    public void mechanics12(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[12]);
        startActivity(int1);
    }
    public void mechanics13(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[13]);
        startActivity(int1);
    }

    public void mechanics14(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[14]);
        startActivity(int1);
    }
    public void mechanics15(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[15]);
        startActivity(int1);
    }
    public void mechanics16(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[16]);
        startActivity(int1);
    }
    public void mechanics17(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[17]);
        startActivity(int1);
    }

    public void mechanics18(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[18]);
        startActivity(int1);
    }
    public void mechanics19(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[19]);
        startActivity(int1);
    }
    public void mechanics20(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[20]);
        startActivity(int1);
    }
    public void mechanics21(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[21]);
        startActivity(int1);
    }
    public void mechanics22(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[22]);
        startActivity(int1);
    }
    public void mechanics23(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[23]);
        startActivity(int1);
    }
    public void mechanics24(View view) {
        Intent int1=new Intent(Mechanics.this,web_activity.class);
        int1.putExtra("links",urls[24]);
        startActivity(int1);
    }

    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }


}
