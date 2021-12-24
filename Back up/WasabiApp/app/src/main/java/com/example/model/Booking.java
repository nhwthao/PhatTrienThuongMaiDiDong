package com.example.model;

public class Booking {
    private int wId;
    private String wName;
    private String wDay;
    private String wHour;
    private String wDes;
    private byte[] wThumb;

    public Booking(int wId, String wName, String wDay, String wHour, String wDes, byte[] wThumb) {
        this.wId = wId;
        this.wName = wName;
        this.wDay = wDay;
        this.wHour = wHour;
        this.wDes = wDes;
        this.wThumb = wThumb;
    }

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public String getwDay() {
        return wDay;
    }

    public void setwDay(String wDay) {
        this.wDay = wDay;
    }

    public String getwHour() {
        return wHour;
    }

    public void setwHour(String wHour) {
        this.wHour = wHour;
    }

    public String getwDes() {
        return wDes;
    }

    public void setwDes(String wDes) {
        this.wDes = wDes;
    }

    public byte[] getwThumb() {
        return wThumb;
    }

    public void setwThumb(byte[] wThumb) {
        this.wThumb = wThumb;
    }
}
