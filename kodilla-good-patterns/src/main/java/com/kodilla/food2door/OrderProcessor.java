package com.kodilla.food2door;

public class OrderProcessor {

    public void process(OrderRequest orderRequest) {

        //TODO w przypadku pustego obiektu rzucamy wyjatek
        orderRequest.getSupplier().process(orderRequest.getOrderDetails());

    }

}
