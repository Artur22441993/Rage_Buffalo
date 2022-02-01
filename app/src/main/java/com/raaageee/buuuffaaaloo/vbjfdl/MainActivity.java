package com.raaageee.buuuffaaaloo.vbjfdl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageViewSpin;
    private TextView textView;
    private int slot1;
    private int slot2;
    private int slot3;
    private int slot4;
    private int slot5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        imageView = findViewById(R.id.imageView5);
        imageView2 = findViewById(R.id.imageView6);
        imageView3 = findViewById(R.id.imageView7);
        imageView4 = findViewById(R.id.imageView8);
        imageViewSpin = findViewById(R.id.imageView4);
        textView = findViewById(R.id.textView);

        slot1 = R.drawable.ic_slot_1;
        slot2 = R.drawable.ic_slot_2;
        slot3 = R.drawable.ic_slot_3;
        slot4 = R.drawable.ic_slot_4;

        imageViewSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetText setText = new SetText(textView);
                setText.setText();
                SetImage setImage =
                        new SetImage(slot1,slot2,slot3,slot4,imageView,imageView2,imageView3,imageView4);
                setImage.setImageRandom();

            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(),RB.class));
        finishAffinity();
    }
}