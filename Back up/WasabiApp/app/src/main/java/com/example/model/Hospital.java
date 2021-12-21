package com.example.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Hospital implements Parcelable {
    private int hospitalImage;
    private  String hospitalName;
    private  String hospitalAddress;

    public Hospital(int hopitalImage, String hopitalName, String hopitalAddress) {
        this.hospitalImage = hopitalImage;
        this.hospitalName = hopitalName;
        this.hospitalAddress = hopitalAddress;
    }

    protected Hospital(Parcel in) {
        hospitalImage = in.readInt();
        hospitalName = in.readString();
        hospitalAddress = in.readString();
    }

    public static final Creator<Hospital> CREATOR = new Creator<Hospital>() {
        @Override
        public Hospital createFromParcel(Parcel in) {
            return new Hospital(in);
        }

        @Override
        public Hospital[] newArray(int size) {
            return new Hospital[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(hospitalImage);
        parcel.writeString(hospitalName);
        parcel.writeString(hospitalAddress);
    }
}
