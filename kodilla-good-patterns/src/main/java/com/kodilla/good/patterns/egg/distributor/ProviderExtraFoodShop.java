package com.kodilla.good.patterns.egg.distributor;

import java.util.HashMap;
import java.util.Map;

public class ProviderExtraFoodShop implements  OrderService{

    @Override
    public HashMap<Boolean, DtoProduct> process(String userId, HashMap<String, Double> productListFromOrder) {

        HashMap<Boolean, DtoProduct> resultList = new HashMap<>();

        for (Map.Entry i : productListFromOrder.entrySet() ) {
            resultList.putAll(checkStock(String.valueOf(String.valueOf( i.getKey())), (double) i.getValue()));
        }
        return  resultList;
    }

    private HashMap<Boolean, DtoProduct> checkStock(String prodName, double quantity){
        HashMap<String,ProviderExtraFoodShopWarehouse> extraFoodShopWarehouses = new HashMap<>();
        extraFoodShopWarehouses.put("HAM", new ProviderExtraFoodShopWarehouse("HAM", 10.0,55.0 ));
        extraFoodShopWarehouses.put("EGGS", new ProviderExtraFoodShopWarehouse("EGGS", 10.0,0.40 ));
        extraFoodShopWarehouses.put("APPLE", new ProviderExtraFoodShopWarehouse("apple", 100.0,2.5 ));
        extraFoodShopWarehouses.put("RASPBERRY", new ProviderExtraFoodShopWarehouse("raspberry", 10.0,25.0 ));
        extraFoodShopWarehouses.put("SALMON", new ProviderExtraFoodShopWarehouse("salmon", 10.0,65.00 ));
        extraFoodShopWarehouses.put("MILK", new ProviderExtraFoodShopWarehouse("MILK", 1000.0,5.20 ));

        HashMap<Boolean, DtoProduct> responseHashMap = new HashMap<>() ;

        if (extraFoodShopWarehouses.get(prodName) != null) {
            if (quantity <= extraFoodShopWarehouses.get(prodName).getQuantityOnStock()) {

                extraFoodShopWarehouses.get(prodName).setQuantityOnStock(extraFoodShopWarehouses.get(prodName).getQuantityOnStock() - quantity);

                responseHashMap.put(true, new DtoProduct(prodName, quantity, extraFoodShopWarehouses.get(prodName).getPrice(),
                        quantity * extraFoodShopWarehouses.get(prodName).getPrice()));
                return responseHashMap ;
            }

            if (quantity > extraFoodShopWarehouses.get(prodName).getQuantityOnStock() & extraFoodShopWarehouses.get(prodName).getQuantityOnStock() !=0) {

                double availableOnStock = extraFoodShopWarehouses.get(prodName).getQuantityOnStock();
                extraFoodShopWarehouses.get(prodName).setQuantityOnStock(0);

                responseHashMap.put(true, new DtoProduct(prodName , availableOnStock, extraFoodShopWarehouses.get(prodName).getPrice()
                        , availableOnStock * extraFoodShopWarehouses.get(prodName).getPrice()));
                return responseHashMap;
            }
        }
        responseHashMap.put(false, new DtoProduct(prodName,0.0,0.0,0.0 ));
        return responseHashMap;
    }
}
