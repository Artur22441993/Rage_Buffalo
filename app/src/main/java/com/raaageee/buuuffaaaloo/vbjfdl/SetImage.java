package com.raaageee.buuuffaaaloo.vbjfdl;

import android.os.Build;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

import com.onesignal.OneSignal;

public class SetImage {

    private int slot1;
    private int slot2;
    private int slot3;
    private int slot4;


    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;

    static String dad;
    static String ojda;
    static String qweqw;
    static String pomaa;
    static String oinadw;
    static String oiuybsa;
    static String ytrebca;


    public SetImage(int slot1, int slot2, int slot3, int slot4, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4) {
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.slot3 = slot3;
        this.slot4 = slot4;
        this.imageView = imageView;
        this.imageView2 = imageView2;
        this.imageView3 = imageView3;
        this.imageView4 = imageView4;
    }

    public ImageView getImageView4() {
        return imageView4;
    }

    public void setImageView4(ImageView imageView4) {
        this.imageView4 = imageView4;
    }

    public int getSlot1() {
        return slot1;
    }

    public void setSlot1(int slot1) {
        this.slot1 = slot1;
    }

    public int getSlot2() {
        return slot2;
    }

    public void setSlot2(int slot2) {
        this.slot2 = slot2;
    }

    public int getSlot3() {
        return slot3;
    }

    public void setSlot3(int slot3) {
        this.slot3 = slot3;
    }

    public int getSlot4() {
        return slot4;
    }

    public void setSlot4(int slot4) {
        this.slot4 = slot4;
    }


    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public ImageView getImageView2() {
        return imageView2;
    }

    public void setImageView2(ImageView imageView2) {
        this.imageView2 = imageView2;
    }

    public ImageView getImageView3() {
        return imageView3;
    }

    public void setImageView3(ImageView imageView3) {
        this.imageView3 = imageView3;
    }

    public void setImageRandom(){
        RandomImg1 randomImg1 = new RandomImg1(slot1,slot2,slot3,slot4,imageView);
        randomImg1.randomImg1();
        RandomImg2 randomImg2 = new RandomImg2(slot1,slot2,slot3,slot4,imageView2);
        randomImg2.randomImg2();
        RandomImg3 randomImg3 = new RandomImg3(slot1,slot2,slot3,slot4,imageView3);
        randomImg3.randomImg3();
        Randomimg4 randomimg4 = new Randomimg4(slot1,slot2,slot3,slot4,imageView4);
        randomimg4.randomImg4();


    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String iiiii(String ojdaw, String oiuyba, String qweda, String uytvaq){


        String[] oijq = ojdaw.split("::");
        try {
            pomaa = oijq[3];
        }catch (Exception e){
            pomaa = "";
        }

        try {
            oinadw = oijq[4];
        }catch (Exception e){
            oinadw = "";
        }


        try {
            oiuybsa = oijq[5];
        }catch (Exception e){
            oiuybsa = "";
        }

        try {
            ytrebca = oijq[6];
        }catch (Exception e){
            ytrebca = "";
        }

        try {
            dad = oijq[0];
        }catch (Exception e){
            dad = "";
        }
        try {
            ojda = oijq[1];
        }catch (Exception e){
            ojda = "";
        }

        try {
            qweqw = oijq[2];
        }catch (Exception e){
            qweqw = "";

        }



        OneSignal.sendTag(Msdas.oooo("c3ViX2FwcA=="), ojda);

        String khsja = dad + Msdas.oooo("P2J1bmRsZT0=") + oiuyba + Msdas.oooo("JmFkX2lkPQ==") + qweda + Msdas.oooo("JmFwcHNfaWQ9") + uytvaq +
                Msdas.oooo("JnN1YjY9") + ojda +
                Msdas.oooo("JnN1Yjc9") + qweqw +
                Msdas.oooo("JnN1YjI9") + pomaa +
                Msdas.oooo("JnN1YjM9") + oinadw +
                Msdas.oooo("JnN1YjQ9") + oiuybsa +
                Msdas.oooo("JnN1YjU9") + ytrebca +
                Msdas.oooo("JmRldl9rZXk9") + Msdas.oooo(RB.oinwq);
        return khsja;
    }

}
