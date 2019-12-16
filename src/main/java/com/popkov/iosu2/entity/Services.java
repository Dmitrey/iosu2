package com.popkov.iosu2.entity;

import javax.persistence.*;

@Entity
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int serviceID;
    @Column
    private String serviceName;
    @Column
    private double price;

    public Services() {
    }

    public Services(String serviceName, double price) {
        this.serviceName = serviceName;
        this.price = price;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}