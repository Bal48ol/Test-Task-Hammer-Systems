package com.bal.hstest.ui.Menu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.bal.hstest.R;
import com.bal.hstest.SlideItem;

import java.util.ArrayList;
import java.util.List;

public class MenuViewModel extends ViewModel {
    private final MutableLiveData<String> selectedCity = new MutableLiveData<>();
    private final MutableLiveData<List<SlideItem>> slideItems = new MutableLiveData<>();

    public LiveData<String> getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(String city) {
        selectedCity.setValue(city);
    }

    public LiveData<List<SlideItem>> getSlideItems() {
        return slideItems;
    }

    public void initSlideItems() {
        List<SlideItem> items = new ArrayList<>();
        items.add(new SlideItem(R.drawable.banner1));
        items.add(new SlideItem(R.drawable.banner2));
        items.add(new SlideItem(R.drawable.banner3));
        slideItems.setValue(items);
    }
}
