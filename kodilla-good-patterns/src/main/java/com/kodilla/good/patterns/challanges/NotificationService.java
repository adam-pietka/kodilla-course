package com.kodilla.good.patterns.challanges;

public interface NotificationService {
    void sendInformationToUser(User user);
    void sendMail();
    void sendSMS();
    void sendLetter();
}
