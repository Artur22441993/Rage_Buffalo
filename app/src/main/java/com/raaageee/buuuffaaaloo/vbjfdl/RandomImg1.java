package com.raaageee.buuuffaaaloo.vbjfdl;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.onesignal.OneSignal;
import com.royrodriguez.transitionbutton.TransitionButton;

import java.util.Random;

public class RandomImg1 {
    private int slot1;
    private int slot2;
    private int slot3;
    private int slot4;


    public static TransitionButton transitionButtonS,transitionButtonP,transitionButtonC;
    @SuppressLint("StaticFieldLeak")
    public static ProgressBar bar;
    @SuppressLint("StaticFieldLeak")
    public static RB rb;

    private int p = 0;


    private ImageView imageView;
    Handler handler;

    public RandomImg1(int slot1, int slot2, int slot3, int slot4, ImageView imageView) {
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.slot3 = slot3;
        this.slot4 = slot4;
        this.imageView = imageView;
    }


    public static void ccc(){
        bar.setVisibility(View.INVISIBLE);
        transitionButtonS.setVisibility(View.VISIBLE);
        transitionButtonP.setVisibility(View.VISIBLE);
        transitionButtonC.setVisibility(View.VISIBLE);

        transitionButtonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transitionButtonS.startAnimation();
                transitionButtonC.setVisibility(View.INVISIBLE);
                transitionButtonP.setVisibility(View.INVISIBLE);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        boolean isSuccessful = true;

                        if (isSuccessful) {
                            transitionButtonS.stopAnimation(TransitionButton.StopAnimationStyle.EXPAND, new TransitionButton.OnAnimationStopEndListener() {
                                @Override
                                public void onAnimationStopEnd() {
                                    Intent intent = new Intent(rb.getBaseContext(), MainActivity.class);
                                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                                    rb.startActivity(intent);
                                    rb.finishAffinity();
                                }
                            });
                        } else {
                            transitionButtonS.stopAnimation(TransitionButton.StopAnimationStyle.SHAKE, null);
                        }
                    }
                }, 1000);
            }
        });

        transitionButtonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transitionButtonC.startAnimation();
                transitionButtonS.setVisibility(View.INVISIBLE);
                transitionButtonP.setVisibility(View.INVISIBLE);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        boolean isSuccessful = true;

                        if (isSuccessful) {
                            transitionButtonC.stopAnimation(TransitionButton.StopAnimationStyle.EXPAND, new TransitionButton.OnAnimationStopEndListener() {
                                @Override
                                public void onAnimationStopEnd() {
                                    rb.finishAffinity();
                                }
                            });
                        } else {
                            transitionButtonC.stopAnimation(TransitionButton.StopAnimationStyle.SHAKE, null);
                        }
                    }
                }, 1000);
            }
        });

        transitionButtonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transitionButtonP.startAnimation();
                transitionButtonS.setVisibility(View.INVISIBLE);
                transitionButtonC.setVisibility(View.INVISIBLE);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        boolean isSuccessful = true;

                        if (isSuccessful) {
                            transitionButtonP.stopAnimation(TransitionButton.StopAnimationStyle.EXPAND, new TransitionButton.OnAnimationStopEndListener() {
                                @Override
                                public void onAnimationStopEnd() {
                                    rb.startActivity(new Intent(rb.getApplicationContext(),Msdas.class));
                                    rb.finishAffinity();
                                }
                            });
                        } else {
                            transitionButtonP.stopAnimation(TransitionButton.StopAnimationStyle.SHAKE, null);
                        }
                    }
                }, 1000);
            }
        });


    }

    public void randomImg1(){
        handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                int a = random.nextInt(3);
                if (a == 0){
                    imageView.setImageResource(slot1);
                }
                if ( a == 1){
                    imageView.setImageResource(slot2);
                }
                if ( a == 2){
                    imageView.setImageResource(slot3);
                }
                if ( a == 3){
                    imageView.setImageResource(slot4);
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
