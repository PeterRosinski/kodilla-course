package com.kodilla.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("kolo", "Zdzisław", "Krawężnik");
        Product product = new Product("CN676232","fotel");
        return new OrderRequest(user,product,50.0);
    }
}
