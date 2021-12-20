package com.example.model;

import java.io.Serializable;

public class User implements Serializable {
    private String phone;
    private String password;
    private String fullName;

    public User() {
    }

    public User(String phone, String password, String fullName) {
        this.phone = phone;
        this.password = password;
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
}
