package com.kodilla.good.patterns.egg.distributor;

import java.util.ArrayList;
import java.util.List;

public class ProviderGlutenFreeShop implements OrderService {

    @Override
    public ArrayList<ResponseProductInBasket> process(List<ProductInBasket> tempListEF) {

        return null;
    }

    @Override
    public List<String> listOfAvailableProducts() {
        List<String> listOfAvailableProducts = new ArrayList<>();
        listOfAvailableProducts.add("HAM");
        listOfAvailableProducts.add("TOMATO");
        listOfAvailableProducts.add("CUCUMBER");

        return listOfAvailableProducts;
    }
}