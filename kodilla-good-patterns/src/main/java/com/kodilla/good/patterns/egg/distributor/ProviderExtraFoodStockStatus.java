package com.kodilla.good.patterns.egg.distributor;

import java.util.HashMap;

public class ProviderExtraFoodStockStatus {

    private HashMap<String, ProviderExtraFoodShopWarehouse> extraFoodShopWarehouseHashMap = new HashMap<>() ;
//
    public ProviderExtraFoodStockStatus() {
//    public void loadDataToHashMap(){
        extraFoodShopWarehouseHashMap.put("HAM", new ProviderExtraFoodShopWarehouse("HAM", 10.0,55.0 ));
        extraFoodShopWarehouseHashMap.put("EGGS", new ProviderExtraFoodShopWarehouse("EGGS", 10.0,0.40 ));
        extraFoodShopWarehouseHashMap.put("APPLE", new ProviderExtraFoodShopWarehouse("apple", 100.0,2.5 ));
        extraFoodShopWarehouseHashMap.put("RASPBERRY", new ProviderExtraFoodShopWarehouse("raspberry", 10.0,25.0 ));
        extraFoodShopWarehouseHashMap.put("SALMON", new ProviderExtraFoodShopWarehouse("salmon", 10.0,65.00 ));
        extraFoodShopWarehouseHashMap.put("MILK", new ProviderExtraFoodShopWarehouse("MILK", 1000.0,5.20 ));
    }

    public HashMap<String, ProviderExtraFoodShopWarehouse> getExtraFoodShopWarehouseHashMap() {
        return extraFoodShopWarehouseHashMap;
    }

    public DtoProduct releaseStaffFromStock(String productName, double quantity){

        if (quantity < extraFoodShopWarehouseHashMap.get(productName).getQuantityOnStock()){
            extraFoodShopWarehouseHashMap.get(productName).setQuantityOnStock(quantity);
            double price = extraFoodShopWarehouseHashMap.get(productName).getPrice();
            double amount = quantity * price;
            return new DtoProduct(productName,
                    quantity,
                    price,
                    amount);
        }
        if (quantity >= extraFoodShopWarehouseHashMap.get(productName).getQuantityOnStock()){
            double tmpQuantity =  extraFoodShopWarehouseHashMap.get(productName).getQuantityOnStock();
            extraFoodShopWarehouseHashMap.get(productName).setQuantityOnStock(tmpQuantity);
            double price = extraFoodShopWarehouseHashMap.get(productName).getPrice();
            double amount = tmpQuantity * price;
            return new DtoProduct(productName,
                    tmpQuantity,
                    price,
                    amount);
        }
        if (quantity < extraFoodShopWarehouseHashMap.get(productName).getQuantityOnStock()){
            return new DtoProduct(productName,0,0,0);
        }
        return null;
    }
}
