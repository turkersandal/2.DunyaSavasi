package com.sandal.trkersandal.a2dunyasavasi;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by TÜRKER SANDAL on 24.01.2017.
 */

public class hitler extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hitler_xml);
        AdView ad =(AdView)findViewById(R.id.adView);
        AdRequest adRequest =new AdRequest.Builder().build();
        ad.loadAd(adRequest);
    }
}
