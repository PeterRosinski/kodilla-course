package com.kodilla.challenges;

public class OrderRequest {

    private User user;
    private Product product;
    private double price;

    public OrderRequest(final User user, final Product product, final double price) {
        this.user = user;
        this.product = product;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }
}
