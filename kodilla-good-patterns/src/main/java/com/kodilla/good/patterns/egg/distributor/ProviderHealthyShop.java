package com.kodilla.good.patterns.egg.distributor;

import java.util.ArrayList;
import java.util.List;

public class ProviderHealthyShop implements OrderService{

    @Override
    public ArrayList<ResponseProductInBasket> process(List<ProductInBasket> tempListEF) {

        return null;
    }

    @Override
    public List<String> listOfAvailableProducts() {
        List<String> listOfAvailableProducts = new ArrayList<>();
        listOfAvailableProducts.add("MILK");

        return listOfAvailableProducts;
    }
}
