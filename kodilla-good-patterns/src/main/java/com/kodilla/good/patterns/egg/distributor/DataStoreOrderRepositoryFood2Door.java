package com.kodilla.good.patterns.egg.distributor;


public class DataStoreOrderRepositoryFood2Door implements OrderRepositoryFood2Door {
    @Override
    public void orderToStore(FoodOrderRequest foodOrderRequest) {
        System.out.println("Order saved in DB.");
    }
}