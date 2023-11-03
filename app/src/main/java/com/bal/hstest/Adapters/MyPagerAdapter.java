package com.bal.hstest.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.bal.hstest.ui.Menu.TabMenu.TabComboFragment;
import com.bal.hstest.ui.Menu.TabMenu.TabDessertFragment;
import com.bal.hstest.ui.Menu.TabMenu.TabDrinksFragment;
import com.bal.hstest.ui.Menu.TabMenu.TabPizzaFragment;

public class MyPagerAdapter extends FragmentStateAdapter {

    public MyPagerAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new TabPizzaFragment();
            case 1:
                return new TabComboFragment();
            case 2:
                return new TabDessertFragment();
            case 3:
                return new TabDrinksFragment();
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
