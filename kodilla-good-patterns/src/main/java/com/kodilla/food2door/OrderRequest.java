package com.kodilla.food2door;

import java.util.Objects;

public class OrderRequest {

    private Suppliers supplier;
    private OrderDetails orderDetails;

    public OrderRequest(final Suppliers supplier, final OrderDetails orderDetails) {
        this.supplier = supplier;
        this.orderDetails = orderDetails;
    }

    public Suppliers getSupplier() {
        return supplier;
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRequest that = (OrderRequest) o;
        return Objects.equals(supplier, that.supplier) &&
                Objects.equals(orderDetails, that.orderDetails);
    }

    @Override
    public int hashCode() {

        return Objects.hash(supplier, orderDetails);
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "supplier=" + supplier +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
