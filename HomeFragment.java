package com.example.jeephysics;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.facebook.ads.*;



public class HomeFragment extends Fragment {
    private InterstitialAd interstitialAd;

    private AdView adView;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

         button1=(Button) view.findViewById(R.id.mechanics1);
        button2=(Button) view.findViewById(R.id.electrical);
        button3=(Button) view.findViewById(R.id.physics1);
        button4=(Button) view.findViewById(R.id.math1);
        button5=(Button) view.findViewById(R.id.chemistry);
        button6=(Button) view.findViewById(R.id.biology);
        button7=(Button) view.findViewById(R.id.environment);
        button8=(Button) view.findViewById(R.id.english);
        button9=(Button) view.findViewById(R.id.physics2);
        button10=(Button) view.findViewById(R.id.math2);
        button11=(Button) view.findViewById(R.id.program);
        button12=(Button) view.findViewById(R.id.drawing);
        button13=(Button) view.findViewById(R.id.physicslab);
        button14=(Button) view.findViewById(R.id.chemistrylab);
        button15=(Button) view.findViewById(R.id.electronics);
        button16=(Button) view.findViewById(R.id.workshop);

        interstitialAd = new InterstitialAd(getContext(), "2322060558043758_2430340313882448");
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




        adView = new AdView(getContext(), "2322060558043758_2322116421371505", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) view.findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();













         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent1 = new Intent(getActivity(), Mechanics.class);
                 startActivity(intent1);
             }
         });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getActivity(), Electrical.class);
                startActivity(intent2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getActivity(), Physics1.class);
                startActivity(intent3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getActivity(), Math1.class);
                startActivity(intent4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(getActivity(), Chemistry.class);
                startActivity(intent5);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(getActivity(), Biology.class);
                startActivity(intent6);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(getActivity(), Environment.class);
                startActivity(intent7);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(getActivity(), English.class);
                startActivity(intent8);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(getActivity(), Physics2.class);
                startActivity(intent9);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10 = new Intent(getActivity(), Math2.class);
                startActivity(intent10);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11 = new Intent(getActivity(), Prrogramming.class);
                startActivity(intent11);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12 = new Intent(getActivity(), Drawing.class);
                startActivity(intent12);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13 = new Intent(getActivity(), PhysicsLab.class);
                startActivity(intent13);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14 = new Intent(getActivity(), ChemistryLab.class);
                startActivity(intent14);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13 = new Intent(getActivity(), BasicElectronics.class);
                startActivity(intent13);
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14 = new Intent(getActivity(), Workshop.class);
                startActivity(intent14);
            }
        });
        return view;
    }

    @Override
    public void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

}
