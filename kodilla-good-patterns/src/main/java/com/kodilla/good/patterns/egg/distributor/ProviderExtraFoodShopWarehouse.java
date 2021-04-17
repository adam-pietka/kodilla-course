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

    public double getQuantityOnStock() {
        return quantityOnStock;
    }

    public void setQuantityOnStock(double chargeQuantity) {
        this.quantityOnStock = getQuantityOnStock() - chargeQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
