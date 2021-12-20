package com.example.model;

public class Hospital {
    private int hospitalImage;
    private  String hospitalName;
    private  String hospitalAddress;

    public Hospital(int hopitalImage, String hopitalName, String hopitalAddress) {
        this.hospitalImage = hopitalImage;
        this.hospitalName = hopitalName;
        this.hospitalAddress = hopitalAddress;
    }

    public int getHopitalImage() {
        return hospitalImage;
    }

    public void setHopitalImage(int hopitalImage) {
        this.hospitalImage = hopitalImage;
    }

    public String getHopitalName() {
        return hospitalName;
    }

    public void setHopitalName(String hopitalName) {
        this.hospitalName = hopitalName;
    }

    public String getHopitalAddress() {
        return hospitalAddress;
    }

    public void setHopitalAddress(String hopitalAddress) {
        this.hospitalAddress = hopitalAddress;
    }
}
