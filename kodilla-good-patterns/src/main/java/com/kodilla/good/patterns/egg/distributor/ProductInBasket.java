package com.kodilla.good.patterns.egg.distributor;

public class ProductInBasket {

    private final String productName;
    private final double productQuantity;

    public ProductInBasket(String productName, double productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductQuantity() {
        return productQuantity;
    }
}
