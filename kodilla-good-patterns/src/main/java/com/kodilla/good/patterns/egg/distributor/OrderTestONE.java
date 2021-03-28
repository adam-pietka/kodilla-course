package com.kodilla.good.patterns.egg.distributor;

import java.util.ArrayList;
import java.util.List;

public class OrderTestONE{
    private List<OrderService> orderServiceList = new ArrayList<>();

    public void addSupplier(OrderService supplierToAdd){
        orderServiceList.add(supplierToAdd);
    }

    public OrderService getShop(int n){
        return orderServiceList.get(n);
    }

    public int getSupplierQuantity(){
        return orderServiceList.size();
    }
}
