package com.example.apple.taipeicityguide;

/**
 * Created by justin on 2017/7/4.
 */

public class Location {

    private static final String PRICE_UNKNOWN = "unknown";
    private static final String ACCESS_TIME_UNKNOWN = "unknown";
    private static final String ADDRESS_UNKNOWN = "unknown";
    private static final String PHONE_NUMBER_UNKNOWN = "unknown";
    private static final int NO_IMAGE_RESOURCE = -1;

    private int mLocationImageResourceId = NO_IMAGE_RESOURCE;
    private String mLocationName;
    private String mLocationInfo;
    private String mLocationAddress = ADDRESS_UNKNOWN;
    private String mLocationAccessTime = ACCESS_TIME_UNKNOWN;
    private String mAttachMoney = PRICE_UNKNOWN;
    private String mPhoneNumber = PHONE_NUMBER_UNKNOWN;

    public Location(String mLocationName, String mLocationInfo) {
        this.mLocationName = mLocationName;
        this.mLocationInfo = mLocationInfo;
    }

    public Location(int mLocationImageResourceId, String mLocationName, String mLocationInfo) {
        this.mLocationImageResourceId = mLocationImageResourceId;
        this.mLocationName = mLocationName;
        this.mLocationInfo = mLocationInfo;
    }

    public Location(int mLocationImageResourceId, String mLocationName, String mLocationInfo,
                    String mLocationAddress, String mPhoneNumber) {
        this.mLocationImageResourceId = mLocationImageResourceId;
        this.mLocationName = mLocationName;
        this.mLocationInfo = mLocationInfo;
        this.mLocationAddress = mLocationAddress;
        this.mPhoneNumber = mPhoneNumber;
    }


    public Location(int mLocationImageResourceId, String mLocationName, String mLocationInfo,
                    String mLocationAddress, String mLocationAccessTime, String mPhoneNumber) {
        this.mLocationImageResourceId = mLocationImageResourceId;
        this.mLocationName = mLocationName;
        this.mLocationInfo = mLocationInfo;
        this.mLocationAddress = mLocationAddress;
        this.mLocationAccessTime = mLocationAccessTime;
        this.mPhoneNumber = mPhoneNumber;
    }

    public Location(int mLocationImageResourceId, String mLocationName, String mLocationInfo,
                    String mLocationAddress, String mLocationAccessTime, String mAttachMoney,
                    String mPhoneNumber) {
        this.mLocationImageResourceId = mLocationImageResourceId;
        this.mLocationName = mLocationName;
        this.mLocationInfo = mLocationInfo;
        this.mLocationAddress = mLocationAddress;
        this.mLocationAccessTime = mLocationAccessTime;
        this.mAttachMoney = mAttachMoney;
        this.mPhoneNumber = mPhoneNumber;
    }

    public int getmLocationImageResourceId() {
        return mLocationImageResourceId;
    }

    public String getmLocationName() {
        return mLocationName;
    }

    public String getmLocationInfo() {
        return mLocationInfo;
    }

    public String getmLocationAddress() {
        return mLocationAddress;
    }

    public String getmLocationAccessTime() {
        return mLocationAccessTime;
    }

    public String getmAttachMoney() {
        return mAttachMoney;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public boolean hasPrice() {
        return mAttachMoney != PRICE_UNKNOWN;
    }

    public boolean hasAccessTime() {
        return mLocationAccessTime != ACCESS_TIME_UNKNOWN;
    }

    public boolean hasAddress() {
        return mLocationAddress != ADDRESS_UNKNOWN;
    }

    public boolean hasPhoneNumber() {
        return mPhoneNumber != PHONE_NUMBER_UNKNOWN;
    }

    public boolean hasImage() {
        return mLocationImageResourceId != NO_IMAGE_RESOURCE;
    }

}
