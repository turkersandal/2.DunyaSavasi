package com.sandal.trkersandal.a2dunyasavasi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by TÜRKER SANDAL on 21.01.2017.
 */

public class olaylar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oalylar);
        Button btnphi,btn_deniz,btn_rus,btn_ufo,btn_los;
        btnphi =(Button)findViewById(R.id.btn_phi);
        btn_deniz=(Button)findViewById(R.id.btn_deniz);
        btn_rus=(Button)findViewById(R.id.btn_rus);
        btn_los=(Button)findViewById(R.id.btn_losangeles);
        btn_ufo=(Button)findViewById(R.id.btn_ufo);
        btnphi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),philadelphia.class);
                startActivity(intent);
            }
        });
        btn_deniz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),deniz.class);
                startActivity(intent);
            }
        });
        btn_rus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),rus.class);
                startActivity(intent);
            }
        });
        btn_los.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),losangeles.class);
                startActivity(intent);
            }
        });
        btn_ufo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ufo.class);
                startActivity(intent);
            }
        });
        AdView ad =(AdView)findViewById(R.id.adView);
        AdRequest adRequest =new AdRequest.Builder().build();
        ad.loadAd(adRequest);





    }
}