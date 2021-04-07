package com.kodilla.good.patterns.egg.distributor;

import java.util.List;

public interface OrderService {
    List<ProductInBasket> process(String userId, List<ProductInBasket> customerBusket);
//    String[][] listOfAvailableProducts();

}
