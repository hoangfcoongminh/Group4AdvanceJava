package org.example.hethongbanve.n4advancejava.models;

import java.sql.Date;

public class User {
    private int userID;
    private String username;
    private String password;
    private String fullName;
    private Date doB;
    private String phoneNumber;
    private String email;
    private String address;
    private String role;

    public User() {
    }

    public User(String username, String password, String fullName, Date doB, String phoneNumber, String email, String address, String role) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.doB = doB;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDoB() {
        return doB;
    }

    public void setDoB(Date doB) {
        this.doB = doB;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
