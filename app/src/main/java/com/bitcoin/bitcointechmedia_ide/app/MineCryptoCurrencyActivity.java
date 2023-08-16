package com.bitcoin.bitcointechmedia_ide.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pesonal.adsdk.AppManage;

public class MineCryptoCurrencyActivity extends AppCompatActivity {
    TextView t1,t11,t2,t22,t3,t33,t4,t44,t5,t55;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_crypto_currency);
        t1=(TextView) findViewById(R.id.t1);
        t11=(TextView) findViewById(R.id.t11);
        t2=(TextView) findViewById(R.id.t2);
        t22=(TextView) findViewById(R.id.t22);
        t3=(TextView) findViewById(R.id.t3);
        t33=(TextView) findViewById(R.id.t33);
        t4=(TextView) findViewById(R.id.t4);
        t44=(TextView) findViewById(R.id.t44);
        t5=(TextView) findViewById(R.id.t5);
        t55=(TextView) findViewById(R.id.t55);
        back=(ImageView) findViewById(R.id.back);
        AppManage.getInstance(MineCryptoCurrencyActivity.this).loadInterstitialAd(this);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MineCryptoCurrencyActivity.this, CryptoGuideActivity.class);
                startActivity(intent);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MineCryptoCurrencyActivity.this, WhatCryptoMiningActivity.class);
                startActivity(intent);
            }
        });
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MineCryptoCurrencyActivity.this, WhatCryptoMiningActivity.class);
                startActivity(intent);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MineCryptoCurrencyActivity.this, HowActivity.class);
                startActivity(intent);
            }
        });
        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MineCryptoCurrencyActivity.this, HowActivity.class);
                startActivity(intent);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppManage.getInstance(MineCryptoCurrencyActivity.this).showInterstitialAd(MineCryptoCurrencyActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(MineCryptoCurrencyActivity.this, DisPowActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            }
        });
        t33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppManage.getInstance(MineCryptoCurrencyActivity.this).showInterstitialAd(MineCryptoCurrencyActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(MineCryptoCurrencyActivity.this, DisPowActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MineCryptoCurrencyActivity.this, allPowActivity.class);
                startActivity(intent);
            }
        });
        t44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MineCryptoCurrencyActivity.this, allPowActivity.class);
                startActivity(intent);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MineCryptoCurrencyActivity.this, AlternativeActivity.class);
                startActivity(intent);
            }
        });
        t55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MineCryptoCurrencyActivity.this, AlternativeActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(MineCryptoCurrencyActivity.this).showInterstitialAd(MineCryptoCurrencyActivity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                MineCryptoCurrencyActivity.super.onBackPressed();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }
}