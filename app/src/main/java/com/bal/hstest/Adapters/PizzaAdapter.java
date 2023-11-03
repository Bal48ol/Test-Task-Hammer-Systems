package com.bal.hstest.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bal.hstest.Pizza;
import com.bal.hstest.PizzaViewHolder;
import com.bal.hstest.R;

import java.util.List;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaViewHolder> {
    Context context;
    List<Pizza> pizzas;

    public PizzaAdapter(Context context, List<Pizza> pizzas) {
        this.context = context;
        this.pizzas = pizzas;
    }

    @NonNull
    @Override
    public PizzaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PizzaViewHolder(LayoutInflater.from(context).inflate(R.layout.pizza_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaViewHolder holder, int position) {
        holder.titleTextView.setText(pizzas.get(position).getTitle());
        holder.descriptionTextView.setText(pizzas.get(position).getDescription());
        holder.priceTextView.setText(pizzas.get(position).getPrice());
        holder.imageView.setImageResource(pizzas.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return pizzas.size();
    }
}
