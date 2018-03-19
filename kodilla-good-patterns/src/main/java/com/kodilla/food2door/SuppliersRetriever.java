package com.kodilla.food2door;

import java.util.List;
import java.util.ArrayList;


public class SuppliersRetriever {

    public List<Supplier> retrieveSuppliersList() {

        List<Supplier> suppliersList = new ArrayList<>();
        suppliersList.add(new ExtraFoodShop());
        suppliersList.add(new HealthyShop());
        suppliersList.add(new GlutenFreeShop());
        return suppliersList;

    }
}
