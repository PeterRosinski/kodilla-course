package com.kodilla.orders;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("kolo", "Zdzisław", "Krawężnik", "zdzislaw.kraweznik@shop.com");
        Product product = new Product("CN676232","fotel");
        return new OrderRequest(user, product,50.0);

    }
}
