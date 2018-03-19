package com.kodilla.food2door;

public class AvailableProductsDto {

    private Supplier supplier;
    private Product product;
    private Double price;
    private Double quantityInStock;

    public AvailableProductsDto(Supplier supplier, Product product, Double price, Double quantityInStock) {
        this.supplier = supplier;
        this.product = product;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public Double getPrice() {
        return price;
    }

    public Double getQuantityInStock() {
        return quantityInStock;
    }

}
