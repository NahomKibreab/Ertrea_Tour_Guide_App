package com.nknahom.tourguideapp;

import androidx.annotation.NonNull;

public class Location {
    private String name;
    private String city;
    private String subzone;
    private String description;
    private String phone;

    /** Image resource ID for the location */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this location */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String city, String description, int image) {
        this.city = city;
        this.description = description;
        this.mImageResourceId = image;
    }

    public Location(String name, String description, int image, String phone) {
        this.name = name;
        this.description = description;
        this.mImageResourceId = image;
        this.phone = phone;
    }

    public Location(String name, String subzone, String description, int mImageResourceId) {
        this.name = name;
        this.subzone = subzone;
        this.description = description;
        this.mImageResourceId = mImageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return mImageResourceId;
    }

    public String getPhone(){
        return phone;
    }

    public String getSubzone() {
        return subzone;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasPhone(){
        return phone != null;
    }

    public boolean hasCity(){
        return city != null;
    }

    public boolean hasSubzone(){
        return subzone != null;
    }

    @NonNull
    @Override
    public String toString() {
        return "Location {" +
                "Name: " + name +
                ", City: " + city +
                ", Description: " + description +
                ", Image ID: " + mImageResourceId +
                ", Phone: " + phone +
                '}';
    }
}
