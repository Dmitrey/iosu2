package com.popkov.iosu2.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int IdStaff;
    @Column
    private String name;
    @Column
    private String phone;

    @OneToMany
    private Set<Orders> ordersSet;

    public Staff() {
    }

    public Staff(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public int getIdStaff() {
        return IdStaff;
    }

    public void setIdStaff(int idStaff) {
        IdStaff = idStaff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Orders> getOrdersSet() {
        return ordersSet;
    }

    public void setOrdersSet(Set<Orders> ordersSet) {
        this.ordersSet = ordersSet;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "IdStaff=" + IdStaff +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
