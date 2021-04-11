package com.kodilla.good.patterns.egg.distributor;

public class OrderDtoFoodToDoor {
    public OrderingPerson user;
    public boolean isSale;

    public OrderDtoFoodToDoor(OrderingPerson user, boolean isSale) {
        this.user = user;
        this.isSale = isSale;
    }

    public OrderingPerson getUser() { return user; }

    public boolean isRented() { return isSale; }
}
