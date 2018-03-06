package com.kodilla.orders;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(Product product, User user, double price) {

        System.out.println("Zamówienie produktu nr " + product.getSerialNumber() + " dla użytkownika " + user.getName() + " w cenie " + price);
        return true;

    }

}
