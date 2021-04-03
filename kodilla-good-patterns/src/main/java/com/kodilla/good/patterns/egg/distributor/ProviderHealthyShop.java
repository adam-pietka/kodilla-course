package com.kodilla.good.patterns.egg.distributor;

public class ProviderHealthyShop implements OrderService{

    @Override
    public String[][] process(String[][] lista) {
        String[][] listaResponse = new String[100][];

        return null;
    }

    @Override
    public String[][] listOfAvailableProducts() {

        String [][] productOnStockHealthyShop = new String[100][];
        productOnStockHealthyShop[0][0] = "HAM";
         productOnStockHealthyShop[0][1] = "100";
        productOnStockHealthyShop[1][0] = "SUGAR";
         productOnStockHealthyShop[1][1] = "10";
        productOnStockHealthyShop[2][0] = "HOMEY";
         productOnStockHealthyShop[2][1] = "10";
        productOnStockHealthyShop[3][0] = "BACON";
         productOnStockHealthyShop[3][1] = "10";
        productOnStockHealthyShop[4][0] = "PORK";
         productOnStockHealthyShop[4][1] = "10";
        productOnStockHealthyShop[5][0] = "BEEF";
         productOnStockHealthyShop[5][1] = "10";
        productOnStockHealthyShop[6][0] = "LAMB";
         productOnStockHealthyShop[6][1] = "10";
        productOnStockHealthyShop[7][0] = "CRAYFISH";
         productOnStockHealthyShop[7][1] = "10";

        return productOnStockHealthyShop;
    }

}
