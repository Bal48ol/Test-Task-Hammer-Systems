package com.bal.hstest;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PizzaViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView titleTextView;
    public TextView descriptionTextView;
    public TextView priceTextView;

    public PizzaViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        titleTextView = itemView.findViewById(R.id.titleTextView);
        descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
        priceTextView = itemView.findViewById(R.id.priceTextView);
    }
}
