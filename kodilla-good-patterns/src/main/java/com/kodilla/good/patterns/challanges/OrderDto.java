package com.kodilla.good.patterns.challanges;

public class OrderDto {
    public User user;
    public boolean isSale;

    public OrderDto(final User user, final boolean isSale) {
        this.user = user;
        this.isSale = isSale;
    }

    public User getUser() { return user; }

    public boolean isRented() { return isSale; }


}
