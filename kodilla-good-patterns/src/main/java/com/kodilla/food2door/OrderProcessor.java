package com.kodilla.food2door;

public class OrderProcessor {

    public void process(OrderRequest orderRequest) {

        if(orderRequest.getSupplier().process(orderRequest.getOrderDetails())) {
            System.out.println("Proces zamówienia zakończony powodzeniem");
        } else {
            System.out.println("Proces zamówienia zakończony niepowodzeniem");
        }

    }

}
