package com.kodilla.orders;

public class ShopRepository implements OrderRepository {

    @Override
    public void saveOrder(Product product, User user, double price) {

        System.out.println("Zapisano zamówienie produktu " + product.getSerialNumber() + " przez użytkownika " + user.getName() + " w cenie " + price + " w bazie danych.");

    }

}
