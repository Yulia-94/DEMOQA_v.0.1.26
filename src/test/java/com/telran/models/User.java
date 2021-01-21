package com.telran.models;

public class User {
    private String fName;
    private String lName;
    private String userName;
    private String password;


    public String getfName() {
        return fName;
    }

    public User withfName(String fName) {
        this.fName = fName;
        return this;
    }

    public String getlName() {
        return lName;
    }

    public User withlName(String lName) {
        this.lName = lName;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User withPassword(String password) {
        this.password = password;
        return this;
    }
}
