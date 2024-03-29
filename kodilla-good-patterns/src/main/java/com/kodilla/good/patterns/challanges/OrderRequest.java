package com.kodilla.good.patterns.challanges;

public class OrderRequest {

    private User user;
    private String productName1Banana ;
    private int productQuantity;

    public OrderRequest(User user, String productName, int productQuantity) {
        this.user = user;
        this.productName1Banana = productName;
        this.productQuantity = productQuantity;
    }

    public User getUser() {
        return user;
    }

    public String getProductName() {
        return productName1Banana;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
