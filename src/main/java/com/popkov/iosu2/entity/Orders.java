package com.popkov.iosu2.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int orderID;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customerid")
    private Customers customers;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "serviceid")
    private Services service;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_staff")
    private Staff staff;
    private String permission;//todo сделать обратно тип bool
    private String date;
    private String vidName;
    private double vidLength;

    public Orders() {
    }

    public Orders(Customers customers, Services serviceID, Staff staffID, String permission, String date, String vidName, double vidLength) {
        this.customers = customers;
        this.service = serviceID;
        this.staff = staffID;
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

    public Services getService() {
        return service;
    }

    public void setService(Services serviceID) {
        this.service = serviceID;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staffID) {
        this.staff = staffID;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
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

    @Override
    public String toString() {
        return "Orders{" +
                "orderID=" + orderID +
                ", customers=" + customers +
                ", service=" + service +
                ", staff=" + staff +
                ", permission='" + permission + '\'' +
                ", date='" + date + '\'' +
                ", vidName='" + vidName + '\'' +
                ", vidLength=" + vidLength +
                '}';
    }
}
