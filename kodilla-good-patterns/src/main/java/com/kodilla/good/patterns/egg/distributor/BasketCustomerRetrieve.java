package com.kodilla.good.patterns.egg.distributor;

public class BasketCustomerRetrieve {

    public FoodOrderRequest retrieve(){
        OrderingPerson orderingPersonAdam = new OrderingPerson("Adam P.","Develope 11 st.", 888_555_55,"adam.java@main.com");

        CustomerBasket customerBasketAdam = new CustomerBasket(orderingPersonAdam.getUserId());
        customerBasketAdam.addProductToBasket(new ProductInBasket("EGGS",12.0));
        customerBasketAdam.addProductToBasket(new ProductInBasket("MILK",3.0));
//        customerBasketAdam.addProductToBasket(new ProductInBasket("HAM",5.0));
//        customerBasketAdam.addProductToBasket(new ProductInBasket("TOMATO",15.0));
//        customerBasketAdam.addProductToBasket(new ProductInBasket("CUCUMBER",15.3));

        return new FoodOrderRequest(orderingPersonAdam,customerBasketAdam);
    }
}