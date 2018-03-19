package com.kodilla.food2door;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SupplierSearcher {

    private List<Supplier> suppliersList;

    public SupplierSearcher(List<Supplier> suppliersList) {
        this.suppliersList = suppliersList;
    }

    public Supplier searchByPrice(OrderDetails orderDetails) throws SupplierNotFoundException {
        Optional<AvailableProductsDto> availableProductsDto = suppliersList.stream()
                .flatMap(products->products.retrieveAvailableProductsList().stream())
                .filter(products -> products.getProduct().equals(orderDetails.getProduct()))
                .filter(products -> products.getQuantityInStock() >= orderDetails.getQuantity())
                .min(Comparator.comparing(AvailableProductsDto::getPrice));
        return availableProductsDto.orElseThrow(SupplierNotFoundException::new).getSupplier();
    }

    public List<Supplier> getSuppliersList() {
        return suppliersList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierSearcher that = (SupplierSearcher) o;
        return Objects.equals(suppliersList, that.suppliersList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(suppliersList);
    }

    @Override
    public String toString() {
        return "SupplierSearcher{" +
                "suppliersList=" + suppliersList +
                '}';
    }
}
