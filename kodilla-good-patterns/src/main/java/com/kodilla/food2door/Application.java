package com.kodilla.food2door;

public class Application {
    public static void main(String[] args) {

        System.out.println("Początek operacji przygotowywania zamówienia");

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        if(orderRequest!=null) {
            OrderProcessor orderProcessor = new OrderProcessor();
            orderProcessor.process(orderRequest);
        }
        System.out.println("Koniec operacji przygotowania zamówienia");
    }
}
