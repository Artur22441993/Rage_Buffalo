package com.raaageee.buuuffaaaloo.vbjfdl;

import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

import java.util.Map;
import java.util.Random;

public class RandomImg2 {
    private int slot1;
    private int slot2;
    private int slot3;
    private int slot4;

    private int p = 0;


    private ImageView imageView2;
    Handler handler;

    public RandomImg2(int slot1, int slot2, int slot3, int slot4, ImageView imageView2) {
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.slot3 = slot3;
        this.slot4 = slot4;
        this.imageView2 = imageView2;
    }


    public void randomImg2(){
        handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                int a = random.nextInt(3);
                if (a == 0){
                    imageView2.setImageResource(slot1);
                }
                if ( a == 1){
                    imageView2.setImageResource(slot2);
                }
                if ( a == 2){
                    imageView2.setImageResource(slot3);
                }
                if ( a == 3){
                    imageView2.setImageResource(slot4);
                }
                p ++;
                if (p!=20){
                    handler.postDelayed(this::run,40);

                }else {
                    p = 0;}
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void oroe(RB rb){

        RB.iabad = AppsFlyerLib.getInstance().getAppsFlyerUID(rb);

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    RB.ihjjwq = AdvertisingIdClient.getAdvertisingIdInfo(rb.getApplicationContext()).getId();
                }catch (Exception e){

                }
            }
        }).start();


        AppsFlyerLib.getInstance().init(Msdas.oooo(RB.oinwq), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {

                RB.injass = map.get(Msdas.oooo("YWZfc3RhdHVz")).toString();
                if (RB.injass.equals(Msdas.oooo("Tm9uLW9yZ2FuaWM="))){
                    String str =map.get(Msdas.oooo("Y2FtcGFpZ24=")).toString();
                    RB.uybbaq = SetImage.iiiii(str,rb.getPackageName(),RB.ihjjwq,RB.iabad);
                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },rb.getApplicationContext());
        AppsFlyerLib.getInstance().start(rb.getApplicationContext());

    }

}
