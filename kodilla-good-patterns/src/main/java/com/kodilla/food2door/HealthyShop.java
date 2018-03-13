package com.kodilla.food2door;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HealthyShop implements Suppliers {

    private String name;
    private String description;

    public HealthyShop() {
        this.name = "HealthyShop";
        this.description = "Żywność ekologiczna";
    }

    @Override
    public List<AvailableProductsDto> retrieveAvailableProductsList() {

        List<AvailableProductsDto> availableProductsDtoList = new ArrayList<>();
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("10343412","Mandarynki", "Warzywa i owoce"),4.5,254.0));
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("36546552","Ser pleśniowy", "Nabiał"),4.99,777.0));
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("01111112","Szynka babuni", "Wędliny"),44.0,150.0));
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("02224412","Jogurt naturalny", "Nabiał"),1.45,289.0));
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("09789313","Kasza jęczmienna", "Inne"),3.3,277.0));
        return availableProductsDtoList;

    }

    @Override
    public boolean process(OrderDetails orderDetails) {
        System.out.println("-----");
        System.out.println("Brak komunikacji z systemem dostawcy");
        return false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthyShop that = (HealthyShop) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, description);
    }

    @Override
    public String toString() {
        return name + ": " + description;
    }
}

