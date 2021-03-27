package com.kodilla.good.patterns.egg.distributor;

import java.util.ArrayList;
import java.util.List;

public class CustomerBasket {

    private String orderingPerson;
    private List<ProductInBasket> customerBusket =  new ArrayList<>();

    public CustomerBasket(String orderingPerson) {
        this.orderingPerson = orderingPerson;
    }

    public void addProductToBasket(ProductInBasket productInBasket){
        customerBusket.add(productInBasket);
    }

    public String getOrderingPerson() {
        return orderingPerson;
    }

    public List<ProductInBasket> getCustomerBusket() {
        return customerBusket;
    }
}