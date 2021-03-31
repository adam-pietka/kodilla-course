package com.kodilla.good.patterns.egg.distributor;

public class AppFood2Door {
    public static void main(String[] args) {
        System.out.println("Let's START!!!");

        BasketCustomerRetrieve basketCustomerRetrieve = new BasketCustomerRetrieve();
        FoodOrderRequest foodOrderRequest =basketCustomerRetrieve.retrieve();


        OrderMainServicesFoodToDoor orderMainServicesFoodToDoor = new OrderMainServicesFoodToDoor(
                new SmsEmailNotyfication(),
//                new ProviderExtraFoodShop(),
                new OrderTestONE().getShop(0),
                // lista  z suplayerami
                new DataStoreOrderRepositoryFood2Door());

        orderMainServicesFoodToDoor.process(foodOrderRequest);
    }

}