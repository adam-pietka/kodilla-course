package com.kodilla.good.patterns.egg.distributor;

import java.util.HashMap;

public class ProviderGlutenFreeStockStatus {

    private HashMap<String, ProviderExtraFoodShopWarehouse> glutenFreeShopWarehouseHashMap = new HashMap<>() ;
//
    public ProviderGlutenFreeStockStatus() {
//    public void loadDataToHashMap(){
        glutenFreeShopWarehouseHashMap.put("CUCUMBER", new ProviderExtraFoodShopWarehouse("CUCUMBER", 1000.0,3.0 ));
        glutenFreeShopWarehouseHashMap.put("EGGS", new ProviderExtraFoodShopWarehouse("EGGS", 10.0,0.40 ));
        glutenFreeShopWarehouseHashMap.put("APPLE", new ProviderExtraFoodShopWarehouse("apple", 100.0,2.5 ));
        glutenFreeShopWarehouseHashMap.put("RASPBERRY", new ProviderExtraFoodShopWarehouse("raspberry", 10.0,25.0 ));
        glutenFreeShopWarehouseHashMap.put("SALMON", new ProviderExtraFoodShopWarehouse("salmon", 10.0,65.00 ));
        glutenFreeShopWarehouseHashMap.put("MILK", new ProviderExtraFoodShopWarehouse("MILK", 1000.0,5.20 ));
    }

    public HashMap<String, ProviderExtraFoodShopWarehouse> getGlutenFreeShopWarehouseHashMap() {
        return glutenFreeShopWarehouseHashMap;
    }

    public DtoProduct releaseStaffFromStock(String productName, double quantity){

        if (quantity < glutenFreeShopWarehouseHashMap.get(productName).getQuantityOnStock()){
            glutenFreeShopWarehouseHashMap.get(productName).setQuantityOnStock(quantity);
            double price = glutenFreeShopWarehouseHashMap.get(productName).getPrice();
            double amount = quantity * price;
            return new DtoProduct(productName,
                    quantity,
                    price,
                    amount);
        }
        if (quantity >= glutenFreeShopWarehouseHashMap.get(productName).getQuantityOnStock()){
            double tmpQuantity =  glutenFreeShopWarehouseHashMap.get(productName).getQuantityOnStock();
            glutenFreeShopWarehouseHashMap.get(productName).setQuantityOnStock(tmpQuantity);
            double price = glutenFreeShopWarehouseHashMap.get(productName).getPrice();
            double amount = tmpQuantity * price;
            return new DtoProduct(productName,
                    tmpQuantity,
                    price,
                    amount);
        }
        if (quantity < glutenFreeShopWarehouseHashMap.get(productName).getQuantityOnStock()){
            return new DtoProduct(productName,0,0,0);
        }
        return null;
    }
}
