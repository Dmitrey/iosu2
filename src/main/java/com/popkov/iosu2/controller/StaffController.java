package com.popkov.iosu2.controller;

import com.popkov.iosu2.entity.Staff;
import com.popkov.iosu2.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StaffController {
    @Autowired
    StaffService staffService;

    @GetMapping
    public String start(){
        return "start";
    }

    @GetMapping("/AddEmp")
    public String goStaff(@RequestParam(required = true) String name, @RequestParam(required = true) String phone){
        staffService.addStaff(name,phone);
        return "staff";
    }

    @GetMapping("/showAllEmp")
    public String showStaff(){
        List<Staff> list = staffService.findAllStaff();
        for (Staff st:list) {
            System.out.println(st.toString());
        }
        return "staff";
    }

    @GetMapping("/deleteEmp")
    public void deleteStaff(@RequestParam int id){
        staffService.deleteStaffById(id);
    }
}
