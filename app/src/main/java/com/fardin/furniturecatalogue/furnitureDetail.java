package com.fardin.furniturecatalogue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.squareup.picasso.Picasso;

public class furnitureDetail extends AppCompatActivity {
    private TextView nameView;
    private TextView detailView;
    private ImageView imageView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture_detail);
        nameView = findViewById(R.id.namee);
        detailView = findViewById(R.id.detailee);
        imageView = findViewById(R.id.imagee);
        String name = getIntent().getExtras().getString("name");
        String detail = getIntent().getExtras().getString("detail");
        int url = getIntent().getExtras().getInt("pic");
        nameView.setText(name);
        Picasso.get()
                .load("https://raw.githubusercontent.com/fardinraz/furniture/main/furniture1/" + url +".jpg")
                .placeholder(R.drawable.progress_animation)
                .into(imageView);
        detailView.setText(detail);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        adView = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }
}