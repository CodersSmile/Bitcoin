package com.bitcoin.bitcointechmedia_ide.app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pesonal.adsdk.AppManage;

import java.util.Locale;

public class ChooseLanguage extends AppCompatActivity {
    Button english_lang,hindi_lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_language);
        english_lang=findViewById(R.id.english_lang);
        hindi_lang=findViewById(R.id.hindi_lang);
        AppManage.getInstance(ChooseLanguage.this).loadInterstitialAd(this);
    }
    public void setLanguage(Activity activity, String language){
        Locale locale=new Locale(language);
        Resources resources = activity.getResources();
        Configuration configuration = resources.getConfiguration();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            configuration.setLocale(locale);
        }
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());

    }
    public void language(View view){
        switch (view.getId()){
            case R.id.english_lang:{
                setLanguage(this,"en");
                AppManage.getInstance(ChooseLanguage.this).showInterstitialAd(ChooseLanguage.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(ChooseLanguage.this, CryptoGuideActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
                break;

            }
            case R.id.hindi_lang:{
                setLanguage(this,"hi");
                AppManage.getInstance(ChooseLanguage.this).showInterstitialAd(ChooseLanguage.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(ChooseLanguage.this, CryptoGuideActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
                break;

            }
        }
    }

}