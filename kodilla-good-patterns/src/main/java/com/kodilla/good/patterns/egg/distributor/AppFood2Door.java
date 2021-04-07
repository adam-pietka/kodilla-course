package com.kodilla.good.patterns.egg.distributor;

import java.util.ArrayList;
import java.util.List;

public class AppFood2Door {
    public static void main(String[] args) {
        System.out.println("Let's START!!!");

        BasketCustomerRetrieve basketCustomerRetrieve = new BasketCustomerRetrieve();
        FoodOrderRequest foodOrderRequest =basketCustomerRetrieve.retrieve();

        List<OrderService> shopList = new ArrayList<>();

        ProviderExtraFoodShop  providerExtraFoodShop = new ProviderExtraFoodShop();
//        ProviderHealthyShop providerHealthyShop = new ProviderHealthyShop();
//        ProviderGlutenFreeShop providerGlutenFreeShop = new ProviderGlutenFreeShop();
        shopList.add(providerExtraFoodShop);
//        shopList.add(providerHealthyShop);
//        shopList.add(providerGlutenFreeShop);

        OrderMainServicesFoodToDoor orderMainServicesFoodToDoor = new OrderMainServicesFoodToDoor(
                new SmsEmailNotyfication()
                , shopList   // lista  z suplayerami
                , new DataStoreOrderRepositoryFood2Door());

        orderMainServicesFoodToDoor.startProcessingOrder(foodOrderRequest);

//        orderMainServicesFoodToDoor.process(String[][] listaSAAA);
    }

}