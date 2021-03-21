package com.kodilla.good.patterns.challanges;

public class AliStore implements OrderService{

    private User user;
    private String productName;
    private int productQuantity;


    @Override
    public boolean sale(User user, String productName, int productQuantity) {
        this.user = user;
        this.productName = productName;
        this.productQuantity = productQuantity;
        return true;
    }

    public double priceToPay(){
        return productQuantity * 2.5;
    }

}
