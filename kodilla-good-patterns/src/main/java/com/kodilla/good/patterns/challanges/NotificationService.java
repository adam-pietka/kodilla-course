package com.kodilla.good.patterns.challanges;

public class NotificationService {
    private int userPhoneNumber;
    private String userMail;

    public NotificationService() {
        System.out.println();
    }

    private void sendSMS(){
        System.out.println("Services just send SMS to: "  + userPhoneNumber);
    }

    private void sendMail(){
        System.out.println("Services just send mail to user: " + userMail);
    }
}