package com.galosoft.androidonlinequizzapp.Model;

public class User {

    private String userName;
    private String password;
    private String emil;

    public User() {
    }

    public User(String userName, String password, String emil) {
        this.userName = userName;
        this.password = password;
        this.emil = emil;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }
}
