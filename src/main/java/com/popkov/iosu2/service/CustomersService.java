package com.popkov.iosu2.service;

import com.popkov.iosu2.entity.Customers;
import com.popkov.iosu2.repository.CustomersRep;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomersService {
    @Autowired
    CustomersRep customersRep;

    public void addCustomer(String name, String type, String phone, String city){
        customersRep.save(new Customers(name,type,phone,city));
    }

    public void deleteCustomerById(int id){
        customersRep.deleteById(id);
    }

    public List findAllServices(){
        return customersRep.findAll();
    }
}
