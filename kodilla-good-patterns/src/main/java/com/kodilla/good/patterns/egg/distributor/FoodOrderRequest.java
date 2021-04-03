package com.kodilla.good.patterns.egg.distributor;

public class FoodOrderRequest {

    private OrderingPerson orderingPerson;
    private CustomerBasket customerBasket;

    public FoodOrderRequest(String orderingPerson, CustomerBasket customerBasket) {
        this.orderingPerson = orderingPerson;
        this.customerBasket = customerBasket;
    }

    public OrderingPerson getOrderingCustomer() {
        return orderingPerson;
    }

    public CustomerBasket getOrderCustomerBasket() {
        return customerBasket;
    }
}
