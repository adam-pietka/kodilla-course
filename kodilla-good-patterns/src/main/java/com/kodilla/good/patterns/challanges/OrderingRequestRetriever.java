package com.kodilla.good.patterns.challanges;


class OrderRequestRetrieve {

    public OrderRequest retrieve(){
        User user = new User("Bart", "Deep Perpule 11 st/ ", 555_888_555, "Bart1@mailc.com");

//        [basket????]

        String productName1Banana = "Banana";
        int productQuantity1 = 5;

        return new OrderRequest(user, productName1Banana, productQuantity1);

    }
}
