package com.popkov.iosu2.service;

import com.popkov.iosu2.entity.Staff;
import com.popkov.iosu2.repository.StaffRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffService {

    @Autowired
    StaffRep staffRep;

    public void addStaff(String name, String phone){
        staffRep.save(new Staff(name,phone));
    }

    public List<Staff> findAllStaff(){
        List<Staff> list = staffRep.findAll();
        return list;
    }
}
