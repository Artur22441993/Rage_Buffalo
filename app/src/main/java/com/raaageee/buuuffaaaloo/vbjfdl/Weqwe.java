package com.raaageee.buuuffaaaloo.vbjfdl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class Weqwe extends WebView {

    @SuppressLint("StaticFieldLeak")
    public static WeqAc weqAc;
    @SuppressLint("StaticFieldLeak")
    public static RB rb;


    public Weqwe(@NonNull Context context) {
        super(context);
    }

    public Weqwe(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        this.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        this.getSettings().setAppCacheEnabled(true);
        this.getSettings().setLoadsImagesAutomatically(true);
        this.setSaveEnabled(true);
        this.getSettings().setMixedContentMode(0);
        this.setFocusable(true);
        this.getSettings().setAllowUniversalAccessFromFileURLs(true);
        this.getSettings().setJavaScriptEnabled(true);
        this.getSettings().setAllowContentAccess(true);
        this.getSettings().setLoadWithOverviewMode(true);
        this.getSettings().setEnableSmoothTransition(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        CookieManager.getInstance().setAcceptCookie(true);
        this.getSettings().setAllowFileAccessFromFileURLs(true);
        this.getSettings().setSavePassword(true);
        this.getSettings().setDatabaseEnabled(true);
        this.getSettings().setUseWideViewPort(true);
        this.getSettings().setSaveFormData(true);
        this.getSettings().setAllowFileAccess(true);
        this.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.getSettings().setDomStorageEnabled(true);
        this.setFocusableInTouchMode(true);
        this.setWebViewClient(new Wefela());
        this.setWebChromeClient(new Wegsa());
    }

    static class Wefela extends WebViewClient{
        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            rb.getSharedPreferences(rb.getPackageName(), rb.MODE_PRIVATE).edit().putString(Msdas.oooo("c2F2ZWRVcmw="),url).apply();
        }

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            if(url.contains(Msdas.oooo("NDA0"))){
                weqAc.startActivity(new Intent(weqAc.getApplicationContext(), MainActivity.class));
                weqAc.finishAffinity();
            }
        }
    }

    static class Wegsa extends WebChromeClient{

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public boolean onShowFileChooser(WebView view,
                                          ValueCallback<Uri[]> filePath,
                                          FileChooserParams fileChooserParams) {
            if (weqAc.ewdasadA != null) {
                weqAc.ewdasadA.onReceiveValue(null);
            }
            weqAc.ewdasadA = filePath;
            Intent cxs = new Intent(Intent.ACTION_GET_CONTENT);
            cxs.addCategory(Intent.CATEGORY_OPENABLE);
            cxs.setType("*/*");
            Intent[] sadw = new Intent[0];
            Intent ubwhhak = new Intent(Intent.ACTION_CHOOSER);
            ubwhhak.putExtra(Intent.EXTRA_INTENT, cxs);
            ubwhhak.putExtra(Intent.EXTRA_TITLE, Msdas.oooo("U2VsZWN0IE9wdGlvbjo="));
            ubwhhak.putExtra(Intent.EXTRA_INITIAL_INTENTS, sadw);
            weqAc.startActivityForResult(ubwhhak, 1);
            return true;
        }
    }
}
