package com.kodilla.good.patterns.egg.distributor;

public class ResponseProductInBasket {
    private ProductInBasket productInBasket;
    private double price;
    private boolean isSale ;

    public ResponseProductInBasket(ProductInBasket productInBasket, double price, boolean isSale) {
        this.productInBasket = productInBasket;
        this.price = price;
        this.isSale = isSale;
    }

    public ProductInBasket getProductInBasket() {
        return productInBasket;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSale() {
        return isSale;
    }
}
