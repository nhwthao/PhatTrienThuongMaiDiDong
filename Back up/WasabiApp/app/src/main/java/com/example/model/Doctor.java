package com.example.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Doctor implements Parcelable {
    private int doctorHinh;
    private String doctorChucVu;
    private  String doctorTen;
    private  String doctorPhone;
    private String doctorKhoa;
    private  String doctorCoQuan;
    private String doctorDiaChi;

    protected Doctor(Parcel in) {
        doctorHinh = in.readInt();
        doctorChucVu = in.readString();
        doctorTen = in.readString();
        doctorPhone = in.readString();
        doctorKhoa = in.readString();
        doctorCoQuan = in.readString();
        doctorDiaChi = in.readString();
    }

    public static final Creator<Doctor> CREATOR = new Creator<Doctor>() {
        @Override
        public Doctor createFromParcel(Parcel in) {
            return new Doctor(in);
        }

        @Override
        public Doctor[] newArray(int size) {
            return new Doctor[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(doctorHinh);
        parcel.writeString(doctorChucVu);
        parcel.writeString(doctorTen);
        parcel.writeString(doctorPhone);
        parcel.writeString(doctorKhoa);
        parcel.writeString(doctorCoQuan);
        parcel.writeString(doctorDiaChi);
    }
}
