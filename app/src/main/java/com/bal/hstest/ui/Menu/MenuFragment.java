package com.bal.hstest.ui.Menu;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;

import com.bal.hstest.Adapters.MyPagerAdapter;
import com.bal.hstest.Adapters.SlideAdapter;
import com.bal.hstest.R;
import com.bal.hstest.SlideItem;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import java.util.ArrayList;
import java.util.List;

public class MenuFragment extends Fragment {
    private TextView titleTextView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        TabLayout tabLayout = view.findViewById(R.id.tabLayout);
        ViewPager2 viewPager = view.findViewById(R.id.viewPager);
        viewPager.setUserInputEnabled(false);
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getActivity());
        viewPager.setAdapter(pagerAdapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("Пицца");
                            break;
                        case 1:
                            tab.setText("Комбо");
                            break;
                        case 2:
                            tab.setText("Десерты");
                            break;
                        case 3:
                            tab.setText("Напитки");
                            break;
                    }
                }
        );
        tabLayoutMediator.attach();

        titleTextView = view.findViewById(R.id.titleTextView);
        titleTextView.setOnClickListener(v -> showCitySelectionDialog());

        ViewPager2 viewPager2 = view.findViewById(R.id.viewImgPager);
        List<SlideItem> slideItem = new ArrayList<>();
        slideItem.add(new SlideItem(R.drawable.banner1));
        slideItem.add(new SlideItem(R.drawable.banner2));
        slideItem.add(new SlideItem(R.drawable.banner3));

        viewPager2.setAdapter(new SlideAdapter(slideItem, viewPager2));

        return view;
    }

    private void showCitySelectionDialog() {
        final String[] cities = new String[]{"Москва", "Тверь", "Санкт-Петербург"};
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Выберите город");
        builder.setItems(cities, (dialog, which) -> {
            String selectedCity = cities[which];
            titleTextView.setText(selectedCity);
        });
        builder.show();
    }
}
