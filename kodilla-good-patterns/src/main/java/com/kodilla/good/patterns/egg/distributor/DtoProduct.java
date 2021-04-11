package com.kodilla.good.patterns.egg.distributor;

public class DtoProduct {
    private String prodName;
    private double quantity;
    private double price;
    private double amount;

    public DtoProduct(String prodName, double quantity, double price, double amount) {
        this.prodName = prodName;
        this.quantity = quantity;
        this.price = price;
        this.amount = amount;
    }

    public String getProdName() {
        return prodName;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

}
