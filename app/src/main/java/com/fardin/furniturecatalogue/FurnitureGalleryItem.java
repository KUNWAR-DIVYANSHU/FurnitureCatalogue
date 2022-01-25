package com.fardin.furniturecatalogue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FurnitureGalleryItem extends AppCompatActivity {

    private RecyclerView recyclerView;
    private furnitureItemRecycler adapter;
    private ArrayList<FItems> fItemList;
    ImageView back_button;

    TextView titleView;
    String title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture_gallery_item);
        title = getIntent().getExtras().getString("title");
        titleView = findViewById(R.id.titleText);
        titleView.setText(title);
        createRecyclerView();
        back_button = findViewById(R.id.back_btn);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    private void createRecyclerView() {

        fItemList = new ArrayList<>();
        switch(title) {
            case "Shofas & Armchairs":
                fItemList.add(new FItems("Sofa", 13, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 15, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 16, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 18, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 2, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 23, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 24, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 27, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 29, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 3, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 31, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 32, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 41, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 43, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 54, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 58, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 59, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 60, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 62, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 63, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 64, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 65, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 66, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 68, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 69, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 7, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 70, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 71, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 74, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 72, "some text for sofa"));
                fItemList.add(new FItems("Sofa", 76, "some text for sofa"));
                break;
            case "Tables":
                fItemList.add(new FItems("Table", 26, "some text for sofa"));
                fItemList.add(new FItems("Table", 9, "some text for sofa"));
                fItemList.add(new FItems("Table", 10, "some text for sofa"));
                fItemList.add(new FItems("Table", 12, "some text for sofa"));
                fItemList.add(new FItems("Table", 15, "some text for sofa"));
                fItemList.add(new FItems("Table", 2, "some text for sofa"));
                fItemList.add(new FItems("Table", 26, "some text for sofa"));
                break;
            case "Chairs":
                fItemList.add(new FItems("Chair", 10, "some text for sofa"));
                fItemList.add(new FItems("Chair", 11, "some text for sofa"));
                fItemList.add(new FItems("Chair", 12, "some text for sofa"));
                fItemList.add(new FItems("Chair", 14, "some text for sofa"));
                fItemList.add(new FItems("Chair", 20, "some text for sofa"));
                fItemList.add(new FItems("Chair", 25, "some text for sofa"));
                fItemList.add(new FItems("Chair", 26, "some text for sofa"));
                fItemList.add(new FItems("Chair", 4, "some text for sofa"));
                fItemList.add(new FItems("Chair", 5, "some text for sofa"));
                fItemList.add(new FItems("Chair", 60, "some text for sofa"));
                fItemList.add(new FItems("Chair", 8, "some text for sofa"));
                break;
            case "Beds":
                fItemList.add(new FItems("Bed", 19, "some text for sofa"));
                fItemList.add(new FItems("Bed", 19, "some text for sofa"));
                fItemList.add(new FItems("Bed", 19, "some text for sofa"));
                fItemList.add(new FItems("Bed", 21, "some text for sofa"));
                fItemList.add(new FItems("Bed", 22, "some text for sofa"));
                fItemList.add(new FItems("Bed", 28, "some text for sofa"));
                fItemList.add(new FItems("Bed", 30, "some text for sofa"));
                fItemList.add(new FItems("Bed", 33, "some text for sofa"));
                fItemList.add(new FItems("Bed", 34, "some text for sofa"));
                fItemList.add(new FItems("Bed", 35, "some text for sofa"));
                fItemList.add(new FItems("Bed", 36, "some text for sofa"));
                fItemList.add(new FItems("Bed", 37, "some text for sofa"));
                fItemList.add(new FItems("Bed", 38, "some text for sofa"));
                fItemList.add(new FItems("Bed", 39, "some text for sofa"));
                fItemList.add(new FItems("Bed", 40, "some text for sofa"));
                fItemList.add(new FItems("Bed", 42, "some text for sofa"));
                fItemList.add(new FItems("Bed", 44, "some text for sofa"));
                fItemList.add(new FItems("Bed", 45, "some text for sofa"));
                fItemList.add(new FItems("Bed", 46, "some text for sofa"));
                fItemList.add(new FItems("Bed", 47, "some text for sofa"));
                fItemList.add(new FItems("Bed", 48, "some text for sofa"));
                fItemList.add(new FItems("Bed", 49, "some text for sofa"));
                fItemList.add(new FItems("Bed", 50, "some text for sofa"));
                fItemList.add(new FItems("Bed", 51, "some text for sofa"));
                fItemList.add(new FItems("Bed", 53, "some text for sofa"));
                fItemList.add(new FItems("Bed", 55, "some text for sofa"));
                fItemList.add(new FItems("Bed", 56, "some text for sofa"));
                fItemList.add(new FItems("Bed", 57, "some text for sofa"));
                fItemList.add(new FItems("Bed", 6, "some text for sofa"));
                fItemList.add(new FItems("Bed", 61, "some text for sofa"));
                fItemList.add(new FItems("Bed", 67, "some text for sofa"));
                fItemList.add(new FItems("Bed", 73, "some text for sofa"));
                fItemList.add(new FItems("Bed", 75, "some text for sofa"));
                break;
            case "Drawers":
                fItemList.add(new FItems("Mirror", 17, "some text for sofa"));
                break;
            case "Matresses":
                fItemList.add(new FItems("Bed", 55, "some text for sofa"));
                fItemList.add(new FItems("Bed", 56, "some text for sofa"));
                fItemList.add(new FItems("Bed", 57, "some text for sofa"));
                break;
            case "Kids Room":
                fItemList.add(new FItems("wooden toy", 1, "some text for sofa"));
                break;
            case "Bookcase":
                fItemList.add(new FItems("Case", 52, "some text for sofa"));
                break;
            default:
                fItemList.add(new FItems("234", 1, "some text for sofa"));
                break;
        }


        
        recyclerView = findViewById(R.id.furnitureItemRecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(
                new GridLayoutManager(FurnitureGalleryItem.this, 2));
        adapter = new furnitureItemRecycler(this , fItemList);
        recyclerView.setAdapter(adapter);
    }
}