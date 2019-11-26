package com.sandal.trkersandal.a2dunyasavasi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by TÜRKER SANDAL on 24.01.2017.
 */

public class deneyler extends Activity {

    private InterstitialAd interstitial;
    private static final String REKLAM_ID = "ca-app-pub-5434949392259224/7093582394 ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.denyler);
        ListView lst =(ListView)findViewById(R.id.lst);

        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId(REKLAM_ID);

        AdRequest adRequest1 = new AdRequest.Builder().build();

        interstitial.loadAd(adRequest1);

        interstitial.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                if (interstitial.isLoaded()) {
                    interstitial.show();
                }
            }
        });


    }
}
