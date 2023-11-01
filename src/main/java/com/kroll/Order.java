package com.kroll;

import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products;
    private String status;

    public Order(int orderId, List<Product> products, String status) {
        this.orderId = orderId;
        this.products = products;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProductsList() {
        return products;
    }

    public String getStatus() {
        return status;
    }

    public int decrementStatus() {
        if (status.equals("В обробці")) {
            return status.length();
        }
        return 0;
    }
}

