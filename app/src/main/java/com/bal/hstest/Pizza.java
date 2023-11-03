package com.bal.hstest;

public class Pizza {
    private String title;
    private String description;
    private String price;
    private int image;

    public Pizza(String title, String description, String price, int image) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}