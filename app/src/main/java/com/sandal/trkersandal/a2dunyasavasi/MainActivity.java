package com.sandal.trkersandal.a2dunyasavasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn_dil;

    private InterstitialAd interstitial;
    private static final String REKLAM_ID = "ca-app-pub-4501104215816175/2182747465";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn0 =(Button)findViewById(R.id.button0);
        btn1 =(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4 =(Button)findViewById(R.id.button4);
        btn5 =(Button)findViewById(R.id.button5);
        btn_dil=(Button)findViewById(R.id.btn_dil);




        try {
            btn0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),Silah.class);
                    startActivity(intent);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent inet = new Intent(getApplicationContext(),olaylar.class);
                    startActivity(inet);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(getApplicationContext(),hitler.class);
                    startActivity(intent);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),hala_sir.class);
                    startActivity(intent);

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(getApplicationContext(),kisiler.class);
                    startActivity(intent);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent inten = new Intent(getApplicationContext(),deneyler.class);
                    startActivity(inten);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        AdView ad =(AdView)findViewById(R.id.adView);
        AdRequest adRequest =new AdRequest.Builder().build();
        ad.loadAd(adRequest);

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






