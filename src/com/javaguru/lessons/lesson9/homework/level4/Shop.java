package com.javaguru.lessons.lesson9.homework.level4;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Shop {

    List<Product> shop = new ArrayList<>();

    void addProduct(Product newProduct) {
        shop.add(newProduct);
    }

    void deleteProduct(Product productToDelete) {
        shop.remove(productToDelete);
    }

    Product findProductByName(String name) {

        Product productFoundByName = null;

        for (Product product : shop) {
            String currentProductName = product.getName();
            if (currentProductName.equals(name)) {
                productFoundByName = product;
            }
        }
        return productFoundByName;
    }

    List<Product> findProductInRange(BigDecimal minPriceRange, BigDecimal maxPriceRange) {

        List<Product> productsFoundInRange = new ArrayList<>();

        for (Product product : shop) {
            BigDecimal currentProductPrice = product.getPrice();
            if (currentProductPrice.compareTo(minPriceRange) > 0 && currentProductPrice.compareTo(maxPriceRange) < 0) {
                productsFoundInRange.add(product);
            }
        }
        return productsFoundInRange;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "shop=" + shop +
                '}';
    }
}
