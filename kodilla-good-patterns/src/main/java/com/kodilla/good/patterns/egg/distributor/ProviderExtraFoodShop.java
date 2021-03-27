package com.kodilla.good.patterns.egg.distributor;

import java.util.ArrayList;
import java.util.List;

public class ProviderExtraFoodShop implements  OrderService{
    @Override
    public ArrayList<ResponseProductInBasket> process(List<ProductInBasket> tempListEF) {

        for (ProductInBasket i: tempListEF) {
            System.out.println(i.getProductName() + " " + i.getProductQuantity());
        }
        System.out.println("Odpowiedż z ExtreFoodShop!!!");
        return null;
    }

    public List<String> listOfAvailableProducts(){
        List<String> listOfAvailableProducts = new ArrayList<>();
        listOfAvailableProducts.add("EGGS");

        return listOfAvailableProducts;
    }
}
