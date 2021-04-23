package com.kodilla.good.patterns.egg.distributor;

import java.util.HashMap;
import java.util.Map;

public class ProviderGlutenFreeShop implements  OrderService{
    ProviderGlutenFreeStockStatus glutenFreeStockStatus = new ProviderGlutenFreeStockStatus();

    @Override
    public HashMap<String, DtoProduct> process(String userId, HashMap<String, Double> productListFromOrder) {

        printStock("before");
        HashMap<String, DtoProduct> resultList = new HashMap<>();
        for (Map.Entry i : productListFromOrder.entrySet() ) {
            resultList.putAll(checkStock(String.valueOf(String.valueOf( i.getKey())), (double) i.getValue()));
        }
        printStock("after");
        return  resultList;
    }

    private HashMap<String, DtoProduct> checkStock(String prodName, double quantity){
        HashMap<String, DtoProduct> responseHashMap = new HashMap<>() ;

        HashMap<String,ProviderExtraFoodShopWarehouse> extraFoodShopWarehouses = glutenFreeStockStatus.getGlutenFreeShopWarehouseHashMap();

        if (extraFoodShopWarehouses.get(prodName) != null) {
            responseHashMap.put( prodName, glutenFreeStockStatus.releaseStaffFromStock(prodName, quantity));
            return responseHashMap;
        }

        responseHashMap.put(prodName, new DtoProduct(prodName,0.0,0.0,0.0 ));
        return responseHashMap;
    }

    private void printStock(String beforeOrAfter){
        glutenFreeStockStatus.getGlutenFreeShopWarehouseHashMap().entrySet().stream()
                .forEach(e->{
                    System.out.print(  beforeOrAfter + "After - GlutenFreeShop: " + e.getValue().getProdName());
                    System.out.println( " - " + e.getValue().getQuantityOnStock());
                });
    }
}