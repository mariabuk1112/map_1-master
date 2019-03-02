package com.example.mar.map;

public class Hospital {
    int id;
    String name;
    double locationX;
    double locationY;
    long phone;
    String password;
    String category;


    public Hospital() {
    }

    public Hospital(int id) {
        this.id = id;
    }

    public Hospital(int id, String name, double locationX, double locationY, long phone, String password , String category) {
        this.id = id;
        this.name = name;
        this.locationX = locationX;
        this.locationY = locationY;
        this.phone = phone;
        this.password = password;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getLocationX() {
        return locationX;
    }
    public double getLocationY() {
        return locationY;
    }


    public long getPhone() {
        return phone;
    }





    public String getPassword() {
        return password;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationX(double locationX) {
        this.locationX = locationX;
    }
    public void setLocationY(double locationY) {
        this.locationY = locationY;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void logIn(int id, String password) {

    }

    public void logOut(int id) {

    }

    public void modifyHospitalEmail( String email) {

    }

    public void modifyHospitalPassword( String password) {

    }
}

