package com.kodilla.good.patterns.egg.distributor;

import java.util.ArrayList;
import java.util.List;

public class CustomerBasket {

    private String orderingPersonID;
    private List<ProductInBasket> customerBusket =  new ArrayList<>();

    public CustomerBasket(String orderingPersonID) {
        this.orderingPersonID = orderingPersonID;
    }

    public void addProductToBasket(ProductInBasket productInBasket){
        customerBusket.add(productInBasket);
    }

    public String getOrderingPerson() {
        return orderingPersonID;
    }

    public List<ProductInBasket> getCustomerBusket() {
        return customerBusket;
    }
    public void printCustomerBuysket(){
        System.out.println(orderingPersonID.toString());
        for (ProductInBasket i: customerBusket             ) {
            System.out.println(i.toString());
        }
    }
}