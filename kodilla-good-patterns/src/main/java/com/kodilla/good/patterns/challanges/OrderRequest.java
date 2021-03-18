package com.kodilla.good.patterns.challanges;

public class OrderRequest {

    private User user;
    private String productName1Banana ;
    private int productQuantity1 ;

    public OrderRequest(User user, String productName1Banana, int productQuantity1) {
        this.user = user;
        this.productName1Banana = productName1Banana;
        this.productQuantity1 = productQuantity1;
    }

    public User getUser() {
        return user;
    }

    public String getProductName1Banana() {
        return productName1Banana;
    }

    public int getProductQuantity1() {
        return productQuantity1;
    }
}
