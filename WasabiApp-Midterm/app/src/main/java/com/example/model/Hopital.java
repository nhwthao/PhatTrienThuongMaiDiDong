package com.example.model;

public class Hopital {
    private int hopitalImage;
    private  String hopitalName;
    private  String hopitalAddress;

    public Hopital(int hopitalImage, String hopitalName, String hopitalAddress) {
        this.hopitalImage = hopitalImage;
        this.hopitalName = hopitalName;
        this.hopitalAddress = hopitalAddress;
    }

    public int getHopitalImage() {
        return hopitalImage;
    }

    public void setHopitalImage(int hopitalImage) {
        this.hopitalImage = hopitalImage;
    }

    public String getHopitalName() {
        return hopitalName;
    }

    public void setHopitalName(String hopitalName) {
        this.hopitalName = hopitalName;
    }

    public String getHopitalAddress() {
        return hopitalAddress;
    }

    public void setHopitalAddress(String hopitalAddress) {
        this.hopitalAddress = hopitalAddress;
    }
}
