package com.kodilla.food2door;

import java.util.List;

public interface Suppliers {

    List<AvailableProductsDto> retrieveAvailableProductsList();
    boolean process(OrderDetails orderDetails);
}
