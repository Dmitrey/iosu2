package com.popkov.iosu2.controller;

import com.popkov.iosu2.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StaffController {
    @Autowired
    StaffService staffService;

    @GetMapping("/")
    public String goStaff(@RequestParam(required = false) String name, @RequestParam(required = false) String phone){
        staffService.addStaff(name,phone);
        return "staff.html";
    }

    @PostMapping("/")
    public String show(){
        return "staff.html";
    }
}
