package com.kodilla.good.patterns.egg.distributor;

import java.util.HashMap;
import java.util.List;

public class OrderMainServicesFoodToDoor {

    private final NotificationServiceFood2Door notificationServiceFood2Door;
    private final OrderRepositoryFood2Door orderRepositoryFood2Door;
    private List<OrderService> listsOfAvailableShop;
    boolean  isSale = false;

    public OrderMainServicesFoodToDoor(NotificationServiceFood2Door notificationServiceFood2Door,
                                       List<OrderService> listsOfAvailableShop,
                                       OrderRepositoryFood2Door orderRepositoryFood2Door) {
        this.notificationServiceFood2Door = notificationServiceFood2Door;
        this.listsOfAvailableShop = listsOfAvailableShop;
        this.orderRepositoryFood2Door = orderRepositoryFood2Door;
    }

    public OrderDtoFoodToDoor startProcessingOrder(FoodOrderRequest foodOrderRequest){
        HashMap<String, Double> shortListOrderedProducts = new HashMap<>();


        for (OrderService shop: listsOfAvailableShop) {

            foodOrderRequest.getOrderCustomerBasket().getCustomerBusket().stream()
                    .forEach(i->{
                        String productName = i.getProductName();
                        double quantityOrdered = i.getQuantityOrderedByCustomer();
                        double quantitySold = i.getQuantitySold();
                        shortListOrderedProducts.put(productName, quantityOrdered - quantitySold);
                    });

            HashMap<String , DtoProduct > answerFromShop = shop.process(foodOrderRequest.getOrderingCustomer().getUserId(), shortListOrderedProducts);
                            answerFromShop.entrySet().stream()
                                    .forEach(eachAnswerFromShop -> {
                                        foodOrderRequest.getOrderCustomerBasket().getCustomerBusket().stream()
                                                .forEach(eachBasket ->{
                                                    if( eachBasket.getProductName().equals(eachAnswerFromShop.getValue().getProdName())) {
                                                        eachBasket.setQuantitySold(eachAnswerFromShop.getValue().getQuantity());
                                                        eachBasket.setTotalPrice(eachAnswerFromShop.getValue().getAmount());
                                                        if(eachBasket.getQuantitySold() == 0) eachBasket.setPrice(0);
                                                        if(eachBasket.getQuantitySold() > 0) {
                                                            eachBasket.setPrice(eachBasket.getTotalPrice() / eachBasket.getQuantitySold());
                                                            isSale = true;
                                                        }
                                                    }
                                                });
                                    } );
                            shortListOrderedProducts.clear();
        }
        
// TESTOWE  // TESTOWE// TESTOWE// TESTOWE// TESTOWE// TESTOWE// TESTOWE// TESTOWE// TESTOWE// TESTOWE// TESTOWE// TESTOWE
        System.out.println("Print customer Basket:");
        for (ProductInBasket i: foodOrderRequest.getOrderCustomerBasket().getCustomerBusket())
            {System.out.println(i.toString() );}
// *************************************************************************************************************************

        if (isSale){
            NotificationServiceFood2Door notificationServiceFood2Door = new SmsEmailNotyfication();
            notificationServiceFood2Door.sendInformationToUser(foodOrderRequest.getOrderingCustomer());
            orderRepositoryFood2Door.orderToStore(foodOrderRequest);
            return new OrderDtoFoodToDoor(foodOrderRequest.getOrderingCustomer(), true);
        } else {
            return new OrderDtoFoodToDoor(foodOrderRequest.getOrderingCustomer(), false);
        }
    }
}