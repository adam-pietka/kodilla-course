package com.kodilla.good.patterns.egg.distributor;

import java.util.ArrayList;
import java.util.List;

public class OrderMainServicesFoodToDoor {

    private final NotificationService notificationService;
    private final FoodOrderRequest foodOrderRequest;
    private final OrderRepository orderRepository;
    private List<ProductInBasket> tempListEF = new ArrayList<>();
    private List<ProductInBasket> tempListHF = new ArrayList<>();
    private List<ProductInBasket> tempListGF = new ArrayList<>();

    public OrderMainServicesFoodToDoor(NotificationService notificationService, FoodOrderRequest foodOrderRequest, OrderRepository orderRepository) {
        this.notificationService = notificationService;
        this.foodOrderRequest = foodOrderRequest;
        this.orderRepository = orderRepository;
    }

    public void process( final FoodOrderRequest foodOrderRequest){
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

        for (ResponseProductInBasket print: responseProductInBaskets         ) {
            System.out.println(print);
        }
    }
}