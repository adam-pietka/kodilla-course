package com.kodilla.good.patterns.challanges;

public class DataStoreOrderRepository implements OrderRepository {
    @Override
    public void orderToStore(User user, OrderRequest orderRequest) {
        System.out.println("Order is saved in DB!");
    }
}