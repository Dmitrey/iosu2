package com.popkov.iosu2.entity;

import javax.persistence.*;

@Entity
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int customerID;
    @Column
    private String name;
    @Column
    private String type;
    @Column
    private String phone;
    @Column
    private String city;

    public Customers() {
    }

    public Customers(String name, String type, String phone, String city) {
        this.name = name;
        this.type = type;
        this.phone = phone;
        this.city = city;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}