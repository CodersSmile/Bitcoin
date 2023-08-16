package com.bitcoin.bitcointechmedia_ide.app;

import static com.pesonal.adsdk.AppManage.ADMOB_B;
import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_NB;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pesonal.adsdk.AppManage;

public class UnderstandGuide extends AppCompatActivity {
    TextView t1,t11,t2,t22,t3,t33,t4,t44,t5,t55,t6,t66,t7,t77,t8,t88,t9,t99,t11t11,t1111,t12,t1212;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_understand_guide);
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
        t6=(TextView) findViewById(R.id.t6);
        t66=(TextView) findViewById(R.id.t66);
        t7=(TextView) findViewById(R.id.t7);
        t77=(TextView) findViewById(R.id.t77);
        t8=(TextView) findViewById(R.id.t8);
        t88=(TextView) findViewById(R.id.t88);
        t9=(TextView) findViewById(R.id.t9);
        t99=(TextView) findViewById(R.id.t99);
        t11t11=(TextView) findViewById(R.id.t11t11);
        t1111=(TextView) findViewById(R.id.t1111);
        t12=(TextView) findViewById(R.id.t12);
        t1212=(TextView) findViewById(R.id.t1212);
        back=(ImageView) findViewById(R.id.back);
        AppManage.getInstance(UnderstandGuide.this).loadInterstitialAd(this);
        AppManage.getInstance(UnderstandGuide.this).showNative((ViewGroup) findViewById(R.id.banner_container), ADMOB_B[0], FACEBOOK_NB[0]);
        AppManage.getInstance(UnderstandGuide.this).showNative((ViewGroup) findViewById(R.id.native_container), ADMOB_N[0], FACEBOOK_N[0]);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UnderstandGuide.this,CryptoGuideActivity.class);
                startActivity(intent);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnderstandGuide.this, WhatAreCrytocurrencyActivity.class);
                startActivity(intent);
            }
        });
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnderstandGuide.this, WhatAreCrytocurrencyActivity.class);
                startActivity(intent);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppManage.getInstance(UnderstandGuide.this).showInterstitialAd(UnderstandGuide.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(UnderstandGuide.this, WhoInventedCrytoACtivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            }
        });
        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppManage.getInstance(UnderstandGuide.this).showInterstitialAd(UnderstandGuide.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(UnderstandGuide.this, WhoInventedCrytoACtivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnderstandGuide.this, WhyActivity.class);
                startActivity(intent);
            }
        });
        t33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnderstandGuide.this, WhyActivity.class);
                startActivity(intent);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnderstandGuide.this, BlockchainActivity.class);
                startActivity(intent);
            }
        });
        t44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnderstandGuide.this, BlockchainActivity.class);
                startActivity(intent);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnderstandGuide.this, TransactionActivity.class);
                startActivity(intent);
            }
        });
        t55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnderstandGuide.this, TransactionActivity.class);
                startActivity(intent);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppManage.getInstance(UnderstandGuide.this).showInterstitialAd(UnderstandGuide.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(UnderstandGuide.this, PublicPrivateActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            }
        });
        t66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppManage.getInstance(UnderstandGuide.this).showInterstitialAd(UnderstandGuide.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(UnderstandGuide.this, PublicPrivateActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnderstandGuide.this, AnonimityActivity.class);
                startActivity(intent);
            }
        });
        t77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnderstandGuide.this, AnonimityActivity.class);
                startActivity(intent);
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnderstandGuide.this, ValueationActivity.class);
                startActivity(intent);
            }
        });
        t88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnderstandGuide.this, ValueationActivity.class);
                startActivity(intent);
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnderstandGuide.this, RiseActivity.class);
                startActivity(intent);
            }
        });
        t99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnderstandGuide.this, RiseActivity.class);
                startActivity(intent);
            }
        });
        t11t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppManage.getInstance(UnderstandGuide.this).showInterstitialAd(UnderstandGuide.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(UnderstandGuide.this, AdvantagesActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            }
        });
        t1111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppManage.getInstance(UnderstandGuide.this).showInterstitialAd(UnderstandGuide.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(UnderstandGuide.this, AdvantagesActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            }
        });
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnderstandGuide.this, DisadvantagesActivity.class);
                startActivity(intent);
            }
        });
        t1212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnderstandGuide.this, DisadvantagesActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(UnderstandGuide.this).showInterstitialAd(UnderstandGuide.this, new AppManage.MyCallback() {
            public void callbackCall() {
                UnderstandGuide.super.onBackPressed();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }
}