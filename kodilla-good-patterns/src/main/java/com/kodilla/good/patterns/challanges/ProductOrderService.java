package com.kodilla.good.patterns.challanges;

public class ProductOrderService {

    public static void main(String[] args) {
        User user = new User("Adam","Java dev 11/805 st.", 565_556_565, "adam@mail.com");
        System.out.println("User: " + user.toString());
//        []
        OrderRequestRetrieve orderRequestRetrieve = new OrderRequestRetrieve();
        OrderRequest orderRequest = orderRequestRetrieve.retrieve();
        System.out.println("\n\t********** start *********** ");
        System.out.println(orderRequest.getProductQuantity1());




        System.out.println("\n\t********************* END ************************ ");
    }
}


/* Serwis powinien zajmować się wykonywaniem zamówień różnego rodzaju produktów
 * – gier, kapcie, szczoteczek do zębów...
 * innymi słowy, Allegro :)
 * */