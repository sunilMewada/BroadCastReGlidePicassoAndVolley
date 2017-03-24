package com.sunil.broadcastreceiver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = (ImageView)findViewById(R.id.imageView);

        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);

        Glide.with(this)
                .load("http://goo.gl/gEgYUd")
                .placeholder(R.drawable.img)
                .centerCrop()
                .into(imageView);


        Picasso.with(this)
                .load("https://www.simplifiedcoding.net/wp-content/uploads/2015/10/advertise.png")
                .placeholder(R.drawable.img)
                .centerCrop()
                .resize(200,200)
                .rotate(360)
                .into(imageView2);
    }
}
