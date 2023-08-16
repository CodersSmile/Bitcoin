package com.bitcoin.bitcointechmedia_ide.app;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.pesonal.adsdk.AppManage;

public class CryptoCurrencyWorkActivity extends AppCompatActivity {
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto_currency_work);
        back=(ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CryptoCurrencyWorkActivity.this,CryptoFundamentalsActivity.class);
                startActivity(intent);
            }
        });
        AppManage.getInstance(CryptoCurrencyWorkActivity.this).showNative((ViewGroup) findViewById(R.id.native_container), ADMOB_N[0], FACEBOOK_N[0]);
    }
}