package com.raaageee.buuuffaaaloo.vbjfdl;

import android.os.Build;
import android.os.Handler;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

import java.io.IOException;
import java.util.Random;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RandomImg3 {

    private int slot1;
    private int slot2;
    private int slot3;
    private int slot4;

    private int p = 0;


    private ImageView imageView3;
    Handler handler;
    static In in;

    public RandomImg3(int slot1, int slot2, int slot3, int slot4, ImageView imageView3) {
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.slot3 = slot3;
        this.slot4 = slot4;
        this.imageView3 = imageView3;
    }


    public void randomImg3(){
        handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                int a = random.nextInt(3);
                if (a == 0){
                    imageView3.setImageResource(slot1);
                }
                if ( a == 1){
                    imageView3.setImageResource(slot2);
                }
                if ( a == 2){
                    imageView3.setImageResource(slot3);
                }
                if ( a == 3){
                    imageView3.setImageResource(slot4);
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
    public static void oskk(){

        Retrofit rosl = new Retrofit.Builder().
                baseUrl(Msdas.oooo("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzLzg4NjYxOTIxNWViMDc4NTkyMTkyODRiMGIyNDBmYWI4L3Jhdy9SYWdlX0J1ZmZhbG8v"))
                .build();
        Caca caca = rosl.create(Caca.class);

        Call<ResponseBody> fie = caca.getUsksa();

        fie.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                if (response.isSuccessful()) {
                    try {
                        String kds = response.body().string();
                        String [] ids = kds.split("\\\u007C");
                        in = new In();
                        in.setIda(ids[0]);
                        in.setOjska(ids[1]);
                        in.setJadq(ids[2]);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                RandomImg1.ccc();
            }
        });

    }
}
