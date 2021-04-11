package com.kodilla.good.patterns.egg.distributor;

public class ProviderExtraFoodShopWarehouse {

    private String prodName;
    private double quantityOnStock;
    private double price;

    public ProviderExtraFoodShopWarehouse(String prodName, double quantityOnStock, double price) {
        this.prodName = prodName.toUpperCase();
        this.quantityOnStock = quantityOnStock;
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getQuantityOnStock() {
        return quantityOnStock;
    }

    public void setQuantityOnStock(double quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
