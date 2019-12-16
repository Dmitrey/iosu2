package com.popkov.iosu2.entity;

import javax.persistence.*;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int IdStaff;
    @Column
    private String name;
    @Column
    private String phone;

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

    @Override
    public String toString() {
        return "Staff{" +
                "IdStaff=" + IdStaff +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
