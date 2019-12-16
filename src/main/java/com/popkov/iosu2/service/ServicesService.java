package com.popkov.iosu2.service;

import com.popkov.iosu2.entity.Services;
import com.popkov.iosu2.repository.ServicesRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesService {

    @Autowired
    ServicesRep servicesRep;

    public void addService(String serviceName, double price){
        servicesRep.save(new Services(serviceName,price));
    }

    public List findAllServices(){
        return servicesRep.findAll();
    }

    public void deleteServiceById(int id){
        servicesRep.deleteById(id);
    }
}
