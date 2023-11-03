package com.bal.hstest;

import android.os.Bundle;

import com.bal.hstest.ui.CartFragment;
import com.bal.hstest.ui.Menu.MenuFragment;
import com.bal.hstest.ui.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    private MenuFragment menuFragment;
    private ProfileFragment profileFragment;
    private CartFragment cartFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuFragment = new MenuFragment();
        profileFragment = new ProfileFragment();
        cartFragment = new CartFragment();

        loadFragment(menuFragment);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNav);
        bottomNav.setSelectedItemId(R.id.tab_menu);
        bottomNav.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.tab_menu) {
                loadFragment(menuFragment);
                return true;
            } else if (item.getItemId() == R.id.tab_profile) {
                loadFragment(profileFragment);
                return true;
            } else if (item.getItemId() == R.id.tab_cart) {
                loadFragment(cartFragment);
                return true;
            }
            return false;
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, fragment);
        transaction.commit();
    }
}