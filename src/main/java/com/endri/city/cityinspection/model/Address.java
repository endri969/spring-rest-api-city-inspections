package com.endri.city.cityinspection.model;

public class Address {

    private String city;
    private Integer zip;
    private String street;
    private String number;

    public Address() {
    }

    public Address(String city, Integer zip, String street, String number) {
        this.city = city;
        this.zip = zip;
        this.street = street;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", zip=" + zip +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
