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

    public void startProcessingOrder(final FoodOrderRequest foodOrderRequest){
        String[][] allInOrder = new  String[100][];
        List<ProductInBasket> productInBaskets = foodOrderRequest.getOrderCustomerBasket().getCustomerBusket();
        for (int i = 0; i <productInBaskets.size() ; i++) {
            int finalI = i;
            productInBaskets.stream()
                    .forEach(p->{
                        allInOrder[finalI][0] = p.getProductName();
                        allInOrder[finalI][1] = p.getProductName();
                    });
        }




    }

    public void splitTheOrder(final FoodOrderRequest foodOrderRequest){
        String[][] listProductsInOrder = new  String[100][];
        List<ProductInBasket> productInBaskets = foodOrderRequest.getOrderCustomerBasket().getCustomerBusket();
        for (int a = 0; a <productInBaskets.size() ; a++) {
            int finalA = a;
            productInBaskets.stream()
                    .forEach(p->{
                        listProductsInOrder[finalA][0] = p.getProductName().toUpperCase();
                        listProductsInOrder[finalA][1] = Double.toString(p.getProductQuantity());
                    });
        }

        for (OrderService shopOnList: listsOfAvailableShop) {
            String[][] listTEST= shopOnList.listOfAvailableProducts();
            for (int j=0; j< listProductsInOrder.length;j++){
                String tmpProductFromOrder = listProductsInOrder[j][0];
                Double tmpQuantityOfOrderedProduct = Double.parseDouble(listProductsInOrder[j][1]) ;
                String[][]  orderPerShop = new  String[100][];
                int tmpCounter = 0;
                for (int i = 0; i < listTEST.length; i++) {
                    String tmpAvailableProdInShop = listTEST[i][0];
                    if (listProductsInOrder[j][2] != "" || listProductsInOrder[j][2] != null) {
                        if (tmpProductFromOrder.equals(tmpAvailableProdInShop)) {
                            if (Double.parseDouble(listTEST[i][1]) != 0) {
                                if (tmpQuantityOfOrderedProduct < Double.parseDouble(listTEST[i][1])) {
                                    listProductsInOrder[j][2] = listTEST.getClass().getName();
                                    orderPerShop[tmpCounter][0] = tmpProductFromOrder;
                                    orderPerShop[tmpCounter][1] = Double.toString(tmpQuantityOfOrderedProduct);

                                    tmpCounter++;
                                }
                            }
                        }
                    }
                }



                /*                int finalJ = j;
                foodOrderRequest.getOrderCustomerBasket().getCustomerBusket().stream()
                .forEach(e->{
                    for (int i =0; i< listTEST.length;i++){
                        if (e.getProductName().toUpperCase().equals(listTEST[i][0])){
                            if (Double.parseDouble(listTEST[i][1]) !=0){
                                if ( (double) e.getProductQuantity() < Double.parseDouble(listTEST[i][1])){
                                    orderPerShop[i][0] = e.getProductName().toUpperCase();
                                    orderPerShop[i][1] = Double.toString( e.getProductQuantity());
                                    listProductsInOrder[finalJ][3] = e.getClass().getName();
                                }
                            }
                        }
                    }
                });*/
                String[][] responseList =  shopOnList.process(orderPerShop);
                completeTheOrder(responseList, listProductsInOrder);
            }
        }
    }

    public void completeTheOrder(String responseList[][], String allProductForOrder[][]){
        System.out.println("Let's start!!! ");
        if (responseList.length == allProductForOrder.length){}

        for (int i=0; i<responseList.length;i++){
        String  x=    responseList[i][0];
        }
    }
}