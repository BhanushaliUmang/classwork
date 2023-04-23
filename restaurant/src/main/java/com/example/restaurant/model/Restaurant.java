package com.example.restaurant.model;

public class Restaurant {
    

    private String id;
    private String name;
    private String address;
    private String phoneNumber;
    private String speciality;
    private String totalStaff;
    

    public Restaurant(String id, String name, String address, String phoneNumber, String speciality,
            String totalStaff) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.speciality = speciality;
        this.totalStaff = totalStaff;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public String getTotalStaff() {
        return totalStaff;
    }
    public void setTotalStaff(String totalStaff) {
        this.totalStaff = totalStaff;
    }

    
}
