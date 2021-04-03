package com.shafay.hp.learn_android.programs.display_execute;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.shafay.hp.learn_android.R;

public class AdUnit extends AppCompatActivity {
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_unit);

        getSupportActionBar().setTitle("Ad Unit");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        interstitial = new InterstitialAd(AdUnit.this);
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id_test));
        interstitial.loadAd(adRequest);
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                // Call displayInterstitial() function
                displayInterstitial();
            }  });
    }
    private void displayInterstitial() {
        if (interstitial.isLoaded())
            interstitial.show();
    }

}
