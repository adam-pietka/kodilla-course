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
        String[][] listProductsInOrder = new  String[100][];
        for (int a = 0; a <foodOrderRequest.getOrderCustomerBasket().getCustomerBusket().size() ; a++) {
            int finalA = a;
            foodOrderRequest.getOrderCustomerBasket().getCustomerBusket().stream()
                    .forEach(p->{
                        listProductsInOrder[finalA][0] = p.getProductName().toUpperCase();
                        listProductsInOrder[finalA][1] = Double.toString(p.getProductQuantity());
                    });
        }

        for (OrderService shopOnList: listsOfAvailableShop) {
            String[][] listOfAvailableProductsInShop = shopOnList.listOfAvailableProducts();
            for (int j=0; j< listProductsInOrder.length;j++){
                String tmpProductNameFromOrder = listProductsInOrder[j][0];
                Double tmpProductQuantityFromOrdered = Double.parseDouble(listProductsInOrder[j][1]) ;
                String[][]  orderPerShop = new  String[100][];
                int tmpCounter = 0;
                for (int i = 0; i < listOfAvailableProductsInShop.length; i++) {
                    String tmpAvailableProdInShopName = listOfAvailableProductsInShop[i][0];
                    if (listProductsInOrder[j][2] == "" || listProductsInOrder[j][2] == null) {
                        if (tmpAvailableProdInShopName.equals(tmpProductNameFromOrder)) {
                            if (Double.parseDouble(listOfAvailableProductsInShop[i][1]) != 0) {
                                if (tmpProductQuantityFromOrdered < Double.parseDouble(listOfAvailableProductsInShop[i][1])) {
                                    listProductsInOrder[j][2] = listOfAvailableProductsInShop.getClass().getName();
                                    orderPerShop[tmpCounter][0] = tmpProductNameFromOrder;
                                    orderPerShop[tmpCounter][1] = Double.toString(tmpProductQuantityFromOrdered);

                                    tmpCounter++;

                                }
                            }
                        }
                    }
                }
                String[][] responseList =  shopOnList.process(orderPerShop);
                completeTheOrder(responseList, listProductsInOrder, listsOfAvailableShop.size(), foodOrderRequest);
            }
        }
    }

    public void completeTheOrder(String responseList[][], String allProductForOrder[][], int countShops, FoodOrderRequest foodOrderRequest){
        int counteR=0;
        System.out.println("Let's start!!! ");

        String[][] allResponsesList = new String[10000][];
        int n = 0 ;
        for (int i = 0; i < responseList.length; i++) {
            allResponsesList[n][0] = responseList[i][0];
            allResponsesList[n][0] = responseList[i][1];
            allResponsesList[n][2] = responseList[i][2];
            allResponsesList[n][3] = responseList[i][3];
            allResponsesList[n][4] = responseList[i][4];
            counteR++;
        }

        if(counteR == countShops){
            NotificationServiceFood2Door notificationServiceFood2Door = new SmsEmailNotyfication();
            notificationServiceFood2Door.sendInformationToUser(foodOrderRequest.getOrderingCustomer());
            orderRepositoryFood2Door.orderToStore(foodOrderRequest.getOrderingCustomer(), foodOrderRequest, allProductForOrder);

        }
        /* NotificationService notificationMail = new SendSmsEmailNotyfication();
            notificationMail.sendInformationToUser(orderRequest.getUser());
            orderRepository.orderToStore(orderRequest.getUser(), orderRequest);*/
    }
}