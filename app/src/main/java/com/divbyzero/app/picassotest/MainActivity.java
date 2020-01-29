package com.divbyzero.app.picassotest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso3.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String IMG_URL = "https://i.pinimg.com/originals/f2/d1/00/f2d100f03cd09b8299e2e4fe248dc685.png";

        imgView = (ImageView) findViewById(R.id.img_view);

        /*
        Works OK on Picasso 2.7
        Doesn't work on Picasso 3.x

        Picasso.with()
                .load("IMG_URL")
                .into(imgView);

         */

        Picasso pic = new Picasso.Builder(getApplicationContext()).build();
        pic.load(IMG_URL).into(imgView);
    }
}
