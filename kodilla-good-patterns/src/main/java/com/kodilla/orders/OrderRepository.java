package com.kodilla.orders;

public interface OrderRepository {
    void saveOrder(Product product, User user, double price);
}
