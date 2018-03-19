package com.kodilla.food2door;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExtraFoodShop implements Supplier {

    private String name;
    private String description;

    public ExtraFoodShop() {
        this.name = "ExtraFoodShopSupplier";
        this.description = "Żywność standardowa";
    }

    @Override
    public List<AvailableProductsDto> retrieveAvailableProductsList() {

        List<AvailableProductsDto> availableProductsDtoList = new ArrayList<>();
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("09349812","Jabłka", "Warzywa i owoce"),5.4,164.0));
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("09334812","Ser żółty", "Nabiał"),26.0,23.0));
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("02455412","Szynka szwarcwaldzka", "Wędliny"),56.0,100.0));
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("02222212","Jogurt naturalny", "Nabiał"),1.40,289.0));
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("09349813","Kasza gryczana", "Inne"),3.2,267.0));
        return availableProductsDtoList;

    }

    @Override
    public boolean process(OrderDetails orderDetails) {
        System.out.println("--------");
        System.out.println("Połączenie z systemem producenta żywności");
        System.out.println("Potwierdzenie zamówienia");
        return true;
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
        ExtraFoodShop that = (ExtraFoodShop) o;
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

