package com.kodilla.good.patterns.egg.distributor;

import java.util.ArrayList;
import java.util.List;

public class ProviderExtraFoodShop implements  OrderService{
    @Override
    public ArrayList<ResponseProductInBasket> process(List<ProductInBasket> tempListEF) {
        ResponseProductInBasket responseProductInBasket ;

        for (ProductInBasket i: tempListEF) {
            i.getProductName();
            i.getProductQuantity();

        }

        return null;
    }

    public List<String> listOfAvailableProducts(){
        List<String> listOfAvailableProducts = new ArrayList<>();
        listOfAvailableProducts.add("EGGS");

        return listOfAvailableProducts;
    }
}
