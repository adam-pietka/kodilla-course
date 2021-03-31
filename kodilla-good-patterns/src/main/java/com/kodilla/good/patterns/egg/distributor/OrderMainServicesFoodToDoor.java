package com.kodilla.good.patterns.egg.distributor;

import java.util.ArrayList;
import java.util.List;

public class OrderMainServicesFoodToDoor {

    private final NotificationServiceFood2Door notificationServiceFood2Door;
    private final OrderService orderService;
    private final OrderRepositoryFood2Door orderRepositoryFood2Door;


    public OrderMainServicesFoodToDoor(NotificationServiceFood2Door notificationServiceFood2Door,
                                       OrderService orderService,
                                       OrderRepositoryFood2Door orderRepositoryFood2Door) {
        this.notificationServiceFood2Door = notificationServiceFood2Door;
        this.orderService = orderService; // arrayList
        this.orderRepositoryFood2Door = orderRepositoryFood2Door;
    }

    public void process(final FoodOrderRequest foodOrderRequest){
        List<ProductInBasket> tempListEF = new ArrayList<>();
        List<ProductInBasket> tempListHF = new ArrayList<>();
        List<ProductInBasket> tempListGF = new ArrayList<>();

//        divideIntoSuppliers();
        OrderService orderServiceExtraFood = new ProviderExtraFoodShop();
        OrderService orderServiceHealthyFood = new ProviderHealthyShop();
        OrderService orderServiceGlutenFreeFood = new ProviderGlutenFreeShop();

        for ( ProductInBasket i: foodOrderRequest.getOrderCustomerBasket().getCustomerBusket()) {
            if (orderServiceExtraFood.listOfAvailableProducts().contains(i.getProductName())) {
                tempListEF.add(new ProductInBasket(i.getProductName(),i.getProductQuantity()));
            }
            if (orderServiceHealthyFood.listOfAvailableProducts().contains(i.getProductName())) {
                tempListHF.add(new ProductInBasket(i.getProductName(),i.getProductQuantity()));
            }
            if (orderServiceGlutenFreeFood.listOfAvailableProducts().contains(i.getProductName())) {
                tempListGF.add(new ProductInBasket(i.getProductName(),i.getProductQuantity()));
            }
        }

        ArrayList<ResponseProductInBasket> responseProductInBaskets  = new ArrayList<>();
        ArrayList<ResponseProductInBasket> responseProductInBaskets1 ;
        ArrayList<ResponseProductInBasket> responseProductInBaskets2 ;
        ArrayList<ResponseProductInBasket> responseProductInBaskets3 ;

        responseProductInBaskets1 = orderServiceExtraFood.process(tempListEF);
        responseProductInBaskets2 = orderServiceExtraFood.process(tempListHF);
        responseProductInBaskets3 = orderServiceExtraFood.process(tempListGF);

        for (ResponseProductInBasket answer :responseProductInBaskets1) {
            responseProductInBaskets.add(answer);
        }
        for (ResponseProductInBasket answer :responseProductInBaskets2) {
            responseProductInBaskets.add(answer);
        }
        for (ResponseProductInBasket answer :responseProductInBaskets3) {
            responseProductInBaskets.add(answer);
        }

        for (ResponseProductInBasket print: responseProductInBaskets  ) {
            System.out.println(print);
        }
    }
}