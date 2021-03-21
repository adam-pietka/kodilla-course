package com.kodilla.good.patterns.challanges;

public class OrderMainServices {
    private final NotificationService notificationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository ;

    public OrderMainServices(final NotificationService notificationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.notificationService = notificationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest ){
        boolean isSale = orderService.sale(
                orderRequest.getUser(),
                orderRequest.getProductName(),
                orderRequest.getProductQuantity());

        if (isSale){
            notificationService.sendInformationToUser(orderRequest.getUser()) ;
            notificationService.sendMail();
            orderRepository.orderToStore(orderRequest.getUser(), orderRequest);

            System.out.println("We have accepted your order.");
            System.out.println("Price is: " + orderService.priceToPay());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            System.out.println("Sorry order is cancelled!");
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
