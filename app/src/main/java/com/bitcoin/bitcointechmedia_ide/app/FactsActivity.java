package com.bitcoin.bitcointechmedia_ide.app;

import static com.pesonal.adsdk.AppManage.ADMOB_B;
import static com.pesonal.adsdk.AppManage.FACEBOOK_NB;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.pesonal.adsdk.AppManage;

public class FactsActivity extends AppCompatActivity {
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);
        back=(ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FactsActivity.this,CryptoGuideActivity.class);
                startActivity(intent);
            }
        });
        AppManage.getInstance(FactsActivity.this).showNative((ViewGroup) findViewById(R.id.banner_container), ADMOB_B[0], FACEBOOK_NB[0]);
    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(FactsActivity.this).showInterstitialAd(FactsActivity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                FactsActivity.super.onBackPressed();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }
}