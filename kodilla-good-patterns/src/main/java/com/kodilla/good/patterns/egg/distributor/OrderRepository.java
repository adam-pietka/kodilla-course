package com.kodilla.good.patterns.egg.distributor;

public interface OrderRepository {

    void orderToStore(OrderingPerson orderingPerson, FoodOrderRequest foodOrderRequest) ;
}