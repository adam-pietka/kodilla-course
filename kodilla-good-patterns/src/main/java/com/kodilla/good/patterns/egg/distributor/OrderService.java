package com.kodilla.good.patterns.egg.distributor;

import java.util.HashMap;

public interface OrderService {
    HashMap<Boolean, DtoProduct> process(String userId, HashMap<String, Double> orderedProducts);
//    String[][] listOfAvailableProducts();

}
