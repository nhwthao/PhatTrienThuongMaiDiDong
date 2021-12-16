package com.example.model;

public class Doctor {
    private int doctorHinh;
    private String doctorChucVu;
    private  String doctorTen;
    private  String doctorPhone;
    private String doctorKhoa;
    private  String doctorCoQuan;
    private String doctorDiaChi;

    public int getDoctorHinh() {
        return doctorHinh;
    }

    public void setDoctorHinh(int doctorHinh) {
        this.doctorHinh = doctorHinh;
    }

    public String getDoctorChucVu() {
        return doctorChucVu;
    }

    public void setDoctorChucVu(String doctorChucVu) {
        this.doctorChucVu = doctorChucVu;
    }

    public String getDoctorTen() {
        return doctorTen;
    }

    public void setDoctorTen(String doctorTen) {
        this.doctorTen = doctorTen;
    }

    public String getDoctorPhone() {
        return doctorPhone;
    }

    public void setDoctorPhone(String doctorPhone) {
        this.doctorPhone = doctorPhone;
    }

    public String getDoctorKhoa() {
        return doctorKhoa;
    }

    public void setDoctorKhoa(String doctorKhoa) {
        this.doctorKhoa = doctorKhoa;
    }

    public String getDoctorCoQuan() {
        return doctorCoQuan;
    }

    public void setDoctorCoQuan(String doctorCoQuan) {
        this.doctorCoQuan = doctorCoQuan;
    }

    public String getDoctorDiaChi() {
        return doctorDiaChi;
    }

    public void setDoctorDiaChi(String doctorDiaChi) {
        this.doctorDiaChi = doctorDiaChi;
    }

    public Doctor(int doctorHinh, String doctorChucVu, String doctorTen, String doctorPhone, String doctorKhoa, String doctorCoQuan, String doctorDiaChi) {
        this.doctorHinh = doctorHinh;
        this.doctorChucVu = doctorChucVu;
        this.doctorTen = doctorTen;
        this.doctorPhone = doctorPhone;
        this.doctorKhoa = doctorKhoa;
        this.doctorCoQuan = doctorCoQuan;
        this.doctorDiaChi = doctorDiaChi;

    }
}
