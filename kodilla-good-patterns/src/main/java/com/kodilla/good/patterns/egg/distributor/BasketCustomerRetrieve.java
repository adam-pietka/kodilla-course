package com.kodilla.good.patterns.egg.distributor;

public class BasketCustomerRetrieve {

    public FoodOrderRequest retrieve(){
        OrderingPerson orderingPersonAdam = new OrderingPerson("Adam P.","Develope 11 st.", 888_555_55,"adam.java@main.com");

        CustomerBasket customerBasketAdam = new CustomerBasket(orderingPersonAdam.getUserId());
        customerBasketAdam.addProductToBasket(new ProductInBasket("EGGS",120.0));
        customerBasketAdam.addProductToBasket(new ProductInBasket("MILK",30.0));
        customerBasketAdam.addProductToBasket(new ProductInBasket("HAM",15.0));
        customerBasketAdam.addProductToBasket(new ProductInBasket("TOMATO",55.5));
        customerBasketAdam.addProductToBasket(new ProductInBasket("CUCUMBER",15.0));

        return new FoodOrderRequest(orderingPersonAdam,customerBasketAdam);
    }
}