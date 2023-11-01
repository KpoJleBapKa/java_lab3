package com.kroll;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return name + " - " + price;
    }

    public static List<Product> createAvailableProducts() {
        List<Product> availableProducts = new ArrayList<>();
        availableProducts.add(new Product(1, "Ноутбук", 999.99));
        availableProducts.add(new Product(2, "Смартфон", 499.99));
        availableProducts.add(new Product(3, "Планшет", 299.99));
        availableProducts.add(new Product(4, "Навушники", 149.99));
        availableProducts.add(new Product(5, "Мишка", 39.99));
        return availableProducts;
    }
}
