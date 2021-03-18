package com.kodilla.good.patterns.challanges;

public class User {
    private String userId;
    private String userName;
    private String userAddress;
    private int userPhoneNumber;
    private String userMail;

    public User(String userName, String userAddress, int userPhoneNumber, String userMail) {
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhoneNumber = userPhoneNumber;
        this.userMail = userMail;
        this.userId = userName + userPhoneNumber;
    }

    public String  getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public int getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public String getUserMail() {
        return userMail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userPhoneNumber=" + userPhoneNumber +
                ", userMail='" + userMail + '\'' +
                '}';
    }
}
