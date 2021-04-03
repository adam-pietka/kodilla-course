package com.kodilla.good.patterns.egg.distributor;

public class ProviderExtraFoodShop implements  OrderService{


    @Override
    public String[][] process(String[][] tempListEF) {

        System.out.println("Odpowiedż z ExtreFoodShop!!!");
        return null;

    }

    public String[][] listOfAvailableProducts(){
        String [][] productOnStockExtraFoodShop = new String[100][];
        productOnStockExtraFoodShop[0][0] = "EGG";
        productOnStockExtraFoodShop[0][1] = "1000";
        productOnStockExtraFoodShop[1][0] = "MILK";
        productOnStockExtraFoodShop[1][1] = "10";
        productOnStockExtraFoodShop[2][0] = "CHEESE";
        productOnStockExtraFoodShop[2][1] = "100";
        productOnStockExtraFoodShop[3][0] = "BUTTER";
        productOnStockExtraFoodShop[3][1] = "1";
        productOnStockExtraFoodShop[4][0] = "PASTA";
        productOnStockExtraFoodShop[4][1] = "20";
        productOnStockExtraFoodShop[5][0] = "RICE";
        productOnStockExtraFoodShop[5][1] = "10";


        return productOnStockExtraFoodShop;
    }
}