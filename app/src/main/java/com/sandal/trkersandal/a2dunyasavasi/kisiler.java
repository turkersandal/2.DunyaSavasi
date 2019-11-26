package com.sandal.trkersandal.a2dunyasavasi;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by TÜRKER SANDAL on 24.01.2017.
 */

public class kisiler extends Activity {

    private static final int CUSTOM_DIALOG_ID=0;
    private static final int CUSTOM_DIALOG_I=1;
    private static final int CUSTOM_DIALOG_IDE=2;
    private static final int CUSTOM_DIALOG_IDEB=3;
    private static final int CUSTOM_DIALOG_IDEK=4;
    private static final int CUSTOM_DIALOG_IDED=5;

    private InterstitialAd interstitial;
    private static final String REKLAM_ID = "ca-app-pub-5434949392259224/7093582394 ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kisiler);

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

        ListView lst = (ListView)findViewById(R.id.list);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        showDialog(CUSTOM_DIALOG_I);break;
                    case 1:
                        showDialog(CUSTOM_DIALOG_ID);break;
                    case 2:
                        showDialog(CUSTOM_DIALOG_IDE);break;
                    case 3:
                        showDialog(CUSTOM_DIALOG_IDEB);break;
                    case 4:
                        showDialog(CUSTOM_DIALOG_IDEK);break;
                    case 5:
                        showDialog(CUSTOM_DIALOG_IDED);break;

                }
            }
        });



    }


    @Override
    protected Dialog onCreateDialog(int id) {

            if(id == CUSTOM_DIALOG_I){
                Dialog dialog = new Dialog(this);
                dialog.setTitle("ADOLF HITLER");
                dialog.setContentView(R.layout.kisi_hitler);
                return dialog;}

            if(id==CUSTOM_DIALOG_ID){
                Dialog dialog1 = new Dialog(this);
                dialog1.setTitle("BENITO MUSSOLINI");
                dialog1.setContentView(R.layout.kisi_mussolini);
                return dialog1;
               }

            if(id== CUSTOM_DIALOG_IDE){
                Dialog dialog2 = new Dialog(this);
                dialog2.setTitle("IMPARATOR HIROHITO");
                dialog2.setContentView(R.layout.hirohito);
                return dialog2;
                }
           if(id==CUSTOM_DIALOG_IDEB){
                Dialog dialog3 = new Dialog(this);
                dialog3.setTitle("JOSEPH STALIN");
                dialog3.setContentView(R.layout.kisi_stalin);
               return  dialog3;
                }
            if(id==CUSTOM_DIALOG_IDEK){
                Dialog dialog4 = new Dialog(this);
                dialog4.setTitle("CHURCHILL");
                dialog4.setContentView(R.layout.kisi_churchill);
                return dialog4;
                }
            if(id==CUSTOM_DIALOG_IDED){
                Dialog dialog5 = new Dialog(this);
                dialog5.setTitle("HARRY S.TRUMAN");
                dialog5.setContentView(R.layout.truman);
                return dialog5;



            }

        return super.onCreateDialog(id);
    }
}
