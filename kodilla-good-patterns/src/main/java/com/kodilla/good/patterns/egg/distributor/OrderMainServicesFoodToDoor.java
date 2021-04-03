package com.kodilla.good.patterns.egg.distributor;

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

    public void splitTheOrder(final FoodOrderRequest foodOrderRequest){
        String[][] allProductForOrder = new  String[100][];

        for (OrderService shopOnList: listsOfAvailableShop) {
            String[][] listTEST= shopOnList.listOfAvailableProducts();

            for (int j=0; j< foodOrderRequest.getOrderCustomerBasket().getCustomerBusket().size();j++){
                String[][]  orderPerShop = new  String[100][];
                int finalJ = j;
                foodOrderRequest.getOrderCustomerBasket().getCustomerBusket().stream()
                .forEach(e->{
                    for (int i =0; i< listTEST.length;i++){
                        if (e.getProductName().toUpperCase().equals(listTEST[i][0])){
                            if (Double.parseDouble(listTEST[i][1]) !=0){
                                if ( (double) e.getProductQuantity() < Double.parseDouble(listTEST[i][1])){
                                    orderPerShop[i][0] = e.getProductName().toUpperCase();
                                    orderPerShop[i][1] = Double.toString( e.getProductQuantity());
                                    allProductForOrder[finalJ][0] = e.getClass().getName();
                                    allProductForOrder[finalJ][1] = e.getProductName().toUpperCase();
                                    allProductForOrder[finalJ][2] = Double.toString( e.getProductQuantity());
                                } else {
                                    allProductForOrder[finalJ][0] = e.getClass().getName();
                                    allProductForOrder[finalJ][1] = e.getProductName().toUpperCase();
                                    allProductForOrder[finalJ][2] = "0.00" ;
                                }
                                //
                            }
                        }
                    }
                });
                String[][] responseList =  new String[100][];
                responseList = shopOnList.process(orderPerShop);
                completeTheOrder(responseList);

            }
        }
    }

    public void completeTheOrder(String lista[][]){
        System.out.println("Let's start!!! ");


        for (int i=0; i<lista.length;i++){
        String  x=    lista[i][0];
        }

    }
}