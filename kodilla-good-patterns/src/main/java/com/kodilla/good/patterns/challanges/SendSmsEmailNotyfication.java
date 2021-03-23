package com.kodilla.good.patterns.challanges;

public class SendSmsEmailNotyfication implements NotificationService{

        @Override
    public void sendInformationToUser(User user) {
            if( user.getUserMail().length() > 1 ) sendMail(user.getUserMail());
            if (user.getUserPhoneNumber() > 1 ) sendSMS(user.getUserPhoneNumber());
            if (user.getUserAddress().length() > 1 ) sendLetter(user.getUserAddress());
    }

    private void sendMail(String  mail){
        System.out.println("Application send mail to: " + mail);
    }

    private void sendSMS(int phoneNumber){
        System.out.println("Application send SMS to: " + phoneNumber);
    }

    private void sendLetter(String userAdress){
        System.out.println("Maybe is old fashion, but we were send mail to you:\n" + userAdress + "\n");
    }
}