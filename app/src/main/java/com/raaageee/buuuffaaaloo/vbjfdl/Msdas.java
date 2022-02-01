package com.raaageee.buuuffaaaloo.vbjfdl;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Base64;

public class Msdas extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.msdas);

        WebView wersa = findViewById(R.id.wersa);
        wersa.loadUrl(Msdas.oooo("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49UE9oVUdCcEhBRTdmZjdZQndZTjhyYWE0WlZ3ZUZoOWc="));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(),RB.class));
        finishAffinity();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String oooo(String ushaq){
        Base64.Decoder oisjjq = Base64.getDecoder();
        String oijaq = new String(oisjjq.decode(ushaq));
        return oijaq;
    }
}
