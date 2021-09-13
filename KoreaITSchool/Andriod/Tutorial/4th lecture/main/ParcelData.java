package com.example.day4;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelData implements Parcelable {

    String phone;
    String name;
    String userName;
    String password;

    protected ParcelData(Parcel in) {
        phone = in.readString();
        name = in.readString();
        userName = in.readString();
        password = in.readString();
    }

    public static final Creator<ParcelData> CREATOR = new Creator<ParcelData>() {
        @Override
        public ParcelData createFromParcel(Parcel in) {
            return new ParcelData(in);
        }

        @Override
        public ParcelData[] newArray(int size) {
            return new ParcelData[size];
        }
    };

    public ParcelData(String phone, String name, String userName, String password) {
        this.phone = phone;
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(phone);
        parcel.writeString(name);
        parcel.writeString(userName);
        parcel.writeString(password);
    }
}
