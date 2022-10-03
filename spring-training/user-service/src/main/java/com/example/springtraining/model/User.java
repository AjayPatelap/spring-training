package com.example.springtraining.model;

import javax.persistence.*;

// Creating JPA Entity - User
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_ID")
    private long userID;
    @Column(name = "User_Name")
    private String userName;
    @Column(name = "User_Phone_No")
    private String userPhoneNo;

    @Column(name = "User_Address")
    private String userAddress;

    @Column(name = "User_Email")
    private String userEmail;

    @Column(name = "User_Pass")
    private String password;

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPhoneNo(String userPhoneNo) {
        this.userPhoneNo = userPhoneNo;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPhoneNo() {
        return userPhoneNo;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getPassword() {
        return password;
    }

    public User(int userID,String userName, String userPhoneNo, String userAddress,String userEmail, String password) {
        this.userID = userID;
        this.userName = userName;
        this.userPhoneNo = userPhoneNo;
        this.userAddress = userAddress;
        this.userEmail = userEmail;
        this.password = password;
    }

    public User() {
    }

}
