package com.fardin.furniturecatalogue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private furnitureViewAdapter adapter;
    private ArrayList<FCategory> fCategoryList;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createRecyclerView();

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

    }

    private void createRecyclerView() {

        fCategoryList = new ArrayList<>();
        fCategoryList.add(new FCategory("Shofas & Armchairs",R.drawable.sofa));
        fCategoryList.add(new FCategory("Tables",R.drawable.tables));
        fCategoryList.add(new FCategory("Chairs",R.drawable.chairs));
        fCategoryList.add(new FCategory("Almirah",R.drawable.almirah));
        fCategoryList.add(new FCategory("Beds",R.drawable.beds));
        fCategoryList.add(new FCategory("Drawers",R.drawable.drawer));
        fCategoryList.add(new FCategory("Matresses",R.drawable.matresses));
        fCategoryList.add(new FCategory("Kids Room",R.drawable.kids_room));
        fCategoryList.add(new FCategory("Bookcase",R.drawable.bookcase));

        recyclerView = findViewById(R.id.furnitureRecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(
                new GridLayoutManager(MainActivity.this, 2));
        adapter = new furnitureViewAdapter(this , fCategoryList);
        recyclerView.setAdapter(adapter);

    }

}