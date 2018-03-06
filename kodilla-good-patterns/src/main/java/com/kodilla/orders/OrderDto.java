package com.kodilla.orders;

public class OrderDto {

    private Product product;
    private User user;
    private boolean isOrdered;

    public OrderDto(final Product product, final User user, final boolean isOrdered) {
        this.product = product;
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

}
