package com.kodilla.food2door;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        Product product = new Product("02222212","Jogurt naturalny","Nabiał");
        OrderDetails orderDetails = new OrderDetails(product, 50.0);

        SuppliersRetriever suppliersRetriever = new SuppliersRetriever();

        TheBestSupplierSearcher theBestSupplierSearcher = new TheBestSupplierSearcher(suppliersRetriever.retrieveSuppliersList());
        Suppliers supplier = theBestSupplierSearcher.search(orderDetails);

        //TODO co jesli nie bedzie produktu, czyli supplier bedzie null
        return new OrderRequest(supplier,orderDetails);

    }

}
