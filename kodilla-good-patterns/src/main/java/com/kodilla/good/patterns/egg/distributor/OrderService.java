package com.kodilla.good.patterns.egg.distributor;

import java.util.ArrayList;
import java.util.List;

public interface OrderService {
    ArrayList<ResponseProductInBasket> process(List<ProductInBasket> tempListEF);
    List<String> listOfAvailableProducts();
}
