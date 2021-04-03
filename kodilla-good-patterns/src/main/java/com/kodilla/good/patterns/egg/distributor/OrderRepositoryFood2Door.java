package com.kodilla.good.patterns.egg.distributor;

public interface OrderRepositoryFood2Door {

    void orderToStore(OrderingPerson orderingPerson, FoodOrderRequest foodOrderRequest, String[][] allProductForOrder) ;
}