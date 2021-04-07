package com.kodilla.good.patterns.egg.distributor;

public class ProductInBasket {

    private String productName;
    private double quantityOrderedByCustomer;
    private double quantitySold;
    private double price;
    private double totalPrice;

    public ProductInBasket(String productName, double quantityOrderedByCustomer) {
        this.productName = productName.toUpperCase();
        this.quantityOrderedByCustomer = quantityOrderedByCustomer;
    }

    public ProductInBasket(String productName, double quantityOrderedByCustomer, double quantitySold, double price, double totalPrice) {
        this.productName = productName.toUpperCase();
        this.quantityOrderedByCustomer = quantityOrderedByCustomer;
        this.quantitySold = quantitySold;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantityOrderedByCustomer() {
        return quantityOrderedByCustomer;
    }

    public double getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(double quantitySold) {
        this.quantitySold = quantitySold;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "ProductInBasket{" +
                "productName='" + productName + '\'' +
                ", quantityOrderedByCustomer=" + quantityOrderedByCustomer +
                ", quantitySold=" + quantitySold +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

