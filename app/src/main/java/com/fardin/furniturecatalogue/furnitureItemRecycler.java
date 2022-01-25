package com.fardin.furniturecatalogue;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;

public class furnitureItemRecycler extends RecyclerView.Adapter<furnitureItemRecycler.viewHolder> {
    private Context context;
    private List<FItems> fItemList;

    public furnitureItemRecycler(Context context, List<FItems> fItemList) {
        this.context = context;
        this.fItemList = fItemList;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_in_gallery, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        FItems fItem = fItemList.get(position);

        Picasso.get()
                .load("https://raw.githubusercontent.com/fardinraz/furniture/main/furniture1/" + fItem.getPhotoUrl() +".jpg")
                .placeholder(R.drawable.progress_animation)
                .into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , furnitureDetail.class);
                intent.putExtra("name",fItem.getName());
                intent.putExtra("detail" , fItem.getDescription());
                intent.putExtra("pic",fItem.getPhotoUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return fItemList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView imageView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.itemImg);
        }

        @Override
        public void onClick(View v) {
            
        }
    }
}
