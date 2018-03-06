package com.kodilla.orders;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderService(), new EmailService(), new ShopRepository());
        orderProcessor.process(orderRequest);

    }
}
