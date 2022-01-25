package com.fardin.furniturecatalogue;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class furnitureViewAdapter extends RecyclerView.Adapter<furnitureViewAdapter.viewHolder> {
    private Context context;
    private List<FCategory> fCategoryList;

    public furnitureViewAdapter(Context context, List<FCategory> fCategoryList) {
        this.context = context;
        this.fCategoryList = fCategoryList;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_layout, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        FCategory fCategory = fCategoryList.get(position);
        holder.categoryText.setText(fCategory.getCategoryName());
        holder.imageView.setImageDrawable(context.getDrawable(fCategory.getCategoryPicUrl()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , FurnitureGalleryItem.class);
                intent.putExtra("title",fCategory.getCategoryName());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return fCategoryList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView categoryText;
        private ImageView imageView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            categoryText = itemView.findViewById(R.id.categoryName);
            imageView = itemView.findViewById(R.id.categoryImage);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
