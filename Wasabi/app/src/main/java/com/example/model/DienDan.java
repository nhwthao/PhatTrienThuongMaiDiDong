package com.example.model;

public class DienDan {
    public DienDan(int dienDanHinh, String dienDanTen, String diendanNgayDang, String dienDanND) {
        this.DienDanHinh = dienDanHinh;
        this.DienDanTen = dienDanTen;
        this.DiendanNgayDang = diendanNgayDang;
        this.DienDanND = dienDanND;
    }

    public int getDienDanHinh() {
        return DienDanHinh;
    }

    public void setDienDanHinh(int dienDanHinh) {
        DienDanHinh = dienDanHinh;
    }

    public String getDienDanTen() {
        return DienDanTen;
    }

    public void setDienDanTen(String dienDanTen) {
        DienDanTen = dienDanTen;
    }

    public String getDiendanNgayDang() {
        return DiendanNgayDang;
    }

    public void setDiendanNgayDang(String diendanNgayDang) {
        DiendanNgayDang = diendanNgayDang;
    }

    public String getDienDanND() {
        return DienDanND;
    }

    public void setDienDanND(String dienDanND) {
        DienDanND = dienDanND;
    }

    private int DienDanHinh;
    private String DienDanTen;
    private  String DiendanNgayDang;
    private  String DienDanND;


}
