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
import android.widget.Button;
import android.widget.ImageView;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;
import com.pesonal.adsdk.AppManage;

public class TypesOfCryptocurrencyActivity extends AppCompatActivity {
    Button bitcoin,etherum,cardano,stellar,dogecoin,tether,usdcoin,xrpbtn,tetherbtn,solana,avalanche;
    ExpandableRelativeLayout ex1,ex2,ex3,ex4,ex5,ex6,ex7,ex8,ex9,ex10,ex11;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of_cryptocurrency);
        bitcoin=(Button) findViewById(R.id.bitcoin);
        etherum=(Button) findViewById(R.id.etherum);
        cardano=(Button) findViewById(R.id.cardano);
        stellar=(Button) findViewById(R.id.stellar);
        dogecoin=(Button) findViewById(R.id.dogecoin);
        tether=(Button) findViewById(R.id.tether);
        usdcoin=(Button) findViewById(R.id.usd_coin);
        xrpbtn=(Button) findViewById(R.id.xrpbtn);
        tetherbtn=(Button) findViewById(R.id.tetherbtn);
        solana=(Button) findViewById(R.id.solana);
        avalanche=(Button) findViewById(R.id.avalanche);
        back=(ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TypesOfCryptocurrencyActivity.this,CryptoGuideActivity.class);
                startActivity(intent);
            }
        });
        AppManage.getInstance(TypesOfCryptocurrencyActivity.this).showNative((ViewGroup) findViewById(R.id.banner_container), ADMOB_B[0], FACEBOOK_NB[0]);
        AppManage.getInstance(TypesOfCryptocurrencyActivity.this).showNative((ViewGroup) findViewById(R.id.native_container), ADMOB_N[0], FACEBOOK_N[0]);

    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(TypesOfCryptocurrencyActivity.this).showInterstitialAd(TypesOfCryptocurrencyActivity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                TypesOfCryptocurrencyActivity.super.onBackPressed();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }
    public void showBitcoin(View view){
        ex1=(ExpandableRelativeLayout) findViewById(R.id.ex1);
        ex1.toggle();

    }
    public void showEtherum(View view){
        ex2=(ExpandableRelativeLayout) findViewById(R.id.ex2);
        ex2.toggle();

    }
    public void showCardano(View view){
        ex3=(ExpandableRelativeLayout) findViewById(R.id.ex3);
        ex3.toggle();

    }
    public void showStellar(View view){
        ex4=(ExpandableRelativeLayout) findViewById(R.id.ex4);
        ex4.toggle();

    }
    public void showDogecoin(View view){
        ex5=(ExpandableRelativeLayout) findViewById(R.id.ex5);
        ex5.toggle();

    }
    public void showTether(View view){
        ex6=(ExpandableRelativeLayout) findViewById(R.id.ex6);
        ex6.toggle();

    }

    public void showUSDCoin(View view){
        ex7=(ExpandableRelativeLayout) findViewById(R.id.ex7);
        ex7.toggle();

    }
    public void showXRP(View view){
        ex8=(ExpandableRelativeLayout) findViewById(R.id.ex8);
        ex8.toggle();

    }
    public void showTerra(View view){
        ex9=(ExpandableRelativeLayout) findViewById(R.id.ex9);
        ex9.toggle();

    }
    public void showSolana(View view){
        ex10=(ExpandableRelativeLayout) findViewById(R.id.ex10);
        ex10.toggle();

    }
    public void showAvalanche(View view){
        ex11=(ExpandableRelativeLayout) findViewById(R.id.ex11);
        ex11.toggle();

    }

}