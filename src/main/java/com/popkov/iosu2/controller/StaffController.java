package com.popkov.iosu2.controller;

import com.popkov.iosu2.entity.Staff;
import com.popkov.iosu2.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StaffController {
    @Autowired
    StaffService staffService;

    @GetMapping("/addEmp")
    public String StaffAdd(Model model){
        model.addAttribute("nstaff", new Staff());
        return "staff/addstaff";
    }

    @PostMapping("/addEmp")
    public String StaffAddSubmit(Model model, @ModelAttribute("nstaff") Staff staff){
        staffService.addStaff(staff.getName(),staff.getPhone());
        return "redirect:/showAllEmp";
    }

    @GetMapping("/showAllEmp")
    public String showStaff(Model model){
        List<Staff> list = staffService.findAllStaff();
        model.addAttribute("list",list);
        return "staff/staff";
    }

    @GetMapping("/deleteEmp")
    public String deleteStaff(@RequestParam int id){
        staffService.deleteStaffById(id);
        return "redirect:/showAllEmp";
    }
}