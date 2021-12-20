package com.example.model;

import java.io.Serializable;

public class BookAppointment implements Serializable {
    private String baId;
    private String baTime;
    private String baDoctor;
    private String baSDTDoctor;
    private String baChuyenNganhDoctor;
    private String baAddress;

    public BookAppointment(String baId, String baTime, String baDoctor, String baSDTDoctor, String baChuyenNganhDoctor, String baAddress) {
        this.baId = baId;
        this.baTime = baTime;
        this.baDoctor = baDoctor;
        this.baSDTDoctor = baSDTDoctor;
        this.baChuyenNganhDoctor = baChuyenNganhDoctor;
        this.baAddress = baAddress;
    }

    public String getBaId() {
        return baId;
    }

    public void setBaId(String baId) {
        this.baId = baId;
    }

    public String getBaTime() {
        return baTime;
    }

    public void setBaTime(String baTime) {
        this.baTime = baTime;
    }

    public String getBaDoctor() {
        return baDoctor;
    }

    public void setBaDoctor(String baDoctor) {
        this.baDoctor = baDoctor;
    }

    public String getBaSDTDoctor() {
        return baSDTDoctor;
    }

    public void setBaSDTDoctor(String baSDTDoctor) {
        this.baSDTDoctor = baSDTDoctor;
    }

    public String getBaChuyenNganhDoctor() {
        return baChuyenNganhDoctor;
    }

    public void setBaChuyenNganhDoctor(String baChuyenNganhDoctor) {
        this.baChuyenNganhDoctor = baChuyenNganhDoctor;
    }

    public String getBaAddress() {
        return baAddress;
    }

    public void setBaAddress(String baAddress) {
        this.baAddress = baAddress;
    }
}