package com.raaageee.buuuffaaaloo.vbjfdl;

import android.os.Handler;
import android.widget.ImageView;

import java.util.Random;

public class Randomimg4 {
    private int slot1;
    private int slot2;
    private int slot3;
    private int slot4;

    private int p = 0;


    private ImageView imageView4;
    Handler handler;

    public Randomimg4(int slot1, int slot2, int slot3, int slot4, ImageView imageView4) {
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.slot3 = slot3;
        this.slot4 = slot4;
        this.imageView4 = imageView4;
    }

    public void randomImg4(){
        handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                int a = random.nextInt(3);
                if (a == 0){
                    imageView4.setImageResource(slot1);
                }
                if ( a == 1){
                    imageView4.setImageResource(slot2);
                }
                if ( a == 2){
                    imageView4.setImageResource(slot3);
                }
                if ( a == 3){
                    imageView4.setImageResource(slot4);
                }
                p ++;
                if (p!=20){
                    handler.postDelayed(this::run,40);

                }else {
                    p = 0;}
            }
        });
    }
}
