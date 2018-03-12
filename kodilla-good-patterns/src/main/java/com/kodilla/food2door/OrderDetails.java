package com.kodilla.food2door;

import java.util.Objects;

public class OrderDetails {

    private Product product;
    private double quantity;

    public OrderDetails(final Product product, final double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetails that = (OrderDetails) o;
        return Objects.equals(product, that.product) &&
                Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(product, quantity);
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
