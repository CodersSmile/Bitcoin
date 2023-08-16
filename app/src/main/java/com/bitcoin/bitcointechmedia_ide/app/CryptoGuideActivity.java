package com.bitcoin.bitcointechmedia_ide.app;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.pesonal.adsdk.AppManage;

public class CryptoGuideActivity extends AppCompatActivity {
    LinearLayout ll1,ll2,ll3,ll4,ll5,ll6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto_guide);
        ll1=(LinearLayout) findViewById(R.id.ll1);
        ll2=(LinearLayout) findViewById(R.id.ll2);
        ll3=(LinearLayout) findViewById(R.id.ll3);
        ll4=(LinearLayout) findViewById(R.id.ll4);
        ll5=(LinearLayout) findViewById(R.id.ll5);
        ll6=(LinearLayout) findViewById(R.id.ll6);
        ll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CryptoGuideActivity.this, CryptoFundamentalsActivity.class);
                startActivity(intent);

            }
        });
        ll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CryptoGuideActivity.this, FactsActivity.class);
                startActivity(intent);

            }
        });
        ll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CryptoGuideActivity.this, UnderstandGuide.class);
                startActivity(intent);

            }
        });
        ll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CryptoGuideActivity.this, TypesOfCryptocurrencyActivity.class);
                startActivity(intent);

            }
        });

        ll5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CryptoGuideActivity.this, CryptoLivePriceActivity.class);
                startActivity(intent);

            }
        });
        ll6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CryptoGuideActivity.this, MineCryptoCurrencyActivity.class);
                startActivity(intent);

            }
        });
        AppManage.getInstance(CryptoGuideActivity.this).showNative((ViewGroup) findViewById(R.id.native_container), ADMOB_N[0], FACEBOOK_N[0]);
    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri)); }
}