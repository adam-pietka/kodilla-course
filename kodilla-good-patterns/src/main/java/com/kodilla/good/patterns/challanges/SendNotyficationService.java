package com.kodilla.good.patterns.challanges;

public class SendNotyficationService implements NotificationService{
    private String userName;
    private String userAddress;
    private int userPhoneNumber;
    private String userMail;

        @Override
    public void sendInformationToUser(User user) {
        this.userName =  user.getUserName();
        this.userAddress = user.getUserAddress();
        this.userMail = user.getUserMail();
        this.userPhoneNumber = user.getUserPhoneNumber();
    }

    private void greetUser(){
        System.out.println("Dear" + userName + ", Thank for byu in our SHOP.");
    }

    public void sendMail(){
        greetUser();
        System.out.println("Mail notyfication was send to user on mail: " + userMail);
    }

    public void sendSMS(){
        greetUser();
        System.out.println("SMS notyfication was send to user on mail: " + userPhoneNumber);
    }

    public void sendLetter(){
        greetUser();
        System.out.println("Letter was send to user on mail: " + userAddress);
    }
}
