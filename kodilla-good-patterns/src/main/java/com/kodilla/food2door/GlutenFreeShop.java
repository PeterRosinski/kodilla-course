package com.kodilla.food2door;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GlutenFreeShop implements Supplier {

    private String name;
    private String description;

    public GlutenFreeShop() {
        this.name = "GlutenFreeShop";
        this.description = "Żywność bezglutenowa";
    }

    @Override
    public List<AvailableProductsDto> retrieveAvailableProductsList() {

        List<AvailableProductsDto> availableProductsDtoList = new ArrayList<>();
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("10349812","Pomarańcze", "Warzywa i owoce"),4.0,254.0));
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("34343412","Ser pleśniowy", "Nabiał"),4.99,777.0));
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("08678772","Szynka babuni", "Wędliny"),44.0,150.0));
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("02222212","Jogurt naturalny", "Nabiał"),1.30,289.0));
        availableProductsDtoList.add(new AvailableProductsDto(this,new Product("09223513","Kasza jęczmienna", "Inne"),3.3,277.0));
        return availableProductsDtoList;

    }

    @Override
    public boolean process(OrderDetails orderDetails) {
        System.out.println("--------");
        System.out.println("Przygotowanie formularza zamówienia");
        System.out.println("Generacja pliku PDF");
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
        GlutenFreeShop that = (GlutenFreeShop) o;
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


