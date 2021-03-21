package com.kodilla.good.patterns.challanges;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetrieve orderRequestRetrieve = new OrderRequestRetrieve();
        OrderRequest orderRequest = orderRequestRetrieve.retrieve();

        OrderMainServices orderMainServices = new OrderMainServices(
                new SendNotyficationService(), new AliStore(), new DataStoreOrderRepository());
        orderMainServices.process(orderRequest);
    }
}
