package com.popkov.iosu2.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int serviceID;
    @Column
    private String serviceName;
    @Column
    private double price;
    @OneToMany
    private Set<Orders> ordersSet;

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

    public Set<Orders> getOrdersSet() {
        return ordersSet;
    }

    public void setOrdersSet(Set<Orders> ordersSet) {
        this.ordersSet = ordersSet;
    }

    @Override
    public String toString() {
        return "Services{" +
                "serviceID=" + serviceID +
                ", serviceName='" + serviceName + '\'' +
                ", price=" + price +
                ", ordersSet=" + ordersSet +
                '}';
    }
}