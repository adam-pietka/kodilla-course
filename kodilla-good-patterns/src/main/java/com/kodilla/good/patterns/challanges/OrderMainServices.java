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
        OrderService shopAli = new AliStore();
        boolean isSale = shopAli.sale(
                orderRequest.getUser(),
                orderRequest.getProductName(),
                orderRequest.getProductQuantity()
        );

        if (isSale){
            NotificationService notificationMail = new SendSmsEmailNotyfication();
            notificationMail.sendInformationToUser(orderRequest.getUser());
            orderRepository.orderToStore(orderRequest.getUser(), orderRequest);
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}