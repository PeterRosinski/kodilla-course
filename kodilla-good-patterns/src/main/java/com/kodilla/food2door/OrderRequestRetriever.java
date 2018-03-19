package com.kodilla.food2door;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        Product product = new Product("02222212","Jogurt naturalny","Nabiał");
        //Product product = new Product("92222212","Inny produkt","Nabiał");
        //Product product = new Product("09789313","Kasza jęczmienna", "Inne");
        OrderDetails orderDetails = new OrderDetails(product, 50.0);
        System.out.println("Produkt: " + orderDetails);

        SuppliersRetriever suppliersRetriever = new SuppliersRetriever();

        SupplierSearcher supplierSearcher = new SupplierSearcher(suppliersRetriever.retrieveSuppliersList());
        try {
            System.out.println("Wyszukiwanie produktu wśród dostawców po najniższej cenie");
            Supplier supplier = supplierSearcher.searchByPrice(orderDetails);
            System.out.println("Znaleziono potencjalnego dostawcę produktu: " + supplier.toString());
            return new OrderRequest(supplier,orderDetails);
        } catch (SupplierNotFoundException e) {
            System.out.println("Nie znaleziono dostawcy produktu");
        }
        return null;
    }

}
