package com.kodilla.food2door;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class TheBestSupplierSearcher {

    private List<Suppliers> suppliersList;

    public TheBestSupplierSearcher(List<Suppliers> suppliersList) {
        this.suppliersList = suppliersList;
    }

    public Suppliers search(OrderDetails orderDetails) throws SupplierNotFoundException {
        Optional<AvailableProductsDto> availableProductsDto = suppliersList.stream()
                .flatMap(products->products.retrieveAvailableProductsList().stream())
                .filter(products -> products.getProduct().equals(orderDetails.getProduct()))
                .filter(products -> products.getQuantityInStock() >= orderDetails.getQuantity())
                .min(Comparator.comparing(AvailableProductsDto::getPrice));
        if(availableProductsDto.orElse(null)==null) {
            throw new SupplierNotFoundException();
        } else {
            return availableProductsDto.get().getSupplier();
        }
    }

    public List<Suppliers> getSuppliersList() {
        return suppliersList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TheBestSupplierSearcher that = (TheBestSupplierSearcher) o;
        return Objects.equals(suppliersList, that.suppliersList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(suppliersList);
    }

    @Override
    public String toString() {
        return "TheBestSupplierSearcher{" +
                "suppliersList=" + suppliersList +
                '}';
    }
}
