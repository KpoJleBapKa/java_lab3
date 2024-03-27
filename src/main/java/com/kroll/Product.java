package com.kroll;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String name;
    private double price;
    private String category;

    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() { return category; }

    @Override
    public String toString() {
        return name + " - " + price;
    }

    public static List<Product> createAvailableProducts() {
        List<Product> availableProducts = new ArrayList<>();
        availableProducts.add(new Product(1, "Acer Predator", 999.99, "monitor"));
        availableProducts.add(new Product(2, "Samsung M12", 499.99, "phone"));
        availableProducts.add(new Product(3, "Zotac RTX 2060", 299.99, "Graphics card"));
        availableProducts.add(new Product(4, "Razer Kraken", 149.99, "headphones"));
        availableProducts.add(new Product(5, "Hator Pulsar", 39.99, "mouse"));
        return availableProducts;
    }
}
