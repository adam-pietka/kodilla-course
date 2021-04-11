/*
package com.kodilla.good.patterns.egg.distributor;

import java.util.HashMap;
import java.util.List;

public class ProviderHealthyShop implements OrderService{


    @Override
    public List<ProductInBasket> process(String userId, List<ProductInBasket> productListFromOrder) {
        List<ProductInBasket> replayListHealthyShop = productListFromOrder;
        replayListHealthyShop.stream()
                .forEach(e-> {
                    DtoProduct tmp = checkStock(e.getProductName(), e.getQuantityOrderedByCustomer());

                    e.setQuantitySold(tmp.getQuantity());
                    e.setPrice(tmp.getPrice());
                    e.setTotalPrice(tmp.getAmount());
                });
        return replayListHealthyShop;
    }

    private DtoProduct checkStock(String prodName, double quantity){
        HashMap<String,ProviderExtraFoodShopWarehouse> extraHealthyShop = new HashMap<>();
        extraHealthyShop.put("CHICKEN", new ProviderExtraFoodShopWarehouse("CHICKEN", 12.50,55.0 ));
        extraHealthyShop.put("TANGERINE", new ProviderExtraFoodShopWarehouse("tangerine", 8.0,0.40 ));
        extraHealthyShop.put("INEDIBLE", new ProviderExtraFoodShopWarehouse("inedible", 100.0,2.5 ));
        extraHealthyShop.put("VINEGAR", new ProviderExtraFoodShopWarehouse("vinegar", 10.0,25.0 ));
        extraHealthyShop.put("LETTUCE", new ProviderExtraFoodShopWarehouse("lettuce", 1.0,65.00 ));
        extraHealthyShop.put("CUCUMBER", new ProviderExtraFoodShopWarehouse("CUCUMBER", 2.0,5.00 ));

        if (extraHealthyShop.get(prodName) != null) {
            if (quantity <= extraHealthyShop.get(prodName).getQuantityOnStock() & extraHealthyShop.get(prodName).getQuantityOnStock() != 0) {
                extraHealthyShop.get(prodName).setQuantityOnStock(extraHealthyShop.get(prodName).getQuantityOnStock() - quantity);
                return new DtoProduct(
                        prodName,
                        quantity,
                        extraHealthyShop.get(prodName).getPrice(),
                        extraHealthyShop.get(prodName).getPrice() * quantity);
            }
            if (quantity > extraHealthyShop.get(prodName).getQuantityOnStock() & extraHealthyShop.get(prodName).getQuantityOnStock() != 0) {
                double tmp = extraHealthyShop.get(prodName).getQuantityOnStock();

                return new DtoProduct(
                        prodName,
                        tmp,
                        extraHealthyShop.get(prodName).getPrice(),
                        extraHealthyShop.get(prodName).getPrice() * tmp);
            }
        }
        return new DtoProduct(prodName,0,0,0);
    }
}
*/
