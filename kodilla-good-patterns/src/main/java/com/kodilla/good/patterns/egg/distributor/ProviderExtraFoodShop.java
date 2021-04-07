package com.kodilla.good.patterns.egg.distributor;

import java.util.List;

public class ProviderExtraFoodShop implements  OrderService{

    @Override
    public List<ProductInBasket>  process(String userId, List<ProductInBasket> productListFromOrder) {
        List<ProductInBasket> replayList = productListFromOrder;

        replayList.stream()
                .forEach(e-> {
                    e.getProductName();
                    if (e.getProductName().equals("HAM")){
                        e.setPrice(5.0);
                        e.setQuantitySold(2.0);
                        e.setTotalPrice(10.0);
                    }
                });
        return replayList;
    }
    private void checkStock(){

    }
}
