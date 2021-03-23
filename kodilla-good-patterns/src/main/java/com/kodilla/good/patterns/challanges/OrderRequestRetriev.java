package com.kodilla.good.patterns.challanges;

class OrderRequestRetrieve {
        public OrderRequest retrieve(){
            User user = new User("Bart Kamonski", "Java dev. 11/8 street", 555_888_555, "Bart2@mailc.com");

            String productName1Banana = "Matrix DVD";
            int productQuantity1 = 1;
//            [this is singe click ORDER, ho to make basket?]

            return new OrderRequest(user, productName1Banana, productQuantity1);
        }
}
