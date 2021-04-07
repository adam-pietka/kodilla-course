package com.kodilla.good.patterns.egg.distributor;

import java.util.Arrays;
import java.util.List;

public class OrderMainServicesFoodToDoor {

    private final NotificationServiceFood2Door notificationServiceFood2Door;
    private final OrderRepositoryFood2Door orderRepositoryFood2Door;
    private List<OrderService> listsOfAvailableShop;

    public OrderMainServicesFoodToDoor(NotificationServiceFood2Door notificationServiceFood2Door,
                                       List<OrderService> listsOfAvailableShop,
                                       OrderRepositoryFood2Door orderRepositoryFood2Door) {
        this.notificationServiceFood2Door = notificationServiceFood2Door;
        this.listsOfAvailableShop = listsOfAvailableShop;
        this.orderRepositoryFood2Door = orderRepositoryFood2Door;
    }

    public void startProcessingOrder(final FoodOrderRequest foodOrderRequest){
        List<ProductInBasket> opppop = foodOrderRequest.getOrderCustomerBasket().getCustomerBusket();

        for (OrderService shop: listsOfAvailableShop) {
            opppop = shop.process(
                    foodOrderRequest.getOrderingCustomer().getUserId()
                    , foodOrderRequest.getOrderCustomerBasket().getCustomerBusket());
        }

        int o=0;
        for (List<ProductInBasket> e : Arrays.asList(opppop)) {
            e.stream().forEach(a -> System.out.println("**" + a.toString()));
            o += e.stream().mapToInt(a -> (int) a.getQuantitySold()).sum();

        }
        System.out.println("O: " + o);
    }
}