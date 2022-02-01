package com.raaageee.buuuffaaaloo.vbjfdl;

import android.os.Handler;
import android.widget.TextView;

import java.util.Random;

public class SetText {
    private TextView textView;
    private int p = 0;
    Handler handler;

    public SetText(TextView textView) {
        this.textView = textView;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    public void setText(){
        handler = new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {
                RandomText randomText = new RandomText(800,600);
               textView.setText("" + randomText.randomText());
                p ++;
                if (p!=20){
                    handler.postDelayed(this::run,40);

                }else {
                    p = 0;}
            }
        });

    }
}
