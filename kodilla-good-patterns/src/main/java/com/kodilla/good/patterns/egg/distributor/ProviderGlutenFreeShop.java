package com.kodilla.good.patterns.egg.distributor;

public class ProviderGlutenFreeShop implements OrderService {

    @Override
    public String[][] process(String[][] lista) {
        String[][] takaTam = new String[100][];
        takaTam[0][0] = "MILK";
        takaTam[0][1] = "10";
        takaTam[0][2] = "100.0";
        takaTam[1][0] = "HAM";
        takaTam[1][1] = "10";
        takaTam[1][2] = "10.5";

        return takaTam ;
    }

    @Override
    public String[][] listOfAvailableProducts() {
        String[][] productOnStockGluTenFree = new String[1000][];
        productOnStockGluTenFree[0][0] = "HAM";
        productOnStockGluTenFree[0][1] = "100";
        productOnStockGluTenFree[1][0] = "MILK";
        productOnStockGluTenFree[1][1] = "100";
        productOnStockGluTenFree[2][0] = "ROLL";
        productOnStockGluTenFree[2][1] = "100";
        productOnStockGluTenFree[3][0] = "KETCHUP";
        productOnStockGluTenFree[3][1] = "10";
        productOnStockGluTenFree[4][0] = "SALT";
        productOnStockGluTenFree[4][1] = "100";
        productOnStockGluTenFree[5][0] = "CREAM";
        productOnStockGluTenFree[5][1] = "5";

        return productOnStockGluTenFree;
    }
}