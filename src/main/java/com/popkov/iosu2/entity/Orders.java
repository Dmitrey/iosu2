package com.popkov.iosu2.entity;

import javax.persistence.*;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int orderID;
    @ManyToOne
    private Customers customers;
    @ManyToOne
    private Services serviceID;
    @ManyToOne
    private Staff staffID;
    private boolean permission;
    private String date;
    private String vidName;
    private double vidLength;

    public Orders() {
    }

    public Orders(Customers customers, Services serviceID, Staff staffID, boolean permission, String date, String vidName, double vidLength) {
        this.customers = customers;
        this.serviceID = serviceID;
        this.staffID = staffID;
        this.permission = permission;
        this.date = date;
        this.vidName = vidName;
        this.vidLength = vidLength;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public Services getServiceID() {
        return serviceID;
    }

    public void setServiceID(Services serviceID) {
        this.serviceID = serviceID;
    }

    public Staff getStaffID() {
        return staffID;
    }

    public void setStaffID(Staff staffID) {
        this.staffID = staffID;
    }

    public boolean isPermission() {
        return permission;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVidName() {
        return vidName;
    }

    public void setVidName(String vidName) {
        this.vidName = vidName;
    }

    public double getVidLength() {
        return vidLength;
    }

    public void setVidLength(double vidLength) {
        this.vidLength = vidLength;
    }
}
