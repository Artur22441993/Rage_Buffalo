package com.raaageee.buuuffaaaloo.vbjfdl;

import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;

public class RandomText {
    private int max;
    private int min;
    public static String ijsa;
    public static String oijaq;

    public RandomText(int max, int min) {
        this.max = max;
        this.min = min;
    }


    public int randomText(){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static int dds(RB rb){
      return  Settings.Secure.getInt(rb.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
    }

    public static void dddede(RB rb, In in){

        FacebookSdk.setApplicationId(in.getJadq());
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(rb.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);

        AppEventsLogger.activateApp(rb.getApplication());
        AppLinkData.fetchDeferredAppLinkData(rb.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData ihqs) {

                if (ihqs == null) {
                    ihqs = AppLinkData.createFromActivity(rb);
                }
                if (ihqs != null) {
                    Uri ubxa = ihqs.getTargetUri();
                    ijsa = ubxa.getQuery();
                    oijaq = SetImage.iiiii(ijsa,rb.getPackageName(), RB.ihjjwq, RB.iabad);

                }else {

                }
            }
        });
    }
}
