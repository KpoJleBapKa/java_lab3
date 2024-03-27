package com.kroll;

import java.util.ArrayList;
import java.util.List;

public class OrderHistory {
    private List<Order> orders;

    public OrderHistory() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void displayOrderHistory() {
        if (orders.isEmpty()) {
            System.out.println("Історія замовлень порожня.");
        } else {
            System.out.println("Історія замовлень:");
            for (Order order : orders) {
                System.out.println("Номер замовлення: " + order.getOrderId() +
                        ". Вміст: " + order.getProductsList() +
                        ". Статус замовлення: " + (order.getStatus() > 0 ? order.getStatus() + " секунд" : "Готово."));
            }
        }
    }
}
