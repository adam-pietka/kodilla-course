package com.kodilla.good.patterns.egg.distributor;


public class DataStoreOrderRepositoryFood2Door implements OrderRepositoryFood2Door {
    @Override
    public void orderToStore(OrderingPerson user, FoodOrderRequest orderRequest) {
        System.out.println("Order is saved in DB, Food2Door inc.");
    }
}