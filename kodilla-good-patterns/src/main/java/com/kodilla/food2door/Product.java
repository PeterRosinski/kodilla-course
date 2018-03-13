package com.kodilla.food2door;

import java.util.Objects;

public class Product {
    private String serialNumber;
    private String name;
    private String category;

    public Product(final String serialNumber, final String name, final String category) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.category = category;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(serialNumber, product.serialNumber) &&
                Objects.equals(name, product.name) &&
                Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {

        return Objects.hash(serialNumber, name, category);
    }

    @Override
    public String toString() {
        return "Product{" +
                "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

}
