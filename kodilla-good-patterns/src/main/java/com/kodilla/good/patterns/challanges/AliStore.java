package com.kodilla.good.patterns.challanges;

public class AliStore implements OrderService{

    @Override
    public boolean sale(User user, String productName, int productQuantity) {

        boolean productIsAvailable = true;

        if (productIsAvailable) {
            orderConfirmation(productName);
            priceTOPay(productQuantity);
            System.out.println("Thank and regards AliShop!!!\n");
            return true;
        } else {
            System.out.println("We are sorry, we can't send to you your product: " + productName + ".\n");
            return false;
        }
    }

    private void orderConfirmation(String productName){
        System.out.println("Thank you for buy " + productName + " in our shop.");
    }

    private void priceTOPay(int productQuantity){
        System.out.println("Price is: " + productQuantity * 2.5 + " EUR" );
    }

}
