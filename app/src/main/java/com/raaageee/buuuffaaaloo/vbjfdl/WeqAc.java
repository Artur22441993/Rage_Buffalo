package com.raaageee.buuuffaaaloo.vbjfdl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WeqAc extends AppCompatActivity {

    WebView wydlsp;
    public ValueCallback<Uri> iiuydha;
    public Uri ywfxaju = null;
    public ValueCallback<Uri[]> ewdasadA;
    public String filePath;
    public static final int rsaadiuhcww = 1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.weqac);
        wydlsp = findViewById(R.id.wydlsp);
        Weqwe.weqAc = this;

        wydlsp.loadUrl(RB.iuhxa);

    }

    @Override
    public void onBackPressed() {
        if (wydlsp.isFocused() && wydlsp.canGoBack()) {
            wydlsp.goBack();
        }
    }

    @Override
    protected void onActivityResult(int dad, int resa, @Nullable Intent bgsa) {
        if (dad != rsaadiuhcww || ewdasadA == null) {
            super.onActivityResult(dad, resa, bgsa);
            return;
        }
        Uri[] results = null;
        if (resa == Activity.RESULT_OK) {
            if (bgsa == null) {
                if (filePath != null) {
                    results = new Uri[]{Uri.parse(filePath)};
                }
            } else {
                String dataString = bgsa.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        ewdasadA.onReceiveValue(results);
        ewdasadA = null;
        if (iiuydha == null) {
            super.onActivityResult(dad, resa, bgsa);
            return;
        }
        Uri result = null;
        try {
            if (resa != RESULT_OK) {
                result = null;
            } else {
                result = bgsa == null ? ywfxaju : bgsa.getData();
            }
        } catch (Exception e) { }
        iiuydha.onReceiveValue(result);
        iiuydha = null;
    }
}
