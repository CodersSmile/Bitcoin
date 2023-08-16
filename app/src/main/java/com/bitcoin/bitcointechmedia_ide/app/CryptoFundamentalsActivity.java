package com.bitcoin.bitcointechmedia_ide.app;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pesonal.adsdk.AppManage;

public class CryptoFundamentalsActivity extends AppCompatActivity {
    TextView t1,t11,t2,t22,t3,t33,t4,t44,t5,t55,t6,t66,t7,t77;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto_fundamentals);
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
        back=(ImageView) findViewById(R.id.back);
        AppManage.getInstance(CryptoFundamentalsActivity.this).loadInterstitialAd(this);
        AppManage.getInstance(CryptoFundamentalsActivity.this).showNative((ViewGroup) findViewById(R.id.native_container), ADMOB_N[0], FACEBOOK_N[0]);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CryptoFundamentalsActivity.this, CryptoGuideActivity.class);
                startActivity(intent);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppManage.getInstance(CryptoFundamentalsActivity.this).showInterstitialAd(CryptoFundamentalsActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(CryptoFundamentalsActivity.this, HistoryOfCryptocurrencyActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            }
        });
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppManage.getInstance(CryptoFundamentalsActivity.this).showInterstitialAd(CryptoFundamentalsActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(CryptoFundamentalsActivity.this, HistoryOfCryptocurrencyActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CryptoFundamentalsActivity.this, CryptoCurrencyWorkActivity.class);
                startActivity(intent);
            }
        });
        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CryptoFundamentalsActivity.this, CryptoCurrencyWorkActivity.class);
                startActivity(intent);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CryptoFundamentalsActivity.this, GetCryptoCurrency.class);
                startActivity(intent);
            }
        });
        t33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CryptoFundamentalsActivity.this, GetCryptoCurrency.class);
                startActivity(intent);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CryptoFundamentalsActivity.this, StoringTransactionCrypto.class);
                startActivity(intent);
            }
        });
        t44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CryptoFundamentalsActivity.this, StoringTransactionCrypto.class);
                startActivity(intent);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppManage.getInstance(CryptoFundamentalsActivity.this).showInterstitialAd(CryptoFundamentalsActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(CryptoFundamentalsActivity.this, OwningActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            }
        });
        t55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppManage.getInstance(CryptoFundamentalsActivity.this).showInterstitialAd(CryptoFundamentalsActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(CryptoFundamentalsActivity.this, OwningActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CryptoFundamentalsActivity.this, Benefits.class);
                startActivity(intent);
            }
        });
        t66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CryptoFundamentalsActivity.this, Benefits.class);
                startActivity(intent);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CryptoFundamentalsActivity.this, KeyActivity.class);
                startActivity(intent);
            }
        });
        t77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CryptoFundamentalsActivity.this, KeyActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(CryptoFundamentalsActivity.this).showInterstitialAd(CryptoFundamentalsActivity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                CryptoFundamentalsActivity.super.onBackPressed();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }
}