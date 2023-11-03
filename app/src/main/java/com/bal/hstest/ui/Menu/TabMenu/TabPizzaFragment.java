package com.bal.hstest.ui.Menu.TabMenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bal.hstest.Adapters.PizzaAdapter;
import com.bal.hstest.Pizza;
import com.bal.hstest.R;

import java.util.ArrayList;
import java.util.List;

public class TabPizzaFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_pizza_fragment, container, false);
        RecyclerView pizzaLayout = view.findViewById(R.id.pizzaLayout);
        pizzaLayout.setLayoutManager(new LinearLayoutManager(requireContext()));
        List<Pizza> pizzas = new ArrayList<Pizza>(){{
            add(new Pizza("Трюфельная с мортаделлой",
                    "Мортаделла, трюфельный соус, шампиньоны, красный лук, моцарелла, фирменный соус альфредо и чеснок",
                    "от 539 ₽",
                    R.drawable.pizza1));
            add(new Pizza("Пицца Миксик",
                    "Пицца четвертинками с ветчиной, цыпленком, томатами, брынзой, моцареллой и фирменным соусом альфредо",
                    "от 389 ₽",
                    R.drawable.pizza2));
            add(new Pizza("Пицца Жюльен",
                    "Цыпленок, шампиньоны, ароматный грибной соус, лук, сухой чеснок, моцарелла, смесь сыров чеддер и пармезан",
                    "от 489 ₽",
                    R.drawable.pizza3));
            add(new Pizza("Сырная \uD83C\uDF31\uD83D\uDC76",
                    "Моцарелла, сыры чеддер и пармезан, фирменный соус альфредо, моцарелла, смесь сыров чеддер и пармезан",
                    "от 299 ₽",
                    R.drawable.pizza4));
            add(new Pizza("Пепперони фреш",
                    "Пикантная пепперони, увеличенная порция моцареллы, томаты, фирменный томатный соус и пармезан",
                    "от 299 ₽",
                    R.drawable.pizza5));
        }};
        pizzaLayout.setAdapter(new PizzaAdapter(requireActivity(), pizzas));
        return view;
    }
}
